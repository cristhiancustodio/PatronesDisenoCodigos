public class PalabraClave extends Expresion 
{ 
    protected String palabraClave; 
 
    public PalabraClave(String palabraClave) 
    { 
        this.palabraClave = palabraClave; 
    } 
 
    public override boolean evalua(String descripcion) 
    { 
        return descripcion.indexOf(palabraClave) != -1; 
    } 
 
    // parte análisis sintáctico 
    public static new Expresion parsea() throws Exception 
    { 
        Expresion resultado; 
        resultado = new PalabraClave(pieza); 
        siguientePieza(); 
        return resultado; 
    } 
}
