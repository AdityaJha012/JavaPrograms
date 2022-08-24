package Patterns;

import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int r = sc.nextInt();
        System.out.println("Enter the character: ");
        char ch = sc.next().charAt(0);

            for(int i=1; i<=r; i++){
                for(int s=r-i; s>=1; s--){
                    System.out.print(" ");
                    for(int c=1; c<=i; c++){
                        System.out.print(ch);
                    }
                }

                System.out.println();
            }

    }
}
