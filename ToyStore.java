//Name: 
//Date: 
//Per: 
//AP Comp Sci

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStore
{
	private ArrayList<Toy> toyList;

	public ToyStore()
	{
		toyList = new ArrayList<Toy>();
	}

	public void loadToys( String toys )
	{
		String[] tempStrArray = toys.split(" ");
		for (String eaToyStr : tempStrArray)
		{
			Toy currToy = new Toy(eaToyStr);
			toyList.add(currToy);
		}
	}
  
  	public Toy getThatToy( String nm )
  	{
  		for (Toy currToy : toyList)
  		{
  			if (currToy.getName().equals(nm))
  			{
  				return currToy;
  			}
  		}
  		return null;
  	}
  
  	public String getMostFrequentToy()
  	{
  		int popCount = 0;
  		int lastCount = 0;
  		String mostPopularToy = "";
  		for (Toy currToy : toyList)
  		{
  			for (Toy dupeToy : toyList)
  			{
  				if (dupeToy.getName().equals(currToy.getName()))
  				{
  					popCount++;
  				}
  			}
  			currToy.setCount(popCount);
  			popCount = 0;
  			if (currToy.getCount() > lastCount)
  			{
  				lastCount = currToy.getCount();
  				mostPopularToy = "max == " + currToy.getName();
  			}
  		}
  		return mostPopularToy;
  	}  
  
  	public void sortToysByCount()
  	{
  		for (Toy eaToy : toyList)
  		{
  			
  		}
  	}  
  	  
	public String toString()
	{
	   String output = "";
	   String[] outOrigArray = new String[toyList.size()];
	   for (int i = 0; i < toyList.size(); i++)
	   {
		   outOrigArray[i] = toyList.get(i).toString();
	   }
	   output = Arrays.toString(outOrigArray);
	   
	   sortToysByCount();
	   String[] outNewArray = new String[toyList.size()];
	   for (int i = 0; i < toyList.size(); i++)
	   {
		   outNewArray[i] = toyList.get(i).toString();
	   }
	   output = output + "\n" + Arrays.toString(outNewArray);
	   return output;
	}
}