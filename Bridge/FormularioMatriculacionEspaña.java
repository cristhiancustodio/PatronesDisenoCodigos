public class FormularioMatriculacionEspania extends 
  FormularioMatriculacion 
{ 
  public FormularioMatriculacionEspania(FormularioImpl implementacion)  
  {
    super(implementacion); 
  }
 
  protected boolean controlZona(String matricula) 
  { 
    return matricula.length() == 7; 
  } 
}
