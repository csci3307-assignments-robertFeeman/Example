/**
 * 
 */
package com.mycompany.basicmathoperations.oop;

/**
 * @author RJ
 *
 */
public class AdditionOperatorFor2numbers extends OperatorFor2numbers implements Addition 
{

	public AdditionOperatorFor2numbers(float number1, float number2) 
	{
		super(number1, number2);
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see com.mycompany.basicmathoperations.oop.Addition#addition(int, int)
	 */
	@Override
	public int addition(int num1, int num2) 
	{
		// TODO Auto-generated method stub
		return (num1 + num2);
	}

	/* (non-Javadoc)
	 * @see com.mycompany.basicmathoperations.oop.Addition#addition(float, float)
	 */
	@Override
	public float addition(float num1, float num2) 
	{
		// TODO Auto-generated method stub
		return (num1 + num2);
	}

	/* (non-Javadoc)
	 * @see com.mycompany.basicmathoperations.oop.Addition#addition2numbers()
	 */
	@Override
	public float addition2numbers() 
	{
		// TODO Auto-generated method stub
		return (number1 + number2);
	}

}
