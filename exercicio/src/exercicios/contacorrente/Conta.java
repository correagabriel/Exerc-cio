package exercicios.contacorrente;
public class Conta{

        String nameTitular;
        int numeroConta = 57645;
        String agenciaConta = " Santander ";
        double salarioconta = 1500D;
        double conta;
        double rendimentoConta;

            public void sacar(){ 
                conta = salarioconta - 50;
                System.out.println("Saldo atual de : " + conta);
            }

            public void depositar(){ //criando o metodo depositar
                conta = conta + (salarioconta + 100);
                System.out.println("Saldo atual da conta : " + conta);
            }

            public void RendimentoaoMes(){
                rendimentoConta = salarioconta * 0.1 * 12;
                System.out.println("Seu rendimento foi de: " + rendimentoConta);
            }


            public void aparecerNome(String nome){
                nameTitular = nome;
                System.out.println("Seu nome : " + nameTitular);
            }

            public void nmrConta(int numero){
                numeroConta = numero;
                System.out.println("Numero da conta " + numeroConta);
            }

            public void nomeAgencia(String nameBanco){
                agenciaConta = nameBanco;
                System.out.println("Sua Agencia: " + agenciaConta);
            }
}