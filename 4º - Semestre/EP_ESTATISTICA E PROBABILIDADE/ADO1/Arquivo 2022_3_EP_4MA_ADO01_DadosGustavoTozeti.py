import csv  # ---> Importação da biblioteca para leitura do dados do arquivo csv
import math # ---> Importação da biblioteca para operações de potência e raíz

MEDIA_DADOS_AGRUPADOS = 0   # Utilização da informação para o exercício 10
CLASSE_MODAIS = []          # Utilização da informação para o exercício 11
DESVIO_ABS_MED = 0          # Utilização da informação para o exercício 12
VARIANCIA_DESVIO = 0        # Utilização da informação para o exercício 13

# Ex1. Crie um programa que leia os dados (se for difícil fazer isto de forma automática, faça que o programa permita a
# digitação manual de cada dado).
def ler_dados(arquivo):
    with open(arquivo, encoding='utf-8-sig') as arquivo_csv:
        # Realizando a leitura dos dados do arquivo csv 
        info = csv.reader(arquivo_csv, delimiter=';')
        dados = list()

        # Loop para adição de cada item em uma nova lista, transformando os dados para o tipo int
        for numeros in info:
            dados.append(int(numeros[0]))
        return dados

# Ex2. Inclua em seu programa uma rotina que organize e exiba os 40 dados em ordem crescente (rol).
def dados_crescente(dados: list):
    # Função para organização dos dados em ordem crescente
    dados.sort()
    return dados

# Ex3. Inclua em seu programa uma rotina que calcule e apresente a média dos 40 dados
def calcula_media(dados: list):
    # Somatória dos itens da lista, dividido pela quantidade de itens
    return sum(dados) / len(dados)

# Ex4. Inclua em seu programa uma rotina que determine e exiba a mediana dos 40 dados.
def calcula_mediana(dados: list):
    # Validação se a quantidade de dados é par ou ímpar, caso futuramente o arquivo seja alterado para outra quantidade de valores
    if len(dados) % 2 == 0:
        # Definição das posições 1 e 2. OBS: Devido o Python iniciar a numeração dos itens da lista por 0, foi subtraído o valor 1 para correta posição
        x1 = int(len(dados) / 2) - 1
        x2 = int(len(dados) / 2 + 1) - 1

        # Cálculo da mediana através dos itens nas posições x1 e x2 da lista
        mediana = (dados[x1] + dados[x2]) / 2
        return mediana
 
    else:
        # Definição da posição. OBS: Devido o Python iniciar a numeração dos itens da lista por 0, foi subtraído o valor 1 para correta posição
        x = int((len(dados)+1) / 2) - 1

        # Cálculo da mediana
        mediana = dados[x]
        return mediana

# Ex5. Inclua em seu programa uma rotina que verifique se existe uma (ou mais) moda(s) entre os 40 dados. Caso
# exista(m), o programa deve apresentá-la(s).
def verifica_moda(dados: list):
    moda = list()
    modas = list()
    quantidade = 0

    # Loop para analisar quais itens aparecem mais de uma vez e armazena-los na lista moda 
    for numero in dados:
        if dados.count(numero) > 1 and numero not in moda:
            moda.append(numero)

    # Loop para validar quais são as modas que se repetem mais vezes que as outras e armazena-las na lista modas
    for m in moda:
        if dados.count(m) > quantidade:
            quantidade = dados.count(m)
            modas.clear() 
            modas.append(m)
        elif dados.count(m) == quantidade:
            modas.append(m)


    return f'{modas} - Frequência = {quantidade}'

# Ex6. Inclua em seu programa uma rotina que calcule e apresente o desvio absoluto médio dos 40 dados.
def desvio_abs_med(dados: list):
    media = calcula_media(dados)
    desvio = 0
    # Para cada valor da lista de dados é somado o valor para o desvio
    for valores in dados:
        desvio += abs(valores - media)

    # Ao final a soma dos desvios é divido pelo total de itens da lista de dados
    desvio = desvio / len(dados)
    return desvio

# Ex7. Inclua em seu programa uma rotina que calcule e apresente a variância e o desvio padrão dos 40 dados.
# Obs.: como estamos lidando com mais de 30 dados, não é necessário usar a correção (n-1) no cálculo da variância.
def variancia_desviopadrao(dados: list):
    media = calcula_media(dados)
    desvio = 0
    # Para cada valor da lista de dados é somado o valor para o desvio, sendo o di^2
    for valores in dados:
        desvio += math.pow((valores - media),2)
    
     # Ao final a soma dos desvios é divido pelo total de itens da lista de dados para obtenção da variância
    variancia = desvio / len(dados)

    # O desvio padrão corresponde a raíz quadrada da variância
    desvio_padrao = math.sqrt(variancia)

    return f'Variância= {variancia} | Desvio padrão = {desvio_padrao}'

