package lesson6;

public class z8 {
    public static void main(String[] args){

    int[] arr = {1, 2, 2};
    System.out.print(sumArray(arr));
    }

    static int sumArray(int[] arr){
        int sum = 0;
        for(int i: arr){
            sum += i;
        }
        return(sum);
    }

    
}


