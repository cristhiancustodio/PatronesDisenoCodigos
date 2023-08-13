public class Usuario 
{ 
    public static void main(String[] args) 
    { 
        Pedido pedidoEspaña = new PedidoEspaña(); 
        pedidoEspaña.setImporteSinIVA(10000); 
        pedidoEspaña.calculaPrecioConIVA(); 
        pedidoEspaña.visualiza(); 
 
 
        Pedido pedidoLuxemburgo = new PedidoLuxemburgo(); 
        pedidoLuxemburgo.setImporteSinIVA(10000); 
        pedidoLuxemburgo.calculaPrecioConIVA(); 
        pedidoLuxemburgo.visualiza(); 
    } 
}

