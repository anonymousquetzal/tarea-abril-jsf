/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import model.Producto;

/**
 *
 * @author Julio Coco
 */
@RequestScoped
public class ProductoServicio implements Serializable{
    public static List<Producto> paisDatasource = new ArrayList<>();
    
    public List<Producto> buscarProductos() {   
        return paisDatasource;
    }

    public void agregarProducto(Producto producto) {
        producto.setId(paisDatasource.size() + 1);
        paisDatasource.add(producto);
    }
    
}
