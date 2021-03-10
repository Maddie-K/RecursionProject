package recur.controller;

import recur.view.Popup;

public class RecurController
{
	private Popup view;
	
	public RecurController()
	{
		this.view = new Popup();
	}
	public void start()
	{
		String text = view.askQuestion("What should we try or blank to exit?");
		
		while (!text.equals(""))
		{
			//double number = Double.parseDouble(text);
			String result = mystery(text);
			view.showMessage(result);
			text = view.askQuestion("next word?");
			
			text = view.askQuestion("type in the next value or blank to end.");
		}
	}
	
	private int fibRecursive(int input)
	{
		if (input == 0 || input == 1)
		{
			return 1;
		}
		else
		{
			return fibRecursive(input - 1) + fibRecursive(input - 2);
		}
	}
	
	private double factorial(double number)
	{
		if (number == 0 || number == 1)
		{
			return 1;
		else
		{
			return (number * factorial(number - 1));
		}
	}
	
	private String mystery(String text)
	{
		if (text.length() == 1)
		{
			return text;
		}
		else
		{
			return mystery (text.substring(1) + text.substring(0,1));
		}
	}
}