package edu.jhu.cs.oose.fall2017.examples.videorental;

/**
 * Represents the rental of a single movie.
 * @author Martin Fowler
 * @author Zachary Palmer
 */
public class Rental
{
	private Movie movie;
	private int daysRented;

	public Rental(Movie movie, int daysRented)
	{
		super();
		this.movie = movie;
		this.daysRented = daysRented;
	}

	public Movie getMovie()
	{
		return movie;
	}

	public int getDaysRented()
	{
		return daysRented;
	}
}
