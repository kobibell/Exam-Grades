package ExamGrades;
import java.util.*;
public class ExamGrades 
{
    public static void main(String[] args) 
    {
        int [][] exams = new int [6][5];
        
        Scanner input = new Scanner (System.in);
        for (int i = 0; i < exams.length; i++)
        {
            System.out.printf("Enter the five scores for student #" + (i + 1) + ".\n");
            System.out.printf("Hit enter key after each score entered: ");
            for(int j = 0; j < exams[i].length; j++)
            {
                exams[i][j] = input.nextInt();
            }
            System.out.println();  
        }
        System.out.println();
        
        printArray (exams);
        getClassAvg (exams);
        getRange (exams);
        getRowAverage(exams);
        getColumnAverage(exams);
        getHighestInRow(exams);
        getLowestInRow(exams);
        getGrades(exams);
 
    }
    
    public static void printArray (int [][] examScore)
    {
        
        for(int row = 0; row < examScore.length; row++)
        {
            for(int col = 0; col < examScore[row].length; col++) 
            {
                System.out.printf("%10d ", examScore[row][col]);
            }
            System.out.println();
        }
        System.out.println();        
    }
    
    public static void getClassAvg (int [][] classAvg)
    {
        int sum = 0;
        double classAverage;
        for (int i = 0; i < classAvg.length; i++)
        {
            for (int j = 0; j < classAvg[i].length; j++)
            {
                sum += classAvg[i][j];   
            }
        }
        
        // Calculating the class average for all student grades.
        classAverage = (double) sum / 30;
        
        System.out.printf("The class average of all grades is: %3.1f\n", classAverage);
    }
    
    public static void getRange (int [][] range)
    {
        int max = (int) range [0][0]; 
        int min = (int) range [0][0];
        int theRange;
        
        // Finding the maximum of all the grades.
        for (int i = 0; i < range.length; i++)
        {
            for (int j = 0; j < range[i].length; j++)
            {
                if (range[i][j] > max)
                    max = (int) range[i][j];
            }
        }
        
        // Finding the minimum of all the grades.
        for (int i = 0; i < range.length; i++)
        {
            for (int j = 0; j < range[i].length; j++)
            {
                if (range[i][j] < min)
                    min = (int) range[i][j];   
            }
        }
        
        // Finding the range for all student grades.
        theRange = max - min;
        
        System.out.printf("The range of all grades: %3d\n", theRange);
        System.out.println();  
    }
    
    public static void getRowAverage (int [][] rowAverage)
    {
        int total;
        double studentAvg;
        for (int i = 0; i < rowAverage.length; i++)
        {
            total = 0;
            for (int j = 0; j < rowAverage[i].length; j++)
            {
                total += rowAverage[i][j];
            }
            studentAvg = (double) total / 5;
            System.out.printf("The average for student #" + (i + 1) + " is: %5.1f\n", studentAvg);
        }
        System.out.println();
    }
    
    public static void getColumnAverage (int [][] colAverage)
    {
        int total;
        double testAvg;
        
        for (int col = 0; col < colAverage.length; col++)
        {
            total = 0;
            for (int row = 0; row < colAverage[col].length; row++)
            {
                total += colAverage[col][row];
            }
                testAvg = (double) total / colAverage.length;
            System.out.printf("The average for test #" + (col + 1) + " is: %.1f\n", testAvg);
        }
        System.out.println();
    }
    
    // Find the highest test grade for each student.
    public static void getHighestInRow (int [][] highestRow)
    {
        int max = highestRow[0][0];
        for (int i = 0; i < highestRow.length; i++)
        {
            max = 0;
            for (int j = 0; j < highestRow[i].length; j++)
            { 
                if (highestRow[i][j] > max)
                    max = highestRow[i][j];
            }
            System.out.printf("The highest test grade for student #" + (i + 1) + ": %3d\n", max);
        } 
        System.out.println();
    }
    
    // Find the lowes
    t test grade for each student.   
    public static void getLowestInRow (int [][] lowestRow)
    {
        int min = lowestRow[0][0];
        for (int i = 0; i < lowestRow.length; i++)
        {
            min = 100;
            for (int j = 0; j < lowestRow[i].length; j++)
            {
                if (lowestRow[i][j] < min)
                    min = lowestRow[i][j];
            }
            System.out.printf("The lowest exam grade for student #" + (i + 1) + ": %3d\n", min);
        } 
        System.out.println();
    }
    
    public static void getStandardDeviation (int [][] standardDeviation)
    {
        
        int total;
        double testAvg;
        double standardD;
        
        
        for (int col = 0; col < standardDeviation.length; col++)
        {
            total = 0;
            for (int row = 0; row < standardDeviation[col].length; row++)
            {
                total += standardDeviation[col][row];
            }
                testAvg = total / standardDeviation.length;
                standardD = Math.sqrt(Math.pow(average - mean,2)/row);
        }       
    }
    
    public static void getGrades(int [][] grades)
    {
        int total = 0;
        double studentAvg;
        int lowestScore;
        
        for (int i = 0; i < grades.length; i++)
        {
            total = 0;
            lowestScore = 0;
            for (int j = 0; j < grades[i].length; j++)
            {
                total += grades[i][j];
                if (grades[i][j] < 100)
                    lowestScore = grades[i][j];
            }
            total = total - lowestScore;
            studentAvg = total / 4.0;
            
            if (studentAvg >= 90)
            {
                System.out.printf("Student #" + (i + 1) + " had an average of %5.1f ", studentAvg);
                System.out.println(" (after dropping lowest score).");
                System.out.println("This student received a grade of A in the class.");
                System.out.println();
            }
            else if (studentAvg >= 80)
            { 
                System.out.printf("Student #" + (i + 1) + " had an average of %5.1f ", studentAvg);
                System.out.println(" (after dropping lowest score).");
                System.out.println("This student received a grade of B in the class."); 
                System.out.println();
            }
            else if (studentAvg >= 70)
            { 
                System.out.printf("Student #" + (i + 1) + " had an average of %5.1f ", studentAvg);
                System.out.println(" (after dropping lowest score).");
                System.out.println("This student received a grade of C in the class."); 
                System.out.println();
            }
            else if (studentAvg >= 60)
            { 
                System.out.printf("Student #" + (i + 1) + " had an average of %5.1f ", studentAvg);
                System.out.println(" (after dropping lowest score).");
                System.out.println("This student received a grade of D in the class."); 
                System.out.println();
            }
            else
            { 
                System.out.printf("Student #" + (i + 1) + " had an average of %5.1f ", studentAvg);
                System.out.println(" (after dropping lowest score).");
                System.out.println("This student received a grade of F in the class.");  
                System.out.println();
            }
    
        }
     
    }
}
