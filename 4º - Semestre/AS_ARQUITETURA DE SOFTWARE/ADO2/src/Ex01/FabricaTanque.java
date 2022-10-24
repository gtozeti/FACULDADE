package Ex01;
public class FabricaTanque implements Creator {

    @Override
    public Tanque factoryMethod(ListaTanque tipoTanque) {
        Tanque tanque = null;

        if (tipoTanque.equals(ListaTanque.M4_SHERMAN)) {
            tanque = new M4Sherman(".70", "Vermelho","40.2317315,-78.2804136");

        } else if (tipoTanque.equals(ListaTanque.TIGER)) {
            tanque = new Tiger(".50", "Camuflado","51.70204270390542, 11.589664419630582");

        }
        else if (tipoTanque.equals(ListaTanque.CHALLENNGER)) {
            tanque = new Challenger(".30", "Nevado","58.63442129529803, -3.1941059626472117");

        }
        else if (tipoTanque.equals(ListaTanque.MERKAVA)) {
            tanque = new Merkava(".120", "Verde","31.498099755729783, 34.52576324697001");

        }

        return tanque;
    }

}
