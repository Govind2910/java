import java.util.*;
public class cost {
public static void main(String args[]){
    System.out.println("enter the cost of pen");
    Scanner sc = new Scanner(System.in);
    float pen = sc.nextFloat();
    System.out.println("enter the cost of pencil");
    float pencil = sc.nextFloat();

    System.out.println("enter the cost of eraser");
    float eraser= sc.nextFloat();

System.out.println("THE bill of this purchase is :");
float  amount =  ((0.18f)*pen*eraser*pencil);
System.out.println("the total amount is :" );
System.out.println(amount);



}}