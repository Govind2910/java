import java.util.Scanner;

public class areaofcir {
    public static void main(String args[]){
Scanner sc = new Scanner (System.in);
System.out.println("please enter the radius of the circle");
float radius = sc.nextFloat();
float area = ((3.14f)*radius*radius);

System.out.println(area);
}
    }

