package Move;

public class Main {
    public static void main(String[] args) {

        Rover rover = new Rover(0, 0, "N");
        rover.executeCommands("MMMM");
        rover.printStatus();
    }
}