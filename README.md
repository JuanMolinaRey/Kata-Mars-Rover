# Kata Mars Rover Project
 
This project implements the movement of a Rover that navigates on a 10x10 rectangular plateau, following a series of commands. The Rover can move forward, turn left and right, and detect obstacles in its path. Additionally, it can report its current position and the direction it is facing.

## Project Description

### `Rover` Class

The `Rover` class represents the explorer vehicle with the following functionalities:

- **Forward Movement**: The Rover can move in eight cardinal directions (N, NE, E, SE, S, SW, W, NW).
- **Obstacle Detection**: The Rover detects obstacles in its path and avoids collisions.
- **Turns**: The Rover can turn left (`L`) or right (`R`) in 45-degree increments.
- **Command Execution**: A command sequence can be provided, which the Rover will execute sequentially.

### Main Methods

- `moveForward()`: Moves the Rover one unit in the current direction.
- `turnLeft()`: Turns the Rover 45 degrees to the left.
- `turnRight()`: Turns the Rover 45 degrees to the right.
- `executeCommands(String commands)`: Executes a series of commands that may include moving forward (`M`), turning left (`L`), or turning right (`R`).
- `printStatus()`: Prints the current position of the Rover and the direction it is facing.

## Usage

### 1. Obstacle Configuration

Obstacles are defined as a set of coordinates in the form `"x,y"`:
Set<String> obstacles = new HashSet<>();
obstacles.add("2,3");
obstacles.add("1,5");

**Development Tools**

## Links

- [Flowchart](https://miro.com/app/board/uXjVKmtmd_s=/)
- [Project Presentation](https://www.canva.com/design/DAGOqs_iNbc/xk3Tj-MZGaAbcif1chNF2A/view?utm_content=DAGOqs_iNbc&utm_campaign=designshare&utm_medium=link&utm_source=editor)



