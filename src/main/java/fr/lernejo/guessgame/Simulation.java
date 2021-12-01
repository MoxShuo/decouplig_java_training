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
        long playerNumber = player.askNextGuess();

        if(playerNumber == this.numberToGuess)
        {
            logger.log("C'est exact l'âge du capitaine est : "+ this.numberToGuess);
            return true;
        }
        else {
            if(playerNumber > this.numberToGuess)
            {
                logger.log("Votre nombre est plus grand que l'âge du capitaine");
                player.respond(true);

            }
            else
            {
                logger.log("Votre nombre est plus petit que l'âge du capitaine");
                player.respond(false);

            }
            return false;
        }


    }


    public void loopUntilPlayerSucceed(long p_Tentative) {
        //TODO implement me
        logger.log("Debut du jeu");
        long fin = 0;
        long Tentative = p_Tentative;
        long debut = System.currentTimeMillis();

        while(!this.nextRound())
        {
            Tentative = Tentative - 1;
            if(Tentative == 0)
            {
                fin = System.currentTimeMillis();
                logger.log("Le joueur a utilisé toute ses tentatives");
                break;
            }
        }
        if(Tentative>0)
        {
            logger.log("Le joueur a trouvé l'âge du capitaine et il lui reste" +" " +Tentative+" " + "tentatives");
            fin = System.currentTimeMillis();

        }
        long Duree = fin - debut;
        int ms = (int)Duree%1000;
        int s = (int)(Duree-ms)/1000;
        int mins = (int)(Duree-s-ms)/60000;
        String S_ms = String.valueOf(ms);
        String S_s = String.valueOf(s);
        String S_mins = String.valueOf(mins);
        logger.log("La game a duree : "+S_mins+" "+S_s+" "+S_ms);
    }

}
