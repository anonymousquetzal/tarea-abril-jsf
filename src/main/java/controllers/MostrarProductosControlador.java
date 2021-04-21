/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import model.Producto;
import servicio.ProductoServicio;

/**
 *
 * @author Julio Coco
 */
@Named
@ViewScoped
public class MostrarProductosControlador implements Serializable {
    @Inject 
    private ProductoServicio paisServicio;
    
    private List<Producto> productoList;

        
    @PostConstruct
    public void init() {
        this.productoList = this.paisServicio.buscarProductos();
    }

    public List<Producto> getProductoList() {
        return productoList;
    }
    
    
}
