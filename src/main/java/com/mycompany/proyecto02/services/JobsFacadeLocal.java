/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.proyecto02.services;

import com.mycompany.proyecto02.entities.Jobs;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author One PC
 */
@Local
public interface JobsFacadeLocal {

    void create(Jobs jobs);

    void edit(Jobs jobs);

    void remove(Jobs jobs);

    Jobs find(Object id);

    List<Jobs> findAll();

    List<Jobs> findRange(int[] range);

    int count();
    
}
