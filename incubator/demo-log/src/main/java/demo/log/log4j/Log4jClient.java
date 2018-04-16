package demo.log.log4j;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;


public class Log4jClient {

    public static void main(String[] args) {
//        PropertyConfigurator.configure("log4j.properties");
        //在后台输出
        Logger logger1 = Logger.getLogger("console");
        logger1.debug("debug!!!");
        logger1.info("info!!!");
        logger1.warn("warn!!!");
        logger1.error("error!!!");
        logger1.fatal("fatal!!!");

        //在NT系统日志输出
        Logger logger2 = Logger.getLogger("NTlog");

        //NTEventLogAppender nla = new NTEventLogAppender();
        logger2.debug("debug!!!");
        logger2.info("info!!!");
        logger2.warn("warn!!!");
        logger2.error("error!!!");

        //只有这个错误才会写入2000日志
        logger2.fatal("fatal!!!");

        //把日志发送到mail
        Logger logger3 = Logger.getLogger("MailLog");
        //SMTPAppender sa = new SMTPAppender();
        logger3.warn("warn!!!");
        logger3.error("error!!!");
        logger3.fatal("fatal!!!");

    }

}
