#	Exercicio n° 5: 
#			Reescreva o programa contaSegundos para imprimir também a quantidade de dias, ou seja, 
#			faça um programa em Python que, dada a quantidade de segundos, "quebre" esse valor em 
#			dias, horas, minutos e segundos. A saída deve estar no formato: a dias, b horas, c minutos e d segundos. 
#			Seja cuidadoso com o formato! 

#	Resolução: 
s = int(input("Por favor, entre com o número de segundos que deseja converter: "))
d = s // 86400
s_rest = s % 86400
h = s_rest // 3600
s_rest = s_rest % 3600
m = s_rest // 60
s_rest = s_rest % 60
print(d,"dia(s),",h,"hora(s),",m,"minuto(s) e",s_rest,"segundo(s).")