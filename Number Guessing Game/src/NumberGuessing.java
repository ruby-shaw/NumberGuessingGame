import java.util.Scanner;

public class NumberGuessing
	{

		public static void main(String[] args)
			{
				System.out.println("Welcome to the Number Guessing Game! Start by guessing a number from 1-5...");
				Scanner userInput = new Scanner(System.in);
				

				int number = (int)((Math.random( )*5 ) +1);
				
				boolean stillGoing = true; 
				int counter = 0;
				
				while (stillGoing)
					{
						int guess = userInput.nextInt();
						
						
						
						if (guess < number)
							{
								System.out.println("Too low, try again!");
								counter++;
							}
						else if(guess > number)
							{
								System.out.println("Too high, try again!");
								counter++;
							}
						else if(guess == number)
						{
							counter++;
							stillGoing = false;
							if(counter <2)
								{
									System.out.println("You got it! It took you " +counter+ " try!");
								}
							else
								{
									System.out.println("You got it! It took you " +counter+ " tries!");
								}

						}
						else
							{
								System.out.println("Nope");
							}
					}
				
			
				
			}

	}
