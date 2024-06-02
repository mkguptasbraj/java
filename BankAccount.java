class ACCOUNT
{ 
    String  accountType;
    String name;
    float balance;

    ACCOUNT(String name){
        accountType="saving account";
        this.name=name;
        balance=0;
    }
    public void deposit(float money)
    {    if(balance>=money)
        {
         balance-=money;
          System.out.println(money+" is deposited\n");
          System.out.println("total balence :"+balance);
        }
         else
         {
            System.out.println("not enough money to be deposited");
          
    }
  
         }
          public void credit(float money)
    { 
         balance+=money;
          System.out.println(money+" is creadeted\n");
          System.out.println("total balence :"+balance);
     }
       
    public void accountInfo()
    {
        System.out.println("account holder name :"+name);
        System.out.println("account type :"+accountType);
        System.out.println("current balance :"+balance);
    }

    
}
class saving_ACCOUNT extends ACCOUNT
{
     saving_ACCOUNT(String name) {
        super(name);
        
    }

    public void open_Account()
    {

    }

}
public class BankAccount {
    public static void main(String[] args) {
        ACCOUNT P1=new ACCOUNT("Akash");
         ACCOUNT P2=new ACCOUNT("sunny");
        P1.accountInfo();
        P1.credit(5000);
        P1.deposit(4000);
             P1.accountInfo();
               P2.accountInfo();
        P2.credit(8000);
        P2.deposit(4000);
             P2.accountInfo();


    }
}
