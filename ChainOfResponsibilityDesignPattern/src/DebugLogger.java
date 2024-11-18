public class DebugLogger extends  Logger{



    DebugLogger(Logger logger) {
        super(logger);
    }

    public void log(LogLevel logLevel,String textToLog)
    {
        if(logLevel.equals(LogLevel.DEBUG))
        {
            System.out.println(textToLog);
        }
        else {
            super.log(logLevel,textToLog);
        }
    }
}
