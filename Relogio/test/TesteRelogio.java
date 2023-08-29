import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TesteRelogio {
    
    @Test
    public void teste() {
        
        

        

        Relogio relogio1 = new Relogio(10, 15, 5);

        int hora = relogio1.getHora();
        int minuto = relogio1.getMinuto();
        int segundo = relogio1.getSegundo();

        assertEquals(10, hora);
        assertEquals(15, minuto);
        assertEquals(5, segundo);
        

    }

}
