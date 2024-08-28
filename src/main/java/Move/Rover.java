package Move;

import java.util.Set;

public class Rover {
    private int y;
    private int x;
    private String direction;
    private final Set<String> obstacles;


    public Rover(int x, int y, String direction, Set<String> obstacles) {
        this.x = x;
        this.y = y;
        this.direction = direction;
        this.obstacles = obstacles;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getDirection() {
        return direction;
    }


    private boolean isObstacle(int nextX, int nextY) {
        return obstacles.contains(nextX + "," + nextY);
    }

    public void moveForward(){
        int nextX = x;
        int nextY = y;

        switch(direction) {
            case "N"  : nextY += 1; break;
            case "E"  : nextX += 1; break;
            case "S"  : nextY -= 1; break;
            case "W"  : nextX -= 1; break;
            case "NE" : nextX += 1; nextY += 1; break;
            case "SE" : nextY -= 1; nextX += 1; break;
            case "SW" : nextX -= 1; nextY -= 1; break;
            case "NW" : nextX -= 1; nextY += 1; break;
        }

        if (nextX < -10 || nextX > 10 || nextY < -10 || nextY > 10) {
            System.out.println("Impossible movement: out of plateau bounds (" + nextX + "," + nextY + ")");
        } else if (isObstacle(nextX, nextY)) {
            System.out.println("Impossible movement: there is an obstacle in (" + nextX + "," + nextY + ")");
        } else {
            x = nextX;
            y = nextY;
        }

    }
    public void turnLeft(){
        switch(direction){
            case "N" : direction = "NW"; break;
            case "NW" : direction = "W"; break;
            case "W" : direction = "SW"; break;
            case "SW" : direction = "S"; break;
            case "S" : direction = "SE"; break;
            case "SE" : direction = "E"; break;
            case "E" : direction = "NE"; break;
            case "NE" : direction = "N"; break;

        }
    }
    public void turnRight(){
        switch (direction){
            case "N" : direction = "NE"; break;
            case "NE" : direction = "E"; break;
            case "E" : direction = "SE"; break;
            case "SE" : direction = "S"; break;
            case "S" : direction = "SW"; break;
            case "SW" : direction = "W"; break;
            case "W" : direction = "NW"; break;
            case "NW" : direction = "N"; break;
        }
    }

    public void executeCommands(String commands){
         for (char command : commands.toCharArray()) {
             switch (command) {
                 case 'M' : moveForward(); break;
                 case 'R' : turnRight(); break;
                 case 'L' : turnLeft(); break;
             }
         }
    }

    public void printStatus(){
        System.out.println("The rover is at (" + x + " , " + y +") looking at "  + direction);
    }

}

