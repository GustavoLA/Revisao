package br.senai.sc.model.negocio;

/**
 * Essa classe representa Fornecedores
 *
 * @version 1.0 31/07/2013
 * @author gustavo_lourenco
 */
public class Fornecedor extends PessoaJuridica {

    private String tipoProduto;

    public Fornecedor() {
    }

    public String getTipoProduto() {
        return tipoProduto;
    }

    public void setTipoProduto(String tipoProduto) {
        this.tipoProduto = tipoProduto;
    }
}
