hystrix-codahale-metrics-publisher
===================================

This is an implementation of [HystrixMetricsPublisher](http://netflix.github.com/Hystrix/javadoc/index.html?com/netflix/hystrix/strategy/metrics/HystrixMetricsPublisher.html) that publishes metrics using [Coda Hale Yammer Metrics](http://metrics.codahale.com) Version 3.

Usage
-----

      HystrixPlugins.getInstance().registerMetricsPublisher(new HystrixCodahaleMetricsPublisher(yourMetricRegistry));
      
See the Hystrix [Metrics & Monitoring](https://github.com/Netflix/Hystrix/wiki/Metrics-and-Monitoring) Wiki for more information.


