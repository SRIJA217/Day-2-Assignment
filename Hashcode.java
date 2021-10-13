import java.util.Scanner;
public class HashCodeExample
{
     public static void main(String args[])
     {
          System.out.println("Enter the input");
          Scanner s = new Scanner(System.in);
          Integer i=sc.nextInt();
          int HashValue=Integer.hashCode(i);
          System.out.println(HashValue);
    }
}
