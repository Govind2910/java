import java.util.Scanner;

public class loop {
    public static void main (String args[]){
      Scanner sc = new Scanner(System.in);

int number;
int oddSum = 0;
int evenSum =0;
int choice;

do{
      System.out.println("enter your integer number: ");
      number  = sc.nextInt();
      if(number%2==0){
        evenSum += number;
      }
      else{
        oddSum += number;
      }
     System.out.println("Do you want to continue? press 1 for yes and press 0 for exit");
     choice = sc.nextInt();
    
 }
 while(choice==1);
 {
System.out.println("Sum of even number: "+ evenSum);
System.out.println("Sum of odd number: "+ oddSum);
 }
    }
    }