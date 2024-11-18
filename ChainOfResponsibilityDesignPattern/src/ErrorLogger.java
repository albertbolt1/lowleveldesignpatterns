public class ErrorLogger extends Logger{
    ErrorLogger(Logger logger) {
        super(logger);
    }

    public void log(LogLevel logLevel,String textToLog)
    {
        if(logLevel.equals(LogLevel.ERROR))
        {
            System.out.println(textToLog);
        }
        else {
            super.log(logLevel,textToLog);
        }
    }
}
