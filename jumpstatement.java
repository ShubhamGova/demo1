/*class breaks{
public static void main(String[]args)
{	int num=100;
	for(int i=1; i<=num; i++)
{
	if(i==65)
	break;
System.out.println(i);
}
System.out.println("out of loop");
}
}*/

/*class continues{
public static void main(String[]args)
{	int num=100;
	for(int i=1; i<=num; i++)
{
	if(i==65)
	continue;
System.out.println(i);
}
System.out.println("out of loop");
}
}
*/



/*
class labelledbreakcontinue{ 
public static void main(String args[])
{

		out:

		for(int i=1; i<=5; i++)
		{
			System.out.println("from outer : "+i);

		for(int j=1 ; j<=5; j++)
		{
			System.out.println("      from inner : "+j);
			if(j==2)
			break;
		}
		}

}
}
*/





class labelledbreakcontinue{ 
public static void main(String args[])
{

		out:

		for(int i=1; i<=5; i++)
		{
			System.out.println("from outer : "+i);

		for(int j=1 ; j<=5; j++)
		{
			if(j==2)
			break;
			System.out.println("      from inner : "+j);
			
		}
		}

}
}

/*

class labelledbreakcontinue{ 
public static void main(String args[])
{

		out:

		for(int i=1; i<=5; i++)
		{
			System.out.println("from outer : "+i);

		for(int j=1 ; j<=5; j++)
		{
			if(j==2)
			break out;
			System.out.println("      from inner : "+j);
			
		}
		}

}
}


*/

/*

class labelledbreakcontinue{ 
public static void main(String args[])
{

		out:

		for(int i=1; i<=5; i++)
		{
			System.out.println("from outer : "+i);

		for(int j=1 ; j<=5; j++)
		{
			if(j==2)
			continue;
			System.out.println("      from inner : "+j);
			
		}
		}

}
}

*/

class labelledbreakcontinue{ 
public static void main(String args[])
{

		out:

		for(int i=1; i<=5; i++)
		{
			System.out.println("from outer : "+i);

		for(int j=1 ; j<=5; j++)
		{
			if(j==2)
			continue out;
			System.out.println("      from inner : "+j);
			
		}
		}

}
}





















