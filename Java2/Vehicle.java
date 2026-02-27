class Car{
    private int speed;

    public void setspeed(int sp){
        speed =sp;
    }
    public int getspeed(){
        if(speed>0){
             return speed;
            }
         else{
           System.out.println("Speed no is wrong");
           return 0;
         }
    }
}

public class Vehicle {
    public static void main(String[] args) {
        Car c=new Car();
        c.setspeed(30);
        System.out.println("Speeed:"+c.getspeed());
        
    }
    
}
