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