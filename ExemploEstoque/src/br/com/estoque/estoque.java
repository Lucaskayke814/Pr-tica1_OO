package br.com.estoque;

public class estoque {
    private int codProduto;
    private String nome;
    private int qtdAtual;
    private int qtdMinimo;

    public estoque() {
    }

    public estoque(int codProduto, String nome, int qtdAtual, int qtdMinimo) {
        this.codProduto = codProduto;
        this.nome = nome;
        this.qtdAtual = qtdAtual;
        this.qtdMinimo = qtdMinimo;


    }

    public int getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(int codProduto) {
        this.codProduto = codProduto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdAtual() {
        return qtdAtual;
    }

    public void setQtdAtual(int qtdAtual) {
        this.qtdAtual = qtdAtual;
    }

    public int getQtdMinimo() {
        return qtdMinimo;
    }

    public void setQtdMinimo(int qtdMinimo) {
        this.qtdMinimo = qtdMinimo;
    }
    public void darBaixa(int qtde){
        if (qtdAtual >= qtde)
        qtdAtual = qtdAtual - qtde;
        System.out.print("Estoque insuficiente para baixa");

    }
    public String mostra(){
        return "Produto: "+ this.nome +"\nQtd Minima: "+ this.qtdMinimo +"\n Qtd atual: "+ this.qtdAtual;

    }
   public boolean precisaRepor(){
        if (getQtdAtual()<=getQtdMinimo())
            return true;
        else
            return false;

   }





}
