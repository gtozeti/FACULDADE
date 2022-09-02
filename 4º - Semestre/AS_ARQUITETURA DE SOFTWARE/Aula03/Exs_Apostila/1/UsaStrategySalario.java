/*
1 -) Uma empresa estabeleceu uma regra para cálculo dos salários dos seus funcionários. Os salários serão calculados com base em um fator, que é diferenciado para cada departamento. Essa regra tem o objetivo de incrementar o plano de carreiras da empresa. 

Gerência - bônus 6%
Desenvolvimento - bônus 5%
Suporte - bônus 4%
Demais departamentos - bônus 3%

Cálculo do salário: salário+salário*bônus

Aplicar o pattern Strategy para esse caso.

 */

public class UsaStrategySalario {
    public static void main(String[] args) {
        Salario salario = new Salario(2000);
        System.out.println(String.format("Valor do salário: R$ %.2f", ListaDepartamento.values()[1].calculo(salario)));
    }
}
