package br.senai.sc.model.negocio;

/**
 * Esta classe representa Cliente do tipo Pessoa Fisica
 *
 * @version 1.0 31/07/2013
 * @author gustavo_lourenco
 */
public class ClientePF extends PessoaFisica {

    private double nrConta;
    private double limiteCompra;
    private char categoria;
    private int qtVezesComprou;
    private int vlTotalGasto;

    public ClientePF() {
    }

    public double getNrConta() {
        return nrConta;
    }

    public void setNrConta(double nrConta) {
        this.nrConta = nrConta;
    }

    public double getLimiteCompra() {
        return limiteCompra;
    }

    public void setLimiteCompra(double limiteCompra) {
        this.limiteCompra = limiteCompra;
    }

    public char getCategoria() {
        return categoria;
    }

    public void setCategoria(char categoria) {
        this.categoria = categoria;
    }

    public int getQtVezesComprou() {
        return qtVezesComprou;
    }

    public void setQtVezesComprou(int qtVezesComprou) {
        this.qtVezesComprou = qtVezesComprou;
    }

    public int getVlTotalGasto() {
        return vlTotalGasto;
    }

    public void setVlTotalGasto(int vlTotalGasto) {
        this.vlTotalGasto = vlTotalGasto;
    }
}