# Ex8. Inclua em seu programa uma rotina que agrupe os 40 dados em 7 classes (sugestão óbvia: classes de 0 a 10, 10 a
# 20, 20 a 30 e assim por diante) e apresente a distribuição de frequências destas classes. Esta tabela de distribuição
# de frequências deve ter colunas para as classes, ponto médio de cada classe (xi), frequências absolutas (ni),
# frequências relativas (ou proporções, fi) e porcentagens (%, obtidas como 100*fi).
def distribuicao_de_frequencias(dados: list):
    tabela = [['Classes','Ponto Médio (xi)','Frequência absoluta (ni)', 'Proporções (fi)','Porcentagem % (100 * fi)']] # Tabela de dados
    cl = 0 # Variável para calcular quantas classes
    pm = 0 # Variável para calcular o ponto médio
    ni = 0 # Variável para calcular a frequência absoluta
    fi = 0 # Variável para calcular a proporção

    # Loop para população da tabela
    while cl < max(dados):
        classe = f'{cl} |--- {cl+10}'   # Definição da distribuição de frequência dentro do range de dados
        pm = (cl + (cl+10)) / 2         # Cálculo do ponto médio
        for x in dados:                 # Laço para cálculo do ni, afim de analisar quais dados estão dentro do range
            if x >= cl and x < cl+10:
                ni += 1
        
        fi = ni / len(dados)            # Cálculo da proporção
        p = fi * 100                    # Cálculo da porcentagem

        tabela.append([classe,pm,ni,fi,p]) # Adição de uma nova linha na tabela a cada cálculo

        # Utilização da informação para o exercício 10
        global MEDIA_DADOS_AGRUPADOS
        MEDIA_DADOS_AGRUPADOS += fi * pm  
        
        # Utilização da informação para o exercício 11
        global CLASSE_MODAIS
        CLASSE_MODAIS.append([classe,pm,ni])

        # Utilização da informação para o exercício 12
        global DESVIO_ABS_MED
        DESVIO_ABS_MED += abs(calcula_media(dados) - pm) * ni

        # Utilização da informação para o exercício 13
        global VARIANCIA_DESVIO
        VARIANCIA_DESVIO += math.pow(abs(calcula_media(dados) - pm),2) * ni


        # Reinicialização das váriavies
        ni = 0      
        cl += 10
    
    # Função para imprimir a tabela
    print('\nExercício 8:')
    for linha in tabela:
        for coluna in linha:
            print(f'{coluna:^25}',end=' | ')
        print()

# Ex9. Inclua em seu programa uma rotina que, baseada na distribuição de frequências montada no item 8. acima,
# apresente um histograma da distribuição. Caso a apresentação de um histograma seja muito difícil na linguagem
# de programação com a qual você esteja trabalhando, tente apresentar ao menos um diagrama de ramos-e-folhas
# dos dados, ou um gráfico de dispersão unidimensional (aquele dos pontinhos).
def diagrama(dados: list):
    print('\nExercício 9:')
    ramo = 0
    folha = ''
    # Loop para população do gráfico
    while ramo < max(dados):
        for x in dados:
            if x >= ramo and x < ramo+10 and ramo == 0: # Caso o ramo seja 0 e os dados estejam entre o ramo e o ramo + 10, os valores são adicionados na folha
                folha += f' {x} ' 
            elif  x >= ramo and x < ramo+10: # Caso o ramo seja maior que 0 e os dados estejam entre o ramo e o ramo + 10, o resto da divisão entre o dado e o ramo são adicionados na folha 
                folha += f' {x % ramo} ' 
        print(f'{ramo / 10:.0f} | {folha}') # Impressão do gráfico
        folha = '' # Reinicialização da folha
        ramo += 10 # Adicição dos valores dos ramo

# Ex10. Inclua em seu programa uma rotina que calcule a média usando os dados agrupados em classes (item 8. acima).
# Verifique se há alguma diferença entre esta média e aquela calculada no item 3. acima. Caso haja alguma
# diferença, explique por que isso ocorre.
def media_dados_agrupados(dados: list):
    # Se a media dos dados agrupados forem diferentes, é exibido o resultado mais a explicação 
    if  MEDIA_DADOS_AGRUPADOS != calcula_media(dados):
        return f'Média dos dados agrupados em classes: {MEDIA_DADOS_AGRUPADOS}. A divergência é devido que o agrupamento dos dados em classes realizado anteriormente não introduziu os pequenos erros que poderiam acontecer. Em algumas situações, a quantidade de informações diferenciadas torna inviável a construção de uma tabela com uma linha para cada representação de valor. Nesses casos optamos por agrupar os dados em intervalos de classes.'
    else:
        return f'Média dos dados agrupados em classes: {MEDIA_DADOS_AGRUPADOS}. Os valores de média são iguais'

