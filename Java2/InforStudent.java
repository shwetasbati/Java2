public class InforStudent {
    int rollNo;
    String name;
    int marks;
    void display(){
        System.out.println( "RollNo:" +rollNo + " ,"+"Name:"+name+" ,"+"Marks:"+marks);

    }
    public static void main(String[] args){ 
    InforStudent s1=new InforStudent();
     s1.marks=78;
     s1.name="Shweta";
     s1.rollNo=34;
     s1.display();

        
    }
}


