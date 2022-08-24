package PracticeQuestions;

public class SecondLargestPrimeNumber {
    
    public static void main(String[] args) {
        
        int x = 100;

        int a=0;
        int b=0;

        for(int i=1; i<=x; i++){
            int count=0;
            for(int j=1; j<=i; j++){
                if(i%j == 0){
                    count++;
                }
            }
            if(count == 2){
                
                a=b;
                b=i;

                // System.out.println(i+" ");
                
            }
        }
        System.out.println(a);
    }

}
