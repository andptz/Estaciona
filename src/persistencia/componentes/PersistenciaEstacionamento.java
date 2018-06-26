/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia.componentes;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import modelo.componentes.Estacionamento;

import persistencia.utilidade.ConexaoBD;

/**
 *
 * @author Manel
 */
public class PersistenciaEstacionamento {
    
    
    
    Connection conexao = null;
   
    //Metodo que retorna um array com todas os estacionamento do banco de dados.
    public ArrayList recuperarEstacionamento() throws ClassNotFoundException, SQLException{
        
        ArrayList<Estacionamento> listaEstacionamento = new ArrayList<>();
        String sql;
        
        sql = String.format("SELECT id,nome,valorhora FROM estacionamento");
        
        conexao = ConexaoBD.conectar();
        Statement statement = conexao.createStatement();
         
        //exeucta a query no meu banco de dados
        ResultSet rs = statement.executeQuery(sql);
        
        while(rs.next()){
                Estacionamento est = new Estacionamento();
                est.setId(rs.getInt("id"));
                est.setNome(rs.getString("nome"));
                est.setValorHora(rs.getDouble("valorhora"));
               
                listaEstacionamento.add(est);
            }
        //fecha a conexao com o banco de dados
        statement.close();
        conexao.close();
        return listaEstacionamento;
    }
    
    
}
