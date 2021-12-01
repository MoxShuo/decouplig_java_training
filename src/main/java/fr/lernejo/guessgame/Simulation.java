package fr.lernejo.guessgame;

import fr.lernejo.logger.Logger;
import fr.lernejo.logger.LoggerFactory;
import java.util.Scanner;

public class Simulation {

    private final Logger logger = LoggerFactory.getLogger("simulation");
    private final Player player;  //TODO add variable type
    private long numberToGuess; //TODO add variable type

    public Simulation(Player player) {
        //TODO implement me
        this.player = player;
    }

    public void initialize(long numberToGuess) {
        //TODO implement me
        this.numberToGuess = numberToGuess;
    }

    /**
     * @return true if the player have guessed the right number
     */
    private boolean nextRound()
    {
        //TODO implement me
        Scanner scanner = new Scanner(System.in);
        long playerNumber = scanner.nextLong();

        if(playerNumber == this.numberToGuess)
        {
            logger.log("C'est exact l'âge du capitaine est : "+ this.numberToGuess);
            return true;
        }
        if(playerNumber > this.numberToGuess)
        {
            logger.log("Votre nombre est plus grand que l'âge du capitaine");
            return false;

        }
       else
        {
            logger.log("Votre nombre est plus petit que l'âge du capitaine");
            return false;

        }

    }


    public void loopUntilPlayerSucceed() {
        //TODO implement me
        logger.log("Debut du jeu");
        boolean var;
        do{
            var = nextRound();

        }while (var == false);
        //int Tentative = 1000;
        //long depart = System.currentTimeMillis();
        /*while(!this.nextRound())
        {
            Tentative = Tentative - 1;
            if(Tentative == 0)
            {
                break;
            }
        }
        if(Tentative>0)
        {
            logger.log("Le joueur a trouvé l'âge du capitaine et il lui reste" + Tentative + "tentatives");
            long fin = System.currentTimeMillis();

        }*/
    }
}
