// BalanceInquiry.java
// Represents a balance inquiry ATM transaction
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.UIManager;
import java.lang.Math;
public class BalanceInquiry extends Transaction
{
   // BalanceInquiry constructor
   private JFrame f2;
   private JPanel pInfo;
   private JTextArea balanceinfo;
   private JButton BackMenubutton;
   
   private String infoMessage;
   private boolean confirm;
   
   public BalanceInquiry( int userAccountNumber, int AccountType, BankDatabase atmBankDatabase )
   {
      super( userAccountNumber, AccountType, atmBankDatabase );
   } // end BalanceInquiry constructor

   // performs the transaction
   public void execute()
   {
      // get references to bank database and screen
      BankDatabase bankDatabase = getBankDatabase();
      
      confirm = false;
      
      f2 = new JFrame("BalanceInfo");
      f2.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
      f2.setBounds(700 ,100,500,700);
      f2.setVisible(true);
      
      pInfo = new JPanel();
      
      f2.add(pInfo);
      // get the available balance for the account involved
      double availableBalance = Math.floor(
         bankDatabase.getAvailableBalance( getAccountNumber() , getAccountType())*100)/100;

      // get the total balance for the account involved
      double totalBalance = Math.floor(
         bankDatabase.getTotalBalance( getAccountNumber() , getAccountType())*100)/100;
         
      infoMessage = "Balance Information: \n" + "\n - Available balance: " + availableBalance + "\n - Total balance: " + totalBalance;
      balanceinfo = new JTextArea(infoMessage, 22, 55);
      
      BackMenubutton = new JButton("Back to Menu");
      BackMenubutton.setPreferredSize(new Dimension(220, 70));
      BackMenubutton.addActionListener( new ActionListener()
      {
          public void actionPerformed (ActionEvent event){
              f2.setVisible(false);
              confirm = true;
            }
        }
      );
      
      pInfo.add(balanceinfo);
      pInfo.add(BackMenubutton);
   } // end method execute
   
   public boolean Confirm(){
    return confirm;
    }
   
} // end class BalanceInquiry

    



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