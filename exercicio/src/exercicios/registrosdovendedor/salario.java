package exercicios.registrosdovendedor;

public class salario {
    String nomeVendedor; //nome do Vendedor 
    String nomeProduto; //nome do Produto
    double valorProduto ; //valor do Produto 
    int quantidadeVendida ; //quantidade do produto no estoque 
    double salarioVendedor; //salario do vendedor 
    double vendas; //quantidade de produtos vendidos 
    double pagamento; //salario do vendedor (salarioinicila + comissão)
    double vendasSalario; //valor da comissão 

        public void VendedorNome(String Name){  //metodo (função) aparecer o nome 
            nomeVendedor = Name;
                System.out.println("Nome do Vendedor : " + nomeVendedor);
        }

        public void SalarioBase(){ //função de guardar o salario base
            salarioVendedor = 1500D;
                System.out.println("Salario Base do Vendedor : " + salarioVendedor);
        }

        public void ProdutosNome(String NomeProduto){ //função guardar o nome do produto
            nomeProduto = NomeProduto;
                System.out.println("Nome do Produto : " + nomeProduto);
        }

        public void ValorProduto(double Preco){ //função guardar o valor do produto
            valorProduto = Preco;
                System.out.println("Preço Produto : " + valorProduto);
        }

        public void Quantidade(int QuantidadeVendas){ //função guardar a quantidade  do produto 
            quantidadeVendida = QuantidadeVendas;
                System.out.println("Quantidade de " + quantidadeVendida);
        }

        public void Vendas(){ //função de guarda a quantidade vendida do produto 
            vendas = quantidadeVendida * valorProduto;  
                System.out.println("Quantidade de Vendas " + nomeProduto + " foi de " + vendas);
        }

        public  void Salario(){ //função de guardar o salario 
            vendasSalario = vendas * 0.15; //comissão 
            pagamento = salarioVendedor + vendasSalario; //comissão + salarioinicial
                System.out.println("O valor da comissão foi de : " + vendasSalario);
                System.out.println("O salario do Vendedor " + nomeVendedor + " foi de : " + pagamento);
        }




}
