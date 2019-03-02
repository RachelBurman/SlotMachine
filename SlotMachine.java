import java.util.Random;
import java.util.Scanner;

public class SlotMachine{
    private static String[] slotArrays(){
        String[] reel1 = new String[]{"Jackpot", "Bomb", "Orange", "Bomb", "Orange", "Bomb", "Orange", "Bomb", "Seven", "Cherries", "Orange", "Bell", "Orange", "Strawberry", "Seven", "Orange", "Horn", "Bomb"};
        String[] reel2 = new String[]{"Jackpot", "Bell", "Horn","Bell", "Cherries", "Orange", "Bomb", "Cherries", "Bell", "Horn", "Bell", "Strawberry", "Bomb", "Seven", "Bell", "Horn", "Bell", "Strawberry"};
        String[] reel3 = new String[]{"Jackpot", "Cherries", "Orange", "Horn", "Orange", "Lemon", "Orange", "Bomb", "Orange", "Bomb", "Orange", "Bomb", "Bell", "Strawberry", "Seven", "Bell", "Cherries", "Lemon"};
        //create new method to call these so it can be played multiple times
        Random rand = new Random();
        String item1 = reel1[rand.nextInt(reel1.length)];
        String item2 = reel2[rand.nextInt(reel2.length)];
        String item3 = reel3[rand.nextInt(reel3.length)];
        String[] reelArray = new String[]{item1, item2, item3};
        return reelArray;
    }
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        int total = 0;
        System.out.println("Do you want to play a game?");
        String game = in.nextLine();
        while(game.equals("Yes")){
            total--;
            System.out.println("Spinning wheels...");
            String[] reelArray = slotArrays();
            System.out.println(reelArray[0] + " " + reelArray[1] + " " + reelArray[2]);
            if(reelArray[0] == reelArray[1] && reelArray[0] == reelArray[2]){
                if(reelArray[0].equals ("Jackpot")){
                    System.out.println("You have hit the Jackpot. You get £20");
                    total = total + 20;
                    System.out.println("You currently have: £" + total);
                }
            }
            else if((reelArray[0] == reelArray[1] && reelArray[0] != reelArray[2]) || (reelArray[0] == reelArray[2] && reelArray[0] != reelArray[1])){
                if(reelArray[0].equals("Orange")){
                    System.out.println("You have got 2 oranges! You get £2");
                    total = total + 2;
                    System.out.println("You currently have: £" + total);
               }
                else if(reelArray[0].equals ("Bomb")){
                    System.out.println("You have got 2 bombs! You get £3");
                    total = total + 3;
                    System.out.println("You currently have: £" + total);
                }
                else if(reelArray[0].equals("Bell")){
                   System.out.println("You have got 2 bells! You get £4");
                    total = total + 4;
                    System.out.println("You currently have: £" + total);
                }
                else if(reelArray[0].equals("Cherries")){
                    System.out.println("You have got 2 Cherries! You get £5");
                    total = total + 5;
                    System.out.println("You currently have: £" + total);
                }
                else if(reelArray[0].equals("Horn")){
                    System.out.println("You have got 2 horns! You get £6");
                    total = total + 6;
                    System.out.println("You currently have: £" + total);
                }
                else if(reelArray[0].equals("Strawberry")){
                    System.out.println("You have got 2 strawberries! You get £7");
                    total = total + 7;
                    System.out.println("You currently have: £" + total);
                }
                else if(reelArray[0].equals("Seven")){
                    System.out.println("You have got 2 sevens! You get £8");
                    total = total + 8;
                    System.out.println("You currently have: £" + total);
                }
                else{
                    System.out.println("You have got 2 jackpots! You get £10");
                    total = total + 10;
                    System.out.println("You currently have: £" + total);
                }
            }
            else if(reelArray[1] == reelArray[2] && reelArray[1] != reelArray[0]){
                if(reelArray[1].equals("Orange")){
                    System.out.println("You have got 2 oranges! You get £2");
                    total = total + 2;
                    System.out.println("You currently have: £" + total);
                }
                else if(reelArray[1].equals ("Bomb")){
                    System.out.println("You have got 2 bombs! You get £3");
                    total = total + 3;
                    System.out.println("You currently have: £" + total);
                }
                else if(reelArray[1].equals("Bell")){
                    System.out.println("You have got 2 bells! You get £4");
                    total = total + 4;
                    System.out.println("You currently have: £" + total);
                }
                else if(reelArray[1].equals("Cherries")){
                    System.out.println("You have got 2 Cherries! You get £5");
                    total = total + 5;
                    System.out.println("You currently have: £" + total);
                }
                else if(reelArray[1].equals("Horn")){
                    System.out.println("You have got 2 horns! You get £6");
                    total = total + 6;
                    System.out.println("You currently have: £" + total);
                }
                else if(reelArray[1].equals("Strawberry")){
                    System.out.println("You have got 2 strawberries! You get £7");
                    total = total + 7;
                    System.out.println("You currently have: £" + total);
                }
                else if(reelArray[1].equals("Seven")){
                    System.out.println("You have got 2 sevens! You get £8");
                    total = total + 8;
                    System.out.println("You currently have: £" + total);
                }
                else{
                    System.out.println("You have got 2 jackpots! You get £10");
                    total = total + 10;
                    System.out.println("You currently have: £" + total);
                }
            }
            else{
                System.out.println("You lose! You currently have: £" + total);
                    
            }
            System.out.println("Do you want play a-gain?");
            game = in.nextLine();
        }
    }    
}
