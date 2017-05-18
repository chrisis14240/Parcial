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
public class Artist extends User{
    
    private String curriculumInfo;
    private ArrayList<Work> works;
    private ArrayList<String> distinctions;

    public Artist(String name, String surname, WebGallery webGallery) {
        super(name, surname, webGallery);
    }
    
    
    public void addWork(Work work) {
        this.works.add(work);
    }

    public ArrayList<Work> getWorks() {
        return works;
    }
    
    
}
