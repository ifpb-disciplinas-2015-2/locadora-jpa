/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package io.github.jass2125.locadora.jpa;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Anderson Souza
 * @email jair_anderson_bs@hotmail.com
 * @since 2015, Feb 9, 2016
 */
public class AutomovelDao implements IAutomovelDao{

    @Override
    public void add(Automovel automovel) {
        EntityManager em = EntityManagerJPA.getEntityManager();
        em.getTransaction().begin();
        em.persist(automovel);
        em.getTransaction().commit();
        em.clear();
    }

    @Override
    public List<Automovel> getAutomoveis() {
        EntityManager em = EntityManagerJPA.getEntityManager();
        Query query = em.createQuery("Select a FROM Automovel a",Automovel.class);
        List<Automovel> automoveis = query.getResultList();
        return automoveis;
    }

}
