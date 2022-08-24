package JavaLearn;

import java.util.Scanner;

public class Java1 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any Number: ");
        int a = scanner.nextInt();

        for(int i=0; i<=10; i+=2){
            
            int x = i*a;
            System.out.println(x);

        }
        System.out.println();

        System.out.println("Enter any Number: ");
        int b = scanner.nextInt();

        for(int j = 1; j<=10; j+=2){
            int y = j*b;
            System.out.println(y);
        }

        scanner.close();

    }
    
}
