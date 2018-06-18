/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia.componentes;

import java.sql.Connection;
import java.sql.ResultSet;
import persistencia.utilidade.ConexaoBD;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import modelo.componentes.Estacionamento;
import modelo.componentes.Veiculo;

public class PersistenciaVeiculo {
    Connection conexao = null;
    
    public void CriarVeiculo(Veiculo veiculo) throws SQLException{
        String sql;
         
        
        conexao = ConexaoBD.conectar();
        Statement statement = conexao.createStatement();
        
        sql = String.format("INSERT INTO veiculo (modelo,ano,placa,marca,id)"
        + "VALUES (%s, %d, %s, %s)", veiculo.getModelo(),veiculo.getAno(),veiculo.getPlaca(),veiculo.getMarca());
        statement.executeUpdate(sql);
        System.out.println("Novo veículo cadastrado!");
        
        statement.close();
        conexao.close();
         
    }
    
    //Metodo que retorna um array com todos os veiculos do banco de dados.
    public ArrayList recuperarVeiculos(Estacionamento estacionamento) throws ClassNotFoundException, SQLException{
        ArrayList<Veiculo> listaVeiculos = new ArrayList<>();
        String sql;
        
        sql = String.format("SELECT * FROM public.veiculo");
        
        conexao = ConexaoBD.conectar();
        Statement statement = conexao.createStatement();
         
        //exeucta a query no meu banco de dados
        ResultSet rs = statement.executeQuery(sql);
        
        while(rs.next()){
                Veiculo veiculo = new Veiculo();
                veiculo.setId(rs.getInt("ID"));
                veiculo.setPlaca(rs.getString("placa"));
                veiculo.setAno(rs.getInt("ano"));
                veiculo.setModelo(rs.getString("modelo"));
                veiculo.setMarca(rs.getString("Marca"));
                listaVeiculos.add(veiculo);
            }
        //fecha a conexao com o banco de dados
        statement.close();
        conexao.close();
        return listaVeiculos;
    }
    
    
}
