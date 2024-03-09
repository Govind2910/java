import java.util.*;
public class ls {

public static int linSearch(int numbers[], int key) {
for(int i =0;i<numbers.length;i++){
    if(numbers[i]==key){
        return i;
    }
}
    return -1;

} 



public static void main(String args[]){
int numbers[]= {1,4,55,66,77,53,24,88};
int key =66;

int index = linSearch(numbers, key);
if(index ==-1){
    System.out.println("not found");
}
System.out.println("key is the index" + index);
    }
}
