'''                          
                             Trabalho de implementação 1.
                             Profª: Maria Inês
                             Aluno/@autor: Carlos Henrique Cerqueira Santos
                             
'''

usr = input('>> Digite um nome para usuário: ').lower().strip()
pwd = input('>> Digite uma senha: ').lower().strip()
tam = len(pwd)

        # O nome do usuário pode ser qualquer conjunto de caracteres; 
        # A senha deve conter no mínimo 8 caracteres;
        # A senha e o usuário não podem ser iguais;
        # A senha deve conter pelo menos um caractere numérico;


    #   
while ((tam < 8) or (usr.isnumeric()) or (pwd.isalpha())): 
    print ('>> Opa, dados inválidos, tente novamente: ')
    pwd = input('>> Digite uma nova senha: ').lower().strip()
    tam = len(pwd)
    
print('Cadastro realizado com sucesso! ')
print('Usuário: ',usr)
print('Senha: ',pwd)

