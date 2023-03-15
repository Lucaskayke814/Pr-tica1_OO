package br.com.estoque;

public class MainEstoque {
    public static void main(String[] args) {
        estoque e1 = new estoque();
        e1.setNome("Caneta");
        e1.setQtdAtual(10);
        e1.setQtdMinimo(5);
        System.out.println(e1.mostra());
    }
}
