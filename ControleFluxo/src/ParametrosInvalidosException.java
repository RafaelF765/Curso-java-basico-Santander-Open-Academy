

public class ParametrosInvalidosException extends Exception {
    private int segundoParametro;

    public ParametrosInvalidosException(int segundoParametro){
        this.segundoParametro = segundoParametro;
    }
    
    public String getMessage(){
        return "O valor do segundo parametro precisa ser maior que o primeiro";
    }
}
