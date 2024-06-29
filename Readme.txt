移动应用开发大作业
题目：微信点餐小程序
小组组员（1人）：杨凡


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
