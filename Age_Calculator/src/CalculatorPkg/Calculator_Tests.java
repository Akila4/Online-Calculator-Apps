package CalculatorPkg;

import CalculatorPkgclass.CustomerData;


import org.junit.Assert;

import org.junit.Test;

public class Calculator_Tests{
	CustomerData cust = new CustomerData();
	
	  int Day;
	  int Month;
	  int Year;
   int BYear;
	int try;
	  int BDay;
	 	int BMonth;


    @Test
    public void testDate() {
		Day=5;
		cust.setDay(Day);
		Assert.assertEquals(Day,cust.getDay());
		
	} 
    
    @Test
    public void testMonth() {	
		Month=1;
		cust.setMonth(Month);
		Assert.assertEquals(Month,cust.getMonth());
			
		}

    @Test
    public void testYear() {	
		Year=2018;
		cust.setYear(Year);
		Assert.assertEquals(2018,cust.getYear());
		
	}
    
    @Test

	public void testbirthDate() {	
		BDay=5;
		cust.setbirthDay(BDay);
		Assert.assertEquals(5,cust.getbirthDay());
		
					}
	
    

    @Test
    public void testbirthMonth() {	
		BMonth=3;
		cust.setbirthMonth(BMonth);
	Assert.assertEquals(3,cust.getbirthMonth());
		
	}
    
    @Test
    public void testbirthYear() {
		BYear=1997;
		cust.setbirthYear(BYear);
		Assert.assertEquals(1997,cust.getbirthYear());
		
	}
    
   
}
