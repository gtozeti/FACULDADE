import csv
from itertools import count # ---> Importação da biblioteca para leitura do dados do arquivo csv
import statistics

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

# Execução do programa
if __name__ == '__main__':
    # Armazenamento dos dados para utilização nas funções
    dados = ler_dados('.\\2022_3_EP_4MA_ADO01_DadosGustavoTozeti.csv')

    print('\nExercício 1:\n',dados)
    print('\nExercício 2:\n',dados_crescente(dados))
    print('\nExercício 3:\n',calcula_media(dados))
    print('\nExercício 4:\n',calcula_mediana(dados))
    print('\nExercício 5:\n',verifica_moda(dados))

    # print('\n',statistics.mode(dados))