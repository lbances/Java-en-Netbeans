/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.company.dao;

import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;
import pe.company.model.PedidoVo;

/**
 *
 * @author lbanc
 */
public class PedidoDao {
    
    private static final Map<Integer,PedidoVo> itemsPedido = new HashMap();
    static {
        PedidoVo pedido1=new PedidoVo(110036,new GregorianCalendar(1990,0,30).getTime(),
                                     "Ace International","Tom Snyder","Montador",9,22500.0);
        PedidoVo pedido2=new PedidoVo(112961,new GregorianCalendar(1989,11,17).getTime(),
                                     "J.P. Sinclair","Sam Clark","Bisagra Izqda",7,31500.0);
        PedidoVo pedido3=new PedidoVo(112963,new GregorianCalendar(1989,11,17).getTime(),
                                     "Acme Mfg.","Bill Adams","Articulo Tipo 4",28,3276.0);
        PedidoVo pedido4=new PedidoVo(112968,new GregorianCalendar(1989,9,12).getTime(),
                                     "Jones Mfg.","Dan Roberts","Articulo Tipo 4",34,3978.0);
        
        itemsPedido.put(pedido1.getId_pedido(),pedido1);
        itemsPedido.put(pedido2.getId_pedido(),pedido2);
        itemsPedido.put(pedido3.getId_pedido(),pedido3);
        itemsPedido.put(pedido4.getId_pedido(),pedido4);
    }    
    
    public PedidoDao() {
    
    }
    
    public PedidoVo findById(Integer id_pedido) {
        return itemsPedido.get(id_pedido);
    }
}
