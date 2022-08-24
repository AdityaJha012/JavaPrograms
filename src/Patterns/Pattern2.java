package Patterns;

import java.util.Scanner;

public class Pattern2 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int r = scanner.nextInt();
        System.out.println("Enter the character: ");
        char ch = scanner.next().charAt(0);

            for(int i=1; i<=r; i++){
                for(int j=1; j<=i; j++){
                    System.out.print(ch);
                }
                System.out.println();
            }
            scanner.close();
    }
    
}
