/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.proyecto02.services;

import com.mycompany.proyecto02.entities.UserStatus;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author One PC
 */
@Local
public interface UserStatusFacadeLocal {

    void create(UserStatus userStatus);

    void edit(UserStatus userStatus);

    void remove(UserStatus userStatus);

    UserStatus find(Object id);

    List<UserStatus> findAll();

    List<UserStatus> findRange(int[] range);

    int count();
    
}
