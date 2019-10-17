/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.ArrayList;
import java.util.List;
import model.Auto;

/**
 *
 * @author aldai
 */
public class ManejadorDeAutos extends javax.swing.JFrame {
    
    private List<Auto> autos; // esto no es C# >:v
    
    public List<Auto> getAutos() {
        if(autos == null){
            autos = new  ArrayList();
        }
        return autos;
    }

    public void setAutos(List<Auto> autos) {
        this.autos = autos;
    }
    
   
    
}
