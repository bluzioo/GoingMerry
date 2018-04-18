
## 日志接口（门面）
主流的有commons-logging和sl4j


## 日志框架介绍
* Log4j(Log for Java) Apache Log4j是一个基于Java的日志记录工具。它是由Ceki Gülcü首创的，现在则是Apache软件基金会的一个项目。
* Log4j 2 Apache Log4j 2是apache开发的一款Log4j的升级产品，Log4j 2 不兼容Log4j。各个方面都与Logback非常相似。
* Commons Logging Apache基金会所属的项目，是一套Java日志接口，之前叫Jakarta Commons Logging，后更名为Commons Logging。
* Slf4j(Simple Logging Facade for Java) 类似于Commons Logging，是一套简易Java日志门面，本身并无日志的实现。
* Logback 一个“可靠、通用、快速而又灵活的Java日志框架”，属于(Slf4j阵营)
* Jul(Java Util Logging) 自Java1.4以来的官方日志实现

## 日志组件的桥接

### Commons Logging + Log4j
```
<dependency>
    <groupId>commons-logging</groupId>
    <artifactId>commons-logging</artifactId>
    <version>1.2</version>
</dependency>
<dependency>
    <groupId>log4j</groupId>
    <artifactId>log4j</artifactId>
    <version>1.2.17</version>
</dependency>
```

### Slf4j + Logback
```
<dependency>  
    <groupId>org.slf4j</groupId>  
    <artifactId>slf4j-api</artifactId>  
    <version>1.6.0</version>  
    <type>jar</type>  
    <scope>compile</scope>  
</dependency>  
<dependency>  
    <groupId>ch.qos.logback</groupId>  
    <artifactId>logback-core</artifactId>  
    <version>0.9.28</version>  
    <type>jar</type>  
</dependency>  
<dependency>  
    <groupId>ch.qos.logback</groupId>  
    <artifactId>logback-classic</artifactId>  
    <version>0.9.28</version>  
    <type>jar</type>  
</dependency>  
```

### Slf4j + Slf4j-Log4j + Log4j
```
<dependency>  
        <groupId>org.slf4j</groupId>  
        <artifactId>slf4j-api</artifactId>  
        <version>1.7.12</version>  
</dependency>  
<dependency>  
        <groupId>org.slf4j</groupId>  
        <artifactId>slf4j-log4j12</artifactId>  
        <version>1.7.12</version>  
</dependency>  
<dependency>  
        <groupId>log4j</groupId>  
        <artifactId>log4j</artifactId>  
        <version>1.2.17</version>  
</dependency>
```

## Log4j
```
<span style="font-size:14px;">// --------------------------------------- log4j.properties 配置开始 ---------------------------------------  
  
  
//  配置rootLogger  
log4j.rootLogger  =   [ level ]   ,  appenderName1 ,  appenderName2 ,  …  
  
//  对配置根Logger的说明（1）：  
//      类别 level 为 OFF、FATAL、ERROR、WARN、INFO、DEBUG、log、ALL或自定义的优先级  
//      Log4j常用的优先级：FATAL > ERROR > WARN > INFO > DEBUG   
//      ERROR 为严重错误 主要是程序的错误  
//      WARN 为一般警告，比如session丢失  
//      INFO 为一般要显示的信息，比如登录登出  
//      DEBUG 为程序的调试信息  
//  对配置根Logger的说明（2）：  
//      appenderName1,appenderName2...为配置每一个日志信息输出目的地的命名,可自行命名,同时可以指定多个输出目的地  
  
  
// < ------------------------- appenderName1 日志输出方式配置开始 ------------------------- >  
//  定义appenderName1的输出方式（appenderName指当前的日志信息输出目的地,当前为appenderName1）  
//  语法：log4j.appender.appenderName  =  fully.qualified.name.of.appender.class（日志输出目的地）  
log4j.appender.appenderName1  =  fully.qualified.name.of.appender.class  
  
//  定义appenderName1当前输出方式的参数 参数：option1...optionN  
log4j.appender.appenderName1.option1  =  value1   
　　…   
log4j.appender.appenderName1.optionN  =  valueN  
  
//  定义appenderName1的输出布局（appenderName指当前的日志信息输出目的地,当前为appenderName1）  
//  语法：log4j.appender.appenderName.layout = fully.qualified.name.of.layout.class（日志输出布局）  
log4j.appender.appenderName1.layout = fully.qualified.name.of.layout.class  
  
//  定义appenderName1当前输出布局的输出格式（appenderName指当前的日志信息输出目的地,当前为appenderName1）  
//  语法：log4j.appender.appenderName.layout.ConversionPattern=（日志输出格式）  
log4j.appender.appenderName1.layout.ConversionPattern=%-4r %-5p %d{yyyy-MM-dd HH:mm:ssS} %c %m%n  
// < ------------------------- appenderName1 日志输出方式配置结束 ------------------------- >  
  
  
// < ------------------------- appenderName2 日志输出方式配置开始 ------------------------- >  
//  定义appenderName2的输出方式（appenderName指当前的日志信息输出目的地,当前为appenderName2）  
//  语法：log4j.appender.appenderName  =  fully.qualified.name.of.appender.class（日志输出目的地）  
log4j.appender.appenderName2  =  fully.qualified.name.of.appender.class  
  
//  定义appenderName1当前输出方式的参数 参数：option1...optionN  
log4j.appender.appenderName2.option1  =  value1   
　　…   
log4j.appender.appenderName2.optionN  =  valueN  
  
//  定义appenderName2的输出布局（appenderName指当前的日志信息输出目的地,当前为appenderName2）  
//  语法：log4j.appender.appenderName.layout = fully.qualified.name.of.layout.class（日志输出布局）  
log4j.appender.appenderName1.layout = fully.qualified.name.of.layout.class  
  
//  定义appenderName2当前输出布局的输出格式（appenderName指当前的日志信息输出目的地,当前为appenderName2）  
//  语法：log4j.appender.appenderName.layout.ConversionPattern=（日志输出格式）  
log4j.appender.appenderName1.layout.ConversionPattern=%-4r %-5p %d{yyyy-MM-dd HH:mm:ssS} %c %m%n   
// < ------------------------- appenderName2 日志输出方式配置结束 ------------------------- >  
  
  
// ... 其它日志信息输出目的地 ...  
  
  
// --------------------------------------- log4j.properties 配置结束 ---------------------------------------</span>  
```



## Reference
https://my.oschina.net/xianggao/blog/539570
https://www.cnblogs.com/liufei-kuaile/p/7575779.html
https://blog.csdn.net/dslztx/article/details/47185027
https://blog.csdn.net/zzjvslove/article/details/74905468