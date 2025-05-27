import java.util.ArrayList;
import java.util.Scanner;

public class zz {
    public static void main(String[] args) {
        //INTRODUCTION STARTS
        introduction.intro();
        //PLAYER CONSTRUCTOR
        Player player = new Player("Player", 10.0, 3);

        
        Scanner playerMoveInputScan = new Scanner(System.in);
        Scanner playerDecisionInputScan = new Scanner(System.in);
        int[] playerPosition = {1, 1};

        ArrayList<String> inventoryArray = new ArrayList<String>();
        boolean gameOver = false;
        boolean movePaused = false;
        boolean npcInteractedWith = false;
        boolean zombieDefeated = false;

//MOVEMENT CODE
        while (gameOver == false) {
            while (movePaused == false) {
                System.out.println("Use WASD to move, or I to open your backpack.");
                System.out.println("YOU ARE IN ROOM: " + playerPosition[0] + ", " + playerPosition[1] + ".");
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

                        case "I":
                        if (inventoryArray.isEmpty()) {
                            System.out.println("YOUR BACKPACK IS EMPTY.");
                        } else {
                            System.out.println("YOUR BACKPACK CONTAINS: " + inventoryArray);
                        }
                            break;
                        
                        default: System.out.println("INVALID INPUT");
                            break;
                    }

//RESETS PLAYER TO 1/1 IF OUT OF BOUNDS
                if (playerPosition[0] >= 6 || playerPosition[0] <= 0 || playerPosition[1] >= 6 || playerPosition[1] <= 0) {
                    System.out.println("OUT OF BOUNDS");
                    playerPosition[0] = 1;
                    playerPosition[1] = 1;
                    }

                String playerPositionString = playerPosition[0] + ", " + playerPosition[1];

                switch (playerPositionString) {
                    case "5, 5":
                    System.out.println("You spot a man lying against the wall.");
                    if (npcInteractedWith == false) {
                        movePaused = true;
                        System.out.println("'Name's Christian. This base was overrun with these things a couple hours ago. From my guess, I'm the only one who's still alive. I'm badly wounded... there's no saving me. Listen, I need a favor from you. Please... end my suffering. In return, I'll give you my medkit.'' (Y/N)");
                        String playerDecisionInput = playerDecisionInputScan.nextLine().toUpperCase();

                        switch (playerDecisionInput) {
                            case "Y":
                            System.out.println("You steady your hand and do what must be done. Christian's suffering ends peacefully. You take the medkit he left behind. 'This should keep you alive out there,' you whisper to yourself.");
                            inventoryArray.add("Medkit");
                            movePaused = false;
                            npcInteractedWith = true;
                            break;
                    
                        default:
                            System.out.println("While you're walking away, the soldier bites you. Game Over!");
                            gameOver = true;
                            break;
                        }
                    } else {
                        System.out.println("Christian lies still.");
                    }
                    
                        break;


                    case "1, 2": //CAFETERIA
                        System.out.println("The Cafeteria has been ransacked, save for some loose energy drink cans. Take one? (Y/N)");
                        movePaused = true;
                        String playerDecisionInput = playerDecisionInputScan.nextLine().toUpperCase();
                        switch (playerDecisionInput) {
                            case "Y":
                                inventoryArray.add("Energy Drink");
                                System.out.println("You grab an energy drink and store it in your bag. YOUR BACKPACK CONTAINS: " + inventoryArray);
                                movePaused = false;
                                break;
                        
                            default:
                                break;
                        }
                        break;

                    case "1, 3": //ARMOURY ZOMBIE COMBAT STARTS
                        System.out.println("YOU ARE IN THE ARMOURY.");
                        if (!zombieDefeated) {
                            combatSystem.combatStart(player);
                            if (player.isAlive()) {
                                zombieDefeated = true;
                            } else {
                                System.out.println("You have died");
                                break;
                            }
                        }
                        break;

                    case "4, 4": //RADIO ROOM
                        System.out.println("YOU ARE IN THE RADIO ROOM.");
                        break;

                    case "1, 5": //LAUNDRY
                        System.out.println("YOU ARE IN THE LAUNDRY.");
                        break;

                    case "3, 5": //BARRACKS
                        System.out.println("YOU ARE IN THE BARRACKS.");
                        break;

                    case "4, 5": //GARAGE ZOMBIE COMBAT STARTS
                        System.out.println("YOU ARE IN THE GARAGE.");
                        System.out.println("You are in the garage room a zombie has appeared!. ");
                        zombieNpc zombieWorker = new zombieNpc("Zombie soldier", 2, 2);
                        combatSystem.combatStart(player);
                        break;

                    case "5, 1": //HELIPAD
                        System.out.println("YOU ARE AT THE HELIPAD.");
                        break;

                    case "3, 3": //MEDICAL WARD
                        System.out.println("YOU ARE IN THE MEDICAL WARD.");
                        break;
                
                    default:
                        System.out.println("This hallway is empty.");
                        break;
                }
            }
        }

        

        if (movePaused == true) {

            System.out.println("combat code goes here");

        }
    }
}
