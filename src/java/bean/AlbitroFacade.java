/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import entidades.Albitro;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author JUANCARLOS
 */
@Stateless
public class AlbitroFacade extends AbstractFacade<Albitro> {
    @PersistenceContext(unitName = "campeonFerPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AlbitroFacade() {
        super(Albitro.class);
    }
    
}
