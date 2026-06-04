using System;
using System.Globalization;
public class Program
{
	public static void Main()
	{
        int x; // Distancia pecorrida (km);
		double y; // Combustivel gasto (l);

		x = int.Parse(Console.ReadLine());
		y = double.Parse(Console.ReadLine(), CultureInfo.InvariantCulture);

		double z = x / y;

		Console.WriteLine(z.ToString("F3", CultureInfo.InvariantCulture) + " km/l");
	}
}
