import java.util.ArrayList;
import java.util.Scanner;

public class zombieGame {
    public static void main(String[] args) {
        Scanner playerMoveInputScan = new Scanner(System.in);
        ArrayList<String> inventory = new ArrayList<>();
        Scanner playerDecisionInputScan = new Scanner(System.in);
        int[] playerPosition = {1, 1};
        boolean gameOver = false;
        boolean inCombat = false;
        boolean npcInteractedWith = false;

//INVENTORY SYSTEM


//MOVEMENT CODE
        while (gameOver == false) {
            while (inCombat == false) {
                System.out.println("use WASD to move or 'I' to view your inventory");
                System.out.println("you are in room " + playerPosition[0] + ", " + playerPosition[1]);
                String playerMoveInput = playerMoveInputScan.nextLine().toUpperCase();
              
                if (playerMoveInput.equals("I")) {
                    if (inventory.isEmpty()) {
                        System.out.println("Your inventory is empty.");
                    } else {
                        System.out.println("Inventory: " + inventory);
                    }
                    continue;
                }

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

                    String input = playerDecisionInputScan.nextLine().toUpperCase();
                    if (playerDecisionInput.equals("Y")){
                        System.out.println("You do what must be done. You take the medkit.");
                        if (!inventory.contains("Medkit")) {
                            inventory.add("Medkit");
                        }
                        npcInteractedWith = true;
                        inCombat = false;
                    } else {
                        System.out.println("He bites you as you turn away. Game Over!");
                        gameOver = true;
                    }
                }

//CAFETERIA 1/1
                if (playerPosition[0] == 1 && playerPosition[1] == 1) {
                    System.out.println("you are in the cafeteria at " + playerPosition[0] + ", " + playerPosition[1]);
                    inCombat = true;
                System.out.println("There is some food on the ground, are you going to pick it up?");
                String playerDecisionInput = playerDecisionInputScan.nextLine().toUpperCase;
                if (playerDecisionInput.equals("Y")){
                    inventory.add("Food");
                    System.out.println("You picked up the food");
                } else {
                    System.out.println("You left the food");
                }
            } else {
                System.out.println("You have already picked up the food");

            }
                }


//ARMOURY 1/3
                if (playerPosition[0] == 1 && playerPosition[1] == 3) {
                    System.out.println("you are in the armoury at " + playerPosition[0] + ", " + playerPosition[1]);
                    inCombat = true;
                System.out.println("You stepped on a Gun whilst walking in, will you pick it up");
                String playerDecisionInput = playerDecisionInputScan.nextLine().toUpperCase;
                if (playerDecisionInput.equals("Y")){
                    inventory.add("Gun");
                    System.out.println("You picked up the Gun");
                } else {
                    System.out.println("You left the Gun");
                }
            } else {
                System.out.println("You have already picked up the Gun");

            }
                }

//RADIO ROOM 4/4
                if (playerPosition[0] == 4 && playerPosition[1] == 4) {
                    System.out.println("you are in the radio room bay at " + playerPosition[0] + ", " + playerPosition[1]);
                    inCombat = true;
                System.out.println("The computer seems to be working, do you want to send a message for help?");
                String playerDecisionInput = playerDecisionInputScan.nextLine().toUpperCase;
                Random random = new Random();
                // Generate a random number between 1 and 20
        int targetNumber = random.nextInt(99) + 1 ;
        int userGuess = 0;
        System.out.println("Enter 2 digit password");
               // Loop until the user guesses correctly
        while (userGuess != targetNumber) {
            userGuess = myInput.nextInt();

            if (userGuess < targetNumber) {
                System.out.println("Higher!");
            } else if (userGuess > targetNumber) {
                System.out.println("Lower!");
            } else {
                System.out.println("Correct! You guessed the password.");
            }
        }
                    
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
                 System.out.println("You stepped on a the Helicopter keys on the corpse of a soldier, do you take it?");
                String playerDecisionInput = playerDecisionInputScan.nextLine().toUpperCase;
                if (playerDecisionInput.equals("Y")){
                    inventory.add("Helicopter Keys");
                    System.out.println("You picked up the Helicopter Keys");
                } else {
                    System.out.println("You left the Keys");
                }
            } else {
                System.out.println("You have already picked up the Keys");

            }
                }

//GARAGE 4/5
                if (playerPosition[0] == 4 && playerPosition[1] == 5) {
                    System.out.println("you are in the garage (room) at " + playerPosition[0] + ", " + playerPosition[1]);
                    inCombat = true;
                System.out.println("You see Helicopter Fuel on the shelf, do you take it?");
                String playerDecisionInput = playerDecisionInputScan.nextLine().toUpperCase;
                if (playerDecisionInput.equals("Y")){
                    inventory.add("Helicopter Fuel");
                    System.out.println("You picked up the Helicopter Fuel");
                } else {
                    System.out.println("You left the Fuel");
                }
            } else {
                System.out.println("You have already picked up the Fuel");

            }
                
                }

//HELIPAD 5/1
                if (playerPosition[0] == 5 && playerPosition[1] == 1) {
                    System.out.println("you are at the helipad at " + playerPosition[0] + ", " + playerPosition[1]);
                         if (inventory.contains("Helipad Keys") && inventory.contains("Helicopter Fuel")) {
                 System.out.println("You are at the helipad at " + playerPosition[0] + ", " + playerPosition[1]);
                 System.out.println("You have the keys and fuel! You board the helicopter and escape. You win!");
                 gameOver = true;
                
                 } else {
                 System.out.println("You found the helipad, but you're missing the necessary items to escape.");
                 System.out.println("You need both the Helipad Keys and Helicopter Fuel to leave.");
        // Optional: send player back to previous location or keep them there
        playerPosition[0] = 4; // move them back one space
        playerPosition[1] = 1;
    
    }                      
                inCombat = true;               
                }

//MEDIC BAY 3/3
                if (playerPosition[0] == 3 && playerPosition[1] == 1) {
                    System.out.println("you are in the medic bay " + playerPosition[0] + ", " + playerPosition[1]);
                    inCombat = true;
                System.out.println("There is a medkit on the ground, are you going to pick it up?");
                String playerDecisionInput = playerDecisionInputScan.nextLine().toUpperCase;
                if (inventory.contains("Medkit")) {
                System.out.println("You already have a medkit. You can't carry another.");
                } else {
                if (playerDecisionInput.equals("Y")) {
                inventory.add("Medkit");
                    System.out.println("You picked up the medkit");
                } else {
                    System.out.println("You left the medkit");
                }
           
          }
        
        
        if (inCombat == true)

            System.out.println("combat code goes here");
            