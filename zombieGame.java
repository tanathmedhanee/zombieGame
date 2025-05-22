import java.util.Scanner;
//github test
public class zombieGame {
    public static void main(String[] args) {
        Scanner playerMoveInputScan = new Scanner(System.in);
        int[] playerPosition = {1, 1};
        boolean inCombat = false;

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

            if (playerPosition[0] >= 7 || playerPosition[0] <= 0 || playerPosition[1] >= 7 || playerPosition[1] <= 0) {
                System.out.println("out of bounds");
                playerPosition[0] = 1;
                playerPosition[1] = 1;
                }

            if (playerPosition[0] == 2 && playerPosition[1] == 2) { //put rooms of interest in here, change to switch case later
                System.out.println("zombie in room 2, 2!");
                inCombat = true;
            }
        }

        if (inCombat == true) {

            System.out.println("combat code goes here");

        }
    }
}
