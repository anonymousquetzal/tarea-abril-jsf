/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import lombok.Getter;
import javax.annotation.PostConstruct;
import javax.inject.Inject;
import model.Producto;
import servicio.ProductoServicio;


/**
 *
 * @author Julio Coco
 */
@Named
@ViewScoped
public class CrearProductosControlador implements Serializable {
    @Inject 
    private ProductoServicio paisServicio;
   
    @Getter
    private Producto producto;
    @Getter
    private List<Producto> productoList;


    @PostConstruct
    public void init() {
        this.producto = new Producto();
        this.productoList = new ArrayList<>();
    }
    public void agregar() {
        
        producto.setId(this.productoList.size() + 1);        
        this.productoList.add(producto);      
        this.producto.setCreadoEl(new Date());
        paisServicio.agregarProducto(producto);
        this.producto = new Producto();   

    }
    
    
    
}
