Eureka服务提供者
启动命令：
   java -jar xxx.jar --server.port=8081
   java -jar xxx.jar --server.port=8082
执行两条命令，会启动两个服务提供者，配合Ribbon-Consumer示例项目，可以看到客户端负载均衡的效果。
