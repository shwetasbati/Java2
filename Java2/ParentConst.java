class Parent{
    Parent(){
        System.out.println("Parent method");
    }
}
class Child extends Parent{
    Child(){
        super();
    }
}


public class ParentConst {
    public static void main(String[] args){
        new Child();
    }
    
}
