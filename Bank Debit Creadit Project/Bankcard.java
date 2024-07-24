
/**
 * Parent class
 * Sameer Parajuli
 * 2023/01/27
 */
public class Bankcard
{
    /**declearing attributes.**/
    private int card_ID;  
    private String client_name;
    private String issuer_bank;
    private String bank_account;
    private double balance_amount;

    public Bankcard( double balance_amount,int card_ID,String bank_account,String issuer_bank)/**creating constructor of class Bankcard.**/
    {
        this.card_ID=card_ID;
        this.client_name="";
        this.issuer_bank=issuer_bank;
        this.bank_account=bank_account;
        this.balance_amount=balance_amount;
        /**using this keyword to invoke attributes of current class**/
    }

    /**creating accessor mutator methods**/
    public int getCard_ID()
    {
        return this.card_ID;
    }

    public String getClient_name()
    {
        return this.client_name;
    }

    public void setClient_name(String client_name)/**to have new client_name value.**/
    {
        this.client_name=client_name;
    }

    public String getIssuer_bank()
    {
        return this.issuer_bank;
    }

    public void setBank_account(String bank_account)
    {
        this.bank_account=bank_account;
    }

    public String getBank_account()
    {
        return this.bank_account;
    }

    public void setBalance_amount(double balance_amount)
    {
        this.balance_amount=balance_amount;
    }

    public double getBalance_amount()
    {
        return this.balance_amount;
    }

    public void display()
    {
        System.out.println("card_ID="+this.card_ID);
        System.out.println("issuer_bank="+this.issuer_bank);
        System.out.println("bank_account="+this.bank_account);
        System.out.println("balance_amount="+this.balance_amount);
        if(client_name=="")
        {
            System.out.println("Client name is not assigned."); 
        }
        else
        {
           System.out.println("Client name is"+this.client_name);
        }   
    }      
}

    
    
  
