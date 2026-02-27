class Laptop{
    String brand;
    int  ram;
    double price;
    void displaydetails(){
        System.out.println("brand:"+brand);
        System.out.println("ram:"+ram+"Gb");
        System.out.println("price:"+price);
    }
}
public class Electrical {
    public static void main(String[] args) {
        Laptop l1=new Laptop();
        l1.brand="Hp";
         l1.ram=4;
        l1.price=3456;
        l1.displaydetails();
        

    }
    
}
