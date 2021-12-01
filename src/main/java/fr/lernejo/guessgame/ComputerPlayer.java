package fr.lernejo.guessgame;

import fr.lernejo.logger.Logger;
import fr.lernejo.logger.LoggerFactory;
import java.util.Scanner;


public class ComputerPlayer implements Player
{
    Logger logger = LoggerFactory.getLogger("player");
    private long minimum = 0;
    private long maximum = Long.MAX_VALUE;

    private long Last_guess_number;

    @Override
    public long askNextGuess()
    {
        logger.log("Le minimum est : "+minimum);
        logger.log("Le maximum est : "+maximum);

        final long guess_number = (minimum + maximum)/2;
        Last_guess_number = guess_number;
        logger.log("Le choix du robot est : "+guess_number);
        return guess_number;
    }

    @Override
    public void respond(boolean lowerOrGreater)
    {
        if(lowerOrGreater)
        {
            logger.log("Votre choix"+ Last_guess_number +"est plus grand que l'âge");
            maximum = Last_guess_number;
        }
        else
        {
            logger.log("Votre choix"+ Last_guess_number +"est plus petit que l'âge");
            minimum = Last_guess_number;
        }
    }
}
