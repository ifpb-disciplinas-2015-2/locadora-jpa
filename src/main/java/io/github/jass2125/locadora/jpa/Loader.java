/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.jass2125.locadora.jpa;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Anderson Souza
 * @email jair_anderson_bs@hotmail.com
 * @since 2015, Feb 9, 2016
 */
public class Loader {

    public static void main(String[] args) {
        IAutomovelDao dao = null;
        Automovel automovel = null;
        int op = 1;
        Scanner in = new Scanner(System.in);

        while (op != 0) {
            System.out.println("1 - Para adicionar um automóvel");
            System.out.println("2 - Para listar os automóveis");
            System.out.println("3 - Para deletar um automóvel");
            op = in.nextInt();
            in.nextLine();

            switch (op) {
                case 1:
                    System.out.println("Marca");
                    String marca = in.nextLine();

                    System.out.println("Modelo");
                    String modelo = in.nextLine();

                    System.out.println("Ano de Fabricação");
                    Integer anoDeFabricacao = in.nextInt();
                    in.nextLine();

                    System.out.println("Ano de modelo");
                    Integer anoDoModelo = in.nextInt();
                    in.nextLine();

                    System.out.println("Observações:");
                    String observacoes = in.nextLine();

                    automovel = new Automovel(marca, modelo, anoDeFabricacao, anoDoModelo, observacoes);
                    dao = new AutomovelDao();
                    dao.add(automovel);
                    break;

                case 2:
                    dao = new AutomovelDao();
                    List<Automovel> automoveis = dao.getAutomoveis();
                    for (Automovel it : automoveis) {
                        System.out.println("-----------------------");
                        System.out.println("identificador: " + it.getId());
                        System.out.println("Marca: " + it.getMarca());
                        System.out.println("Modelo: " + it.getModelo());
                        System.out.println("Ano de Fabricação: " + it.getAnoDeFabricacao());
                        System.out.println("Ano de Modelo: " + it.getAnoModelo());
                        System.out.println("Observações: " + it.getObservacoes());
                        System.out.println("-----------------------");
                    }

                    break;
                case 3:
                    System.out.println("Modelo do automóvel que deseja excluir?");
                    Long identificador = in.nextLong();
                    dao = new AutomovelDao();
                    dao.delete(identificador);
                    break;
                default:
                    System.exit(1);
            }

        }

    }

}
