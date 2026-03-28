#	Exercicio n° 4: 
#			Faça um programa em Python que recebe um número inteiro e imprime seu dígito das dezenas. 
	

#	Resolução: 
numero = int(input('Digite um número inteiro:'))
unidade = numero % 10
    # Eliminando a unidade de nosso número
numero = (numero - unidade)/10
dezena = numero % 10
    # Eliminando a dezena do número original, fica a centena
numero = (numero - dezena)/10
centena = numero
    # Fazendo ser inteiros
dezena = int(dezena)
centena = int(centena)
print(centena,'centena(s),',dezena,'dezena(s) e',unidade,'unidade(s)')