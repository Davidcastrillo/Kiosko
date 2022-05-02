/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cr.ac.una.kiosko.model;

import java.lang.invoke.MethodHandle;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 *
 * @author David
 */
public class Ventanas{
     public String posx;
     public String posy;
     public String idimg;
     public ImageView images;
     public String tiempo;

    public Ventanas(String x, String y, String id, ImageView images, String time) {
        this.posx = x;
        this.posy = y;
        this.idimg = id;
        this.images = images;
        this.tiempo = time;
    }

    public Ventanas(String posx, String posy, String idimg, String tiempo) {
        this.posx = posx;
        this.posy = posy;
        this.idimg = idimg;
        this.tiempo = tiempo;
    }
    
    public String getPosx() {
        return posx;
    }

    public void setPosx(String posx) {
        this.posx = posx;
    }

    public String getPosy() {
        return posy;
    }

    public void setPosy(String posy) {
        this.posy = posy;
    }

    public String getIdimg() {
        return idimg;
    }

    public void setIdimg(String idimg) {
        this.idimg = idimg;
    }

    public ImageView getImages() {
        return images;
    }

    public void setImages(ImageView images) {
        this.images = images;
    }

    public String getTiempo() {
        return tiempo;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }
    
     
     
     
     
    
    
     
    
    
    
    
    
}
