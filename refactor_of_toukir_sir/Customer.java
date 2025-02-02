package edu.jhu.cs.oose.fall2017.examples.videorental;

import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;

/**
 * A class representing a customer in the application.
 * 
 * @author Martin Fowler
 * @author Zachary Palmer
 */
public class Customer
{
	private String name;
	private List<Rental> rentals = new ArrayList<Rental>();

	public Customer(String name)
	{
		this.name = name;
	}

	public String getName()
	{
		return name;
	}

	public void addRental(Rental rental)
	{
		this.rentals.add(rental);
	}

	public String generateStatement()
	{		
		double totalAmount = 0;
		int frequentRenterPoints = 0;
		Formatter formatter = new Formatter();
		formatter.format("Rental Record for %s\n", getName());
		for (Rental rental : this.rentals)
		{
			double num = 0;

			// determine amounts for each line
			switch (rental.getMovie().getPriceCode())
			{
				case Movie.REGULAR:
					num += 2;
					if (rental.getDaysRented() > 2)
						num += (rental.getDaysRented() - 2) * 1.5;
					break;
				case Movie.NEW_RELEASE:
					num += rental.getDaysRented() * 3;
					break;
				case Movie.CHILDRENS:
					num += 1.5;
					if (rental.getDaysRented() > 3)
						num += (rental.getDaysRented() - 3) * 1.5;
					break;
			}

			// add frequent renter points
			frequentRenterPoints++;
			// add bonus for a two day new release rental
			if ((rental.getMovie().getPriceCode() == Movie.NEW_RELEASE) && rental.getDaysRented() > 1)
			{
				frequentRenterPoints++;
			}

			// show figures for this rental
			formatter.format("    %-40s  (%02d)  $%5.2f\n", rental.getMovie().getTitle(), rental.getDaysRented(), num);
			totalAmount += num;
		}
		
		// add footer lines
		formatter.format("Amount owed is $%5.2f\n", totalAmount);
		formatter.format("You earned %d frequent renter points",frequentRenterPoints);
		
		String result = formatter.out().toString();
		formatter.close();
		return result;
	}

}
