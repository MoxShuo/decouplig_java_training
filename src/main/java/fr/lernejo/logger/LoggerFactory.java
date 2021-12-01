package fr.lernejo.logger;


import fr.lernejo.guessgame.CompositeLogger;

public class LoggerFactory{
    public static Logger getLogger(String Name){
        return new ContextualLogger(new CompositeLogger(new ConsoleLogger(),new FileLogger("Filelog.log")));
    }
}

