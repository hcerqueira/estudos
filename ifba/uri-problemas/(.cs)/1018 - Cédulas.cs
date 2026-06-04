using System;

public class Program
{
	public static void Main()
	{

	//As notas consideradas são de 100, 50, 20, 10, 5, 2 e 1
		int valor, troco, cem, cinquenta, vinte, dez, cinco, dois;
			valor = int.Parse(Console.ReadLine());

		troco = valor;
			cem = troco / 100;
		troco = troco - (cem *100);
			cinquenta = troco / 50;
		troco = troco - (cinquenta * 50);
			vinte = troco / 20;
		troco = troco - (vinte * 20);
			dez = troco /10;
		troco = troco -(dez * 10);
			cinco = troco / 5;
		troco = troco - (cinco * 5);
			dois = troco / 2;
		troco = troco - (dois * 2);

		Console.WriteLine(valor);
		Console.WriteLine(cem + " nota(s) de R$ 100,00");
		Console.WriteLine(cinquenta + " nota(s) de R$ 50,00");
		Console.WriteLine(vinte + " nota(s) de R$ 20,00");
		Console.WriteLine(dez + " nota(s) de R$ 10,00");
		Console.WriteLine(cinco + " nota(s) de R$ 5,00");
		Console.WriteLine(dois + " nota(s) de R$ 2,00");
		Console.WriteLine(troco + " nota(s) de R$ 1,00");
	}
}
