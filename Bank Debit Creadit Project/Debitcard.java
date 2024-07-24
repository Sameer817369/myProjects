 

/**
 * Child Class Debitcard
 * Sameer Parajuli
 */
public class Debitcard extends Bankcard
{
    /**declearing variables**/
    private int pin_number;
    private int withdrawl_amount;
    private String date_of_withdrawl;
    private boolean has_withdrawn;
    /**creating constructors**/
    public Debitcard(double balance_amount,int card_ID,String bank_account,String issuer_bank,String client_name,int pin_number)
    {
        super(balance_amount,card_ID,bank_account,issuer_bank);
        this.pin_number=pin_number;
        this.has_withdrawn=false;
        super.setClient_name(client_name);
    }

    /**creating accessors and mutators method**/ 
    public int getPin_number()
    {
        return this.pin_number;
    }

    public void setWithdrawl_amount(int withdrawl_amount)
    {
        this.withdrawl_amount=withdrawl_amount;
    }

    public int getWithdrawl_amount()
    {
        return this.withdrawl_amount;
    }

    public String getDate_of_withdrawl()
    {
        return this.date_of_withdrawl; 
    }

    public boolean getHas_withdrawn()
    {
        return this.has_withdrawn;
    }

    public void withdraw(int withdrawl_amount,int pin_number,String date_of_withdrawl)
    {
        if(pin_number==this.pin_number)
        {
            if(super.getBalance_amount()>=withdrawl_amount)
            {
                this.withdrawl_amount=withdrawl_amount;
                this.has_withdrawn=true;
                this.date_of_withdrawl=date_of_withdrawl;
                super.setBalance_amount(super.getBalance_amount()-this.withdrawl_amount);
            }
            else
            {
                System.out.println("insufficient balance");
            }
        }
        else
        {
            System.out.println("incorrect pin_number");
        }
    }

    public void display()
    {
        super.display();
        if(this.has_withdrawn==true)
        {
            System.out.println("pin_number="+this.pin_number);
            System.out.println("date_of_withdrawl="+this.date_of_withdrawl);
            System.out.println("withdrawl_amount="+this.withdrawl_amount);
        }
        else
        {
            System.out.println("transaction has not been carried your balance_amount is "+super.getBalance_amount());
        }
    } 
}

