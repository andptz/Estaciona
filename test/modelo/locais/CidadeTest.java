
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


public class CidadeTest {
    
    public CidadeTest() {
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


//    @Test
    public void testGetId() {
        System.out.println("getId");
        Cidade instance = new Cidade();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }


//    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Cidade instance = new Cidade();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNome method, of class Cidade.
     */
//    @Test
    public void testGetNome() {
        System.out.println("getNome");
        Cidade instance = new Cidade();
        String expResult = "";
        String result = instance.getNome();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }


//    @Test
    public void testSetNome() {
        System.out.println("setNome");
        String nome = "";
        Cidade instance = new Cidade();
        instance.setNome(nome);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }


//    @Test
    public void testGetEstado() {
        System.out.println("getEstado");
        Cidade instance = new Cidade();
        Estado expResult = null;
        Estado result = instance.getEstado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }


//    @Test
    public void testSetEstado() {
        System.out.println("setEstado");
        Estado estado = null;
        Cidade instance = new Cidade();
        instance.setEstado(estado);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }


//    @Test
    public void testGetLista_bairros() {
        System.out.println("getLista_bairros");
        Cidade instance = new Cidade();
        ArrayList<Bairro> expResult = null;
        ArrayList<Bairro> result = instance.getLista_bairros();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }


//    @Test
    public void testSetLista_bairros() {
        System.out.println("setLista_bairros");
        ArrayList<Bairro> lista_bairros = null;
        Cidade instance = new Cidade();
        instance.setLista_bairros(lista_bairros);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }


//    @Test
    public void testGetFK_ESTADO_id() {
        System.out.println("getFK_ESTADO_id");
        Cidade instance = new Cidade();
        int expResult = 0;
        int result = instance.getFK_ESTADO_id();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }


//    @Test
    public void testSetFK_ESTADO_id() {
        System.out.println("setFK_ESTADO_id");
        int FK_ESTADO_id = 0;
        Cidade instance = new Cidade();
        instance.setFK_ESTADO_id(FK_ESTADO_id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    @Test
    public void testRecuperarCidades() throws SQLException, ClassNotFoundException{
        PersistenciaEstado persistEstado = new PersistenciaEstado();
        PersistenciaCidade persistCidade = new PersistenciaCidade();
        
        ArrayList<Estado> listaEstados;
        ArrayList<Cidade> listaCidades;
        
        listaEstados = persistEstado.recuperarEstados();
        persistEstado.toString(listaEstados);
        
        Estado est = listaEstados.get(7);
        
        listaCidades = persistCidade.recuperarCidades(est);
        System.out.println(persistCidade.toString(listaCidades));
        
        assertNotEquals(null, listaEstados.size());
    }
    
}
