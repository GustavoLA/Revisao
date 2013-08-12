package br.senai.sc.model.negocio;

/**
 * Esta classe representa funcionarios
 *
 * @version 1.0 31/07/2013
 * @author gustavo_lourenco
 */
public class Funcionario extends PessoaFisica {

    public static int idFuncionario;
    public int codigo;
    private double salario;
    private String dataAdmissao;
    private String ctps; //ctps = carteira de trabalho
    private String cargo;

    public Funcionario() {
        this.idFuncionario++;
        codigo = idFuncionario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public String getCtps() {
        return ctps;
    }

    public void setCtps(String ctps) {
        this.ctps = ctps;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
