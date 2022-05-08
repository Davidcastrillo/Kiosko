
package cr.ac.una.kiosko.model;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 *
 * @author David
 */
public class Ventanas extends ImageView{
    /*Como es una herencia de imageView el " el setX" y "setY" se manejan con las propiedades de el imageview
    */ 
     
     private String idimg;
     private Image images;
     private int tiempo;

    public Ventanas() {
        this.idimg = "0";
        this.tiempo = 0;
        
        
    }
    public Image crearventana(){
        try {
           switch(this.idimg){
               case "1":
                   System.out.println("Una Mentira");
                   Image image = new Image("cr/ac/una/Kiosko/resources/NE.jpeg");
                   setImages(image);
                   break;
               case"2":
                   System.out.println("Una Mentira");
                   Image image2 = new Image("cr/ac/una/Kiosko/resources/NE.jpeg");
                  setImages(image2);
                   break;
               case"3":
                  System.out.println("Una Mentira3");
//                 setImage(this.images);
//                 setFitHeight(100);
//                setFitWidth(500);  
                   break;      
             default:
                System.out.println("me cai en la clase ventana en el metodo crear ventana");
              
           }
        } catch (Exception e) {
            System.out.println("me cai en la clase ventana en el metodo crear ventana");
        }
         return images;
        
    }
  
    public String getIdimg() {
        return idimg;
    }

    public void setIdimg(String idimg) {
        this.idimg = idimg;
    }

    public Image getImages() {
        return images;
    }

    public void setImages(Image images) {
        this.images = images;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }
    
     
     
     
     
    
    
     
    
    
    
    
    
}
