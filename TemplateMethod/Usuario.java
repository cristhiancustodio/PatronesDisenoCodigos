public class Usuario 
{ 
    public static void main(String[] args) 
    { 
        Pedido pedidoEspa�a = new PedidoEspa�a(); 
        pedidoEspa�a.setImporteSinIVA(10000); 
        pedidoEspa�a.calculaPrecioConIVA(); 
        pedidoEspa�a.visualiza(); 
 
 
        Pedido pedidoLuxemburgo = new PedidoLuxemburgo(); 
        pedidoLuxemburgo.setImporteSinIVA(10000); 
        pedidoLuxemburgo.calculaPrecioConIVA(); 
        pedidoLuxemburgo.visualiza(); 
    } 
}

