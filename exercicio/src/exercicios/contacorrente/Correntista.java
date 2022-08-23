package exercicios.contacorrente;

public class Correntista {
    public static void main(String[] args) {
        Conta Correntista = new Conta();

            Correntista.aparecerNome(" Geraldo");
            Correntista.nmrConta( 15647);
            Correntista.nomeAgencia("Bradesco");
            Correntista.RendimentoaoMes();
 
               //chamamos os metodos 
            Correntista.depositar();

            Correntista.sacar();
    }
}
