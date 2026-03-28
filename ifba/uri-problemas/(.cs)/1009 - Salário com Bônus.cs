using System;
using System.Globalization;
public class Program
{
	public static void Main()
	{
		String nome;
		double totalVendas, salarioFixo, bonus;

		nome = Console.ReadLine();
		salarioFixo = double.Parse(Console.ReadLine(), CultureInfo.InvariantCulture);
		totalVendas = double.Parse(Console.ReadLine(), CultureInfo.InvariantCulture);

		bonus = totalVendas * 0.15;
		double salarioFinal = salarioFixo + bonus;

		Console.WriteLine("TOTAL = R$ "+salarioFinal.ToString("F2", CultureInfo.InvariantCulture));

	}
}
