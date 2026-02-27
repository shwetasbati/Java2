class Circle{
   static double calculateArea(int r){
        return Math.PI*r*r;
    }
    static double calculateCircumreference(int r){
        return 4*Math.PI*r;

    }
public static void main(String[] args) {
       System.out.println(calculateArea(4));
        System.out.println(calculateCircumreference(5));
    }
}
    

