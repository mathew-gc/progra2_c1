/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ja215
 */
abstract class Cine {
    protected String nombre;
    protected int anio;
    protected String descripcion;
    protected boolean vista;
    
    public abstract String getInfo();
    public Cine (){
        this.anio = anio;
        this.descripcion = descripcion;
        this.nombre = nombre;
        this.vista = vista;
    }
    
    public Boolean checkVistaPelicula(boolean vista){
       
        if(vista !=false)
            return true;
        else
            return true;
        
       
    }
    
}
