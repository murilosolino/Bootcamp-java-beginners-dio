public class Usuario {
    public static void main(String[] args) throws Exception {
       
        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumetarVolume();

        smartTv.mudarCanal(22);
        System.out.println ("Canal  Atual:" + smartTv.canal);

        System.out.println ("TV ligada?" + smartTv.ligada);
        System.out.println ("Canal Atual:" + smartTv.canal);
        System.out.println ("Volume Atual:" + smartTv.volume);

        smartTv.ligar();
        System.out.println (" Novo Status: -> TV ligada?" + smartTv.ligada);

        smartTv.desligar();
        System.out.println (" Novo Status: -> TV ligada?" + smartTv.ligada);

        smartTv.aumetarVolume();
        System.out.println (" Novo Statuts -> Volume  Atual:" + smartTv.volume);

        smartTv.diminuirVolume();
        System.out.println (" Novo Statuts -> Volume  Atual:" + smartTv.volume);

        smartTv.aumetarCanal();
        System.out.println (" Novo Statuts -> Canal  Atual:" + smartTv.canal);

        smartTv.diminuirCanal();
        System.out.println (" Novo Statuts -> Canal  Atual:" + smartTv.canal);


    }
}

