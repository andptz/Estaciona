
package modelo.locais;

import java.sql.SQLException;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import persistencia.locais.PersistenciaCidade;
import persistencia.locais.PersistenciaEstado;


public class EstadoTest {
    
    public EstadoTest() {
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
     * Test of getId method, of class Estado.
     */
    //@Test
    public void testGetId() {
        System.out.println("getId");
        Estado instance = new Estado();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Estado.
     */
   // @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Estado instance = new Estado();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNome method, of class Estado.
     */
    //@Test
    public void testGetNome() {
        System.out.println("getNome");
        Estado instance = new Estado();
        String expResult = "";
        String result = instance.getNome();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNome method, of class Estado.
     */
   // @Test
    public void testSetNome() {
        System.out.println("setNome");
        String nome = "";
        Estado instance = new Estado();
        instance.setNome(nome);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLista_cidades method, of class Estado.
     */
   // @Test
    public void testGetLista_cidades() {
        System.out.println("getLista_cidades");
        Estado instance = new Estado();
        ArrayList<Cidade> expResult = null;
        ArrayList<Cidade> result = instance.getLista_cidades();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLista_cidades method, of class Estado.
     */
   // @Test
    public void testSetLista_cidades() {
        System.out.println("setLista_cidades");
        ArrayList<Cidade> lista_cidades = null;
        Estado instance = new Estado();
        instance.setLista_cidades(lista_cidades);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    @Test
    public void recuperarEstados() throws ClassNotFoundException, SQLException {
        PersistenciaEstado persistencia = new PersistenciaEstado();
        ArrayList<Estado> listaEstados;
                
        listaEstados = persistencia.recuperarEstados();
        //System.out.println(persistencia.toString(listaEstados));
        
        //assertNotEquals(null, listaEstados);
        //assertEquals("", listaEstados.get(0).getNome());
        //Verifica se há 27 registros (estados) no array.
        assertEquals(27, listaEstados.size());
    }
}
