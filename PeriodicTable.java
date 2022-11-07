package periodic_table;

public class PeriodicTable 
{
	public static void element() 
	{
		System.out.print("[...]");
	}
	
	public static void drawFirstRow()
	{
		for(int x=1;x<=18;x++)
		{
			if(x==1 || x==18)
			{
				element();
			}
			else
			{
				System.out.print("     ");
			}
		}
		System.out.println();
	}
	
	public static void draw2nd3rdRow()
	{
		for(int x=1;x<=18;x++)
		{
			if(x<=2|| x>=17)
			{
				element();
			}
			else
			{
				System.out.print("     ");
			}
		}
		System.out.println();
	}
	
	public static void draw45Row()
	{
		int x=0;
		while(x<18)
		{
			element();
			x++;
		}
		System.out.println();
	}
	
	public static void draw6Row()
	{
		for(int column=1;column<=18;column++)
		{
			if(column==3)
			{
				System.out.print("[ + ]");
			}
			else
			{
				element();
			}
		}
		System.out.println();
	}
	
	public static void draw7Row()
	{
		for(int column=1;column<=18;column++)
		{
			if(column==3)
			{
				System.out.print("[ # ]");
			}
			else
			{
				element();
			}
		}
		System.out.println();
	}
	
	public static void drawLa()
	{
		for(int column=1;column<=18;column++)
		{
			if(column<3)
			{
				System.out.print("     ");
			}
			else if(column>3)
			{
				element();
			}
			else
			{
				System.out.print(" La+ ");
			}
		}
		System.out.println();
	}
	
	public static void drawAct()
	{
		for(int column=1;column<=18;column++)
		{
			if(column<3)
			{
				System.out.print("     ");
			}
			else if(column>3)
			{
				element();
			}
			else
			{
				System.out.print(" Ac# ");
			}
		}
		System.out.println();
	}
	
	public static void drawPeriodicTable() 
	{
		System.out.println("                               THE PERIODIC TABLE OF ELEMENTS");
		for(int row=1;row<=7;row-=-1)
		{
			if(row==1)
			{
				drawFirstRow();
			}
			
			else if(row>1 && row<4)
			{
				draw2nd3rdRow();
			}
			
			else if(row==4 || row==5)
			{
				draw45Row();
			}
			
			else if(row==6)
			{
				draw6Row();
			}
			else
			{
				draw7Row();
			}
		}
		System.out.println();
		drawLa();
		drawAct();
	}
	
	public static void main(String[] args)
	{
		drawPeriodicTable();
	}
}
