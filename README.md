---
typora-copy-images-to: ./bitbook_resource
---

一个CMS和后端Api系统，基于Java Springboot，且拥有标准的ACL权限控制。本人为了做项目方便，就特意搞了这个东西，用来二次开发，方便实用。

本人会逐渐提供完整、详细的文档资料和接口资料。



**^_^**

**基于本项目做二开，只需配备一名初级Java工程师和一名初级前端工程师，在成本和效率上媲美”世界上最好的语言“。**



#### 单机部署方式：

**1、clone项目，配置数据库：**

```
git clone https://github.com/soyojoearth/nxtframework.git
cd wwwroot/mysql
#创建、启动docker数据库（仅供测试）
docker build --tag nxtmysql:0.1.0 .
docker-compose -f docker-compose-nxtmysql.yml up
```

**2、按照`docker-compose-nxtmysql.yml`里面的数据库与用户名密码配置项目文件数据库链接**

**3、到项目根目录，执行：**


```
#打包
mvn package
#创建镜像
docker build --tag nxtframework:0.1.0 .
#启动本地测试
cd wwwroot
docker-compose -f docker-compose-quickstart.yml up
```



#### 集群部署方式：

1、使用k8s部署；

2、完。




#### 主要涉及到的技术：

1、MySQL 8.0

2、SpringBoot 2

3、Open Jdk 8

4、Docker



#### **拥有的特性：**

1、拥有完整的ACL访问控制模块；

2、图片可以保存在服务器本地，也可以选择保存在七牛云；

3、上传保存在本地的图片也支持自动生成缩略图（仿七牛云）；

4、前后端分离，且提供“搜索引擎SEO特供版渲染”；

5、可docker-compose一键启动，已配置好nginx文件，支持ssl，只要修改绑定域名和证书文件即可；

6、具备Docker HEALTHCHECK 、Docker autoheal，自动检测健康状态，发现故障自动重启；



#### 技术架构图：

![image-20201026155843783](gitbook_resource/image-20201026155843783.png)

