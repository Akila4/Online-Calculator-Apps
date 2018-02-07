package Currency_ConvertorPkg;
import org.junit.Assert;


import org.junit.Test;

public class Currency_Test {
	CurrencyData cd=new CurrencyData();
	int amount;
	String Country1;
	String Country2;

	 @Test
	    public void testgetAmount() {
	    	Assert.assertEquals(amount,cd.getAmount());
	    }
	 
	 @Test
	    public void testgetCountry1() {
		 Assert.assertEquals(Country1,cd.getCountry1());
	    }
	 
	 @Test
	    public void testgetCountry2() {
		 Assert.assertEquals(Country2,cd.getCountry2());
	    }
    @Test
    public void test1() {
    	amount=8;
    	cd.setAmount(amount);
    	Assert.assertEquals(amount,cd.getAmount());
    }
    @Test
    public void test2() {
    	Country1="India";
    	cd.setCountry1(Country1);
    	Assert.assertEquals(Country1,cd.getCountry1());
    }
    
    @Test
    public void test3() {
    	Country2="Euro";
    	cd.setCountry2(Country2);
    	Assert.assertEquals(Country2,cd.getCountry2());
    }

}
