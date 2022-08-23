package exercicios.registrosdovendedor;

public class vendas {
    public static void main(String[] args) {
        salario vendas = new salario();

        vendas.VendedorNome(" Josuke Higashikawa ");
        vendas.SalarioBase();
            System.out.println("");
        vendas.ProdutosNome(" Nintendo Switch ");
        vendas.ValorProduto(2369.50D);
        vendas.Quantidade(10);
            System.out.println("");

        vendas.Vendas();
            System.out.println("");
        vendas.Salario();
    }
}
