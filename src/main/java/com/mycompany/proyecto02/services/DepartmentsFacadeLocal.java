/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.proyecto02.services;

import com.mycompany.proyecto02.entities.Departments;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author One PC
 */
@Local
public interface DepartmentsFacadeLocal {

    void create(Departments departments);

    void edit(Departments departments);

    void remove(Departments departments);

    Departments find(Object id);

    List<Departments> findAll();

    List<Departments> findRange(int[] range);

    int count();
    
}
