package controller;

import DB.connection;
import java.sql.Statement;

public class Cexame implements Imed {

    @Override
    public void insert(Object exame) {
        try {
            connection con = new connection();
            Statement stm = con.criaConexao();
            stm.executeUpdate("");
            con.fechaConexao();
        } catch (Exception e) {

        }
    }

    @Override
    public Object select(int id) {
        try {
            // TODO retornar o objeto com os dados do paciente buscado do banco
            return null;
        } catch (Exception e) {
            return e.getMessage();
        }
    }

    @Override
    public void update(Object exame) {
        try {
            connection con = new connection();
            Statement stm = con.criaConexao();
            stm.executeUpdate("");
            con.fechaConexao();
        } catch (Exception e) {

        }
    }

    @Override
    public void delete(Object exame) {
        try {
            connection con = new connection();
            Statement stm = con.criaConexao();
            stm.executeUpdate("");
            con.fechaConexao();
        } catch (Exception e) {

        }
    }
}
