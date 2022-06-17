// ATM.java
// Represents an automated teller machine
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import java.awt.Color;

public class ATM extends JFrame
{
   private boolean userAuthenticated; // whether user is authenticated
   private boolean typeAuthenticated;
   private boolean userExit;
   private int currentAccountNumber; // current user's account number
   private int AccountNumber;
   private int Type;
   private int mainMenuSelection;
   private CashDispenser cashDispenser; // ATM's cash dispenser
   private BankDatabase bankDatabase; // account information database
   private Date date;
   
   private JFrame f1;
   private JPanel Main;
   private JPanel p1;
   private JPanel p2;
   private JPanel p3;
   private JPanel p4;
   private CardLayout c1;
   private JTextArea a1;
   private JTextArea a2;
   private JTextArea a3;
   private JTextArea a4;
   private JButton nextbutton;
   private JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, bCancel, bClear, bEnter, bnull1, bnull2, bnull3;
   private JButton savingbutton, chequebutton;
   private JButton balanceinfobutton, withdrawalbutton, transferbutton, exitbutton;
   private JPasswordField pw;
   private JTextField t1;
   private String p1Message;
   private String p2Message;
   private String p3Message;
   private String p4Message;

   // constants corresponding to main menu options
   private static final int BALANCE_INQUIRY = 1;
   private static final int WITHDRAWAL = 2;
   private static final int TRANSFER = 3;
   private static final int EXIT = 4;
   private static final int SavingAccount = 1;
   private static final int ChequeAccount = 2;

   // no-argument ATM constructor initializes instance variables
   public ATM() 
   {
      super("ABC Bank");
      userAuthenticated = false; // user is not authenticated to start
      userExit = false;
      currentAccountNumber = 0; // no current account number to start
      cashDispenser = new CashDispenser(); // create cash dispenser
      bankDatabase = new BankDatabase(); // create acct info database
      date = new Date(31, 12, 2020);
      
      payinterest();
      run();
      
   } // end no-argument ATM constructor
   
   public void run(){
       
       
       try { 
            // set look and feel 
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName()); 
        } 
        catch (Exception e) { 
            System.err.println(e.getMessage()); 
      }
      
      f1 = new JFrame(); 
      
      Main = new JPanel();
      
      c1 = new CardLayout();
      Main.setLayout(c1);
      
      p1 = new JPanel();
      p2 = new JPanel();
      p3 = new JPanel();
      p4 = new JPanel();

      Main.add(p1,"1");
      Main.add(p2,"2");
      Main.add(p3,"3");
      Main.add(p4,"4");
      
      add(Main);
      
      if(userAuthenticated == false){
        c1.show(Main,"1");
        }
        else{
        c1.show(Main,"4");
        }

      p1Message = "Welcome to ABC Bank\n" + "Please insert your bank card\n" + "After finished, please click the \"Next\" Button.";
      a1 = new JTextArea(p1Message, 22,55);
      a1.setEditable(false);
      
      nextbutton = new JButton("Next");
      nextbutton.setPreferredSize(new Dimension(90,50));
      nextbutton.addActionListener( new ActionListener()
        {
          public void actionPerformed (ActionEvent event){
              c1.show(Main,"2");
            }
        }
      );
      
      p1.add(a1);
      p1.add(nextbutton);
      
      
      AccountNumber = 12345;
      currentAccountNumber = AccountNumber;
      
      
      
      p2Message = "Please enter your pin\n" + "After finished, please click the \"Enter\" button. ";
      a2 = new JTextArea(p2Message, 22,55);
      a2.setEditable(false);
      
      pw = new JPasswordField(50);
      pw.setEditable(false);
      
      b0 = new JButton("0"); 
      b0.setPreferredSize(new Dimension(90,50));
      b0.addActionListener( new ActionListener()
      {
          public void actionPerformed (ActionEvent event){
             String EnterNumber = pw.getText() + "0";
             pw.setText(EnterNumber);
            }
        }
      );
        
      b1 = new JButton("1"); 
      b1.setPreferredSize(new Dimension(90,50));
      b1.addActionListener( new ActionListener()
      {
          public void actionPerformed (ActionEvent event){
             String EnterNumber = pw.getText() + "1";
             pw.setText(EnterNumber);
            }
        }
      );
        
      b2 = new JButton("2"); 
      b2.setPreferredSize(new Dimension(90,50));
      b2.addActionListener( new ActionListener()
      {
          public void actionPerformed (ActionEvent event){
             String EnterNumber = pw.getText() + "2";
             pw.setText(EnterNumber);
            }
        }
      );
        
      b3 = new JButton("3"); 
      b3.setPreferredSize(new Dimension(90,50));
      b3.addActionListener( new ActionListener()
      {
          public void actionPerformed (ActionEvent event){
             String EnterNumber = pw.getText() + "3";
             pw.setText(EnterNumber);
            }
        }
      );
        
