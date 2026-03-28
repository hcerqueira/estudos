'''                          Trabalho de implementação 1.
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

while tam < 8: 
    print ('>> Opa, a senha não pode conter menos que 8 caracteres')
    pwd = input('>> Digite uma nova senha: ').lower().strip()
    tam = len(pwd)
if tam >= 8:
    if pwd != usr:
       
        if pwd.isalpha() == True:
            print ('>> Atenção, a senha deve conter pelo menos um caractere numérico')
            pwd = input('>> Digite uma nova senha: ').lower().strip()
            tam = len(pwd)
            while tam < 8: 
                print ('>> Opa, a senha não pode conter menos que 8 caracteres')
                pwd = input('>> Digite uma nova senha: ').lower().strip()
                tam = len(pwd)
            if tam >= 8:
                if pwd != usr:
                    if pwd.isalpha() == True:
                        print ('>> Atenção, a senha deve conter pelo menos um caractere numérico')
                        pwd = input('>> Digite uma nova senha: ').lower().strip()
                        tam = len(pwd)
                    elif pwd.isalpha() == False:
                        print ('>> Cadastro realizado com sucesso!' )
                        print ('      Usuário:',usr)
                        print ('      Senha:',pwd)
        elif pwd.isalpha() == False:
            print ('>> Cadastro realizado com sucesso!' )
            print ('      Usuário:',usr)
            print ('      Senha:',pwd)
    while pwd == usr: 
        print ('>> Usuário e senha iguais não são permitidos, tente novamente! ')
        pwd = input('>> Digite uma nova senha: ').lower().strip()
        tam = len(pwd)
        
        if tam >= 8:
            if pwd != usr:
                if pwd.isalpha() == True:
                    print ('>> Atenção, a senha deve conter pelo menos um caractere numérico')
                    pwd = input('>> Digite uma nova senha: ').lower().strip()
                    tam = len(pwd)
                    while tam < 8: 
                        print ('>> Opa, a senha não pode conter menos que 8 caracteres')
                        pwd = input('>> Digite uma nova senha: ').lower().strip()
                        tam = len(pwd)
                    if tam >= 8:
                        if pwd != usr:
                            if pwd.isalpha() == True:
                                print ('>> Atenção, a senha deve conter pelo menos um caractere numérico')
                                pwd = input('>> Digite uma nova senha: ').lower().strip()
                                tam = len(pwd)
                            elif pwd.isalpha() == False:
                                print ('>> Cadastro realizado com sucesso!' )
                                print ('      Usuário:',usr)
                                print ('      Senha:',pwd)
                elif pwd.isalpha() == False:
                    print ('>> Cadastro realizado com sucesso!' )
                    print ('      Usuário:',usr)
                    print ('      Senha:',pwd)
        while tam < 8: 
            print ('>> Opa, a senha não pode conter menos que 8 caracteres')
            pwd = input('>> Digite uma nova senha: ').lower().strip()
            tam = len(pwd)
            if tam >= 8:
                if pwd != usr:
                    if pwd.isalpha() == True:
                        print ('>> Atenção, a senha deve conter pelo menos um caractere numérico')
                        pwd = input('>> Digite uma nova senha: ').lower().strip()
                        tam = len(pwd)
                        while tam < 8: 
                            print ('>> Opa, a senha não pode conter menos que 8 caracteres')
                            pwd = input('>> Digite uma nova senha: ').lower().strip()
                            tam = len(pwd)            
                        if tam >= 8:
                            if pwd != usr:
                                if pwd.isalpha() == True:
                                    print ('>> Atenção, a senha deve conter pelo menos um caractere numérico')
                                    pwd = input('>> Digite uma nova senha: ').lower().strip()
                                    tam = len(pwd)
                                elif pwd.isalpha() == False:
                                    print ('>> Cadastro realizado com sucesso!' )
                                    print ('      Usuário:',usr)
                                    print ('      Senha:',pwd)
                    elif pwd.isalpha() == False:
                        print ('>> Cadastro realizado com sucesso!' )
                        print ('      Usuário:',usr)
                        print ('      Senha:',pwd)