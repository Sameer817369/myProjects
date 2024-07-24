import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;
public class BankGUI  extends Frame implements ActionListener
{
    /*declaring JFranme,JPanel,JLabe,JButton,JComboBox and making object of arraylist */
    JFrame f;
    JFrame f1;
    JFrame f2;
    JPanel p;
    JPanel p1;
    JPanel p2;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l19,l20,l21,l22,l23,l24,l25,l26,l27,l28,l29;
    JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15,t16,t17,t18,t19,t20,t21,t22,t23,t24,t25,t26,t27,t28,t29;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15;
    JComboBox<String>yearlist,monthlist,datelist,cd_yearlist,cd_datelist,cd_monthlist;

    ArrayList<Bankcard> bank=new ArrayList<Bankcard>();

    public BankGUI()
    {
        //creating frame and panel
        f=new JFrame();
        p=new JPanel();
        f.add(p);

        //creating button
        b1=new JButton("DebitCard");
        b1.setBounds(29,108,180,100);
        p.add(b1);

        b2=new JButton("CreditCard");
        b2.setBounds(376,108,180,100);
        p.add(b2);

        //eventlistener registering
        b1.addActionListener(this);
        b2.addActionListener(this);

        f.setLayout(null);
        p.setLayout(null);
        p.setSize(600,350);
        f.setSize(600,350);
        f.setVisible(true);
        p.setVisible(true);
        f.setTitle("BankGUI");
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);

    }

    public void DebitCard()
    {
        //creating frame and panel
        f1=new JFrame();
        p1=new JPanel();
        f1.add(p1);

        //creating label
        l10=new JLabel("Add to Debit Card");
        l10.setBounds(72,10,257,36);
        l10.setFont(new Font("Arial",Font.BOLD,20));        
        p1.add(l10);

        l1=new JLabel("Client Name");
        l1.setBounds(15,70,80,25);
        p1.add(l1);

        l2=new JLabel("Issuer Bank");
        l2.setBounds(15,115,80,25);
        p1.add(l2);

        l3=new JLabel("Card_ID");
        l3.setBounds(15,160,80,25);
        p1.add(l3);

        l4=new JLabel("Bank Account");
        l4.setBounds(15,196,120,25);
        p1.add(l4);

        l5=new JLabel("Balance Amount");
        l5.setBounds(15,242,120,25);
        p1.add(l5);

        l6=new JLabel("Pin Number");
        l6.setBounds(15,295,120,25);
        p1.add(l6);

        l11=new JLabel("Withdraw");
        l11.setBounds(709,10,166,36);
        l11.setFont(new Font("Arial",Font.BOLD,20));   
        p1.add(l11);

        l7=new JLabel("Card ID");
        l7.setBounds(629,70,80,25);
        p1.add(l7);

        l8=new JLabel("Withdrwal Amount");
        l8.setBounds(629,115,125,25);
        p1.add(l8);

        l9=new JLabel("Date of withdrawl");
        l9.setBounds(629,160,135,25);
        p1.add(l9);

        l12=new JLabel("Pin Number");
        l12.setBounds(629,205,80,25);
        p1.add(l12);

        //creating text field
        t1=new JTextField();
        t1.setBounds(134,58,180,32);
        p1.add(t1);

        t2=new JTextField();
        t2.setBounds(134,104,180,32);
        p1.add(t2);

        t3=new JTextField();
        t3.setBounds(134,150,180,32);
        p1.add(t3);

        t4=new JTextField();
        t4.setBounds(134,196,180,32);
        p1.add(t4);

        t5=new JTextField();
        t5.setBounds(134,242,180,32);
        p1.add(t5);

        t6=new JTextField();
        t6.setBounds(134,288,180,32);
        p1.add(t6);

        t7=new JTextField();
        t7.setBounds(735,64,180,32);
        p1.add(t7);

        t8=new JTextField();
        t8.setBounds(735,112,180,32);
        p1.add(t8);

        t9=new JTextField();
        t9.setBounds(735,208,180,32);
        p1.add(t9);

        //creating combobox
        String[]year={"2023"};
        yearlist=new JComboBox<String>(year);
        yearlist.setBounds(735,160,63,25);
        p1.add(yearlist);

        String[]month={"Jan","Feb","March","April","May","June","July","Aug","Sept","Oct","Nov","Dec"};
        monthlist=new JComboBox<String>(month);
        monthlist.setBounds(808,160,63,25);
        p1.add(monthlist);

        String[]date={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31","32"};
        datelist= new JComboBox<String>(date);
        datelist.setBounds(881,160,63,25);
        p1.add(datelist);

        b3=new JButton("Add to Debit Card");
        b3.setBounds(63,418,180,32);
        p1.add(b3);

        b4=new JButton("Display");
        b4.setBounds(306,418,180,32);
        p1.add(b4);

        b5=new JButton("Withdraw");
        b5.setBounds(540,418,180,32);
        p1.add(b5);

        b6=new JButton("Clear");
        b6.setBounds(795,418,180,32);
        p1.add(b6);

        b7=new JButton("Go Back");
        b7.setBounds(411,196,140,32);
        p1.add(b7); 
        //eventlistener registering
        b5.addActionListener(this);
        b4.addActionListener(this);
        b6.addActionListener(this);
        b3.addActionListener(this);
        b7.addActionListener(this);
        p1.setLayout(null);
        f1.setSize(1080,550);
        f1.setVisible(true);
        f1.setTitle("DebitGUI");
        f1.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
    }

    public void CreditCard()
    {
        f2=new JFrame();
        p2=new JPanel();
        f2.add(p2);
        //creating JLabel
        l25=new JLabel("Add to Credit Card");
        l25.setBounds(72,10,257,36);
        l25.setFont(new Font("Arial",Font.BOLD,20));        
        p2.add(l25);

        l15=new JLabel("Client Name");
        l15.setBounds(15,70,80,25);
        p2.add(l15);

        l16=new JLabel("Issuer Bank");
        l16.setBounds(15,115,80,25);
        p2.add(l16);

        l17=new JLabel("Card_ID");
        l17.setBounds(15,160,80,25);
        p2.add(l17);

        l18=new JLabel("Bank Account");
        l18.setBounds(15,196,120,25);
        p2.add(l18);

        l19=new JLabel("Balance Amount");
        l19.setBounds(15,242,120,25);
        p2.add(l19);

        l20=new JLabel("CVC Number");
        l20.setBounds(15,295,120,25);
        p2.add(l20);

        l21=new JLabel("Set Credit Limit");
        l21.setBounds(839,10,166,36);
        l21.setFont(new Font("Arial",Font.BOLD,20));   
        p2.add(l21);

        l22=new JLabel("Card ID");
        l22.setBounds(781,70,80,25);
        p2.add(l22);

        l23=new JLabel("Credit Limit");
        l23.setBounds(781,108,125,25);
        p2.add(l23);

        l24=new JLabel("Grace Period");
        l24.setBounds(781,146,135,25);
        p2.add(l24);

        l25=new JLabel("Interest Rate");
        l25.setBounds(15,340,80,25);
        p2.add(l25);

        l26=new JLabel("Expiration Date");
        l26.setBounds(15,385,120,25);
        p2.add(l26);

        l27=new JLabel("Cancel Credit Card");
        l27.setBounds(436,10,207,36);
        l27.setFont(new Font("Arial",Font.BOLD,20));   
        p2.add(l27);

        l28=new JLabel("Card ID");
        l28.setBounds(430,65,80,25);
        p2.add(l28);
        //creating TextField
        t15=new JTextField();
        t15.setBounds(505,58,180,32);
        p2.add(t15);

        t16=new JTextField();
        t16.setBounds(134,58,180,32);
        p2.add(t16);

        t17=new JTextField();
        t17.setBounds(134,104,180,32);
        p2.add(t17);

        t18=new JTextField();
        t18.setBounds(134,150,180,32);
        p2.add(t18);

        t19=new JTextField();
        t19.setBounds(134,196,180,32);
        p2.add(t19);

        t20=new JTextField();
        t20.setBounds(134,242,180,32);
        p2.add(t20);

        t21=new JTextField();
        t21.setBounds(134,288,180,32);
        p2.add(t21);

        t22=new JTextField();
        t22.setBounds(865,63,180,32);
        p2.add(t22);

        t23=new JTextField();
        t23.setBounds(865,101,180,32);
        p2.add(t23);

        t24=new JTextField();
        t24.setBounds(134,334,180,32);
        p2.add(t24);

        t25=new JTextField();
        t25.setBounds(865,139,180,32);
        p2.add(t25);
        //creating ComboBox
        String[]year={"2023"};
        cd_yearlist=new JComboBox<String>(year);
        cd_yearlist.setBounds(126,380,60,25);
        p2.add(cd_yearlist);

        String[]month={"Jan","Feb","March","April","May","June","July","Aug","Sept","Oct","Nov","Dec"};
        cd_monthlist=new JComboBox<String>(month);
        cd_monthlist.setBounds(217,380,60,25);
        p2.add(cd_monthlist);

        String[]date={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31","32"};
        cd_datelist= new JComboBox<String>(date);
        cd_datelist.setBounds(308,380,60,25);
        p2.add(cd_datelist);
        //Creating JButton
        b8=new JButton("Add to Credit Card");
        b8.setBounds(58,457,180,32);
        p2.add(b8);

        b9=new JButton("Display");
        b9.setBounds(289,457,180,32);
        p2.add(b9);

        b10=new JButton("Go Back");
        b10.setBounds(755,364,180,32);
        p2.add(b10);

        b11=new JButton("Cancel");
        b11.setBounds(386,139,140,32);
        p2.add(b11);

        b12=new JButton("Set");
        b12.setBounds(885,191,60,42);
        p2.add(b12);

        b13=new JButton("Clear");
        b13.setBounds(573,139,140,32);
        p2.add(b13);
        //eventlistener registering
        b8.addActionListener(this);
        b13.addActionListener(this);
        b10.addActionListener(this);
        b12.addActionListener(this);
        b11.addActionListener(this);
        b9.addActionListener(this);

        p2.setLayout(null);
        f2.setSize(1080,550);
        f2.setVisible(true);
        f2.setTitle("CreditGUI");
        f2.setDefaultCloseOperation(f.EXIT_ON_CLOSE);

    }
    //invoking ActionListener
    public void actionPerformed(ActionEvent e)
    {
        //invoking ActionListener on b1 button
        if (e.getSource()==b1)
        {
            DebitCard();
            f.setVisible(false);
            f1.setVisible(true);
        }
        //invoking ActionListener on b2 button
        else if(e.getSource()==b2)
        {
            CreditCard();
            f.setVisible(false);
            f2.setVisible(true);
        }
        //invoking ActionListener on b7 button
        else if(e.getSource()==b7)
        {
            new BankGUI();
            f1.setVisible(false);

        }
        //invoking ActionListener on b10 button
        else if(e.getSource()==b10)
        {
            new BankGUI();
            f2.setVisible(false);

        }
        //invoking ActionListener on b8 button
        else if (e.getSource()==b8)
        {
        try
        {
             String Client_Name=t16.getText();
             String Issuer_Bank=t17.getText();
             int Card_ID=Integer.parseInt(t18.getText());
             String Bank_Account=t19.getText();
             double Balance_Amount=Double.parseDouble(t20.getText());
             int CVC_Number=Integer.parseInt(t21.getText());
             double Interest_Rate=Double.parseDouble(t24.getText());
             String cd_year=cd_yearlist.getSelectedItem().toString();
             String cd_month=cd_monthlist.getSelectedItem().toString();
             String cd_date=cd_datelist.getSelectedItem().toString();
             String Expiration_date=cd_year+cd_month+cd_date;
            
             Bankcard cre=new Creditcard(Card_ID,Client_Name,Balance_Amount,Issuer_Bank,Bank_Account,CVC_Number,Interest_Rate,Expiration_date);
             bank.add(cre);
             JOptionPane.showMessageDialog(f2,"Credit Card Added","Success",JOptionPane.INFORMATION_MESSAGE);
             System.out.println("added");      
        }
        catch(NumberFormatException err)
        {
             System.out.println("Error");
             JOptionPane.showMessageDialog(f2,"Credit Card Not Added","Error",JOptionPane.ERROR_MESSAGE);
            
        }
        }
        //invoking ActionListener on b3 button
        else if (e.getSource()==b3)
        {
            try
            {
                String ClientName=t1.getText();
                String IssuerBank=t2.getText();
                int CardID=Integer.parseInt(t3.getText());
                String BankAccount=t4.getText();
                double BalanceAmount=Double.parseDouble(t5.getText());
                int PinNumber=Integer.parseInt(t6.getText());

                Bankcard deb=new Debitcard(BalanceAmount,CardID,BankAccount,IssuerBank,ClientName,PinNumber);
                bank.add(deb);
                JOptionPane.showMessageDialog(f1,"Debit Card Added","Success",JOptionPane.INFORMATION_MESSAGE);
                System.out.println("Added");
            }
            catch(NumberFormatException err)
            {
                System.out.println("Error");
                JOptionPane.showMessageDialog(f1,"Debit Card Not Added","Error",JOptionPane.ERROR_MESSAGE);
            }
        }
        //invoking ActionListener on b6 button
        else if (e.getSource()==b6)
        {
            t1.setText("");
            t2.setText("");
            t3.setText("");
            t4.setText("");
            t5.setText("");
            t6.setText("");
            t7.setText("");
            t8.setText("");
            t9.setText("");
        }
        //invoking ActionListener on b13 button
        else if(e.getSource()==b13)
        {
            t15.setText("");
            t16.setText("");
            t17.setText("");
            t18.setText("");
            t19.setText("");
            t20.setText("");
            t21.setText("");
            t22.setText("");
            t23.setText("");
            t24.setText("");
            t25.setText("");

        }
        //invoking ActionListener on b5 button
        else if(e.getSource()==b5)
        {
            try
            {
            int CardID=Integer.parseInt(t7.getText());
            int Withdrawl_Amount=Integer.parseInt(t8.getText());
            int Pin_Number=Integer.parseInt(t9.getText());
            String deb_year=yearlist.getSelectedItem().toString();
            String deb_month=monthlist.getSelectedItem().toString();
            String deb_date=datelist.getSelectedItem().toString();
            String Date_Of_Withdrawl=deb_year+deb_month+deb_date;

            
            for(Bankcard widobj:bank)
            {
                if(widobj instanceof Debitcard)
                {
                    Debitcard wid=(Debitcard)widobj;
                    if(CardID==wid.getCard_ID())
                    {
                         if(Pin_Number==wid.getPin_number())
                         {
                             if(Withdrawl_Amount<=wid.getBalance_amount())
                             {
                                wid.withdraw(Withdrawl_Amount,Pin_Number,Date_Of_Withdrawl);
                                JOptionPane.showMessageDialog(f1,"Amount Withdrawn"+"\n"+"CardID:"+wid.getCard_ID()+"\n"+"Client Name:"+wid.getClient_name()+
                                "\n"+"Issuer Bank:"+wid.getIssuer_bank()+"\n"+"Balance Amount:"+wid.getBalance_amount()+"\n"+"Withdrawn Amount:"+wid.getWithdrawl_amount(),"Success",JOptionPane.INFORMATION_MESSAGE);
                           
                             }
                             else
                             {
                                 JOptionPane.showMessageDialog(f1,"Not Enough Balance","Error",JOptionPane.ERROR_MESSAGE);
                             }   
                    }
                        else
                        {
                            JOptionPane.showMessageDialog(f1,"Incorrect Pin_Number","Error",JOptionPane.ERROR_MESSAGE);
                        }        
                    }
                    else
                    {
                       JOptionPane.showMessageDialog(f1,"Incorrect Card_ID","Error",JOptionPane.ERROR_MESSAGE);  
                    }
                }
            }
        }
            catch(NumberFormatException err)
            {
                System.out.println("error");
            }
        }
        
        //invoking ActionListener on b12 button
        else if(e.getSource()==b12)
        {
            try{
            int CardID=Integer.parseInt(t22.getText());
            int CreditLimit=Integer.parseInt(t23.getText());
            int GracePeriod=Integer.parseInt(t25.getText());
            
            for(Bankcard objset:bank)
            {
                if(objset instanceof Creditcard)
                {
                    Creditcard cd_set=(Creditcard)objset;
                    if(CardID==cd_set.getCard_ID())
                    {
                         if(CreditLimit <= 2.5 * cd_set.getBalance_amount())
                         {
                             JOptionPane.showMessageDialog(f2,"Credit Limit Set","Success",JOptionPane.INFORMATION_MESSAGE);
                             cd_set.setCredit_limit(CreditLimit,GracePeriod);
                         }
                         else
                         {
                             JOptionPane.showMessageDialog(f2,"Balance exceeded","Fail",JOptionPane.INFORMATION_MESSAGE);
                         }
                    }
                     else
                    {
                      JOptionPane.showMessageDialog(f2,"Incorrect Card ID","Error",JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
               }
            catch(NumberFormatException err)
            {
                System.out.println("Error");
            }   
        }
        //invoking ActionListener on b11 button
        else if(e.getSource()==b11)
        {
            try
            {
            int CardID=Integer.parseInt(t22.getText());
            for(Bankcard objcancel:bank)
            {
                if(objcancel instanceof Creditcard)
                {
                    Creditcard cd_cancel=(Creditcard)objcancel;
                    if(CardID==cd_cancel.getCard_ID())
                    {
                    cd_cancel.cancelCreditCard();
                    JOptionPane.showMessageDialog(f2,"Credit Card Cancelled","Success",JOptionPane.INFORMATION_MESSAGE);
                    System.out.println("canceled");
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(f2,"Incorrect Card ID","Error",JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
            }
            catch(NumberFormatException err)
            {
                System.out.println("error");
            }
        }
        //invoking ActionListener on b9 button
        else if(e.getSource()==b9)
        {
            for(Bankcard objdisplay:bank)
        {
            
            
                if(objdisplay instanceof Creditcard)
                {
                    Creditcard cd_dis=(Creditcard)objdisplay;
                    cd_dis.display();    
                }
        }
        }
        //invoking ActionListener on b4 button
         else if(e.getSource()==b4)
        {
            for(Bankcard objdisplay:bank)
        {
            
            
                if(objdisplay instanceof Debitcard)
                {
                    Debitcard deb_dis=(Debitcard)objdisplay;
                    deb_dis.display();    
                }
        }
        }
                 
            
    }
        
    public static void main(String[]args)
    {
        new BankGUI();
    }
}
    
