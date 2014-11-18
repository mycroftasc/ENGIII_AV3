/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.Scanner;

/**
 *
 * @author 631210040
 */
public class Principal {

    private int op = -1;
    Scanner s = new Scanner(System.in);

    public void showMenuOptions() {

        System.out.println("Selecione uma das opcoes abaixo:");
        System.out.println("0 - Para Sair");
        System.out.println("1 - Para Manter Medico");
        System.out.println("2 - Para Manter Paciente");
        System.out.println("3 - Para Manter Exame");
        this.op = s.nextInt();
    }

    public void menuMedicoOptions() {
        System.out.println("Selecione uma das opcoes abaixo:");
        System.out.println("0 - Para Voltar ao menu anterior");
        System.out.println("1 - Para Cadastrar Medico");
        System.out.println("2 - Para Atualizar Medico");
        System.out.println("3 - Para Excluir Medico");
        System.out.println("4 - Visualizar Todos os Medicos");
        this.op = s.nextInt();
    }

    public void menuMedico() {
        this.menuMedicoOptions();
        switch (op) {
            case 0: {
                this.showMenuOptions();
                break;
            }
            case 1: {
                System.out.println("Cadastro de medico");
                break;
            }
            case 2: {
                System.out.println("Atualizacao medico");
                break;
            }
            case 3: {
                System.out.println("exclui o medico maroto");
                break;
            }
            case 4: {
                System.out.println("visualiza todos os medicos");
                break;
            }
            default: {
                System.out.println("Opcao inexistente, tente novamente \n\n\n");
                this.menuMedicoOptions();
                break;
            }
        }
    }

    public void menuPacienteOptions() {
        System.out.println("Selecione uma das opcoes abaixo:");
        System.out.println("0 - Para Voltar ao menu anterior");
        System.out.println("1 - Para Cadastrar Paciente");
        System.out.println("2 - Para Atualizar Paciente");
        System.out.println("3 - Para Excluir Paciente");
        System.out.println("4 - Visualizar Todos os Pacientes");
        this.op = s.nextInt();
    }

    public void menuPaciente() {
        this.menuPacienteOptions();

        switch (op) {
            case 0: {
                this.showMenuOptions();
                break;
            }
            case 1: {
                System.out.println("Cadastro de Paciente");
                break;
            }
            case 2: {
                System.out.println("Atualizacao Paciente");
                break;
            }
            case 3: {
                System.out.println("exclui o Paciente maroto");
                break;
            }
            case 4: {
                System.out.println("visualiza todos os Paciente");
                break;
            }
            default: {
                System.out.println("Opcao inexistente, tente novamente \n\n\n");
                this.menuPacienteOptions();
                break;
            }
        }
    }

    public void menuExameOptions() {
        System.out.println("Selecione uma das opcoes abaixo:");
        System.out.println("0 - Para Voltar ao menu anterior");
        System.out.println("1 - Para Cadastrar Exame");
        System.out.println("2 - Para Atualizar Exame");
        System.out.println("3 - Para Excluir Exame");
        System.out.println("4 - Visualizar Todos os Exames");
        this.op = s.nextInt();
    }

    public void menuExame() {
        this.menuExameOptions();
        switch (op) {
            case 0: {
                this.showMenuOptions();
                break;
            }
            case 1: {
                System.out.println("Cadastro de Exame");
                break;
            }
            case 2: {
                System.out.println("Atualizacao Exame");
                break;
            }
            case 3: {
                System.out.println("exclui o Exame maroto");
                break;
            }
            case 4: {
                System.out.println("visualiza todos os Exames");
                break;
            }
            default: {
                System.out.println("Opcao inexistente, tente novamente \n\n\n");
                this.menuExameOptions();
                break;
            }
        }
    }

    public void mainMenu() {

        this.showMenuOptions();

        switch (op) {
            case 0: {
                System.exit(0);
                break;
            }
            case 1: {
                this.menuMedico();
                break;
            }
            case 2: {
                this.menuPaciente();
                break;
            }
            case 3: {
                this.menuExame();
                break;
            }
            default: {
                System.out.println("Opcao inexistente, tente novamente \n\n\n");
                this.showMenuOptions();
                break;
            }
        }

    }
}
