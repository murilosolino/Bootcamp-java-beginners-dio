package estruturaPoo;

public class RodarAplicacao {
    public static void main(String[] args) {

        Automovel automovel1 = new Automovel();

        automovel1.setCor("Azul");
        automovel1.setModelo("BMW série 3");
        automovel1.setCapacidadeTanque(59);

        System.out.println(automovel1.getModelo());
        System.out.println(automovel1.getCor());
        System.out.println(automovel1.getCapacidadeTanque());
        System.out.println(automovel1.totalValorTanque(6.39));

        Automovel automovel2 = new Automovel("Roxo", "Mercedes-Benz Classe C", 66);

        System.out.println(automovel2.getModelo());
        System.out.println(automovel2.getCor());
        System.out.println(automovel2.getCapacidadeTanque());
        System.out.println(automovel2.totalValorTanque(6.44));

    }
}
