// Withdrawal.java
// Represents a withdrawal ATM transaction
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import java.awt.Color;
public class Withdrawal extends Transaction
{
   private double amount1; // amount to withdraw
   private int amount2;
   private boolean cashDispensed = false; // cash was not dispensed yet
   private double availableBalance;
   private CashDispenser cashDispenser; // reference to cash dispenser
   
   private JFrame fwithdrawal;
   private JPanel Main;
   private JPanel p1;
   private JPanel p2;
   private JPanel p3;
   private CardLayout c2;
   private JTextArea a1;
   private JTextArea a2;
   private JTextArea a3;
   private JTextField t1;
   private JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, bCancel, bClear, bEnter, bnull1, bpoint, bnull3;
   private JButton NextButton1;
   private JButton NextButton2;
   private String Message1;
   private String Message2;
   private String Message3;
   
   // constant corresponding to menu option to cancel
   private final static int CANCELED = 0;

   // Withdrawal constructor
   public Withdrawal( int userAccountNumber, int AccountType, BankDatabase atmBankDatabase, CashDispenser atmCashDispenser )
   {
      // initialize superclass variables
      super( userAccountNumber, AccountType, atmBankDatabase );
      
      // initialize references to keypad and cash dispenser
      cashDispenser = atmCashDispenser;
      
   } // end Withdrawal constructor

