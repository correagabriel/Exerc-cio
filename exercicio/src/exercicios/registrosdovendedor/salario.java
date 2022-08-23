package exercicios.registrosdovendedor;

public class salario {
    String nomeVendedor;
    String nomeProduto;
    double valorProduto ;
    int quantidadeVendida ;
    double salarioVendedor;
    double vendas;
    double pagamento;
    double vendasSalario;

        public void VendedorNome(String Name){
            nomeVendedor = Name;
                System.out.println("Nome do Vendedor : " + nomeVendedor);
        }

        public void SalarioBase(){
            salarioVendedor = 1500D;
                System.out.println("Salario Base do Vendedor : " + salarioVendedor);
        }

        public void ProdutosNome(String NomeProduto){
            nomeProduto = NomeProduto;
                System.out.println("Nome do Produto : " + nomeProduto);
        }

        public void ValorProduto(double Preco){
            valorProduto = Preco;
                System.out.println("Preço Produto : " + valorProduto);
        }

        public void Quantidade(int QuantidadeVendas){
            quantidadeVendida = QuantidadeVendas;
                System.out.println("Quantidade de " + quantidadeVendida);
        }

        public void Vendas(){
            vendas = quantidadeVendida * valorProduto;  
                System.out.println("Quantidade de Vendas " + nomeProduto + " foi de " + vendas);
        }

        public  void Salario(){
            vendasSalario = vendas * 0.15;
            pagamento = salarioVendedor + vendasSalario;
                System.out.println("O valor da comissão foi de : " + vendasSalario);
                System.out.println("O salario do Vendedor " + nomeVendedor + " foi de : " + pagamento);
        }




}
