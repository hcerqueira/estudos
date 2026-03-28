#	Exercicio n° 1: 
#			Faça um programa em Python que receba (entrada de dados) o valor correspondente ao lado de um quadrado, 
#			calcule e imprima (saída de dados) seu perímetro e sua área.

#	Resolução: 
lado = int(input('Digite o valor correspondente ao lado de um quadrado: '))
perimetro = lado * 4
area = lado ** 2
print('perímetro: ', perimetro, ' - ', 'área: ', area)