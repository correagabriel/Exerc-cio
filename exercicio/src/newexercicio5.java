public class newexercicio5 {
    public static void main(String[] args) {
    
        int atual = 1;
        int anterior = 0;
        int aux;

        for(int i =0; i <= 100; i++){
            aux = atual;      
            atual = atual + anterior;
            anterior = aux;

            System.out.println(atual + " = " + atual);
        }
    }
}


/*
    int anterior = 0;
    int atual =1;
        while(atual < 100)
            System.out.println(atual);
                int proximo = anterior + atual;
                System.out.println(proximo);
 */
