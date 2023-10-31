/**
 * APCS 01.12 Assignment
 *
 * @author Paul Jeon
 * @version V2
 */
public class GradesV2
{
    public static void mian(String[ ] args)
    {
        //local variables
        int numTests = 0;      //counts number of tests
        int testGrade = 0;     //individual test grade
        int totalPoints = 0;   //total points for all tests
        double average = 0.0;  //average grade
        

        //1
        numTests++;
        testGrade = 95;
        totalPoints += testGrade;
        average = ((double)totalPoints / (double)numTests);
        System.out.print("Test # "+ numTests);
        System.out.print("\t" +"Test Grade: " + testGrade );
        System.out.print("\t\t" + "Total Points: " + totalPoints);
        System.out.print("\t" + "Average Score: " + average + "\n");
        
        //2
        numTests++;
        testGrade = 73;
        totalPoints += testGrade;
        average = ((double)totalPoints / (double)numTests);
        System.out.print("Test # "+ numTests);
        System.out.print("\t" +"Test Grade: " + testGrade );
        System.out.print("\t\t" + "Total Points: " + totalPoints);
        System.out.print("\t" + "Average Score: " + average + "\n");
        
        //3
        numTests++;
        testGrade = 91;
        totalPoints += testGrade;
        average = ((double)totalPoints / (double)numTests);
        System.out.print("Test # "+ numTests);
        System.out.print("\t" +"Test Grade: " + testGrade );
        System.out.print("\t\t" + "Total Points: " + totalPoints);
        System.out.print("\t" + "Average Score: " + average + "\n");
        
        //4
        numTests++;
        testGrade = 82;
        totalPoints += testGrade;
        average = ((double)totalPoints / (double)numTests);
        System.out.print("Test # "+ numTests);
        System.out.print("\t" +"Test Grade: " + testGrade );
        System.out.print("\t\t" + "Total Points: " + totalPoints);
        System.out.print("\t" + "Average Score: " + average + "\n");
    }
}
