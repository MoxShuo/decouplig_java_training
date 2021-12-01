package fr.lernejo.logger;


public class LoggerFactory{
    public static Logger getLogger(String Name){
        return new ContextualLogger(new FileLogger("FileLog.log"));
    }
}

