package fr.lernejo.guessgame;
import fr.lernejo.logger.Logger;
import fr.lernejo.logger.LoggerFactory;
import java.security.SecureRandom;


public class Launcher
{
    private static final Logger logger = LoggerFactory.getLogger("Launcher");
    public static void main(String[] args)
    {
        if (args[0].equals("-interactive"))
        {
            logger.log("Mode interactif enclenché");
            SecureRandom random = new SecureRandom();
            long RandomNumber = random.nextInt(100);
            HumanPlayer player = new HumanPlayer();
            Simulation simulation = new Simulation(player);
            simulation.initialize(RandomNumber);
            simulation.loopUntilPlayerSucceed(Long.MAX_VALUE);
        }
        if (args[0].equals("-auto"))
       {
           logger.log("Mode auto enclenché");
           final long number = Long.parseLong(args[1]);

           logger.log("Le nombre est : "+number);
           final Player player = new ComputerPlayer();
           final Simulation simulation = new Simulation(player);
           simulation.initialize(number);
           simulation.loopUntilPlayerSucceed(500);
           return;
       }
        logger.log("Guide d'aide");
        System.out.println("Les arguments sont :");
        System.out.println("-interactive");
        System.out.println("-auto [nombre a trouvé]");
   }

}
