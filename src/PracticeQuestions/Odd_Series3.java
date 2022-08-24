package PracticeQuestions;

import java.util.Scanner;

public class Odd_Series3 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value: ");
        int x = sc.nextInt();

        int num;

        for(int i=x; i>=1; i--){
            num = i*i;
            System.out.print(num-1+" ");
        }
        sc.close();
    }

}
