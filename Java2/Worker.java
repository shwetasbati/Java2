class Employee{
    private int salary;
    public void setsalary(int sal){
        salary=sal;
    }
    public int getsalary(){
        return salary;
    }

}

public class Worker {
    public static void main(String[] args) {
        Employee e=new Employee();
        e.setsalary(3466788);
        System.out.println("Salary:"+e.getsalary());
    }
    
}
