package fr.lernejo.logger;



public class LoggerFactory{
    public static Logger getLogger(String Name){
        return new ContextualLogger(new CompositeLogger(new ConsoleLogger(),new FilteredLogger(new FileLogger("Filelog.log"), (message) -> message.contains("fr.lernejo.guessgame.Simulation"))));
    }
}

