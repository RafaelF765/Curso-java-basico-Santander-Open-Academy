public class ContaTerminal {
    int numero;
    String agencia;
    String nomeCliente;
    double saldo;

    ContaTerminal(int numero, String agencia, String nomeCliente, double saldo){
        this.numero = numero;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

    public void apresentarDados(){
        String menssage1 =  "Olá,"+ this.nomeCliente +", obrigado por criar uma conta em nosso banco."; 
        String menssage2 = "Sua Agência é "+this.agencia+", conta "+ this.numero+" e seu saldo de R$"+this.saldo+", já está disponível para saque.";
        System.out.println(menssage1.concat(menssage2));
    }
}
