class Book{
    String title;
    String author;
    int price;
    void display(String title,String author,int price){
        System.out.println("Title:"+title+ " ," +"Author:"+ author+ " ,"+"Price:"+price);
    }
}




public class Bookinfo {
    public static void main(String[] args) {
        Book b1=new Book();
        b1.display("Bebs","shweta",90);
        Book b2=new Book();
        b2.display("Life","Soumya",  560);
         Book b3=new Book();
         b3.display("Family","FAther",80000);
    }
    
}
