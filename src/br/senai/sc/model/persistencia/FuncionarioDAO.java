/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.model.persistencia;

import br.senai.sc.model.negocio.Funcionario;
import java.util.List;
import javax.swing.JOptionPane;

/**
 * Classe que guarda as informações referentes aos funcionarios
 *
 * @version 1.0 31/07/2013
 * @author gustavo_lourenco
 */
public class FuncionarioDAO {

    //Metodo para adicionar um funcionario no vetor de Funcionarios.
    public void adicionar(Funcionario f, List<Funcionario> funcionarios) {
        funcionarios.add(f);
        JOptionPane.showMessageDialog(null, "Funcionario adicionado com sucesso.");
    }

    //Metodo que lista todos os funcionarios do vetor Funcionario
    public void listar(List<Funcionario> funcionarios) {
        String msg = "";
        for (Funcionario f : funcionarios) {
            msg = msg + "\nNome: " + f.getNome()
                    + "\nData de nascimento: " + f.getDataNascimento()
                    + "\nRG: " + f.getRg()
                    + "\nCPF: " + f.getCpf()
                    + "\nEndereço: " + f.getEndereco()
                    + "\nTelefone: " + f.getTelefone()
                    + "\nData cadastro: " + f.getDataCadastro()
                    + "\nSalário: " + f.getSalario()
                    + "\nData admissão: " + f.getDataAdmissao()
                    + "\nCTPS: " + f.getCtps()
                    + "\nCargo: " + f.getCargo()
                    + "\n----------";
        }
        JOptionPane.showMessageDialog(null, msg);
    }

    //Método para excluir atraves do nome
    public void excluir(String nome, List<Funcionario> funcionarios) {
       
        Funcionario fRemove = null;
        
        for (Funcionario f : funcionarios) {
            if (f.getNome().equals(nome)) {
                fRemove = f;
            }
        }
        funcionarios.remove(fRemove);

    }

    //Metodo para alterar funcionarios
    public void altera(String nome, List<Funcionario> funcionarios, Funcionario fAltera) {
        excluir(nome, funcionarios);
        adicionar(fAltera, funcionarios);

    }

    
    //Metodo para buscar funcionarios pelo nome
    public Funcionario buscarFuncionarioByNome(String nome, List<Funcionario> funcionarios) {
        for (Funcionario fBusca : funcionarios) {
            if (fBusca.getNome().equals(nome)) {
                return fBusca;
            }

        }
        return null;
    }
}
