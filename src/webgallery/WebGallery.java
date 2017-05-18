/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webgallery;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class WebGallery {
    
    private ArrayList<User> users;
    private ArrayList<Work> gallery;

    public WebGallery() {
        this.users = new ArrayList<>();
        this.gallery = new ArrayList<>();
    }

    public ArrayList<Work> getGallery() {
        return gallery;
    }

    
    public void registerUser(User newUser){
        this.users.add(newUser);
        
        for (int i = 0; i < this.users.size(); i++) {
             if (this.users.get(i) instanceof Artist) {
                 
             }
            
        }
    }

   
}
