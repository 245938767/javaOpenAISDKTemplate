# 基于OpenApi的接口基础封装

## 如何学习
此项目架构是参考  [op-mybatis-spring-boot-starter.zip][1]中的一个链式调用方式，如果感觉看不懂可以通过两个项目的对比

入口类：

```java
public class OpenAICreate {}
```

Key配置类

```java
public abstract class BaseOpenAIOperation implements OpenAIOperation {}
```

欢迎大家Fork，通过构建自己的版本，对自己的提升更大

构建新的接口时只需要定义一个Request对象（最好和OpenAI官网中的数据结构一致），返回Response对象也类似，然后就是Api链接（具体可以参考Factory包中的实现对象）

## 头脑风暴

- [ ] 在此项目的架构中不应该仅仅支持OpenAi，将来会出现各种各样的AI平台是否到时候也能适配呢（对架构在进行一次抽象）
- [ ] 支持对不同平台的AI的密匙管理
- [ ] 是否能够变成一个样板代码呢？公司对外开放的SDK可以基于此种逻辑直接生成Java的SDK
- [ ] 是否能够加上代理，防止出现网络不好请求失败问题


## 怎么使用

把代码Copy到你项目即可，根据需要可以把Key配置到Application.yml中。

## 引用

[1]: https://gitee.com/only4playgroup/op-system-center	"一个教你在实际的项目中领域驱动实际的落地以及代码编写方式"

[2]: https://platform.openai.com/docs/api-reference/introduction "OpenAI API官网"
