class Bankaccount{
    private String accountholder;
    private int balance;

    Bankaccount(String accountholder, int balance){
        this.accountholder=accountholder;
        this.balance=balance;
    }
    void deposit(double amount){
        if(amount>0){
            balance+=amount;
        }
        
    }
    void withdraw( double amount){
        if (amount<balance){
            balance-=amount;
        }
        else{
            System.out.println("Insufficient amount");
        }
    }
    void display(){
        System.out.println("Account holder:"+accountholder);
        System.out.println("Balance:"+balance);
    }
    
}
class Bank{
    public static void main(String[] args) {
        Bankaccount acc=new Bankaccount("Shweta",100000);
        acc.deposit(3000);
        acc.withdraw(30000000);
        acc.display();
        
    }
}