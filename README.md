hystrix-codahale-metrics-publisher
===================================

This is an implementation of HystrixMetricsPublisher that publishes metrics using Codahale Metrics

Usage
-----

      HystrixPlugins.getInstance().registerMetricsPublisher(new HystrixCodahaleMetricsPublisher(yourRegistry));

