import java.util.*; 
public class MensajeGeneral extends MensajeAbstracto 
{ 
    protected List<String> contenido; 

    public List<String> getContenido()
    {
      return contenido;
    } 
 
    public MensajeGeneral(IList<String> contenido) 
    { 
        super.contenido();
        this.contenido = contenido; 
    } 
} 
 
