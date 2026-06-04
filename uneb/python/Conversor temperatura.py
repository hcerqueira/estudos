# 	Exercicio n° 0: 
#			Escreva um programa em Python que receba uma temperatura em °F e converta em °C
#			Faça a conversão e imprima o resultado.

# 	Resolução:	
print ('Olá, usuário, esse programa vai auxiliar você na conversão da temperatura de °F p/ °C.')
f = int(input('Digite uma temperatura em ° Fahrenheit: '))	
c = (f - 32) * 5 / 9
print ('Ok, realizamos o cálculo e a temperatura em ° Celsius é: ',c)