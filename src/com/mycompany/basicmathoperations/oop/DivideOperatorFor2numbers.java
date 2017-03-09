/**
 * 
 */
package com.mycompany.basicmathoperations.oop;

/**
 * @author Robert
 *
 */
public class DivideOperatorFor2numbers extends OperatorFor2numbers implements Divide
{

	public DivideOperatorFor2numbers(float number1, float number2) 
	{
		super(number1, number2);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int divide(int num1, int num2) 
	{
		// TODO Auto-generated method stub
		return (num1 / num2);
	}

	@Override
	public float divide(float num1, float num2) 
	{
		// TODO Auto-generated method stub
		return (num1 / num2);
	} 

	@Override
	public float divide2numbers() 
	{
		// TODO Auto-generated method stub
		return (number1 / number2);
	}

}
