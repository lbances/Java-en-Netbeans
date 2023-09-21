/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.company.vo;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author lbanc
 */
public class CategoriaVo {
    
    private Integer id_categoria;
    private String descripcion;
    private Collection<ProductoVo> itemsProducto = new ArrayList();

    public CategoriaVo() {
    }

    public CategoriaVo(Integer id_categoria, String descripcion) {
        this.id_categoria = id_categoria;
        this.descripcion = descripcion;
    }

    public Integer getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(Integer id_categoria) {
        this.id_categoria = id_categoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Collection<ProductoVo> getItemsProducto() {
        return itemsProducto;
    }

    public void setItemsProducto(Collection<ProductoVo> itemsProducto) {
        this.itemsProducto = itemsProducto;
    }
    
    public void addProducto(ProductoVo producto){
        itemsProducto.add(producto);
    }
}
