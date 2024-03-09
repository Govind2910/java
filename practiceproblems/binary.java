public class binary {
    
    public static int binarySearch( int numbers[], int key){
        int start = 0; int end = numbers.length-1;

        while( start <= end){
          int mid = (start+end)/2;

         if (numbers[mid]  == key){
            return mid;

         }
         if (numbers[mid]<key){
            start =  mid +1;
         }
         else {
            end = mid-1;
         }
        }
return -1;
    }

public static void main (String args[]){
    int numbers[] = { 1,2,3,47,48,77,88,99,111,122};
    int key = 122;

    System.out.print("the number is found at index: " + binarySearch(numbers, key));
}


}
