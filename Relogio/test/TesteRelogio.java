import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TesteRelogio {
    
    @Test
    public void testeCriacaoRelogio() {
        
        

        

        Relogio relogio1 = new Relogio(10, 15, 5);

        int hora = relogio1.getHora();
        int minuto = relogio1.getMinuto();
        int segundo = relogio1.getSegundo();

        assertEquals(10, hora);
        assertEquals(15, minuto);
        assertEquals(5, segundo);
        

        
    }
        
    @Test
    public void testeReiniciaRelogio() {

        Relogio relogio2 = new Relogio(10, 15, 5);

        relogio2.reiniciaRelogio();

        int hora = relogio2.getHora();
        int minuto = relogio2.getMinuto();
        int segundo = relogio2.getSegundo();

        assertEquals(0, hora);
        assertEquals(0, minuto);
        assertEquals(0, segundo);

    }
    

}
