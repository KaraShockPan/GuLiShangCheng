# GuLiShangCheng  
bilibili网站尚硅谷项目视频

##2020-02-29 15:33:02  
·提交测试
·只提交pom.xml文件和src目录下的源代码  
·git-->add-->git-->Commit Directory-->Commit  
·git-->Repository-->Push  

##2020-02-29 16:11:09  
新建Module-->spring initializr 2.2.5
group:com.atguigu.gmall  
artifact:gmall-user  
package:com.atguigu.gmall.user  
勾选 Web MySQL JDBC MyBatis  
上传  

##2020-02-29 16:29:48  
gmall-user Module  
在resources目录下创建mapper文件夹  
    新建UserMapper.xml
编辑application.properties文件，加入服务端口号，jdbc，mybatis相关配置  
在java目录下新建  
com.atguigu.gmall.user.controller 包    
    新建UserController类  
com.atguigu.gmall.user.service 包  
    新建UserService接口  
    新建com.atguigu.gmall.user.service.impl 包  
        新建UserServiceImpl类
com.atguigu.gmall.user.mapper 包  
    新建UserMapper接口  
com.atguigu.gmall.user.bean 包  
可以运行GmallUserApplication，在localhost中访问到UserController的index方法    

##2020-02-29 22:56:00  
实现：访问localhost:8080/getAllUser 显示ums_member表所有数据  

##2020-03-01 00:18:56
使用通用mapper，加入tk.mybatis后会一直报  
Caused by: java.util.NoSuchElementException: No value bound  
和  
Caused by: java.lang.reflect.InvocationTargetException  
的错误，将tk.mybatis的版本从1.2.3改为2.0.2后项目正常启动  

##2020-03-01 11:26:10  
实现根据memberId查询所有数据，将日志级别设置到debug来显示sql语句  

##2020-03-01 15:15:06  
新建Maven Module：  
gmall-parent:导入所有的jar包进行版本控制  
和  
gmall-api:将bean和service接口转入，并引入bean所需的tk.mapper通用Mapper  

##2020-03-01 16:13:13
创建Maven Module：  
gmall-common-util gmall-service-util gmall-web-util  
并将 gmall-user 拆解  

##2020-03-02 22:00:44  
gmall-user-service用户服务的service层8070  
gmall-user-web用户服务的web层8080  

##2020-03-04 14:23:12  
因springboot2.2.5与dubbo2.6.0版本产生冲突  
所以将所有pom.xml文件与视频中统一  

##2020-03-06 10:42:44  
gmall-manage-service用户服务的service层8071  
gmall-manage-web用户服务的web层8081  

##2020-03-10 11:00:11  
使用Node.js访问前端页面，通过后端请求一级分类数据  

##2020-03-10 23:21:44  
显示三级分类失败，原因未知  

##2020-03-12 20:27:34  
三级分类未显示原因：controller-@RequestMapping后括号中内容大小写错误  
加入：增改查功能  
