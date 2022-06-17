// BankDatabase.java
// Represents the bank account information database 
import java.lang.Math;
public class BankDatabase
{
   private Account accounts[]; // array of Accounts
   
   // no-argument BankDatabase constructor initializes accounts
   public BankDatabase()
   {
      accounts = new Account[ 5 ]; // just 5 accounts for testing
      accounts[ 0 ] = new ChequeAccount( 12345, 2, 54321, 5000.0, 13000.0, 31, 12, 2019);
      accounts[ 1 ] = new SavingAccount( 12345, 1, 54321, 10000.0, 10000.0, 01, 01, 2019);
      accounts[ 2 ] = new ChequeAccount( 23456, 2, 65432, 20000.0, 30000.0, 11, 12, 2020);  
      accounts[ 3 ] = new SavingAccount( 23456, 1, 65432, 500.0, 1000.0 , 05, 01, 2020);  
      accounts[ 4 ] = new SavingAccount( 34567, 1, 76543, 30000.0, 30000.0, 06, 06, 2018);  
   } // end no-argument BankDatabase constructor

   // retrieve Account object containing specified account number
   private Account getHoster( int accountNumber )
   {
      // loop through accounts searching for matching account number
      for ( Account currentAccount : accounts )
      {
         // return hoster if match found
         if ( currentAccount.getAccountNumber() == accountNumber )
            return currentAccount;
      } // end for

      return null; // if no matching account was found, return null
   } // end method getAccount

   private Account getAccount(int accountNumber, int AccountType){
       
    for (Account currentAccount : accounts){
        //return current account if match found
    if((currentAccount.getAccountNumber() == accountNumber) && (currentAccount.getAccountType() == AccountType))
        return currentAccount;
    }
    
    return null;
   }
   
    //overloading
   public boolean authenticateUser(int userAccountNumber){
     Account userAccount = getHoster(userAccountNumber);
     if (userAccount !=null){
            return true;
        }
     else{
            return false;
        }
    }
    
   // determine whether user-specified account number and PIN match
   // those of an account in the database
   public boolean authenticateUser( int userAccountNumber, int userPIN )
   {
      // attempt to retrieve the account with the account number
      Account userAccount = getHoster( userAccountNumber );

      // if account exists, return result of Account method validatePIN
      if ( userAccount != null )
         return userAccount.validatePIN( userPIN );
      else
         return false; // account number not found, so return false
   } // end method authenticateUser
   
   public boolean authenticateType(int userAccountNumber, int AccountType){
    Account userAccount = getHoster(userAccountNumber);
    return userAccount.validateType(AccountType);
    }

   public int getlimit(int userAccountNumber, int AccountType){
    return getAccount(userAccountNumber, AccountType).getlimit();
    }
    
   // return available balance of Account with specified account number
   public double getAvailableBalance( int userAccountNumber , int AccountType)
   {
      return getAccount( userAccountNumber , AccountType).getAvailableBalance();
   } // end method getAvailableBalance

   // return total balance of Account with specified account number
   public double getTotalBalance( int userAccountNumber , int AccountType)
   {
      return getAccount( userAccountNumber , AccountType).getTotalBalance();
   } // end method getTotalBalance

   // credit an amount to Account with specified account number
   public void credit( int userAccountNumber, int AccountType, double amount )
   {
      getAccount( userAccountNumber , AccountType).credit( amount );
   } // end method credit

   // debit an amount from of Account with specified account number
   public void debit( int userAccountNumber, int AccountType, double amount )
   {
      getAccount( userAccountNumber , AccountType).debit( amount );
   } // end method debit
   
   public void updateTotalBalance(int AccountType, int SystemRunningYear){
       for (Account currentAccount : accounts){
        if(currentAccount.getAccountType() == AccountType){
        int period = SystemRunningYear - currentAccount.getYear();
            if(period >=1){
                double newTotalBalance = currentAccount.getTotalBalance() * Math.pow((1 + currentAccount.getinterestrate()),period);
                newTotalBalance = Math.round(newTotalBalance * 100)/100;
                currentAccount.updateTotalBalance(newTotalBalance);
                double newAvailableBalance = currentAccount.getAvailableBalance() * Math.pow((1 + currentAccount.getinterestrate()),period);
                newAvailableBalance = Math.round(newAvailableBalance * 100)/100;
                currentAccount.updateAvailableBalance(newAvailableBalance);
            }
        }
    }
    }
    
} // end class BankDatabase



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