using System;
using System.Globalization;
public class Program
{
	public static void Main()
	{
		double x1, y1, x2, y2;

		String[] vet1 = Console.ReadLine().Split(' ');
			x1 = double.Parse(vet1[0], CultureInfo.InvariantCulture);
			y1 = double.Parse(vet1[1], CultureInfo.InvariantCulture);

		String[] vet2 = Console.ReadLine().Split(' ');
			x2 = double.Parse(vet2[0], CultureInfo.InvariantCulture);
			y2 = double.Parse(vet2[1], CultureInfo.InvariantCulture);

		double distancia = (Math.Sqrt(Math.Pow((x2 - x1), 2) + Math.Pow((y2 - y1), 2)));

		Console.WriteLine(distancia.ToString("F4", CultureInfo.InvariantCulture));

	}
}