      b4 = new JButton("4");
      b4.setPreferredSize(new Dimension(90,50));
      b4.addActionListener( new ActionListener()
      {
          public void actionPerformed (ActionEvent event){
             String EnterNumber = pw.getText() + "4";
             pw.setText(EnterNumber);
            }
        }
      );
        
      b5 = new JButton("5"); 
      b5.setPreferredSize(new Dimension(90,50));
      b5.addActionListener( new ActionListener()
      {
          public void actionPerformed (ActionEvent event){
             String EnterNumber = pw.getText() + "5";
             pw.setText(EnterNumber);
            }
        }
      );
        
      b6 = new JButton("6"); 
      b6.setPreferredSize(new Dimension(90,50));
      b6.addActionListener( new ActionListener()
      {
          public void actionPerformed (ActionEvent event){
             String EnterNumber = pw.getText() + "6";
             pw.setText(EnterNumber);
            }
        }
      );
        
      b7 = new JButton("7"); 
      b7.setPreferredSize(new Dimension(90,50));
      b7.addActionListener( new ActionListener()
      {
          public void actionPerformed (ActionEvent event){
             String EnterNumber = pw.getText() + "7";
             pw.setText(EnterNumber);
            }
        }
      );
        
      b8 = new JButton("8"); 
      b8.setPreferredSize(new Dimension(90,50));
      b8.addActionListener( new ActionListener()
      {
          public void actionPerformed (ActionEvent event){
             String EnterNumber = pw.getText() + "8";
             pw.setText(EnterNumber);
            }
        }
      );
        
      b9 = new JButton("9"); 
      b9.setPreferredSize(new Dimension(90,50));
      b9.addActionListener( new ActionListener()
      {
          public void actionPerformed (ActionEvent event){
             String EnterNumber = pw.getText() + "9";
             pw.setText(EnterNumber);
            }
        }
      );
        
