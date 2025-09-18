package org.sistemalogistica.view;

import java.util.Scanner;
import org.sistemalogistica.utils.Utils;

public class Menus {

    Scanner input = new Scanner(System.in);
    static Utils utils = new Utils();

    public int home(){

        System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
        System.out.println("┃         Bem vindo ao RouteSystem         ┃");
        System.out.println("┣━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┫");
        System.out.println("┃                 opções                   ┃");
        System.out.println("┣------------------------------------------┫");
        System.out.println("┃ 1 - Cadastros()                          ┃");
        System.out.println("┃ 2 - Criar Pedido                         ┃");
        System.out.println("┃ 3 - Gerar Entrega                        ┃");
        System.out.println("┃ 4 - Histórico                            ┃");
        System.out.println("┃ 5 - Atualizar Status Entrega             ┃");
        System.out.println("┃ 6 - Listar Entregas                      ┃");
        System.out.println("┃ 7 - Relatórios()                         ┃");
        System.out.println("┃ 8 - Buscar Pedido                        ┃");
        System.out.println("┃ 9 - Cancelar Pedido                      ┃");
        System.out.println("┃ 10 - Excluir()                           ┃");
        System.out.println("┃                                          ┃");
        System.out.println("┃ 0 - sair                                 ┃");
        System.out.print("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛\n:");
        return Utils.inputNumber();
    }

    public int registrationType(){

        System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
        System.out.println("┃       Escolha o que deseja Cadastar      ┃");
        System.out.println("┣━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┫");;
        System.out.println("┃ 1 - Cliente                              ┃");
        System.out.println("┃ 2 - Motorista                            ┃");
        System.out.println("┃                                          ┃");
        System.out.println("┃ 0 - sair                                 ┃");
        System.out.print("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛\n:");
        return Utils.inputNumber();

    }
}
