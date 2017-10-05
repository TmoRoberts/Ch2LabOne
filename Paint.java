//***************************************************************
//File: Paint.java
//
//Purpose: Determine how much paint is needed to paint the walls
//of a room given its length, width, and height
//***************************************************************
import java.lang.Math;
import java.util.Scanner;
public class Paint
{
        public static void main(String[] args)
        {
            Scanner keyboard = new Scanner(System.in);
            final int COVERAGE = 350;  //paint covers 350 sq ft/gal
            int length, width, height, doors, windows;//declare integers length, width, and height;
            double totalSqFt;//declare double totalSqFt;
            double paintNeeded;//declare double paintNeeded;
 
            //Declare and initialize the length of the room
            System.out.println("Length of Room?");
            length = keyboard.nextInt();
            
            //Declare and initialize the width of the room
            System.out.println("Width of Room?");
            width = keyboard.nextInt();
            
            //Declare and initialize the height of the room
            System.out.println("Height of Room?");
            height = keyboard.nextInt();
            
            //Declare and initialize doors
            System.out.println("Number of doors?");
            doors = keyboard.nextInt();
            
            //Declare and initalize windows
            System.out.println("Number of windows?");
            windows = keyboard.nextInt();
            
            //Compute the total square feet to be painted--think
            //about the dimensions of each wall
            totalSqFt = ((2*(length*height)) + (2*(width*height)) + (length*width)) - ((doors*20) + (windows*15));
            //Compute the amount of paint needed
            paintNeeded = (totalSqFt/350);
            //Print the length, width, and height of the room and the
            //number of gallons of paint needed.
            System.out.println("Length is " + length);
            System.out.println("Width is " + width);
            System.out.println("Height is " + height);
            System.out.println("Gallons of paint needed: " + paintNeeded);
        }
}