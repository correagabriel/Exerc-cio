package metodo;

public class usuario {
    public static void main(String[] args) {
        
        smartv smarTv = new smartv();
            System.out.println(" TV Ligada ? " + smarTv.ligada);
            
            System.out.println(" Canal : " + smarTv.canal);
            System.out.println(" Volume : " + smarTv.volume);

                smarTv.mudarCanal(13);
            System.out.println(" Canal Atual: " + smarTv.canal);

                smarTv.diminuirVolume();
                smarTv.diminuirVolume();
                smarTv.diminuirVolume();
                smarTv.aumentarVolume();
                smarTv.aumentarVolume();
                    System.out.println(" Volume Atual: " + smarTv.volume);

                    smarTv.ligar();
                        System.out.println(" Status : " + smarTv.ligada);

                    smarTv.desligar();
                        System.out.println(" novo status : " + smarTv.ligada);
    }
}
