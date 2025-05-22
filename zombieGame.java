import java.util.Scanner;

public class zombieGame {
    public static void main(String[] args) {
        Scanner playerMoveInputScan = new Scanner(System.in);
        Scanner playerDecisionInputScan = new Scanner(System.in);
        int[] playerPosition = {1, 1};
        boolean gameOver = false;
        boolean inCombat = false;
        boolean npcInteractedWith = false;

        while (gameOver == false) {
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
    
                if (playerPosition[0] >= 6 || playerPosition[0] <= 0 || playerPosition[1] >= 6 || playerPosition[1] <= 0) {
                    System.out.println("out of bounds");
                    playerPosition[0] = 1;
                    playerPosition[1] = 1;
                    }
    
                if (playerPosition[0] == 5 && playerPosition[1] == 5 && npcInteractedWith == false) { //NPC interaction
                    System.out.println("you spot an injured man in room " + playerPosition[0] + ", " + playerPosition[1]);
                    inCombat = true;
                    System.out.println("Name's Christian. This base was overrun with these things a couple hours ago. From my guess, I'm the only one who's still alive. I'm badly wounded... there's no saving me. Listen, I need a favor from you. Please... end my suffering. In return, I'll give you my medkit. (Y/N)");
                    String playerDecisionInput = playerDecisionInputScan.nextLine().toUpperCase();

                    switch (playerDecisionInput) {
                        case "Y":
                        System.out.println("You steady your hand and do what must be done. Christian's suffering ends peacefully. You take the medkit he left behind. 'This should keep you alive out there,' you whisper to yourself.");
                        //give player medkit
                        inCombat = false;
                        npcInteractedWith = true;
                            break;
                    
                        default:
                        System.out.println("While you're walking away, the soldier bites you. Game Over!");
                        gameOver = true;
                            break;
                    }
                }
    
                if (playerPosition[0] == 2 && playerPosition[1] == 2) { //put rooms of interest in here, change to switch case later
                    System.out.println("a zombie attacks you in " + playerPosition[0] + ", " + playerPosition[1]);
                    inCombat = true;
                }
            }
        }

        if (inCombat == true) {

            System.out.println("combat code goes here");

        }
    }
}
