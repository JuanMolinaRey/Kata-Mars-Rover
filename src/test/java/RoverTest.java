import Move.Rover;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.HashSet;
import java.util.Set;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoverTest {

    private Rover rover;

    @BeforeEach
    public void setUp() {
        Set<String> obstacles = new HashSet<>();
        rover = new Rover(0, 0, "N", obstacles);
    }

    @Test
    public void test_MoveForward() {
        rover.moveForward();
        assertEquals(0, rover.getX());
        assertEquals(1, rover.getY());
    }

    @Test
    public void test_MoveForward_With_Obstacles() {
        Set<String> obstacles = new HashSet<>();
        obstacles.add("0,1");
        rover = new Rover(0, 0, "N", obstacles);

        rover.moveForward();
        assertEquals(0, rover.getX());
        assertEquals(0, rover.getY());
    }

    @Test
    public void test_TurnLeft() {
        rover.turnLeft();
        assertEquals("NW", rover.getDirection());

        rover.turnLeft();
        assertEquals("W", rover.getDirection());

        rover.turnLeft();
        assertEquals("SW", rover.getDirection());

        rover.turnLeft();
        assertEquals("S", rover.getDirection());

    }

    @Test
    public void test_TurnRight() {
        rover.turnRight();
        assertEquals("NE", rover.getDirection());

        rover.turnRight();
        assertEquals("E", rover.getDirection());

        rover.turnRight();
        assertEquals("SE", rover.getDirection());

        rover.turnRight();
        assertEquals("S", rover.getDirection());

    }

    @Test
    public void test_Execute_Commands() {
        rover.executeCommands("MMRMM");
        assertEquals(2, rover.getX());
        assertEquals(4, rover.getY());
        assertEquals("NE", rover.getDirection());
    }

    @Test
    public void test_Execute_Commands_With_Obstacles() {
        Set<String> obstacles = new HashSet<>();
        obstacles.add("1,1");
        rover = new Rover (0, 0, "N", obstacles);

        rover.executeCommands("RMRM");
        assertEquals(1, rover.getX());
        assertEquals(0, rover.getY());
    }

}