package JavaLearn;

public class OOPs {

    private String Name;
    private int rollnumber;

    public void setname(String name){
        Name = name;
    }

    public String getname(){
        return Name;
    }

    public void setrollnumber(int number){
        rollnumber = number;
        
        if(rollnumber<=0){
            System.out.println("Invalid Rollnumber!");
            rollnumber=0;
        }
        
    }

    public int getrollnumber(){
        return rollnumber;
    }

    public void print(String name, int number){
        this.Name = name;
        this.rollnumber = number;
        System.out.println("Your name is: "+Name+"\n"+"Your Rollnumber is: "+rollnumber);
    }
    
}
