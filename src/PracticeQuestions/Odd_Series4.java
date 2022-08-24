package PracticeQuestions;

import java.util.Scanner;

public class Odd_Series4 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value: ");
        int x = sc.nextInt();

        String num;

        for(int i=1; i<=x; i++){
            num = (int) Math.pow(i, i)+" ";
            System.out.print(num);
        }

    }

}
