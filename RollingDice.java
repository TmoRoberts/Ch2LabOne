import java.util.Random;
public class RollingDice {
    public static void main (String[] args)
    {
        Random generator = new Random();
        int dice1, dice2, sum;
        
        //Roll dice 1
        dice1 = generator.nextInt(6) + 1;
        
        //Roll dice 2
        dice2 = generator.nextInt(6) + 1;
        
        //Sum of dice
        sum = dice1 + dice2;
        
        //Print values
        System.out.println("Dice 1 is " + dice1);
        System.out.println("Dice 2 is " + dice2);
        System.out.println("Sum of roll is " + sum);
    }
}