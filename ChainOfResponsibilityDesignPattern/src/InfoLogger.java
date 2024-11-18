public class InfoLogger extends  Logger{
    InfoLogger(Logger logger) {
        super(logger);
    }

    public void log(LogLevel logLevel,String textToLog)
    {
        if(logLevel.equals(LogLevel.INFO))
        {
            System.out.println(textToLog);
        }
        else {
            super.log(logLevel,textToLog);
        }
    }
}
