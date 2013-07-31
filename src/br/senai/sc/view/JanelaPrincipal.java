/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.view;

import javax.swing.JOptionPane;

/**
 * Classe que controla toda a parte visual da aplicação
 *
 * @version 1.0 31/07/2013
 * @author gustavo_lourenco
 */
public class JanelaPrincipal {

    public void mostraMenu() {
        int opcao = 0;
        do {

            opcao = Integer.parseInt(JOptionPane.showInputDialog("Informe a opção: "
                    + "\n1 - Funcionario: "
                    + "\n2 - Clietne: "
                    + "\n3 - Fornecedor"
                    + "\n4 - Transportadora"
                    + "\n5 - Sair"));

            switch (opcao) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inexistente");
            }
        } while (opcao != 5);

    }
}
