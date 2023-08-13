public class VisitanteMailingComercial implements Visitante 
{ 
    public void visita(EmpresaSinFilial empresa) 
    { 
        System.out.println("Env�a un email a " + 
          empresa.getNombre() + " direcci�n: " + empresa.getEmail() 
          + " Propuesta comercial para su empresa"); 
    } 
 
    public void visita(EmpresaMadre empresa) 
    { 
        System.out.println("Env�a un email a " + 
          empresa.getNombre() + " direcci�n: " + empresa.getEmail() 
          + " Propuesta comercial para su grupo"); 
        System.out.println("Impresi�n de un correo para " + 
          empresa.getNombre() + " direcci�n: " + 
          empresa.getDireccion() + 
          " Propuesta comercial para su grupo"); 
    } 
}
