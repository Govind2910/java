import java.util.Scanner;

public class fun {
    int average;
public static int avg(){
System.out.println("enter the numbers:"); 
Scanner sc = new Scanner(System.in);
int num1 = sc.nextInt();
int num2 = sc.nextInt();
int num3 = sc.nextInt();
int  average = (num1+num2+num3)/3;
System.out.println("Averge is : " + average); 
return average;

}


    }

