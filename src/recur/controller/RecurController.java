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
			int number = Integer.parseInt(text);
			int result = fibRecursive(number);
			view.showMessage("The" + number + "th fibonacci is:" + result);
			
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
}