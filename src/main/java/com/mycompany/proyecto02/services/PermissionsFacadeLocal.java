/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.proyecto02.services;

import com.mycompany.proyecto02.entities.Permissions;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author One PC
 */
@Local
public interface PermissionsFacadeLocal {

    void create(Permissions permissions);

    void edit(Permissions permissions);

    void remove(Permissions permissions);

    Permissions find(Object id);

    List<Permissions> findAll();

    List<Permissions> findRange(int[] range);

    int count();
    
}
