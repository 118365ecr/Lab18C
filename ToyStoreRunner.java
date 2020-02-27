//Name: 
//Date: 
//Per: 
//AP Comp Sci

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStoreRunner
{
	public static void main( String args[] )
	{
		ToyStore toyStore = new ToyStore();
		toyStore.loadToys("sorry bat sorry sorry sorry train train teddy teddy ball ball");
		System.out.println(toyStore);
	}
}