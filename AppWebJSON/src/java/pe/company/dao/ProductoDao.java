/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.company.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import pe.company.dbase.ConexionDb;
import pe.company.vo.CategoriaVo;
import pe.company.vo.ProductoVo;

/**
 *
 * @author lbanc
 */
public class ProductoDao {
    
    private Connection conn;
    private PreparedStatement ps;
    private ResultSet rs;
    private CategoriaDao categoriaDao = new CategoriaDao();

    public ProductoDao() {
    }
    
    public Collection<ProductoVo> findAll(){
        List<ProductoVo> list = new ArrayList();
        
        try {
            conn = ConexionDb.MySQL();
            ps = conn.prepareStatement("SELECT id_producto, nombre, marca, precio, stock, id_categoria FROM productos");
            rs = ps.executeQuery();
            
            while(rs.next()){
                ProductoVo producto = new ProductoVo();
                producto.setId_producto(rs.getInt("id_producto"));
                producto.setNombre(rs.getString("nombre"));
                producto.setMarca(rs.getString("marca"));
                producto.setPrecio(rs.getDouble("precio"));
                producto.setStock(rs.getInt("stock"));
                
                CategoriaVo categoria = categoriaDao.findById(rs.getInt("id_categoria"));
                producto.setCategoria(categoria);
                
                
                list.add(producto);
            }
        } 
        catch (Exception ex) {
            ex.printStackTrace();
        }
        return list;
    }
    
    public void insert(ProductoVo producto){
        try {
            conn = ConexionDb.MySQL();
            ps = conn.prepareStatement("INSERT INTO productos (nombre, marca, precio, stock, id_categoria) VALUES(?, ?, ?, ?, ?)");
            
            ps.setString(1, producto.getNombre());
            ps.setString(2, producto.getMarca());
            ps.setDouble(3, producto.getPrecio());
            ps.setInt(4, producto.getStock());
            ps.setInt(5, producto.getCategoria().getId_categoria());
            
            int rows = ps.executeUpdate();
            
            if (rows != 1){
                throw new Exception("No se pudo guardar el producto");
            }
        }
        
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void update(ProductoVo producto) {
        try {
            conn = ConexionDb.MySQL();
            ps = conn.prepareStatement("UPDATE productos SET nombre = ?, marca = ?, precio = ?, stock = ?, id_categoria = ? WHERE id_producto = ?");

            ps.setString(1, producto.getNombre());
            ps.setString(2, producto.getMarca());
            ps.setDouble(3, producto.getPrecio());
            ps.setInt(4, producto.getStock());
            ps.setInt(5, producto.getCategoria().getId_categoria());
            ps.setInt(6, producto.getId_producto());

            int rows = ps.executeUpdate();

            if (rows != 1) {
                throw new Exception("No se pudo actualizar el producto");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void delete(Integer id_producto) {
        try {
            conn = ConexionDb.MySQL();
            ps = conn.prepareStatement("DELETE FROM productos WHERE id_producto = ?");

            ps.setInt(1, id_producto);

            int rows = ps.executeUpdate();

            if (rows != 1) {
                throw new Exception("No se pudo eliminar el producto");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
