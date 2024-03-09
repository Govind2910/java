  import java.util.*;
public class searchh {
  
    public static int linearSearch(int numbers[],int key){
for(int i =0;i<=numbers.length;i++){
    if(numbers[i]==key){
        return i;
    }
}
public static void main (String args[]){
int numbers[] = { 1,2,9,7,55,44,78,100,25,66};
int key = 66;
}
int index = linearSearch(numbers, key);
if( index == -1){
    System.out.println("the number is not found");}
else {
    System.out.println("the number is found at index : " + index);
}

}
    }



