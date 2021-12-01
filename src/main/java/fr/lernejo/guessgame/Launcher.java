package fr.lernejo.guessgame;

import java.security.SecureRandom;

public class Launcher
{
    public static void main(String[] args)
    {
        SecureRandom random = new SecureRandom();
        long RandomNumber = random.nextInt(100);
        HumanPlayer player = new HumanPlayer();
        Simulation simulation = new Simulation(player);
        simulation.initialize(RandomNumber);
        simulation.loopUntilPlayerSucceed();
    }

}
