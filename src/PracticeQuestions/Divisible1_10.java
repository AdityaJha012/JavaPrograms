package PracticeQuestions;

public class Divisible1_10 {
    
    public static void main(String[] args) {
        
        int num = 100;
        
        while(true){
            int count=0;
            for(int i=1; i<=10; i++){
                if(num%i==0){
                    count++;
                }
            }
            if(count == 10){
                break;
            }
            num = num+10;
        }
            System.out.println("The number is: "+num);
    }
}
