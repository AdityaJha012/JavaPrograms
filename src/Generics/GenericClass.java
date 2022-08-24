package Generics;

public class GenericClass <Thing1, Thing2>{

Thing1 x;
Thing2 y;

    GenericClass(Thing1 x, Thing2 y){
        this.x = x;
        this.y = y;

    }
    
    public Thing1 getValue(){
        return x;
    }

    public Thing2 Getvalue(){
        return y;
    }

}
