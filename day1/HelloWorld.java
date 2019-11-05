// C:\Users\TSSVJA\Dragon\Day1
// HelloWorld.java

/**
* @author: RKtheDragon
*/
@Entity 
public class HelloWorld {
  
  public static void main(String[] args)
  {
      System.out.println("Hello Java...");
	  //return ;
  }
}

/**
* javac HelloWorld.java 
*
* java HelloWorld
**/

// What are the concepts of Java OOPs ?
// What is Garbage Collection, and What is finalyzer ?
// 
// Slide 25th Of JavaIntro

//-- 5th Nov 2019
//  Basic Relational Operators
-->    Less Than  <
-->    Greater Than  >
-->    Equal To  ==

// Basic Conditional Structures
if(condition is true)
{
	// run this code
}
else{
	// run this code 
}

// ==============
// Initialise ... Condition ... Increment / Decrement
for (int i=0; i < 5; i++)
{
	System.out.println("String : " + i);
}

// Print Pattern **** using for loop 
// Place the class file authomatically in Design folder
// javac -d ../Design pattern.java
// Generate Documentation using JavaDoc 

// git push -u origin master













// *
// **
// ***
public class JavaProgram
{
    public static void main(String args[])
    {
        int i, j;
        for(i=0; i<5; i++)
        {
            for(j=0; j<=i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}







//   *
//  **
// ***
public class JavaProgram
{
    public static void main(String args[])
    {
        int i, j, k=8;
        for(i=0; i<5; i++)
        {
            for(j=0; j<k; j++)
            {
                System.out.print(" ");
            }
            k = k - 2;
            for(j=0; j<=i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}






// Printing a pyramid
import java.util.Scanner;

public class JavaProgram
{
    public static void main(String args[])
    {
        int i, space, rows, k=0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Number of Rows : ");
        rows = scan.nextInt();
        for(i=1; i<=rows; i++)
        {
            for(space=1; space<=(rows-i); space++)
            {
                System.out.print("  ");
            }
            while(k != (2*i-1))
            {
                System.out.print("* ");
                k++;
            }
            k = 0;
            System.out.println();
        }
    }
}
























