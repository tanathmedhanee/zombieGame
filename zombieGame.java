import java.util.Scanner;

public class zombieGame {
    public static void main(String[] args) {
        Scanner playerMoveInputScan = new Scanner(System.in);
        Scanner playerDecisionInputScan = new Scanner(System.in);
        int[] playerPosition = {1, 1};
        boolean gameOver = false;
        boolean inCombat = false;
        boolean npcInteractedWith = false;

//MOVEMENT CODE
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

//RESETS PLAYER TO 1/1 IF OUT OF BOUNDS
                if (playerPosition[0] >= 6 || playerPosition[0] <= 0 || playerPosition[1] >= 6 || playerPosition[1] <= 0) {
                    System.out.println("out of bounds");
                    playerPosition[0] = 1;
                    playerPosition[1] = 1;
                    }
    
//NPC INTERACTION 5/5
                    if (playerPosition[0] == 5 && playerPosition[1] == 5 && npcInteractedWith == false) {
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

//CAFETERIA 1/1
                if (playerPosition[0] == 1 && playerPosition[1] == 1) {
                    System.out.println("you are in the cafeteria at " + playerPosition[0] + ", " + playerPosition[1]);
                    inCombat = true;
                }

//ARMOURY 1/3
                if (playerPosition[0] == 1 && playerPosition[1] == 3) {
                    System.out.println("you are in the armoury at " + playerPosition[0] + ", " + playerPosition[1]);
                    inCombat = true;
                }

//RADIO ROOM 4/4
                if (playerPosition[0] == 4 && playerPosition[1] == 4) {
                    System.out.println("you are in the radio room bay at " + playerPosition[0] + ", " + playerPosition[1]);
                    inCombat = true;
                }

//LAUNDRY 1/5
                if (playerPosition[0] == 1 && playerPosition[1] == 5) {
                    System.out.println("you are in the cleaning room (laundry) " + playerPosition[0] + ", " + playerPosition[1]);
                    inCombat = true;
                }

//BARRACKS 3/5
                if (playerPosition[0] == 3 && playerPosition[1] == 5) {
                    System.out.println("you are in the barracks at " + playerPosition[0] + ", " + playerPosition[1]);
                    inCombat = true;
                }

//GARAGE 4/5
                if (playerPosition[0] == 4 && playerPosition[1] == 5) {
                    System.out.println("you are in the garage (room) at " + playerPosition[0] + ", " + playerPosition[1]);
                    inCombat = true;
                }

//HELIPAD 5/1
                if (playerPosition[0] == 5 && playerPosition[1] == 1) {
                    System.out.println("you are at the helipad at " + playerPosition[0] + ", " + playerPosition[1]);
                    inCombat = true;
                }
                
//MEDIC BAY 3/3
                if (playerPosition[0] == 3 && playerPosition[1] == 1) {
                    System.out.println("you are in the medic bay " + playerPosition[0] + ", " + playerPosition[1]);
                    inCombat = true;
                }
            }
        }

        if (inCombat == true) {

            System.out.println("combat code goes here");

        }
    }
}
