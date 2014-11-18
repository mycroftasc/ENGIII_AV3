package controller;

import DB.Conexao;
import java.sql.ResultSet;
import java.sql.Statement;
import model.Mexame;
import model.Mpaciente;

public class Cexame implements Iexame {

    @Override
    public void insert(Mexame exame) {
        try {
            Conexao con = new Conexao();
            Statement stm = con.connection();
            stm.executeUpdate("INSERT INTO exame (descexame, valorunit)\n" +
"VALUES ('',);");
            con.fechaConexao();
        } catch (Exception e) {

        }
    }

    @Override
    public Mexame select(int id) {
        try {
            Conexao con = new Conexao();
            Statement stm = con.connection();
            ResultSet rs =  stm.executeQuery("SELECT * FROM exame");
            Mexame exam = new Mexame();
            while (rs.next()) {                
                exam.setDescExame(rs.getString("descexame"));
                exam.setValorUnit(rs.getDouble("valorunit"));
            }
            con.fechaConexao();
            return exam;
        } catch (Exception e) {
            System.err.println(e.getMessage());
           
            return null;
        }
    }

    @Override
    public void update(Mexame exame) {
        try {
            Conexao con = new Conexao();
            Statement stm = con.connection();
            stm.executeUpdate("UPDATE exame SET descexame = '', valorunit =  WHERE codexame = ;");
            con.fechaConexao();
        } catch (Exception e) {

        }
    }

    @Override
    public void delete(Mexame exame) {
        try {
            Conexao con = new Conexao();
            Statement stm = con.connection();
            stm.executeUpdate("DELETE FROM exame WHERE codexame = ;");
            con.fechaConexao();
        } catch (Exception e) {

        }
    }
}
