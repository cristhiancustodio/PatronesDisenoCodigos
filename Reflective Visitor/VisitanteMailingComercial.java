public class VisitanteMailingComercial extends Visitante 
    implements VisitanteEmpresa
{ 
    public void visita(EmpresaSinFilial empresa) 
    { 
        System.out.println("Envía un correo a " + empresa.getNombre() 
         + " dirección: " + empresa.getEmail() 
         + " Propuesta comercial para su empresa"); 
    } 
 
    public void visita(EmpresaMadre empresa) 
    { 
        System.out.println("Envía un correo a " + empresa.getNombre() 
         + " dirección: " + empresa.getEmail() 
         + " Propuesta comercial para su grupo"); 
        System.out.println("Impresión de un correo para " 
         + empresa.getNombre() + " dirección: " 
         + empresa.getDireccion() 
         + " Propuesta comercial para su grupo"); 
        for (Empresa: empresa.getFiliales()) 
            this.iniciaVisita(filial); 
    } 
}
