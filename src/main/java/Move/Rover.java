package Move;


public class Rover {

    private int x;
    private int y;
    private String direction;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getDirection() {
        return direction;
    }

    public Rover(int x, int y, String direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;

    }

    public void moveForward() {
        switch (direction) {
            case "N": y += 1;break;
            case "S": y -= 1;break;
            case "E": x += 1;break;
            case "W": x -= 1;break;
            case "NE": x += 1;y += 1;break;
            case "NW": x -= 1;y += 1;break;
            case "SE": x += 1;y -= 1;break;
            case "SW": x -= 1;y -= 1;break;
        }
    }

    public void turnLeft() {
        switch (direction) {
            case "N": direction = "NW";break;
            case "NW": direction = "W";break;
            case "W": direction = "SW";break;
            case "SW": direction = "S";break;
            case "S": direction = "SE";break;
            case "SE": direction = "E";break;
            case "E": direction = "NE";break;
            case "NE": direction = "N";break;
        }
    }

    public void turnRight() {
        switch (direction) {
            case "N": direction = "NE";break;
            case "NE": direction = "E";break;
            case "E": direction = "SE";break;
            case "SE": direction = "S";break;
            case "S": direction = "SW";break;
            case "SW": direction = "W";break;
            case "W": direction = "NW";break;
            case "NW": direction = "N";break;
        }
    }

    public void executeCommands(String commands) {
        for (char command : commands.toCharArray()) {
            switch (command) {
                case 'L': turnLeft();break;
                case 'R': turnRight();break;
                case 'M': moveForward();break;
            }
        }
    }

    public void printStatus() {
        System.out.println("The rover is at (" + x + ", " + y + ") looking at " + direction);
    }
}
