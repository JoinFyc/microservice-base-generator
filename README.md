#  互动中台-脚手架-分层规范

## 分层依赖
![img_1.png](image/img_1.png)


## 工程结构
![img_2.png](image/img_2.png)

## 各层介绍

## 基础层
#### common-utils: 基础⼯具模块,负责沉淀该应⽤独有的⼯具类,共享类⼯具建议使⽤公共⼯具组件
#### common-dal: orm模块,负责与数据库交互
#### common-integration: 三⽅调⽤模块, 负责维护和收敛所有三⽅接⼝(三⽅包括 内部rpc web 外部 web)
#### common-facade: 内部rpc⼆⽅包模块,维护接⼝类和dto实体类,供rpc消费⽅使⽤

## 核⼼领域层
#### core-model: 实体对象模块,负责维护业务模型和领域实体,负责实体的拼装,转换等
#### core-service: 领域核⼼业务模块, 负责维护核⼼业务逻辑,如 账户中⼼的账户新增

## 业务层
#### biz-service: 业务逻辑模块,负责沉淀应⽤的业务逻辑⽅法
#### biz-share: 附加业务模块, 负责处理定时任务 消息中间件等中间件异步任务 biz-XXX: 业务扩展模块,当应⽤内业务有分⽀时可在业务层扩展模块

## Rpc层
#### facade-impl: 对外rpc服务的提供⽅,该模块没有业务逻辑,可以处理加锁 幂等之类的操作

## Web层
#### web-home: 负责对外提供http接⼝,如果应⽤是单纯的rpc服务该层可以去除

## 调用关系图
![img_3.png](image/img_3.png)
#### 1.	接⼝层可调⽤biz层的 service 和 shared模块
#### 2.	shared只允许调biz-service
#### 3.	biz-service 可以调core-service 和 common-dal 

## 实体交互图
![img_5.png](image/img_5.png)
#### DTO : 数据交互实体
#### DO : 领域模型实体
#### CONTEXT : 领域模型实体集合
#### PO : 持久话实体
#### BO : 业务处理实体

## 实体交互规范
##### 1. 接⼝层对外使⽤DTO进⾏交互
##### 2. biz-service 和 core-service使⽤DO和CONTEXT进⾏交互
#### 3.	shared内部使⽤BO进⾏转化跟biz-service进⾏交互
#### 4. dao层对外使⽤PO进⾏交互
#### 5. integration对外使⽤BO进⾏交互




