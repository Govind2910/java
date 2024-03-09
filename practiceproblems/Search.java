import java.util.*;
public class Search {
    public static int linearSearch(int numbers[],int key){
for(int i =0;i<numbers.length;i++){
    if(numbers[i]== key){
        return i;
    }
}
return -1;  }
public static int getLargest(int numbers[]){
    int largest = Integer.MIN_VALUE;
    for (int i =0; i<numbers.length;i++){
        if(largest < numbers[i]){
            largest = numbers[i];
        }
    }
    return largest;
}
   
public static void main(String args []){
int numbers[] = { 1,2,9,7,55,44,78,100,25,66};
int key = 66;

int index = linearSearch(numbers, key);
if( index == -1){
    System.out.println("the number is not found");
}
else {
    System.out.println("the number is found at index : " + index);

}
System.out.println("largest numbER is in the string " + getLargest(numbers));

    }
}

