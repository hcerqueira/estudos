'''
Lista de exercícios n° 1 
    Professor: Marcos Simões
    Disciplina: Algoritmos
    Resolvida em Python e pseudo-código por: @author Carlos Henrique
    
    Questão 3: 
        Dada a seguinte sequência: 
            i = 1   j = 60
            i = 4   j = 55
            i = 7   j = 50
            ...
            i =?    j = 0
        Escreva um algoritmo que impria na tela. 
        
'''

# Observações: 
    # Sempre que você ver um 'Leia', 'Escreva' ou qualquer outra ação, entenda como uma ordem ao computador...
    # Por exemplo: Computador Leia o valor da variável num1 em inteiro (int(input)) e escreva na tela o resultado (print)
    # Abaixo ficará mais claro... eu espero. 

    
# Lembrando que nem sempre os comentários estarão bonitinhos assim, mas é somente pra entender de maneira rápida
# Mas a identação do código é importante em Python, minha dica é: Seja organizado e dará tudo certo (ou não)! 


# Declarando i = 1
i = 1
# Declarando j = 60
j = 60
        
# Enquanto (j for diferente de 0) faça:          
while (j != 0):
     # i = i + 3 por que ele incrementa (aumenta) de 3 em 3;
        i = i + 3 
     # j = j - 5 por que ele decrementa (reduz) de 5 em 5;
        j = j - 5


    # MUITA ATENÇÃO
# A sacada da questão é mostrar o valor de *i*, então já sabemos que *j* vai ser = 0  

    #Escreva i
print (i)
    



