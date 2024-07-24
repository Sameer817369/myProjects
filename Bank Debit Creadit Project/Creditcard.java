 

/**
 * Child Class Creditcard
 * Sameer Parajuli
 */
public class Creditcard extends Bankcard
{
    /**declearing varivables**/
    private int cvc_number;
    private double credit_limit;
    private double interest_rate;
    private String expiration_date;
    private int grace_period;
    private boolean isGranted;
    /**creating constructors**/
    public Creditcard(int card_ID,String client_name,double balance_amount,String issuer_bank,String bank_account,int cvc_number,double interest_rate,
    String expiration_date)
    {
        super(balance_amount,card_ID,bank_account,issuer_bank);
        super.setClient_name(client_name);
        this.cvc_number=cvc_number;
        this.interest_rate=interest_rate;
        this.expiration_date=expiration_date;
        this.isGranted=false;
    }

    /**using accessor and mutator methods**/
    public int getCvc_number()
    {
        return this.cvc_number;
    }

    public double getCredit_limit()
    {
        return this.credit_limit;
    }

    public double getInterest_rate()
    {
        return this.interest_rate;
    }

    public String getExpiration_date()
    {
        return this.expiration_date;
    }

    public int getGrace_period()
    {
        return this.grace_period;
    } 

    public boolean getIsGranted()
    {
        return this.isGranted;
    }

    public void setCredit_limit(double credit_limit,int grace_period)
    {
        if(credit_limit<=2.5*super.getBalance_amount())
        {          
            this.credit_limit=credit_limit;
            this.grace_period=grace_period;
            this.isGranted=true;
        }
        else
        {
            System.out.println("credit_limit not reached");

        }
    }

    public void cancelCreditCard()
    {
        this.interest_rate=0;
        this.cvc_number=0;
        this.credit_limit=0;
        this.grace_period=0;
        this.isGranted=false;       
    }

    public void display()
    {
        super.display();/**calling main class**/
        if(isGranted=true)
        {

            System.out.println("cvc_number="+getCvc_number());
            System.out.println("credit_limit="+getCredit_limit());
            System.out.println("interest_rate="+getInterest_rate());
            System.out.println("expiration_date="+getExpiration_date());
            System.out.println("isGranted="+getIsGranted());
            System.out.println("graec_period="+getGrace_period());

        }
        else
        {

            System.out.println("cvc_number="+getCvc_number());
            System.out.println("interest_rate="+getInterest_rate());
            System.out.println("expiration_date="+getExpiration_date());
            System.out.println("isGranted="+getIsGranted());
        }
    }
}

