package lesson6;

public class z9 {
    public static void main(String[] args){

    System.out.print(factorial(4));
    }

    static int factorial(int n){
        int sum = 1;
        for(int i = 1; i<=n; i++) sum*=i;
        return(sum);
    }

    
}


