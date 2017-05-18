/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webgallery;

/**
 *
 * @author Estudiante
 */
public class Consumer extends User  {

    public Consumer(String name, String surname, WebGallery webGallery) {
        super(name, surname, webGallery);
    }


   public void consultGallery() {
       for (int i = 0; i < webGallery.getGallery().size(); i++) {
            System.out.println(webGallery.getGallery().get(i).toString());
       }
   }
   
   public void selectWork() {
       
   }
   
   public void validPay() {
       
   }

   
  
}
