import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("Enter a number to count down or up from: ");
    int number = s.nextInt();
    if (number >= 0) 
    {
      while (number >= 0) 
      {
      System.out.println(number);
      number --;
      }}
    
    else  { 
      while (number <0)
      {
        System.out.println(number);
        number ++;
      }}
    
    System.out.println("Blast off!"); 
  }
}