/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.proyecto02.services;

import com.mycompany.proyecto02.entities.RolePermissions;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author One PC
 */
@Local
public interface RolePermissionsFacadeLocal {

    void create(RolePermissions rolePermissions);

    void edit(RolePermissions rolePermissions);

    void remove(RolePermissions rolePermissions);

    RolePermissions find(Object id);

    List<RolePermissions> findAll();

    List<RolePermissions> findRange(int[] range);

    int count();
    
}
