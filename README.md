# orderminiprogram
微信点餐小程序

推荐使用：谷歌浏览器

后台地址
http://localhost:8080/ssmjxtr8/admin/dist/index.html

在/src/main/resources/config.properties中编辑
											
	jdbc_url=jdbc:mysql://127.0.0.1:3306/ssmjxtr8?useUnicode=true&characterEncoding=UTF-8&tinyInt1isBit=false
	jdbc_username=root	    数据库用户名 root

后端
准备环境：
     JDK、IDEA、Maven、Mysql、Navicat
启动步骤：
      1、打开IDEA后，选择 "open" 打开 "后端" 项目 
      2、IDEA配置好 "JDK1.8" 和 "Maven"，刷新等待编译成功
      3、使用Navicat导入数据库文件 "db.sql"
      4、在"application.yml"中配置好数据库配置
      5、在"application.yml"中配置图片文件路径
      upload.path = "你自己电脑项目的图片路径"

 
小程序端
注意：请先完成小程序AppId的申请
准备环境：
   Node 16.13.2，微信小程序开发者工具
启动步骤
1、使用微信小程序打开“mp-weixin”项目
2、在“project.config.json”查看配置下自己的appid   
3、编译启动
   
用户账号密码：
yangfan / 123456

管理员账号密码：
abo / abo


springboot框架搭建：
SpringBoot是一个快速开发框架，它基于Spring框架，采用了约定大于配置的开发方式，简化了开发过程，提高了开发效率。SpringBoot提供了许多预先配置好的依赖项，开发者只需要关注业务逻辑即可。

用idea建立一个springboot工程
整合Security
SpringSecurity是Spring框架的一个安全模块，它提供了对应用程序的安全性管理功能，包括身份验证、授权、会话管理等。SpringSecurity可以让开发者更加简单地实现应用程序的安全性管理。

SpringBoot整合SpringSecurity是SpringBoot与SpringSecurity的集成，可以让开发者更加简单地实现应用程序的安全性管理。
身份验证是指用户提供身份信息，系统验证用户是否具有合法的身份。

授权是指用户具有合法的权限才能访问资源。SpringSecurity提供了多种授权方式，包括：
基于角色的授权：用户具有某个角色才能访问资源。
基于权限的授权：用户具有某个权限才能访问资源。
基于资源的授权：用户具有某个资源才能访问资源。

会话管理是指系统管理用户的会话，包括会话创建、会话销毁等。SpringSecurity提供了多种会话管理方式，包括：
基于Cookie的会话管理：用户通过Cookie保存会话信息，系统通过Cookie验证会话信息。
基于Token的会话管理：用户通过Token保存会话信息，系统通过Token验证会话信息。
基于Session的会话管理：用户通过Session保存会话信息，系统通过Session验证会话信息。


 navcat上传图片到mysql 方法 
测试版本 nvcat15.0.9 mysql5.7.24

目前测试仅支持 .jpg .png .bmp
注 图片不要太大 太大可能会引起安卓加载速度过慢 或者崩溃 一般几十个kb或几百个kb即可，如图片太大 可重新截图后保存  或变小 再转换 本人测试200条数据 一条数据里的图片大小再900kb左右 模拟器加载时间大概10秒 模拟器版本 api29 googleapis10 x86系统
