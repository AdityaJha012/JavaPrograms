package Cetpa;

import java.util.Scanner;

public class WhileLoopPrimeNumber {

    public static void main(String[] args) {
        
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter any value: ");
    int num = scanner.nextInt();
    int count = 0;
    int i = 1;
    
        while(i<num){
            i++;
           for(int j=1; j<=i; j++){
                    if(i%j == 0){
                        count++;
                    }
            }

            if(count == 2){
                System.out.println(i);
            }
        count = 0;
        }

        scanner.close();

    }
    
}
