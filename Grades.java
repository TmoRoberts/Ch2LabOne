// ***************************************************************
//   Grades.java
//
//   Prints a list of student grades
// ***************************************************************
public class Grades
{
    public static void main (String[] args)
    {
        makeHeaders();
        populateRows();
    }
    public static void makeHeaders() {
        System.out.println("==================================");
        System.out.println("==\tStudent Points\t\t==");
        System.out.println("==================================");
    }
    public static void populateRows() {
        System.out.println("Name\t\tLab\tBonus  Total");
        System.out.println("====\t\t===\t=====  =====");
        System.out.println("Joe \t\t43 \t  7\t 50");
        System.out.println("William \t50  \t  8\t 58");
        System.out.println("Mary Sue \t39  \t 10\t 49");
        System.out.println("Timothy \t50  \t 10\t 60");
        System.out.println("Bryan ]\t\t49  \t  9\t 58");
    }
}
