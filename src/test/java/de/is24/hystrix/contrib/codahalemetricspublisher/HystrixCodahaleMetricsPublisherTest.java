package de.is24.hystrix.contrib.codahalemetricspublisher;

import com.codahale.metrics.MetricRegistry;
import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;
import com.netflix.hystrix.strategy.HystrixPlugins;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;


public class HystrixCodahaleMetricsPublisherTest {
  @Test
  public void smoke_test() {
    MetricRegistry registry = new MetricRegistry();
    HystrixPlugins.getInstance().registerMetricsPublisher(new HystrixCodahaleMetricsPublisher(registry));

    new HystrixTestCommand().execute();

    assertThat(registry.getGauges().get("HystrixCommand.HystrixTestCommand.countSuccess").getValue(),
      equalTo((Object) 1L));
  }

  private static class HystrixTestCommand extends HystrixCommand<Void> {
    public HystrixTestCommand() {
      super(HystrixCommandGroupKey.Factory.asKey("HystrixTestCommand"));
    }

    @Override
    protected Void run() throws Exception {
      return null;
    }
  }

}
