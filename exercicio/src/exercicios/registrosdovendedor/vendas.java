package exercicios.registrosdovendedor;

public class vendas {
    public static void main(String[] args) {
        salario vendas = new salario();

        vendas.VendedorNome(" Josuke Higashikawa ");
        vendas.ProdutosNome(" Nintendo Switch ");
        vendas.ValorProduto(2369.50D);
        vendas.Quantidade(10);

        vendas.SalarioBase();

        vendas.Vendas();
        vendas.Salario();
    }
}
