/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.antonov.juniorlearning;

/**
 *
 * @author Antonov
 */
public class Client {

    private String name;
    private String email;
    private int id;

    public String getName() {
        return name;
    }

    public void setName(String Name) {
        this.name = Name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {

        return "\nid = " + id + "\nnname = " + name + "'nemail = " + email; //To change body of generated methods, choose Tools | Templates.
    }

}
