
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
import persistencia.locais.PersistenciaEndereco;
import persistencia.locais.PersistenciaEstado;
import persistencia.utilidade.ConexaoBD;


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


//    @Test
    public void testToString() {
        System.out.println("toString");
        Endereco instance = new Endereco();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }


//    @Test
    public void testGetId() {
        System.out.println("getId");
        Endereco instance = new Endereco();
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
        Endereco instance = new Endereco();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }


//    @Test
    public void testGetLogradouro() {
        System.out.println("getLogradouro");
        Endereco instance = new Endereco();
        String expResult = "";
        String result = instance.getLogradouro();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }


//    @Test
    public void testSetLogradouro() {
        System.out.println("setLogradouro");
        String logradouro = "";
        Endereco instance = new Endereco();
        instance.setLogradouro(logradouro);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }


//    @Test
    public void testGetEstado() {
        System.out.println("getEstado");
        Endereco instance = new Endereco();
        Estado expResult = null;
        Estado result = instance.getEstado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }


//    @Test
    public void testGetCidade() {
        System.out.println("getCidade");
        Endereco instance = new Endereco();
        Cidade expResult = null;
        Cidade result = instance.getCidade();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }


//    @Test
    public void testGetBairro() {
        System.out.println("getBairro");
        Endereco instance = new Endereco();
        Bairro expResult = null;
        Bairro result = instance.getBairro();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }


//    @Test
    public void testGetCep() {
        System.out.println("getCep");
        Endereco instance = new Endereco();
        String expResult = "";
        String result = instance.getCep();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }


//    @Test
    public void testSetCep() {
        System.out.println("setCep");
        String cep = "";
        Endereco instance = new Endereco();
        instance.setCep(cep);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }


//    @Test
    public void testGetComplemento() {
        System.out.println("getComplemento");
        Endereco instance = new Endereco();
        String expResult = "";
        String result = instance.getComplemento();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }


//    @Test
    public void testSetComplemento() {
        System.out.println("setComplemento");
        String complemento = "";
        Endereco instance = new Endereco();
        instance.setComplemento(complemento);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testInsertEndereco() throws SQLException, ClassNotFoundException{
        String logradouro = "Rua Sete de Setembro, 362";
        String complemento = new String();
        String cep = "29015-905";
        
        PersistenciaEndereco persistEndereco = new PersistenciaEndereco();
        PersistenciaEstado persistEstado = new PersistenciaEstado();
        PersistenciaCidade persistCidade = new PersistenciaCidade();
        PersistenciaBairro persistBairro = new PersistenciaBairro();
        
        ArrayList<Estado> listaEstados = persistEstado.recuperarEstados();
        ArrayList<Cidade> listaCidades = persistCidade.recuperarCidades(listaEstados.get(7));//7-ES
        //ArrayList<Bairro> listaBairros = persistBairro.recuperarBairros(listaCidades.get(0));//0-Vitória
        
        Endereco endereco = new Endereco();
        endereco.setLogradouro(logradouro);
        endereco.setCep(cep);
        endereco.setComplemento(complemento);
        endereco.setEstado(listaEstados.get(7));
        endereco.setCidade(listaCidades.get(0));
        //endereco.setBairro(listaBairros.get(3));//3-Centro
        
        persistEndereco.insertEndereco(endereco);
        //System.out.println(endereco.toString());
        
        assertNotEquals(null, endereco);
    }
    
}

