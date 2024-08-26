package Obstacle;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> obstacles = new HashSet<>();
        obstacles.add("0,1");
        obstacles.add("5,5");

        Rover rover = new Rover(0, 0, "N", obstacles);
        rover.executeCommands("MMRMMRM");
        rover.printStatus();
    }
}