   // perform transaction
   public void execute()
   {
       // amount available for withdrawal
      // get references to bank database and screen
      BankDatabase bankDatabase = getBankDatabase(); 
      
      fwithdrawal = new JFrame("Withdrawal");
      fwithdrawal.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
      fwithdrawal.setBounds(700 ,100,500,700);
      fwithdrawal.setVisible(true);
      
      c2 = new CardLayout();
      
      Main = new JPanel();
      fwithdrawal.add(Main);
      
      Main.setLayout(c2);
      
      p1 = new JPanel();
      Main.add(p1,"1");
      
      p2 = new JPanel();
      Main.add(p2,"2");
      
      p3 = new JPanel();
      Main.add(p3,"3");
      
      c2.show(Main,"1");
      
      Message1 = "Please type a withdrawal HKD amount: \n" + "Click the \"CANCEL\" button will back to the Main Menu.";
      a1 = new JTextArea(Message1, 22 , 55);
      a1.setEditable(false);
      
      t1 = new JTextField(50);
      t1.setEditable(false);
      
      b0 = new JButton("0"); 
      b0.setPreferredSize(new Dimension(90,50));
      b0.addActionListener( new ActionListener()
      {
          public void actionPerformed (ActionEvent event){
             String EnterNumber = t1.getText() + "0";
             t1.setText(EnterNumber);
            }
        }
      );
        
      b1 = new JButton("1"); 
      b1.setPreferredSize(new Dimension(90,50));
      b1.addActionListener( new ActionListener()
      {
          public void actionPerformed (ActionEvent event){
             String EnterNumber = t1.getText() + "1";
             t1.setText(EnterNumber);
            }
        }
      );
        
      b2 = new JButton("2"); 
      b2.setPreferredSize(new Dimension(90,50));
      b2.addActionListener( new ActionListener()
      {
          public void actionPerformed (ActionEvent event){
             String EnterNumber = t1.getText() + "2";
             t1.setText(EnterNumber);
            }
        }
      );
        
      b3 = new JButton("3"); 
      b3.setPreferredSize(new Dimension(90,50));
      b3.addActionListener( new ActionListener()
      {
          public void actionPerformed (ActionEvent event){
             String EnterNumber = t1.getText() + "3";
             t1.setText(EnterNumber);
            }
        }
      );
        
      b4 = new JButton("4");
      b4.setPreferredSize(new Dimension(90,50));
      b4.addActionListener( new ActionListener()
      {
          public void actionPerformed (ActionEvent event){
             String EnterNumber = t1.getText() + "4";
             t1.setText(EnterNumber);
            }
        }
      );
        
      b5 = new JButton("5"); 
      b5.setPreferredSize(new Dimension(90,50));
      b5.addActionListener( new ActionListener()
      {
          public void actionPerformed (ActionEvent event){
             String EnterNumber = t1.getText() + "5";
             t1.setText(EnterNumber);
            }
        }
      );
        
      b6 = new JButton("6"); 
      b6.setPreferredSize(new Dimension(90,50));
      b6.addActionListener( new ActionListener()
      {
          public void actionPerformed (ActionEvent event){
             String EnterNumber = t1.getText() + "6";
             t1.setText(EnterNumber);
            }
        }
      );
        
      b7 = new JButton("7"); 
      b7.setPreferredSize(new Dimension(90,50));
      b7.addActionListener( new ActionListener()
      {
          public void actionPerformed (ActionEvent event){
             String EnterNumber = t1.getText() + "7";
             t1.setText(EnterNumber);
            }
        }
      );
        
      b8 = new JButton("8"); 
      b8.setPreferredSize(new Dimension(90,50));
      b8.addActionListener( new ActionListener()
      {
          public void actionPerformed (ActionEvent event){
             String EnterNumber = t1.getText() + "8";
             t1.setText(EnterNumber);
            }
        }
      );
        
      b9 = new JButton("9"); 
      b9.setPreferredSize(new Dimension(90,50));
      b9.addActionListener( new ActionListener()
      {
          public void actionPerformed (ActionEvent event){
             String EnterNumber = t1.getText() + "9";
             t1.setText(EnterNumber);
            }
        }
      );
        
      bCancel = new JButton("CANCEL");
      bCancel.setBackground(Color.RED);
      bCancel.setPreferredSize(new Dimension(170,50));
      bCancel.addActionListener( new ActionListener()
      {
          public void actionPerformed (ActionEvent event){
                fwithdrawal.setVisible(false);
            }
        }
      );
        
      bClear = new JButton("CLEAR"); 
      bClear.setBackground(Color.YELLOW);
      bClear.setPreferredSize(new Dimension(170,50));
      bClear.addActionListener( new ActionListener()
      {
          public void actionPerformed (ActionEvent event){
             t1.setText("");
            }
        }
      );
        
      bEnter = new JButton("ENTER");
      bEnter.setBackground(Color.GREEN);
      bEnter.setPreferredSize(new Dimension(170,50));
      bEnter.addActionListener( new ActionListener()
      {
          public void actionPerformed (ActionEvent event)
          {
                
                amount1 = Double.parseDouble(t1.getText());
             
                if(amount1%100 == 0 ){
                    amount2 = (int) amount1;
                    if ( ( getAccountType() == 2 ) && ( amount2 > bankDatabase.getlimit( getAccountNumber(), getAccountType() ) ) ){
                        JOptionPane.showMessageDialog(fwithdrawal, "Sorry! The amount is out of the limit. Please type a smaller amount.");
                    }
                    else{
                        
                        availableBalance = 
                        bankDatabase.getAvailableBalance( getAccountNumber() , getAccountType());
                    
                        if(amount2 <= availableBalance){
                            if ( cashDispenser.isSufficientCashAvailable( amount2 ) )
                                {
                                    if(JOptionPane.showConfirmDialog(fwithdrawal, "Confirm the amount of withdrawal","ABC Bank", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
                                        bankDatabase.debit( getAccountNumber(), getAccountType(), amount2 );
                  
                                        cashDispenser.dispenseCash( amount2 ); // dispense cash
                                        cashDispensed = true; // cash was dispensed
                                        c2.show(Main,"2");
                                        t1.setText("");
                                    }
                                }
                                else{
                                    JOptionPane.showMessageDialog(fwithdrawal, "Insufficient cash available in the ATM.\n" + "Please type a smaller amount.");
                                    t1.setText("");
                                }
                            }
                            else{
                                JOptionPane.showMessageDialog(fwithdrawal, "Insufficient funds in your account.\n" + "Please type a smaller amount.");
                                t1.setText("");
                            }
                        }
                }
                else{
                    JOptionPane.showMessageDialog(fwithdrawal, "Ivalid Input.\n" + "Please try again.");
                    t1.setText("");
                }
            }
        }
      );
        
      bnull1 = new JButton(" ");
      bnull1.setPreferredSize(new Dimension(90,50));
       
      bpoint = new JButton(".");
      bpoint.setPreferredSize(new Dimension(90,50));
      bpoint.addActionListener( new ActionListener()
      {
          public void actionPerformed (ActionEvent event)
          {
              String EnterNumber = t1.getText() + ".";
              t1.setText(EnterNumber);
          }
      }
      );
        
      bnull3 = new JButton(" ");
      bnull3.setPreferredSize(new Dimension(170,50));
       
      p1.add(a1); 
      p1.add(t1);
      p1.add(b1);
      p1.add(b2);
      p1.add(b3);
      p1.add(bCancel);
      p1.add(b4);
      p1.add(b5);
      p1.add(b6);
      p1.add(bClear);
      p1.add(b7);
      p1.add(b8);
      p1.add(b9);
      p1.add(bEnter);
      p1.add(bnull1);
      p1.add(b0);
      p1.add(bpoint);
      p1.add(bnull3);
      
      Message2 = "Please take your bank card.\n" + "The card ejected.";
      a2 = new JTextArea(Message2, 22, 55);
      a2.setEditable(false);
      
      NextButton1 = new JButton("Continuse");
      NextButton1.setPreferredSize(new Dimension(220,70));
      NextButton1.addActionListener(new ActionListener()
      {
          public void actionPerformed(ActionEvent event){
              c2.show(Main,"3");
            }
        }
        );
      
      p2.add(a2);
      p2.add(NextButton1);
      
      Message3 = "Please take your cash.\n" + "Cash dispensed";
      a3 = new JTextArea(Message3, 22, 55);
      a3.setEditable(false);
      
      NextButton2 = new JButton("Finish");
      NextButton2.setPreferredSize(new Dimension(220,70));
      NextButton2.addActionListener(new ActionListener()
      {
          public void actionPerformed(ActionEvent event){
              JOptionPane.showMessageDialog(fwithdrawal,"Thank you for using ABC Bank's ATM!" + "GoodBye!");
              System.exit(0);
            }
        }
      );

      p3.add(a3);
      p3.add(NextButton2);
   } // end method execute
} // end class Withdrawal



/**************************************************************************
 * (C) Copyright 1992-2007 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/