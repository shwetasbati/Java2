class College{
    private String CollegeName;
    private int totalStudents;
    College(String CollegeName,int totalStudents){
        this.CollegeName=CollegeName;
        this.totalStudents=totalStudents;
 }
 public String getCollegeName(){
    return CollegeName;
 }
public int gettotalStudents(){
    return totalStudents;
}
}
public class CollegeInfo {
    public static void main(String[] args) {
        College c1=new College("ABC",1500);
        System.out.println("CollegeName:"+c1.getCollegeName());
        System.out.println("Total Students:"+c1.gettotalStudents());
    }
    
}
