import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TesteRelogio {
    
    @Test
    public void teste() {
        

        relogio1 = new Relogio(10, 15, 5);

        if (relogio1.hora.assertEquals(10) == false || relogio1.minuto.assertEquals(15) == false || relogio1.segundo.assertEquals(5) == false) {
            System.out.println("Teste falho. O relogio foi criado errado/nao foi criado.");
        }

    }

}
