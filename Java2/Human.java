class Person{
    private int  age;
    public int getage(){
        return age;

    }
    public void setage(int age){
      this.age=age;
    }
}

 public class Human{
    public static void main(String[] args) {
        Person p1=new Person();
        p1.setage(43);
        System.out.println("Age:"+p1.getage());
    }

}