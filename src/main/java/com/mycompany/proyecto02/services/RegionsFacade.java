/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto02.services;

import com.mycompany.proyecto02.entities.Regions;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author One PC
 */
@Stateless
public class RegionsFacade extends AbstractFacade<Regions> implements RegionsFacadeLocal {

    @PersistenceContext(unitName = "com.mycompany_Proyecto02_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public RegionsFacade() {
        super(Regions.class);
    }
    
}
