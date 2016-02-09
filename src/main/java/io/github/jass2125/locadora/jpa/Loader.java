/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package io.github.jass2125.locadora.jpa;

/**
 *
 * @author Anderson Souza
 * @email jair_anderson_bs@hotmail.com
 * @since 2015, Feb 9, 2016
 */
public class Loader {
    
    public static void main(String[] args) {
        IAutomovelDao dao = new AutomovelDao();
        Automovel automovel = new Automovel("Fiat", "Astra", 2015, 2016, "A Venda");
        dao.add(automovel);
    }
            
            

}
