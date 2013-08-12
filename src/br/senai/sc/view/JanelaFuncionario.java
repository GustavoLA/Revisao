/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.view;

import br.senai.sc.model.negocio.Funcionario;
import br.senai.sc.model.persistencia.FuncionarioDAO;
import java.util.List;
import javax.swing.JOptionPane;

/**
 * Classe que controla a parte visual do menu funcionario
 *
 * @version 1.0 05/08/2013
 * @author gustavo_lourenco
 */
public class JanelaFuncionario {

    public void menuFuncionario(List<Funcionario> funcionarios) {
        int opcao = 0;
        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("FUNCIONARIO\nInforme a opção desejada: "
                    + "\n1 - Inserir"
                    + "\n2 - Excluir"
                    + "\n3 - Alterar"
                    + "\n4 - Buscar"
                    + "\n5 - Listar"
                    + "\n6 - Sair"));
            switch (opcao) {
                case 1:
                    adicionaFuncionario(funcionarios);
                    break;
                case 2:
                    removeFuncionario(funcionarios);
                    break;
                case 3:
                    alteraFuncionario(funcionarios);
                    break;
                case 4:
                    break;
                case 5:
                    listaFuncionarios(funcionarios);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Você digitou uma opção incorreta");
            }
        } while (opcao != 6);
    }

    void adicionaFuncionario(List<Funcionario> funcionarios) {

        Funcionario f = new Funcionario();
        f.setNome(JOptionPane.showInputDialog("Informe o nome: "));
        f.setDataNascimento(JOptionPane.showInputDialog("Informe a data de nascimento do funcionario: "));
        f.setRg(JOptionPane.showInputDialog("Informe o RG do funcionario: "));
        f.setCpf(JOptionPane.showInputDialog("Informe o CPG do funcionario: "));
        f.setEndereco(JOptionPane.showInputDialog("Endereço do funcionario: "));
        f.setTelefone(JOptionPane.showInputDialog("Telefone do funcionario: "));
        f.setDataCadastro(JOptionPane.showInputDialog("Data de cadastro: "));
        f.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Salario do funcionario: ")));
        f.setDataAdmissao(JOptionPane.showInputDialog("Data de Admissão: "));
        f.setCtps(JOptionPane.showInputDialog("Carteira de trabalho do funcionario: "));
        f.setCargo(JOptionPane.showInputDialog("Informe o cargo do funcionario: "));


        FuncionarioDAO dao = new FuncionarioDAO();
        dao.adicionar(f, funcionarios);

    }

    private void listaFuncionarios(List<Funcionario> funcionarios) {
        FuncionarioDAO dao = new FuncionarioDAO();
        dao.listar(funcionarios);
    }

    private void removeFuncionario(List<Funcionario> funcionarios) {
        FuncionarioDAO dao = new FuncionarioDAO();
        String nome = JOptionPane.showInputDialog("Informe o nome do funcionario a ser excluido: ");

        dao.excluir(nome, funcionarios);
    }

    private void alteraFuncionario(List<Funcionario> funcionarios) {
        FuncionarioDAO dao = new FuncionarioDAO();

        String nome = JOptionPane.showInputDialog("Informe o nome do funcionario a ser alterado: ");

        Funcionario fAltera = new Funcionario();

        fAltera = dao.buscarFuncionarioByNome(nome, funcionarios);

        if (fAltera != null) {
            Funcionario f1 = new Funcionario();

            f1.setNome(JOptionPane.showInputDialog("Informe o nome: ", fAltera.getNome()));
            f1.setDataNascimento(JOptionPane.showInputDialog("Informe a data de nascimento do funcionario: ", fAltera.getDataAdmissao()));
            f1.setRg(JOptionPane.showInputDialog("Informe o RG do funcionario: ", fAltera.getRg()));
            f1.setCpf(JOptionPane.showInputDialog("Informe o CPG do funcionario: ", fAltera.getCpf()));
            f1.setEndereco(JOptionPane.showInputDialog("Endereço do funcionario: ", fAltera.getEndereco()));
            f1.setTelefone(JOptionPane.showInputDialog("Telefone do funcionario: ", fAltera.getTelefone()));
            f1.setDataCadastro(JOptionPane.showInputDialog("Data de cadastro: ", fAltera.getDataCadastro()));
            f1.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Salario do funcionario: ", fAltera.getSalario())));
            f1.setDataAdmissao(JOptionPane.showInputDialog("Data de Admissão: ", fAltera.getDataAdmissao()));
            f1.setCtps(JOptionPane.showInputDialog("Carteira de trabalho do funcionario: ", fAltera.getCtps()));
            f1.setCargo(JOptionPane.showInputDialog("Informe o cargo do funcionario: ", fAltera.getCargo()));

            dao.altera(nome, funcionarios, f1);

        } else {
            JOptionPane.showMessageDialog(null, "Funcionario: " + nome + " não existe");
        }
    }
}