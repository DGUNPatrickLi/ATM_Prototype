public class Date
{
   private int day;
   private int month; 
   private int year; 
   
   // Date constructor: day, month and year supplied
   public Date( int d, int m, int y ) 
   { 
      setDate( d, m, y ); // invoke setTime to validate time
   } // end Time2 three-argument constructor 

   // Set Methods
   // validate the date
   public void setDate( int d, int m, int y )
   {
      setDay( d, m, y ); // set the hour
      setMonth( m ); // set the minute
      setYear( y ); // set the second
   } // end method setDate

   // validate and set day 
   public void setDay( int d, int m, int y ) 
   { 
      if ( ( m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12 ) && ( d <= 31 ) )
      {
          day = d;
      }   
      else if ( ( m == 4 || m == 6 || m == 9 || m == 11 ) && ( d <=30 ) )
      {
          day = d;
      }   
      else if ( ( ( (y % 4 == 0) && (year % 100!= 0) ) || (year%400 == 0) ) && ( m == 2 ) && ( d <= 29 ) )
      {
          day = d;
      }    
      else if ( !( ( (y % 4 == 0) && (year % 100!= 0) ) || (year%400 == 0) ) && ( m == 2 ) && ( d <= 28 ) )
      {
          day = d;
      }    
      else 
      { 
          throw new IllegalArgumentException( "Error day" );
      }   
   } // end method setDay

   // validate and set month 
   public void setMonth( int m ) 
   { 
      if ( m >= 1 && m <= 12 )
      {
          month = m;
      }   
      else
      {
         throw new IllegalArgumentException( "Error month" );
      }   
   } // end method setMonth

   // validate and set year
   public void setYear( int y ) 
   { 
      if ( y > 0 )
      {
         year = y;
      }   
      else
      {
         throw new IllegalArgumentException( "Error year" );
      }   
   } // end method setYear

   // Get Methods
   // get day value
   public int getDay() 
   { 
       return day; 
   } // end method getDay

   // get month value
   public int getMonth() 
   { 
       return month; 
   } // end method getMonth

   // get year value
   public int getYear() 
   { 
       return year; 
   } // end method getYear

} // end class Date

/**************************************************************************
 * (C) Copyright 1992-2012 by Deitel & Associates, Inc. and               *
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
