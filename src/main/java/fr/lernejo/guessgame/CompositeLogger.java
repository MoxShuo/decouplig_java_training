package fr.lernejo.guessgame;

import fr.lernejo.logger.Logger;

public class CompositeLogger implements Logger
{

    private final Logger[] loggers;

    public CompositeLogger(final Logger... loggers)
    {
        this.loggers = loggers;
    }

    @Override
    public void log(String message)
    {
        for(final Logger logger : loggers)
        {
            logger.log(message);
        }
    }
}
