public class SmartTv {
    boolean ligada = false;
    int     canal = 1;
    int     volume = 0;

    public void ligar(){
        this.ligada = true;
        this.status();
    }

    public int escolherCanal(int canal){
        return this.canal = canal;
    }

    public void proximoCanal(){
        if(this.ligada == false){
            this.status();
        }else{
            this.canal = this.canal + 1;
            System.out.println("canal: "+ this.canal);
        }
    }
    public void voltarCanal(){
        if(this.ligada == false){
            this.status();
        }else if(this.canal < 0){
            System.out.println("Canal Inválido!");
        }else{
            this.canal = this.canal - 1;
            System.out.println("Canal: "+ this.canal);
        }
    }
    public void aumentarVolume(){
        if(this.volume < 100){
            this.volume = this.volume +1;
            System.out.println("Volume + "+this.volume);
        }
    }

    public void diminuirVolume(){
        if(this.volume >= 0){
            this.volume = -1;
            System.out.println("Volume -"+this.volume);
        }
    }

    public void status() {
        if(this.ligada == true){
            System.out.println("_____________________");
            System.out.println("A Tv está: Ligada!");
            System.out.println("Canal: "+ this.canal);
            System.out.println("Volume: "+ this.volume);
            System.out.println("_____________________");
        }else{
            System.out.println("A Tv está: Desligada!");
        }
    }
}
