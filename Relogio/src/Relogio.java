public class Relogio {
    
    private int hora, minuto, segundo;

    public Relogio(int hora, int minuto, int segundo) {
        
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;



    }

    public Relogio() {

    }

    public void setHora(int hora){
        this.hora = hora;
    }

    public void setMinuto(int minuto){
        this.minuto = minuto;
    }
    
    public void setSegundo(int segundo){
        this.segundo = segundo;
    }
    
    
    public int getHora(){
        return hora;
    }

    public int getMinuto(){
        return minuto;
    }

    public int getSegundo(){
        return segundo;
    }
}
