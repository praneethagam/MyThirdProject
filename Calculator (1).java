package com;


//Behavioral inheritance
public abstract class Calculator implements CalculatorInterface {

	
	public int add(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1+num2;
	}
	public double add(int num1, double num2) {
		// TODO Auto-generated method stub
		return num1+num2;
	}

	
	public int sub(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1-num2;
	}

	
	public int mul(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1*num2;
	}


	@Override
	public int div(int num1, int num2) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public int divtwo(int num1, int num2) {
		// TODO Auto-generated method stub
		return 0;
	}


	


}
