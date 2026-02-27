class Product{
    private String productName;
    private int price;

    Product(String name,int p){
        productName=name;
        price=p;
    }

    public int getprice(){
        return price;                                                                                                                 
    }
    public String getproductionName(){
        return productName;
    }
}

public class Things {
    public static void main(String[] args) {
        Product p1=new Product("Masala",34);
        System.out.println(p1.getproductionName ());
        System.out.println( p1.getprice());

    }
    
}