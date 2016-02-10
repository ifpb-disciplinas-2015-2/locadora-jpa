/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package io.github.jass2125.locadora.jpa;

import java.util.List;

/**
 * @author Anderson Souza
 * @since 2015
 */
public interface IAutomovelDao {
    
    public void add(Automovel automovel);
    
    public List<Automovel> getAutomoveis();

    public void delete(Long identificador);
    
}
