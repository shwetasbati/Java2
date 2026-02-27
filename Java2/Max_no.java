public class Max_no {
   static int max(int a,int b){
        if(a>b)
           return a;
        else
            return b;
    }
    
    public static void main(String[] args) {
        int Large=max(9,8);
        System.out.println("Max of two no:"+Large);
    }
}
