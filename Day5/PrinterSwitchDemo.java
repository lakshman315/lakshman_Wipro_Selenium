package Day5;

interface Printer 
{
	void print(String document);
}

class LaserPrinter implements Printer
{

	public void print(String document) 
	{
		System.out.println("Laser Printer Printing document: " + document);
	}
}

class InkjetPrinter implements Printer
{
 
	public void print(String document) 
	{
		System.out.println("Inkjet Printer Printing document: " + document);
	}
}


public class PrinterSwitchDemo 
{
	public static void main(String[] args) 
	{
    
		Printer p;
     
		p = new LaserPrinter();
		p.print("java record");
     
		p = new InkjetPrinter();
		p.print("invitation Card");
	}
}
