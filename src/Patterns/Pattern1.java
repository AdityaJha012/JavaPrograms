package Patterns;

import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows: ");
        int r = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int c = sc.nextInt();
        System.out.println("Enter the character: ");
        char ch = sc.next().charAt(0);

            for(int i=1; i<=r; i++){
                for(int j=1; j<=c; j++){
                    System.out.print(ch);
                }
                System.out.println();
            }
            sc.close();
    }
    
}
