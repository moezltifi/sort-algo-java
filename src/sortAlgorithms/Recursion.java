package sortAlgorithms;

public class Recursion {
    public static void implementRecursion() {
        System.out.println("\nRecursive Factorial of 6: "+recursiveFactorial(6));
        System.out.println("Iterative Factorial of 6: "+iterativeFactorial(6));
    }
    public static int recursiveFactorial(int num){
        if(num == 0){
            return 1;
        }

        return num*recursiveFactorial(num-1);
    }

    public static int iterativeFactorial(int num){
        if(num == 0){
            return 1;
        }
        int factorial = 1;
        for(int i = 1; i <= num; i++){
            factorial *= i;
        }
        return factorial;
    }
}
