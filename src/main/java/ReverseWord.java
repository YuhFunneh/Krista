import java.util.Scanner;
/**
 * @author Krista Powell
 * This class take a user input and display in reverse order
 */
public class ReverseWord
{
   /**
    *
    * @param args
    */
   public static void main (String[] args)
   {
      Scanner scan = new Scanner(System.in);
//      System.out.println("Please enter a word");
//      String word = scan.nextLine();
//
//      for (int i = 0; i < word.length(); i++) {
//         System.out.println(word.charAt(i));
//
//         for (int j = word.length() - 1; j >= 0; j--) {
//            System.out.println(word.charAt(j));
//
//         }
//      }

      System.out.println("Please enter student name");
      String names = scan.nextLine();
      Student st1 = new Student();

      System.out.println("Output is: " + st1.getName());

      Student array[] = new Student[3];
      for (int i = 0; i < array.length; i++) {
         int j = i + 1;
         System.out.println("Please eter student name");
         String name = scan.nextLine();
         array[i] = new Student(name);
         System.out.println();
      }
      for (Student s : array) {
         System.out.println(s.getName());


      }

   }
}
