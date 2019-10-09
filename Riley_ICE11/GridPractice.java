import java.util.Scanner;
import java.util.Random;

/*
 * Course: NACA.161
 * Author: Brian Trager, Raja Kushalnagar
 * ICE #11 Ex 1, Starter Code
 * Topic: 2-dim arrays
 */
public class GridPractice {

   public static void main(String[] args) {
      // Declarations
      Scanner in = new Scanner(System.in);
      Random  generator = new Random();
      int [][] grid;	//un-instantiated grid
      int size = 0;		//number of rows and columns
   
      // Get size of grid and instantiate - no validation necessary.
      System.out.print("Enter size of grid: ");
      size = in.nextInt();
      grid = new int[size][size];
   
      // Fill grid with random number from 0.99
      System.out.println();
      for (int row = 0; row < size; row++) 
      {
         for (int col = 0; col < size; col++) 
         {
            grid[row][col] = generator.nextInt(100); //random numbers 0..99 - not 100
         }
      }
   
      // Exercise 1: print grid with formatting to align
      
      for (int i = 0; i < size; i++)
      {
         for (int c = 0; c < size; c++)
         {
         String line = String.format("%1$10s", grid[i][c]);
         System.out.print(line);
           /* System.out.print(grid[i][c] + "\t");*/
         }
         System.out.println();
      }
      System.out.println();
      // Exercise 2: print each row sum
      int rowSum = 0;
      System.out.println("Row\tSum");
      System.out.println("---\t---");
    for (int row = 0; row < size; row++)
      {
         for (int col = 0; col < size; col++)
         {
            rowSum += grid[row][col];
         }
         System.out.println(row + "\t  \t" + rowSum);
         rowSum = 0; //resets back to 0 for recalc

      }
   
   
   System.out.println();
      // Exercise 2: print each column sum
   int colSum = 0;
      System.out.println("Col\tSum");
      System.out.println("---\t---");
    for (int col = 0; col < size; col++)
      {
         for (int row = 0; row < size; row++)
         {
            colSum += grid[row][col];
         }
         System.out.println(col + "\t  \t" + colSum);
         colSum = 0; //resets back to 0 for recalc

      }
      System.out.println();
      // Exercise 3: print two diagonal sums
      int lrTotals = 0;
   for (int col = 0; col < size; col++)
    {
                   lrTotals += grid[col][col];
    }
   System.out.println("Upper left to down right is: " + lrTotals); 
   
   int rlTotals = 0;
   for (int row = 0; row < size; row++)
    {
                   rlTotals += grid[row][size - row - 1];
    }
   System.out.println("Upper right to down left is: " + rlTotals);    
   }

}
