package Cetpa;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value:");
        int a = scanner.nextInt();
        int count = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int e = 0;
        int f = 0;
        int g = 0;
        int h = 0;

        for(int i=1; i<a; i++){
            for(int j=1; j<=i; j++){
            
                if(i%j == 0){
                    count++;     
                }
            }

        if(count == 2){

            b = c;
            c = d;
            d = e;
            e = f;
            f = g;
            g = h;
            h = i;

            // System.out.println(i);
        }  
        count = 0; 
        }
        System.out.println("Largest Number: "+h);
        System.out.println("Second Largest Number: "+g);
        System.out.println("Third Largest Number: "+f);
        System.out.println("Fourth Largest Number: "+e);
        System.out.println("Fifth Largest Number: "+d);
        System.out.println("Sixth Largest Number: "+c);
        System.out.println("Seventh Largest Number: "+b);

        scanner.close();
       
    }
    
}
