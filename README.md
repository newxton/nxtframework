---
typora-copy-images-to: ./resource
---

本开源框架是一个简单的基于Java SpringBoot开发的网站和API的后台。

使用本框架可以快速做一个一般的企业网站、资讯网站、产品展示网站，完全不用开发后台。

也可以在原有的基础上做二次开发。NxtFramework提供完整、详细的文档资料和接口资料。



##### 主要涉及到的技术：

1、MySQL 8.0

2、SpringBoot 2

3、Open Jdk 8

4、Docker



**拥有的特性：**

1、图片可以保存在服务器本地，也可以选择保存在七牛云；

2、上传保存在本地的图片也支持自动生成缩略图（仿七牛云）；

3、可docker-compose一键启动，已配置好nginx文件，支持ssl，只要修改绑定域名和证书文件即可；



##### 服务器可选使用的部署运维方案：

1、docker-compose一键启动【配合Docker HEALTHCHECK 、Docker autoheal，由docker-compose编排，含Nginx和SSL】，该方案便宜、方便，可单机部署【新手推荐】；

2、k8s部署（高可靠、弹性可扩展）



##### 技术架构图：

![image-20201002193247580](bitbook_resource/image-20201002193247580.png)

