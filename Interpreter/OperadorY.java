public class OperadorY extends OperadorBinario 
{ 
    public OperadorY(Expresion operandoIzquierdo, 
        Expresion operandoDerecho) 
    {
        super(operandoIzquierdo, operandoDerecho);
    } 
 
    public boolean evalua(String descripcion) 
    { 
        return operandoIzquierdo.evalua(descripcion) && 
            operandoDerecho.evalua(descripcion); 
    } 
 
    // parte análisis sintáctico 
    public static Expresion parsea() throws Exception 
    { 
        Expresion resultadoIzquierdo, resultadoDerecho; 
        resultadoIzquierdo = Expresion.parsea(); 
        while ((pieza != null) && (pieza.equals("y"))) 
        { 
           siguientePieza(); 
           resultadoDerecho = Expresion.parsea(); 
           resultadoIzquierdo = new OperadorY(resultadoIzquierdo,
              resultadoDerecho); 
        } 
        return resultadoIzquierdo; 
    } 
}
