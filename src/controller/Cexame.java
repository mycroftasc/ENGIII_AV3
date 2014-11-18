package controller;

import DB.connection;
import java.sql.Statement;
import model.Mexame;

public class Cexame implements Iexame {

    @Override
    public void insert(Mexame exame) {
        try {
            connection con = new connection();
            Statement stm = con.connection();
            stm.executeUpdate("");
            con.fechaConexao();
        } catch (Exception e) {

        }
    }

    @Override
    public Mexame select(int id) {
        try {
            // TODO retornar o objeto com os dados do paciente buscado do banco
            return null;
        } catch (Exception e) {
            System.err.println(e.getMessage());
           
            return null;
        }
    }

    @Override
    public void update(Mexame exame) {
        try {
            connection con = new connection();
            Statement stm = con.connection();
            stm.executeUpdate("");
            con.fechaConexao();
        } catch (Exception e) {

        }
    }

    @Override
    public void delete(Mexame exame) {
        try {
            connection con = new connection();
            Statement stm = con.connection();
            stm.executeUpdate("");
            con.fechaConexao();
        } catch (Exception e) {

        }
    }
}