# Ex11. Inclua em seu programa uma rotina que determine a(s) classe(s) modal(is) da distribuição de frequências
# construída no item 8. acima.
def classes_modais():
    global CLASSE_MODAIS
    moda = 0
    clm = list()

    # Loop para validar quais das classes possui a maior frequência e se possui mais de uma classe com a mesma frequência 
    for classe in CLASSE_MODAIS:
        if classe[2] > moda:
            moda = classe[2]
            clm.clear()
            clm.append(classe)
        elif classe[2] == moda:
            clm.append(classe) 
    print('\nExercício 11:')
    print(f'As classes modais são as de maiores frequências. Neste caso, a{"s" if len(clm) > 1 else ""} classe{"s" if len(clm) > 1 else ""} de {", ".join(f"{c[0]}" for c in clm)} com ponto médio {", ".join(f"{c[1]}" for c in clm)} que tem frequência {moda}{", respectivamentes" if len(clm) > 1 else "."}')

# Ex12. Inclua em seu programa uma rotina que, baseada na distribuição de frequências montada no item 8. acima, calcule
# e apresente o desvio absoluto médio. Verifique se há alguma diferença entre este desvio absoluto médio e aquele
# calculado no item 6. acima. Caso haja alguma diferença, explique por que isso ocorre.
def desvio_abs_med_agrup(dados: list):
    global DESVIO_ABS_MED
    DESVIO_ABS_MED = DESVIO_ABS_MED / len(dados)
    # Se o desvio absoluto médio dos dados agrupados forem diferentes, é exibido o resultado mais a explicação 
    if  DESVIO_ABS_MED != desvio_abs_med(dados):
        return f'Desvio absoluto médio dos dados agrupados: {DESVIO_ABS_MED}. A divergência é devido que o agrupamento dos dados em classes realizado anteriormente não introduziu os pequenos erros que poderiam acontecer. Em algumas situações, a quantidade de informações diferenciadas torna inviável a construção de uma tabela com uma linha para cada representação de valor. Nesses casos optamos por agrupar os dados em intervalos de classes.'
    else:
        return f'Desvio absoluto médio dos dados agrupados: {DESVIO_ABS_MED}. Os valores do desvio absoluto médio são iguais'
   
# Ex13. Inclua em seu programa uma rotina que, baseada na distribuição de frequências montada no item 8. acima, calcule
# e apresente a variância e o desvio padrão. Verifique se há alguma diferença entre a variância e o desvio padrão
# assim calculados e aqueles calculados no item 7. acima. Caso haja alguma diferença, explique por que isso ocorre.
# Obs.: como estamos lidando com mais de 30 dados, não é necessário usar a correção (n-1) no cálculo da variância. 
def variancia_desviopadrao_agrup(dados: list):
    global VARIANCIA_DESVIO
    VARIANCIA_DESVIO = VARIANCIA_DESVIO / len(dados)
    desvio = math.sqrt(VARIANCIA_DESVIO)

    # Se a variância dos dados agrupados forem diferentes, é exibido o resultado mais a explicação 
    if  VARIANCIA_DESVIO != variancia_desviopadrao(dados):
        return f'Variância = {VARIANCIA_DESVIO} | Desvio padrão = {desvio}. A divergência é devido que o agrupamento dos dados em classes realizado anteriormente não introduziu os pequenos erros que poderiam acontecer. Em algumas situações, a quantidade de informações diferenciadas torna inviável a construção de uma tabela com uma linha para cada representação de valor. Nesses casos optamos por agrupar os dados em intervalos de classes.'
    else:
        return f'Variância = {VARIANCIA_DESVIO} | Desvio padrão = {desvio}. Os valores de variância e desvio padrão são iguais'

# Execução do programa
if __name__ == '__main__':

    # Armazenamento dos dados para utilização nas funções
    dados = ler_dados('.\\2022_3_EP_4MA_ADO01_DadosGustavoTozeti.csv')

    # Chamada dos exercícios    
    print('\nExercício 1:\n',dados)
    print('\nExercício 2:\n',dados_crescente(dados))
    print('\nExercício 3:\n',calcula_media(dados))
    print('\nExercício 4:\n',calcula_mediana(dados))
    print('\nExercício 5:\n',verifica_moda(dados))
    print('\nExercício 6:\n',desvio_abs_med(dados))
    print('\nExercício 7:\n',variancia_desviopadrao(dados))
    distribuicao_de_frequencias(dados)
    diagrama(dados_crescente(dados))
    print('\nExercício 10:\n',media_dados_agrupados(dados))
    classes_modais()
    print('\nExercício 12:\n',desvio_abs_med_agrup(dados))
    print('\nExercício 13:\n',variancia_desviopadrao_agrup(dados))