      bCancel = new JButton("CANCEL");
      bCancel.setBackground(Color.RED);
      bCancel.setPreferredSize(new Dimension(170,50));
      bCancel.addActionListener( new ActionListener()
      {
          public void actionPerformed (ActionEvent event){
             if(JOptionPane.showConfirmDialog(f1, "Confirm if you want to exit","Loan Management System", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
                 JOptionPane.showMessageDialog(f1,"Thank you for using ABC Bank's ATM!" + "GoodBye!");
                 System.exit(0);
                }
            }
        }
      );
        
      bClear = new JButton("CLEAR"); 
      bClear.setBackground(Color.YELLOW);
      bClear.setPreferredSize(new Dimension(170,50));
      bClear.addActionListener( new ActionListener()
      {
          public void actionPerformed (ActionEvent event){
             pw.setText("");
            }
        }
      );
        
      bEnter = new JButton("ENTER");
      bEnter.setBackground(Color.GREEN);
      bEnter.setPreferredSize(new Dimension(170,50));
      bEnter.addActionListener( new ActionListener()
      {
          public void actionPerformed (ActionEvent event){
             int Pin = Integer.parseInt(pw.getText());
             if(authenticateUser(currentAccountNumber,Pin)){
                 JOptionPane.showMessageDialog(f1, "Logined");
                 c1.show(Main,"3");
                }
                else{
                    JOptionPane.showMessageDialog(f1, "Sorry! Your Pin is worng\n" + "Please enter again.");
                    pw.setText("");
                }
            }
        }
      );
        
      bnull1 = new JButton(" ");
      bnull1.setPreferredSize(new Dimension(90,50));
       
      bnull2 = new JButton(" ");
      bnull2.setPreferredSize(new Dimension(90,50));
        
      bnull3 = new JButton(" ");
      bnull3.setPreferredSize(new Dimension(170,50));
       
      p2.add(a2); 
      p2.add(pw);
      p2.add(b1);
      p2.add(b2);
      p2.add(b3);
      p2.add(bCancel);
      p2.add(b4);
      p2.add(b5);
      p2.add(b6);
      p2.add(bClear);
      p2.add(b7);
      p2.add(b8);
      p2.add(b9);
      p2.add(bEnter);
      p2.add(bnull1);
      p2.add(b0);
      p2.add(bnull2);
      p2.add(bnull3);

      
      p3Message = "Account Type\n" + "1 - Saving Account\n" + "2 - Cheque Account\n" + "Please choose the Type of Account.";
      a3 = new JTextArea(p3Message,22,55);
      a3.setEditable(false);
      
      savingbutton = new JButton("Saving Account");
      savingbutton.setPreferredSize(new Dimension(220, 70));
      savingbutton.addActionListener( new ActionListener()
      {
          public void actionPerformed (ActionEvent event){
             JOptionPane.showMessageDialog(f1,"You have choosed Saving Account");
             Type = 1;
             c1.show(Main,"4");
            }
        }
      );
      
      chequebutton = new JButton("Cheque Account");
      chequebutton.setPreferredSize(new Dimension(220, 70));
      chequebutton.addActionListener( new ActionListener()
      {
          public void actionPerformed (ActionEvent event){
             Type = 2;
             if(validateType(Type)){
                JOptionPane.showMessageDialog(f1,"You have choosed Cheque Account");
                    c1.show(Main,"4");
                }
              else{
                JOptionPane.showMessageDialog(f1,"Sorry, you have not Cheque Account\n" + "Please choose another Account.");
                }
            }
        }
      );
      
      p3.add(a3);
      p3.add(savingbutton);
      p3.add(chequebutton);

      p4Message = "Main Menu\n" + "1 - View my balance\n" + "2 - Withdrawal\n" + "3 - Transfer\n" + "4 - Exit\n" + "Please choose a choice.";
      a4 = new JTextArea (p4Message, 22 ,55);
      
      balanceinfobutton = new JButton("Balance Info");
      balanceinfobutton.setPreferredSize(new Dimension(220, 70));
      balanceinfobutton.addActionListener( new ActionListener()
      {
          public void actionPerformed (ActionEvent event){
              mainMenuSelection = BALANCE_INQUIRY;
              performTransactions(mainMenuSelection);
            }
        }
      );
      
      withdrawalbutton = new JButton("Withdrawal");
      withdrawalbutton.setPreferredSize(new Dimension(220, 70));
      withdrawalbutton.addActionListener( new ActionListener()
      {
          public void actionPerformed (ActionEvent event){
             mainMenuSelection = WITHDRAWAL;
             performTransactions(mainMenuSelection);
            }
        }
      );
      
      transferbutton = new JButton("Transfer");
      transferbutton.setPreferredSize(new Dimension(220, 70));
      transferbutton.addActionListener( new ActionListener()
      {
          public void actionPerformed (ActionEvent event){
             mainMenuSelection = TRANSFER;
              performTransactions(mainMenuSelection);
            }
        }
      );
      
      exitbutton = new JButton("Exit");
      exitbutton.setPreferredSize(new Dimension(220, 70));
      exitbutton.addActionListener( new ActionListener()
      {
          public void actionPerformed (ActionEvent event){
             if(JOptionPane.showConfirmDialog(f1, "Confirm if you want to exit","ABC Bank", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
                 JOptionPane.showMessageDialog(f1,"Thank you for using ABC Bank's ATM!" + "GoodBye!");
                 userExit = true;
                 System.exit(0);
                }
            }
        }
      );
      
      p4.add(a4);
      p4.add(balanceinfobutton);
      p4.add(withdrawalbutton);
      p4.add(transferbutton);
      p4.add(exitbutton);
      
    }
   // start ATM 

   public void payinterest(){
    int AccountType = 1;
    int SystemRunningYear = date.getYear(); 
    bankDatabase.updateTotalBalance(AccountType, SystemRunningYear);
    }
   
   // attempts to authenticate user against database
   private boolean authenticateUser(int AccountNumber,int Pin) 
   {
      
      // set userAuthenticated to boolean value returned by database
      userAuthenticated = 
         bankDatabase.authenticateUser( AccountNumber, Pin );
      
      // check whether authentication succeeded
      if ( userAuthenticated )
      {
         return true;
      } // end if
      else
         return false;
   } // end method authenticateUser

   private boolean validateType(int TypeSelection){
 
       typeAuthenticated=
            bankDatabase.authenticateType(currentAccountNumber,TypeSelection);
            
        if(typeAuthenticated){
            return true;
        }
        else{
            return false;
        }
 
   }
   
   // display the main menu and perform transactions
   private void performTransactions( int mainMenuSelection) 
   {
      // local variable to store transaction currently being processed
      Transaction currentTransaction = null;
         switch ( mainMenuSelection )
         {
            // user chose to perform one of three transaction types
            case BALANCE_INQUIRY: 
            case WITHDRAWAL: 
            case TRANSFER:

               // initialize as new object of chosen type
               currentTransaction = 
                  createTransaction( mainMenuSelection );
                  currentTransaction.execute();
               break;
         } // end switch
   } // end method performTransactions
         
   // return object of specified Transaction subclass
   private Transaction createTransaction( int type )
   {
      Transaction temp = null; // temporary Transaction variable
      
      // determine which type of Transaction to create     
      switch ( type )
      {
         case BALANCE_INQUIRY: // create new BalanceInquiry transaction
            temp = new BalanceInquiry( currentAccountNumber, Type, bankDatabase );
            break;
         case WITHDRAWAL: // create new Withdrawal transaction
            temp = new Withdrawal( currentAccountNumber, Type, bankDatabase, cashDispenser);
            break; 
         case TRANSFER: // create new Deposit transaction
            temp = new Transfer( currentAccountNumber, Type, bankDatabase);
            break;
      } // end switch

      return temp; // return the newly created object
   } // end method createTransaction
} // end class ATM



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