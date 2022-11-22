package Config;

import java.util.Scanner;

public class A3_teste {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Deseja ligar o celular? S ou N");

        String ligaCelular = entrada.next();

        boolean celularLigado = true;

        if (ligaCelular.equals("S") || ligaCelular.equals("s")) {
            System.out.println("Ligando celular...");
            do {
                boolean estadoLigado = true;
                Config cfg = new Config();

                while (estadoLigado) {
                    System.out.println("""
                            O que deseja fazer?
                            1 - Ver contatos
                            2 - Mandar mensagem
                            3 - Chamar a emergencia
                            4 - Realizar ligacoes/Teclado numerico
                            5 - Desligar o telefone""");
                    String opcao = entrada.next();
                    if (estadoLigado == true) {
                        switch (opcao) {
                            case "1":
                                System.out.println("CONTATOS");
                                System.out.println("=============");
                                for (String string : cfg.getContatos()) {
                                    System.out.println(string);
                                }
                                System.out.println("=============");
                                estadoLigado = false;
                                break;
                            case "2":
                                System.out.println("Digite a mensagem a ser enviada: ");
                                cfg.setMensagem(entrada.next());
                                System.out.println("=============");
                                System.out.println("CONTATOS");
                                System.out.println("=============");
                                for (String string : cfg.getContatos()) {
                                    System.out.println(string);
                                }
                                System.out.println("=============");
                                System.out.println("Digite o contato que deseja enviar a mensagem: ");
                                cfg.setEscolha(entrada.next());
                                System.out.println("=============");
                                System.out.println("Mensagem enviada!");
                                System.out.println(
                                        "Mensagem: " + cfg.getMensagem() + " enviada para: " + cfg.getEscolha());
                                System.out.println("=============");
                                break;
                            case "3":
                                cfg.setEmergencia(190);
                                System.out.println("Ligando para a emergencia: " + cfg.getEmergencia());
                                break;
                            case "4":
                                System.out.println("Direcionando para o teclado numerico...");
                                break;
                            case "5":
                                System.out.println("Desligando o celular...");
                                estadoLigado = false;
                                celularLigado = false;
                                break;
                            default:
                                System.out.println("Opcao Invalida!");
                        }
                    } else {
                        estadoLigado = true;
                    }
                }

            } while (celularLigado);
        } else if (ligaCelular.equals("N") || ligaCelular.equals("n")) {
            System.out.println("Celular desligando...");
            celularLigado = false;
        } else {
            System.out.println("Opcao invalida!");
        }

        entrada.close();

    }

}
