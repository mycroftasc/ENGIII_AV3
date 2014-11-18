package controller;

import DB.Conexao;
import java.sql.ResultSet;
import java.sql.Statement;
import model.Mmedico;

public class Cmedico implements Imed {

    @Override
    public void insert(Mmedico medico) {
        try {
            Conexao con = new Conexao();
            Statement stm = con.connection();
            stm.executeUpdate("INSERT INTO medico (nome, crm, endereco, cidade, uf, telefone, email)\n" +
"VALUES ('"+ medico.getNome() +"','"+ medico.getCrm() +"','"+ medico.getEndereco() +"','"+ medico.getCidade() +"'"
                    + ",'"+ medico.getUf() +"','"+ medico.getTelefone() +"','"+ medico.getEmail() +"');");
            con.fechaConexao();
        } catch (Exception e) {

        }
    }

    @Override
    public Mmedico select(int id) {
        try {
            Conexao con = new Conexao();
            Statement stm = con.connection();
            ResultSet rs =  stm.executeQuery("SELECT * FROM medico WHERE codmedico ="+ id +"");
            Mmedico med = new Mmedico();
            while (rs.next()) {                
                med.setNome(rs.getString("nome"));
                med.setCrm(rs.getString("crm"));
                med.setEndereco(rs.getString("endereco"));
                med.setCidade(rs.getString("cidade"));
                med.setUf(rs.getString("uf"));
                med.setTelefone(rs.getString("telefone"));
                med.setEmail(rs.getString("email"));
            }
            con.fechaConexao();
            return med;
            
        } catch (Exception e) {
             System.out.println(e.getMessage());
             return null;
        }
    }

    @Override
    public void update(Mmedico medico, int id) {
        try {
            Conexao con = new Conexao();
            Statement stm = con.connection();
            stm.executeUpdate("UPDATE medico SET nome = '"+medico.getNome()+"', crm = '"+medico.getCrm()+"',"
                    + " endereco = '"+medico.getEndereco()+"', cidade = '"+medico.getCidade()+"'"
                    + " uf = '"+medico.getUf()+"', telefone = '"+medico.getTelefone()+"', email = '"+medico.getEmail()+"'"
                    + " WHERE codmedico = "+ id +";");
            con.fechaConexao();
        } catch (Exception e) {

        }
    }

    @Override
    public void delete(Mmedico medico, int id) {
        try {
            Conexao con = new Conexao();
            Statement stm = con.connection();
            stm.executeUpdate("DELETE FROM medico WHERE codmedico = "+ id  +";");
            con.fechaConexao();
        } catch (Exception e) {

        }
    }
}
