/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.company.ws;

import java.util.Collection;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import pe.company.dao.ProductoDao;
import pe.company.vo.ProductoVo;

/**
 *
 * @author lbanc
 */
@WebService(serviceName = "ProductoWS")
public class ProductoWS {

    private ProductoDao productoDao = new ProductoDao();
    
    @WebMethod(operationName = "listarProductos")
    public Collection<ProductoVo> listarProducto() {
        return productoDao.findAll();
    }
}
