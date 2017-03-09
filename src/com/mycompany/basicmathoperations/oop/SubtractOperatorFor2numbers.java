/**
 * 
 */
package com.mycompany.basicmathoperations.oop;

/**
 * @author RJ
 *
 */
public class SubtractOperatorFor2numbers extends OperatorFor2numbers implements Subtract 
{

	public SubtractOperatorFor2numbers(float number1, float number2) 
	{
		super(number1, number2);
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see com.mycompany.basicmathoperations.oop.Subtract#subtract(int, int)
	 */
	@Override
	public int subtract(int num1, int num2) 
	{
		// TODO Auto-generated method stub
		return (num1 - num2);
	}

	/* (non-Javadoc)
	 * @see com.mycompany.basicmathoperations.oop.Subtract#subtract(float, float)
	 */
	@Override
	public float subtract(float num1, float num2) 
	{
		// TODO Auto-generated method stub
		return (num1 = num2);
	}

	/* (non-Javadoc)
	 * @see com.mycompany.basicmathoperations.oop.Subtract#subtract2numbers()
	 */
	@Override
	public float subtract2numbers() 
	{
		// TODO Auto-generated method stub
		return (number1 - number2);
	}

}
