/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia.operacoes;

import java.sql.Connection;
import java.sql.ResultSet;
import persistencia.utilidade.ConexaoBD;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import modelo.componentes.Vaga;
import modelo.componentes.Veiculo;
import modelo.operacoes.Reserva;
import modelo.operadores.Motorista;

public class PersistenciaReserva {
    Connection conexao = null;
    private Motorista motorista;
    private Vaga vaga;
    private Veiculo veiculo;
    
    public void CriarReserva(Reserva reserva) throws SQLException{
        String sql;
         
        
        conexao = ConexaoBD.conectar();
        Statement statement = conexao.createStatement();
        
        sql = String.format("INSERT INTO reserva (horaReserva, dataReserva, horaSaida, fk_veiculo_id, fk_vaga_id, fk_motorista_fk_pessoa_fisica_fk_pessoa_id)"
        + "VALUES (%s, %s, %s, %d, %d, %d)",reserva.getHoraReserva(),reserva.getHoraReserva(),reserva.getHoraSaida(),reserva.getVeiculo().getId(),reserva.getVaga().getId(),reserva.getMotorista().getId_pessoa() );
        statement.executeUpdate(sql);
        System.out.println("Nova reserva cadastrada!");
        
        statement.close();
        conexao.close();
         
    }
    
    //Recebe o motorista e recupera a reserva
    public ArrayList recuperarReserva(Motorista motorista) throws ClassNotFoundException, SQLException{
        ArrayList<Reserva> listaReservas = new ArrayList<>();
        String sql;
        
        sql = String.format("SELECT * FROM reserva R WHERE R.fk_motorista_fk_pessoa_fisica_fk_pessoa_id = %d;", motorista.getId_pessoa());
        
        conexao = ConexaoBD.conectar();
        Statement statement = conexao.createStatement();
         
        //exeucta a query no meu banco de dados
        ResultSet rs = statement.executeQuery(sql);
        
        while(rs.next()){
                Reserva reserva = new Reserva();
                reserva.setId(rs.getInt("ID"));
                reserva.setHoraReserva(rs.getString("Hora Reserva"));
                reserva.setHoraSaida(rs.getString("Hora Saida"));
                reserva.setDataReserva(rs.getString("Data Reserva"));
                
                listaReservas.add(reserva);
                
            }
        //fecha a conexao com o banco de dados
        statement.close();
        conexao.close();
        return listaReservas;
    }
    
    public ArrayList recuperarReserva2(Motorista motorista,Veiculo veiculo) throws ClassNotFoundException, SQLException{
        ArrayList<Reserva> listaReservas = new ArrayList<>();
        String sql;
        
        sql = String.format("SELECT * FROM reserva R WHERE R.fk_motorista_fk_pessoa_fisica_fk_pessoa_id = %d AND WHERE R.fk_veiculo_id = %d;", motorista.getId_pessoa(),veiculo.getId());
        
        conexao = ConexaoBD.conectar();
        Statement statement = conexao.createStatement();
         
        //exeucta a query no meu banco de dados
        ResultSet rs = statement.executeQuery(sql);
        
        while(rs.next()){
                Reserva reserva = new Reserva();
                reserva.setId(rs.getInt("ID"));
                reserva.setHoraReserva(rs.getString("Hora Reserva"));
                reserva.setHoraSaida(rs.getString("Hora Saida"));
                reserva.setDataReserva(rs.getString("Data Reserva"));
                
                listaReservas.add(reserva);
                
            }
        //fecha a conexao com o banco de dados
        statement.close();
        conexao.close();
        return listaReservas;
    }
    
    
}

