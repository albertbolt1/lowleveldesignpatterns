public abstract class Logger {

    Logger logger ;

    Logger(Logger logger)
    {
        this.logger= logger;
    }

    public void log(LogLevel logLevel,String logText)
    {
        if(logger!=null)
        {
            logger.log(logLevel,logText);
        }
    }
}
