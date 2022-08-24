package PracticeQuestions;

import java.util.Scanner;

public class Odd_Series1 {

    public static void main(String[] args) {
        
        // Series = A B D G K P

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Value: ");
        int x = sc.nextInt();

        char ch = 65;
        for(int i=0; i<=x; i++){
            ch = (char) (ch+i);
            System.out.print(ch+" ");
        }
        sc.close();

       }
    
}
