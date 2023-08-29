public class Relogio {
    
    private int hora, minuto, segundo;

    public Relogio(int hora, int minuto, int segundo) {
        
        if( hora>=24 || minuto>=60 || segundo>=60 || hora<0 || minuto<0 || segundo<0) {
            
            this.hora = 0;
            this.minuto = 0;
            this.segundo = 0;
            
        }

        else

        this.hora = hora;   
        this.minuto = minuto;
        this.segundo = segundo;

    }

    public Relogio() {

    }

    public void reiniciaRelogio() {

        this.hora = 0;
        this.minuto = 0;
        this.segundo = 0;

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
