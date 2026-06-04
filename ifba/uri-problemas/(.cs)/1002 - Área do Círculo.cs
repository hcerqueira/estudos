using System;
using System.Globalization;
public class Program
{
	public static void Main()
	{

		double r;
		double π = 3.14159;

		r = double.Parse(Console.ReadLine(), CultureInfo.InvariantCulture);

		//calculo
			double a = π * Math.Pow(r, 2);
		//imprimindo
			Console.WriteLine("A="+a.ToString("F4", CultureInfo.InvariantCulture));

	}
}
