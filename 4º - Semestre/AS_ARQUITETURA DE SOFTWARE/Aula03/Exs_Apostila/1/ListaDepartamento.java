public enum ListaDepartamento implements Departamento {
    GERENCIA {
        @Override
        public double calculo(Salario salario) {
            return salario.getSalario() + salario.getSalario() * 0.06;
        }
    },
    DESENVOLVIMENTO {
        @Override
        public double calculo(Salario salario) {
            return salario.getSalario() + salario.getSalario() * 0.05;
        }
    },
    SUPORTE {
        @Override
        public double calculo(Salario salario) {
            return salario.getSalario() + salario.getSalario() * 0.04;
        }
    },
    DEMAIS_DEPARTAMENTOS {
        @Override
        public double calculo(Salario salario) {
            return salario.getSalario() + salario.getSalario() * 0.03;
        }
    }
}
