
package modelo.locais;

import java.sql.SQLException;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import persistencia.locais.PersistenciaBairro;
import persistencia.locais.PersistenciaCidade;
import persistencia.locais.PersistenciaEstado;


public class BairroTest {
    
    public BairroTest() {
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
        Bairro instance = new Bairro();
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
        Bairro instance = new Bairro();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }


//    @Test
    public void testGetNome() {
        System.out.println("getNome");
        Bairro instance = new Bairro();
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
        Bairro instance = new Bairro();
        instance.setNome(nome);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }


//    @Test
    public void testGetCidade() {
        System.out.println("getCidade");
        Bairro instance = new Bairro();
        Cidade expResult = null;
        Cidade result = instance.getCidade();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }


//    @Test
    public void testSetCidade() {
        System.out.println("setCidade");
        Cidade cidade = null;
        Bairro instance = new Bairro();
        instance.setCidade(cidade);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }


//    @Test
    public void testGetFK_CIDADE_id() {
        System.out.println("getFK_CIDADE_id");
        Bairro instance = new Bairro();
        int expResult = 0;
        int result = instance.getFK_CIDADE_id();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }


//    @Test
    public void testSetFK_CIDADE_id() {
        System.out.println("setFK_CIDADE_id");
        int FK_CIDADE_id = 0;
        Bairro instance = new Bairro();
        instance.setFK_CIDADE_id(FK_CIDADE_id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    @Test
    public void testRecuperarBairros() throws ClassNotFoundException, SQLException {
        PersistenciaBairro persistBairro = new PersistenciaBairro();
        PersistenciaCidade persistCidade = new PersistenciaCidade();
        PersistenciaEstado persistEstado = new PersistenciaEstado();
        
        ArrayList<Estado> listaEstados = persistEstado.recuperarEstados();
        ArrayList<Cidade> listaCidades = persistCidade.recuperarCidades(listaEstados.get(7));
        ArrayList<Bairro> listaBairros = persistBairro.recuperarBairros(listaCidades.get(0));
        
        System.out.println(persistBairro.toString(listaBairros));
        
        assertNotEquals(null, listaBairros.size());
    }
    
}
