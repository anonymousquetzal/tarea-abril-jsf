/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * @code Aqui va estar encapsulado el template para un producto
 * @version 0.1
 * @author Julio Coco
 */
@Data
@EqualsAndHashCode(of = "codigo")
@ToString(of = {"codigo", "nombre", "creadoEl"})
public class Producto {
    
    private Integer id;
    private String codigo;
    private String nombre;
    private BigDecimal precio_base;
    private BigDecimal precio_venta;
    private Double existencia;
    private Date creadoEl;
        
}
