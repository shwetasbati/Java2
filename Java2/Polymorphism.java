class Calculator{
    int add(int a,int b){
        return a+b;
    }
    double add(double a,double b){
        return a+b;
    }
    int add(int a,int b,int c){
        return a+b+c;
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Calculator obj=new Calculator();
        System.out.println(obj.add(10,20));
        System.out.println(obj.add(9.0,3.4));
        System.out.println(obj.add(3,4,5));
    }
    
}
