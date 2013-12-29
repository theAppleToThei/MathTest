import static org.junit.Assert.*;

import javax.swing.JOptionPane;

import org.junit.Test;


public class AdditionTest
{
	@Test
	public void TwoPlus2()
	{
		Addition test1 = new Addition();
		assertEquals(4, test1.add(2, 2));
	}
	
	@Test
	public void FourPlus4Plus2()
	{
		Addition test2 = new Addition();
		assertEquals(10, test2.add(4, 4, 2));
	}
	
	@Test
	public void FivePlus9Plus8Plus2()
	{
		Addition test3 = new Addition();
		assertEquals(24, test3.add(5, 9, 8, 2));
	}
	
	@Test
	public void UserInput()
	{
		Addition test4 = new Addition();
		String string1 = JOptionPane.showInputDialog("Enter a number to add.").toString();
		String string2 = JOptionPane.showInputDialog("Enter another number to add.").toString();
		int num1 = Integer.parseInt(string1);
		int num2 = Integer.parseInt(string2);
		assertEquals(num1 + num2, test4.add(num1, num2));
		System.out.println(num1 + " + " + num2 + " = " + test4.add(num1, num2));
	}
}
