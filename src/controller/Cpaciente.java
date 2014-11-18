package controller;

import DB.Conexao;
import java.sql.ResultSet;
import java.sql.Statement;
import model.Mmedico;
import model.Mpaciente;

public class Cpaciente implements Ipaciente {

    @Override
    public void insert(Mpaciente paciente) {
        try {
            Conexao con = new Conexao();
            Statement stm = con.connection();
            stm.executeUpdate("INSERT INTO paciente (cpf,nome, endereco, cidade, uf, dtnascto, peso, altura)\n" +
"VALUES ('','','','','','',);");
            con.fechaConexao();
        } catch (Exception e) {

        }
    }

    @Override
    public Mpaciente select(int id) {
        try {
            Conexao con = new Conexao();
            Statement stm = con.connection();
            ResultSet rs =  stm.executeQuery("SELECT * FROM paciente");
            Mpaciente pac = new Mpaciente();
            while (rs.next()) {                
                pac.setNome(rs.getString("nome"));
                pac.setCpf(rs.getString("cpf"));
                pac.setEndereco(rs.getString("endereco"));
                pac.setCidade(rs.getString("cidade"));
                pac.setUf(rs.getString("uf"));
                pac.setDtNascimento(rs.getString("dtnascimento"));
                pac.setPeso(rs.getDouble("peso"));
                pac.setAltura(rs.getDouble("altura"));
            }
            con.fechaConexao();
            return pac;
        } catch (Exception e) {
            System.err.println(e.getMessage());
            return null;
        }
    }

    @Override
    public void update(Mpaciente paciente, int id) {
        try {
            Conexao con = new Conexao();
            Statement stm = con.connection();
            stm.executeUpdate("UPDATE paciente SET cpf = '', nome = '', endereco = '', cidade = ''"
                    + "uf = '', peso = , altura =  WHERE codpaciente = ...;");
            con.fechaConexao();
        } catch (Exception e) {

        }
    }

    @Override
    public void delete(Mpaciente paciente, int id) {
        try {
            Conexao con = new Conexao();
            Statement stm = con.connection();
            stm.executeUpdate("DELETE FROM paciente WHERE codpaciente = ...;");
            con.fechaConexao();
        } catch (Exception e) {

        }
    }
}
