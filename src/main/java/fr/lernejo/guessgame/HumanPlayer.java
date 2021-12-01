package fr.lernejo.guessgame;

import fr.lernejo.logger.Logger;
import fr.lernejo.logger.LoggerFactory;
import java.util.Scanner;


public class HumanPlayer implements Player
{
    Logger logger = LoggerFactory.getLogger("player");
    Scanner scanner = new Scanner(System.in);

    @Override
    public long askNextGuess()
    {
        System.out.println("Entrez un nombre : ");

        final long guess_number = scanner.nextLong();
        logger.log("Le joueur a joué "+ guess_number);
        scanner.nextLine();
        return 0;
    }

    @Override
    public void respond(boolean lowerOrGreater)
    {
        if(lowerOrGreater)
        {
            System.out.println("Votre nombre est plus grand que l'âge");
        }
        else
        {
            System.out.println("Votre nombre est plus petit que l'âge");
        }
    }
}
