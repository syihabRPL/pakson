/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User;

/**
 *
 * @author SMK TELKOM 47
 */
public class User {
    private String username ;
    private String password ;
    private int id;
    private boolean status; //true : menikah ,false
    
    public User(){
        System.out.println("Knstruktor");
    }
    public User(String apaya,String opoyo){
        this.username = apaya;
        this.password =opoyo;
    }
    

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
   
}
