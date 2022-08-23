package exercicios.registrosdovendedor;

public class vendas {
    public static void main(String[] args) {
        salario vendas = new salario(); //primeiro colocar o nome de quem eu vou chamar - nome da onde eu to = novo objeto (mesmo nome de que eu chamei)

        vendas.VendedorNome(" Josuke Higashikawa "); //nome do Vendedor - alterei 
        vendas.SalarioBase(); //seu salario base - não alterei
            System.out.println(""); //nada 
        vendas.ProdutosNome(" Nintendo Switch "); //nome do produto que eu alterei 
        vendas.ValorProduto(2369.50D); //preco do produto que eu criei 
        vendas.Quantidade(10); //quantidade que eu criei 
            System.out.println(""); //nada 

        vendas.Vendas(); //quantidade de vendas do produto
            System.out.println(""); //nada 
        vendas.Salario(); //salario do vendedor 
    }
}
