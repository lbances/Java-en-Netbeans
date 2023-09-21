/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.company.ws;

import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.xml.ws.WebServiceContext;
import pe.company.dao.PedidoDao;
import javax.xml.ws.handler.MessageContext;
import pe.company.model.PedidoVo;

/**
 *
 * @author lbanc
 */
@WebService(serviceName = "PedidoWSAuth")
public class PedidoWSAuth {

    private PedidoDao pedidoDao = new PedidoDao();
    
    @Resource
    private WebServiceContext webServiceContext;
    
    private String userName = "";
    private String passWord = "";
    
    @WebMethod(operationName = "buscar")
    public PedidoVo buscar(@WebParam(name = "id_pedido") Integer id_pedido){
        
        PedidoVo pedido = new PedidoVo();
        
        MessageContext messageContext = webServiceContext.getMessageContext();
        Map requestHeader = (Map)messageContext.get(MessageContext.HTTP_REQUEST_HEADERS);
        
        List usernameList = (List)requestHeader.get("USERNAME");
        List passwordList = (List)requestHeader.get("PASSWORD");
        
        if ((usernameList != null) && (passwordList != null)){
            userName = (String)usernameList.get(0);
            passWord = (String)passwordList.get(0);
        }
        
        if ((userName.equals("admin")) && (passWord.equals("1234"))){
            pedido = pedidoDao.findById(id_pedido);
        }
        else {
            pedido.setFecha_pedido(null);
            pedido.setCliente("Sin acceso");
            pedido.setVendedor("Sin acceso");
            pedido.setProducto("Sin acceso");
            pedido.setCantidad(0);
            pedido.setImporte(0.00);
        }        
        
        
        return pedido;
    }
    
    
}
