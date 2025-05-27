import java.util.Scanner;

public class zombieGame {
    public static void main(String[] args) {
        Scanner playerMoveInputScan = new Scanner(System.in);
        Scanner playerDecisionInputScan = new Scanner(System.in);
        int[] playerPosition = {1, 1};

        boolean gameOver = false;
        boolean movePaused = false;
        boolean npcInteractedWith = false;

//MOVEMENT CODE
        while (gameOver == false) {
            while (movePaused == false) {
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

                String playerPositionString = playerPosition[0] + ", " + playerPosition[1];

                switch (playerPositionString) {
                    case "5, 5":
                    System.out.println("you spot an injured man in room " + playerPosition[0] + ", " + playerPosition[1]);
                    movePaused = true;
                    System.out.println("Name's Christian. This base was overrun with these things a couple hours ago. From my guess, I'm the only one who's still alive. I'm badly wounded... there's no saving me. Listen, I need a favor from you. Please... end my suffering. In return, I'll give you my medkit. (Y/N)");
                    String playerDecisionInput = playerDecisionInputScan.nextLine().toUpperCase();

                    switch (playerDecisionInput) {
                        case "Y":
                        System.out.println("You steady your hand and do what must be done. Christian's suffering ends peacefully. You take the medkit he left behind. 'This should keep you alive out there,' you whisper to yourself.");
                        //give player medkit
                        movePaused = false;
                        npcInteractedWith = true;
                            break;
                    
                        default:
                        System.out.println("While you're walking away, the soldier bites you. Game Over!");
                        gameOver = true;
                            break;
                    }
                        break;


                    case "1, 1": //CAFETERIA
                        System.out.println("you are in the XXX");
                        break;

                    case "1, 3": //ARMOURY
                        System.out.println("you are in the XXX");
                        break;

                    case "4, 4": //RADIO ROOM
                        System.out.println("you are in the XXX");
                        break;

                    case "1, 5": //LAUNDRY
                        System.out.println("you are in the XXX");
                        break;

                    case "3, 5": //BARRACKS
                        System.out.println("you are in the XXX");
                        break;

                    case "4, 5": //GARAGE
                        System.out.println("you are in the XXX");
                        break;

                    case "5, 1": //HELIPAD
                        System.out.println("you are in the XXX");
                        break;

                    case "3, 3": //MEDIC BAY
                        System.out.println("you are in the XXX");
                        break;
                
                    default:
                        System.out.println("empty room");
                        break;
                }
            }
        }

        if (movePaused == true) {

            System.out.println("combat code goes here");

        }
    }
}
