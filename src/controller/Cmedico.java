package controller;

import DB.connection;
import java.sql.Statement;

public class Cmedico implements Imed {

    @Override
    public void insert(Object medico) {
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
    public void update(Object medico) {
        try {
            connection con = new connection();
            Statement stm = con.criaConexao();
            stm.executeUpdate("");
            con.fechaConexao();
        } catch (Exception e) {

        }
    }

    @Override
    public void delete(Object medico) {
        try {
            connection con = new connection();
            Statement stm = con.criaConexao();
            stm.executeUpdate("");
            con.fechaConexao();
        } catch (Exception e) {

        }
    }
}
