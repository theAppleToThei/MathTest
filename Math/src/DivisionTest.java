import static org.junit.Assert.*;

import org.junit.Test;

public class DivisionTest
{
	@Test
	public void TwoDividedBy2()
	{
		Division test1 = new Division();
		assertEquals(1, test1.divide(2, 2));
	}

	@Test
	public void FourDividedBy2()
	{
		Division test2 = new Division();
		assertEquals(2, test2.divide(4, 2));
	}
}
