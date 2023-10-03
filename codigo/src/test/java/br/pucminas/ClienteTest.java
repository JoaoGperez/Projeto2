import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class ClienteTest {

    private Cliente cliente;

    @Before
    public void setUp() {
        cliente = new Cliente(123456789, "João");
    }

    @Test
    public void testGetCpf() {
        assertEquals(123456789, cliente.getCpf());
    }

    @Test
    public void testSetCpf() {
        cliente.setCpf(987654321);
        assertEquals(987654321, cliente.getCpf());
    }

    @Test  
    public void testGetNome() {
        assertEquals("João", cliente.getNome());
    }

    @Test
    public void testSetNome() {
        cliente.setNome("Maria");
        assertEquals("Maria", cliente.getNome());
    }
}
