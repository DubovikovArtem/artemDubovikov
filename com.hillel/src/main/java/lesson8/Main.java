package lesson8;

public class Main {
    public static void main(String[] args) {
        new Logger().startLogging("incorrect","DEBUG");
        new Logger().startLogging(Logger.DEBUG,"DEBUG");
        new Logger().startLogging(Logger.INFO,"INFO");
        new Logger().startLogging(Logger.WARN,"WARN");
        new Logger().startLogging(Logger.ERROR,"ERROR");
    }
}
