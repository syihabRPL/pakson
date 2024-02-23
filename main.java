/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User;

public class main {
    public static void main(String[] args) {
        
        User user = new User("popo","lol");
        User user1 = new User();
        
        user.setUsername( "LOL");
        user.setPassword( "lil");
        user.setStatus(false);
        
        System.out.println("Username : "+user.getUsername());
        System.out.println("Password : "+user.getPassword());
        System.out.println("Status : "+user.getId());
    }
    
}
