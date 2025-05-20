import java.util.Scanner;

public class zombieGame {
    public static void main(String[] args) {
        Scanner playerMoveInputScan = new Scanner(System.in);
        int[] playerPosition = {0, 0};
        boolean inCombat = false;

        if (inCombat == true) {
            System.out.println("work");
        }

        while (inCombat == false) {
            System.out.println("use WASD to move");
            System.out.println("you are in room " + playerPosition[0] + ", " + playerPosition[1]);
            String playerMoveInput = playerMoveInputScan.nextLine().toUpperCase();
    
                switch (playerMoveInput) {
                    case "W":
                        playerPosition[0] = playerPosition[0] + 1;
                        break;
                    
                    case "A":
                    playerPosition[1] = playerPosition[1] + 1;
                        break;
                    
                    case "S":
                    playerPosition[0] = playerPosition[0] - 1;
                        break;
                        
                    case "D":
                    playerPosition[1] = playerPosition[1] - 1;
                        break;
                    
                    default: System.out.println("invalid input");
                        break;
                }

            if (playerPosition[0] >= 6 || playerPosition[0] <= -1 || playerPosition[1] >= 6 || playerPosition[1] <= -1) {
                System.out.println("out of bounds");
                playerPosition[0] = 0;
                playerPosition[1] = 0;
                }

            if (playerPosition[0] == 2) {
                System.out.println("combatt");
                inCombat = true;
            }
        }

        if (inCombat == true) {
            System.out.println("work");
        }
    }
}