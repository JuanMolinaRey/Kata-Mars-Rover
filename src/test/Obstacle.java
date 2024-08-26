package Test;

/*import org.junit.jupiter.api.Test;
import java.util.HashSet;
import java.util.Set;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoverTest {

    @Test
    public void testInitialPositionAndDirection() {
        Set<String> obstacles = new HashSet<>();
        Rover rover = new Rover(0, 0, "N", obstacles);
        rover.printStatus(); // Para verificar visualmente
        assertEquals(0, rover.getX());
        assertEquals(0, rover.getY());
        assertEquals("N", rover.getDirection());
    }

    @Test
    public void testMoveForwardWithoutObstacles() {
        Set<String> obstacles = new HashSet<>();
        Rover rover = new Rover(0, 0, "N", obstacles);
        rover.moveForward();
        assertEquals(0, rover.getX());
        assertEquals(1, rover.getY());
    }

    @Test
    public void testMoveForwardWithObstacle() {
        Set<String> obstacles = new HashSet<>();
        obstacles.add("0,1"); // Obstáculo en la posición a la que el rover intentará moverse
        Rover rover = new Rover(0, 0, "N", obstacles);
        rover.moveForward();
        assertEquals(0, rover.getX());
        assertEquals(0, rover.getY()); // La posición no debería cambiar
    }

    @Test
    public void testTurnLeft() {
        Set<String> obstacles = new HashSet<>();
        Rover rover = new Rover(0, 0, "N", obstacles);
        rover.turnLeft();
        assertEquals("NW", rover.getDirection());
    }

    @Test
    public void testTurnRight() {
        Set<String> obstacles = new HashSet<>();
        Rover rover = new Rover(0, 0, "N", obstacles);
        rover.turnRight();
        assertEquals("NE", rover.getDirection());
    }

    @Test
    public void testExecuteCommands() {
        Set<String> obstacles = new HashSet<>();
        obstacles.add("2,2");
        obstacles.add("2,1");
        Rover rover = new Rover(0, 0, "N", obstacles);
        rover.executeCommands("RMMRM");
        assertEquals(1, rover.getX());
        assertEquals(1, rover.getY());
        assertEquals("E", rover.getDirection());
    }

    @Test
    public void testExecuteCommandsWithObstacle() {
        Set<String> obstacles = new HashSet<>();
        obstacles.add("1,1"); // Obstáculo en la posición a la que el rover intentará moverse
        Rover rover = new Rover(0, 0, "N", obstacles);
        rover.executeCommands("RMM");
        assertEquals(0, rover.getX());
        assertEquals(1, rover.getY()); // La posición del rover debería ser (0, 1) ya que el segundo movimiento se detiene por el obstáculo
    }
}*/
