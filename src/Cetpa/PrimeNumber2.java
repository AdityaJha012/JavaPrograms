package Cetpa;

import java.util.Scanner;

public class PrimeNumber2 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Value: ");
        int num = scanner.nextInt();
        
        for(int i=1; i<num; i++){
            int count = 0;
            for(int j=1; j<=i; j++){
                if(i%j == 0){
                    count++;
                }
            }
            if(count == 2){
                System.out.println(i);
            }
           
        }
       
        scanner.close();

    }
    
}