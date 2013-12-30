import static org.junit.Assert.*;

import javax.swing.JOptionPane;

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
	
	@Test
	public void UserInput()
	{
		Division test4 = new Division();
		String string1 = JOptionPane.showInputDialog("Enter a number to divide.").toString();
		String string2 = JOptionPane.showInputDialog("Enter another number to divide.").toString();
		int num1 = Integer.parseInt(string1);
		int num2 = Integer.parseInt(string2);
		assertEquals(num1 / num2, test4.divide(num1, num2));
		System.out.println(num1 + " Ö " + num2 + " = " + test4.divide(num1, num2));
	}
}
