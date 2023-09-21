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

/**
 *
 * @author lbanc
 */
public class CategoriaDao {
    
    private Connection conn;
    private PreparedStatement ps;
    private ResultSet rs;

    public CategoriaDao() {
    }
    
    public CategoriaVo findById(int id_categoria) {
        CategoriaVo categoria = null;
        
        try {
            conn = ConexionDb.MySQL();
            ps = conn.prepareStatement("SELECT id_categoria, descripcion FROM categorias WHERE id_categoria = ?");
            ps.setInt(1, id_categoria);
            rs = ps.executeQuery();
            
            if(rs.next()) {
                categoria = new CategoriaVo();
                categoria.setId_categoria(rs.getInt("id_categoria"));
                categoria.setDescripcion(rs.getString("descripcion"));
            }
        } 
        
        catch (Exception ex) {
            ex.printStackTrace();
        }
        return categoria;
    }
    
    public Collection<CategoriaVo> findAll() {
        List<CategoriaVo> list = new ArrayList<>();
        
        try {
            conn = ConexionDb.MySQL();
            ps = conn.prepareStatement("SELECT id_categoria, descripcion FROM categorias");
            rs = ps.executeQuery();
            
            while(rs.next()) {
                CategoriaVo categoria = new CategoriaVo();
                categoria.setId_categoria(rs.getInt("id_categoria"));
                categoria.setDescripcion(rs.getString("descripcion"));
                
                list.add(categoria);
            }
            
        }
        
        catch (Exception e) {
        }
        
        return list;
    }
    
}
