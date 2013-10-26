import static org.junit.Assert.*;

import org.junit.Test;


public class SubtractionTest
{
	@Test
	public void TwoMinus2()
	{
		Subtraction test1 = new Subtraction();
		assertEquals(0, test1.sub(2, 2));
	}
	
	@Test
	public void TenMinus4Minus2()
	{
		Subtraction test2 = new Subtraction();
		assertEquals(4, test2.sub(10, 4, 2));
	}
	
	@Test
	public void OneHundredMinus50Minus25Minus13()
	{
		Subtraction test3 = new Subtraction();
		assertEquals(12, test3.sub(100, 50, 25, 13));
	}
}
