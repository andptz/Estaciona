
package andreangelo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class EnderecoTest {
    
    public EnderecoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of toString method, of class Endereco.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Endereco instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEstado method, of class Endereco.
     */
    @Test
    public void testGetEstado() {
        System.out.println("getEstado");
        Endereco instance = null;
        Estado expResult = null;
        Estado result = instance.getEstado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCidade method, of class Endereco.
     */
    @Test
    public void testGetCidade() {
        System.out.println("getCidade");
        Endereco instance = null;
        Cidade expResult = null;
        Cidade result = instance.getCidade();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBairro method, of class Endereco.
     */
    @Test
    public void testGetBairro() {
        System.out.println("getBairro");
        Endereco instance = null;
        Bairro expResult = null;
        Bairro result = instance.getBairro();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCep method, of class Endereco.
     */
    @Test
    public void testGetCep() {
        System.out.println("getCep");
        Endereco instance = null;
        String expResult = "";
        String result = instance.getCep();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCep method, of class Endereco.
     */
    @Test
    public void testSetCep() {
        System.out.println("setCep");
        String cep = "";
        Endereco instance = null;
        instance.setCep(cep);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRua method, of class Endereco.
     */
    @Test
    public void testGetRua() {
        System.out.println("getRua");
        Endereco instance = null;
        String expResult = "";
        String result = instance.getRua();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRua method, of class Endereco.
     */
    @Test
    public void testSetRua() {
        System.out.println("setRua");
        String rua = "";
        Endereco instance = null;
        instance.setRua(rua);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getComplemento method, of class Endereco.
     */
    @Test
    public void testGetComplemento() {
        System.out.println("getComplemento");
        Endereco instance = null;
        String expResult = "";
        String result = instance.getComplemento();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setComplemento method, of class Endereco.
     */
    @Test
    public void testSetComplemento() {
        System.out.println("setComplemento");
        String complemento = "";
        Endereco instance = null;
        instance.setComplemento(complemento);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
