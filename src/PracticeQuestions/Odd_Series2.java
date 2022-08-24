package PracticeQuestions;

import java.util.Scanner;

public class Odd_Series2 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value: ");
        int x = sc.nextInt();

        int y = 1;

        for(int i= 0; i<=x; i++){
            y = y+i;
            System.out.print(y+ " ");
        }
        
        sc.close();
    }

}
