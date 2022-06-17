// Account.java
// Represents a bank account

public class Account 
{
    private int accountNumber; // account number
    private int pin; // PIN for authentication
    private double availableBalance; // funds available for withdrawal
    private double totalBalance; // funds available + pending deposits
    private double interestrate = 0.00;
    private int Type;
    private int limit = 0;
    private Date date;
       
       // Account constructor initializes attributes
       public Account( int theAccountNumber, int AccountType, int thePIN, 
          double theAvailableBalance, double theTotalBalance ,int day, int month, int year)
       {
          accountNumber = theAccountNumber;
          Type=AccountType;
          pin = thePIN;
          availableBalance = theAvailableBalance;
          totalBalance = theTotalBalance;
          date = new Date(day, month, year);
       } // end Account constructor
    
       // determines whether a user-specified PIN matches PIN in Account
       public boolean validatePIN(int userPIN )
       {
          if ( userPIN == pin )
             return true;
          else
             return false;
       } // end method validatePIN
       
   public boolean validateType(int AccountType)
   {
       if( AccountType == Type)
            return true;
       else
            return false;
   }
       
       // returns available balance
   public double getAvailableBalance()
   {
       return availableBalance;
   } // end getAvailableBalance
    
       // returns the total balance
   public double getTotalBalance()
   {
       return totalBalance;
   } // end method getTotalBalance
       
   public double getinterestrate(){
       return interestrate;
   }
    
   // credits an amount to the account
   public void credit( double amount )
   {
       totalBalance += amount; // add to total balance
   } // end method credit
    
   // debits an amount from the account
   public void debit( double amount )
   {
       availableBalance -= amount; // subtract from available balance
       totalBalance -= amount; // subtract from total balance
   } // end method debit
    
   public void updateTotalBalance( double NewTotalBalance )
   {
       totalBalance = NewTotalBalance;
   } // end method updateTotalBalance
       
   public void updateAvailableBalance( double NewAvailableBalance )
   {
       availableBalance = NewAvailableBalance;
   }
   // returns account number
   public int getAccountNumber()
   {
       return accountNumber;  
   } // end method getAccountNumber
   
   public int getAccountType()
   {
       return Type;
   }// end method getAccountType
    
   public int getlimit()
   {
       return limit;
   }
    
   public int getYear()
   {
       return date.getYear();
   }
} // end class Account


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