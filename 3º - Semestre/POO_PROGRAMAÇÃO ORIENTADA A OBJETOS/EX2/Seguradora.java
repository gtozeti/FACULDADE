import java.util.ArrayList;

public class Seguradora {
    
    private ArrayList<Beneficiario> beneficiario;

    public static void main(String[] args) {
        Seguradora seg = new Seguradora();
        seg.informaPaciente();
        seg.validaOperacao();
    }

    public Seguradora(){
        beneficiario = new ArrayList<Beneficiario>();
    }


    public void informaPaciente(){

        beneficiario.add(new PlanoA("Enzo Lorenzo Assunção", "248.491.088-65", 27, "Oftalmologista", "Dermatologista"));
        beneficiario.add(new PlanoA("Luna Sarah Farias", "599.803.639-59", 17, "Oftalmologista", "Nutricionista"));
        beneficiario.add(new PlanoA("Isabelly Rosa da Cruz", "874.206.328-04", 45, "Oftalmologista", "Dermatologista"));
        beneficiario.add(new PlanoA("Alexandre Bryan da Mota", "105.809.743-16", 34, "Dentista", "Clínico Geral"));
        beneficiario.add(new PlanoB("Patrícia Rosângela Fernanda Rezende", "434.462.265-08", 35, 343.65, 123.75));
        beneficiario.add(new PlanoB("Patrícia Rosângela Fernanda Rezende", "434.462.265-08", 35, 343.65, 123.75));
        beneficiario.add(new PlanoB("Fábio Manoel Pires", "737.913.350-06", 65, 700.01, 83.75));
        beneficiario.add(new PlanoB("Rebeca Sarah Martins", "397.351.819-08", 55, 800.41, 456.75));
    }

    public void validaOperacao(){

        for (Beneficiario pessoa: beneficiario){
            System.out.println(pessoa);
        }

    }
}
