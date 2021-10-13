import java.util.Scanner;
class FirstHalf 
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a string");
    String str=sc.nextLine();
    str=str.substring(0,str.length()/2);
    System.out.println(str);
  }
}
