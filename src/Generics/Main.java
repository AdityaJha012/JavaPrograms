package Generics;

public class Main {
    
    public static void main(String[] args) {
        
        GenericClass<Integer, Double> myInt = new GenericClass<>(10,5.65);
        GenericClass<Double, Character> myDouble =  new GenericClass<>(3.14, '&');
        GenericClass<Character, String> myChar = new GenericClass<>('%', "Nani?");
        GenericClass<String, Integer> myString = new GenericClass<>("Omae wa mou Shindeiru", 69);

            System.out.println(myInt.getValue());
            System.out.println(myDouble.getValue());
            System.out.println(myChar.getValue());
            System.out.println(myString.getValue());
            System.out.println();
            System.out.println(myInt.Getvalue());
            System.out.println(myDouble.Getvalue());
            System.out.println(myChar.Getvalue());
            System.out.println(myString.Getvalue());
        

    }

}
