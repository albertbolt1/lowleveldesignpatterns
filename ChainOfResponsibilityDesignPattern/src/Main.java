public class Main {
    public static void main(String[] args) {

        Logger logger= new DebugLogger(new InfoLogger(new ErrorLogger(null)));


        logger.log(LogLevel.DEBUG,"my name is teja");
        logger.log(LogLevel.ERROR,"my name is teja");
    }
}