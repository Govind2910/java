public class advpattern {
    // public static void hollow_rectangle(int totRows ,int totCols){
    //     // outer loop
    //     for (int i =1; i<=totRows;i++)
    // {
    //     for (int j =1;j<= totCols; j++){
    //         if (i==1|| i == totRows|| j==1||j==totCols){
    //             System.out.print("*");

    //         }
    //         else{
    //             System.out.print(" ");
    //         }
    //     }
    //     System.out.println();
    // }
    // }


    //
    // inverted pyramid

    public static void InvPymd (int rows, int col){
        for (int i = 1;  i <=rows; i++){
            for (int j =1;  j <= col;j++){
                if (i ==1|| i== rows|| j==1||j == (4-rows) ) {
    System.out.print("*");}
            }} }

    public static void main (String args []){
       // hollow_rectangle(4,5 );
        InvPymd(4, 5);
    }
}
