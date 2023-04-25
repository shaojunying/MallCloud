# mallcloud-config

这是一个微服务架构的配置中心项目。

## 学到的点

- 配置中心只会读配置信息，不会修改。

## 可以优化的点

-[ ] 考虑怎么才能实现服务的高可用。
  - 按照[文档](https://docs.spring.io/spring-cloud-config/docs/current/reference/html/)中的描述，我们可以启动多个Config Server，从而实现配置中心的高可用，但是这些实例应该指向同一个配置文件存储仓库，从而保证应用程序读取到配置文件的一致性。
  - 至于所有Config Server都指向同一个存储仓库，带来的单点故障问题。将该存储仓库也做成分布式的。
-[ ] 我们还需要考虑配置中心的何时拉取最新的配置信息。主动拉or设置callback函数，被动更新。主动拉的话，拉取频率。

## 参考链接

- [Baeldung - Spring Cloud Configuration](https://www.baeldung.com/spring-cloud-configuration)

以上链接是作者参考的相关文章，其中介绍了使用 Spring Cloud 实现配置中心的方法。如果你需要更多帮助，请参考该链接。


可以将以上内容复制粘贴到你的 README.md 文件中。希望对你有所帮助。