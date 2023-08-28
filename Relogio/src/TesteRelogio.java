import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TesteRelogio {
    
    @Test
    public void teste() {
        

        relogio1 = new Relogio(10, 15, 5);
        
        
        relogio1.hora.assertEquals(10);
        relogio1.minuto.assertEquals(15);
        relogio1.segundo.assertEquals(5);
        
    }

}
