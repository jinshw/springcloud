# Spring Cloud 学习笔记
* 教程地址： https://www.cnblogs.com/MJyc/p/8674371.html

## 第一到第七篇  
* 源代码：
    - eurekaserver：注册中心服务
    - provider：服务提供者，可以启动多个注册到注册中心中，例如启动工程中  *mvn ProviderApplication start -Dserver.port=9090 ,mvn ProviderApplication start -Dserver.port=9091*
    - consumer:消费者，也需要注入注册中心，该工程使用ribbon实现的
    - feign：消费者，该工程使用feign实现的
    - service-zuul：路由网关
    - config-server，config-client：配置中心


## 第九篇: 服务链路追踪(Spring Cloud Sleuth)
* 源代码：server-zipkin,service-hi,service-miya
* 访问方式：
    - http://localhost:9411
    - http://localhost:8989/miya
    - http://localhost:8988/hi
    - 刷新http://localhost:9411


