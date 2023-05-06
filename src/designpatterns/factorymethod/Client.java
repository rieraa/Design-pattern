//designpatterns.factorymethod.Client.java
package designpatterns.factorymethod;

public class Client {
    public static void main(String[] args) {

        LoggerFactory factory;
        Logger logger;
        // ����ת��
        factory = new DatabaseLoggerFactory(); //�����������ļ�ʵ��
        //factory = (LoggerFactory)XMLUtil.getBean(); //getBean()�ķ�������ΪObject����Ҫ����ǿ������ת��

        logger = factory.createLogger();
        logger.writeLog();
    }
}