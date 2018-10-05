/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginapp;

import java.sql.Time;

/**
 *
 * @author jakub
 */
public class User {
    private String name,surname;
    private String password;
    
    public User(String name,String surname){
        this.name = name;
        this.surname = surname;
    }
}
