package PracticeQuestions;

import java.util.Scanner;

public class PrimeNumber {
    
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Value: ");
    int x = sc.nextInt();

        for(int i=1; i<=x; i++){
            int count=0;
            for(int j=1; j<=i; j++){

                if(i%j==0){
                    count++;
                }

            }
            if(count == 2){
                System.out.print(i+" ");
            }
        }
        sc.close();

    }

}
