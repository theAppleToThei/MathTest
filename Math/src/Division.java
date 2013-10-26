public class Division
{
	public Division()
	{
		
	}
	public int divide(int divisor, int dividend)
	{
		int answer = 0;
		while (divisor >= dividend)
		{
			divisor -= dividend;
			answer++;
		}
		return answer;
	}
}
