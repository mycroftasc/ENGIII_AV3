package controller;

import DB.connection;
import java.sql.Statement;
import model.Mmedico;

public class Cmedico implements Imed {

    @Override
    public void insert(Mmedico medico) {
        try {
            connection con = new connection();
            Statement stm = con.connection();
            stm.executeUpdate("");
            con.fechaConexao();
        } catch (Exception e) {

        }
    }

    @Override
    public Mmedico select(int id) {
        try {
            // TODO retornar o objeto com os dados do paciente buscado do banco
            return null;
        } catch (Exception e) {
             System.out.println(e.getMessage());
             return null;
        }
    }

    @Override
    public void update(Mmedico medico) {
        try {
            connection con = new connection();
            Statement stm = con.connection();
            stm.executeUpdate("");
            con.fechaConexao();
        } catch (Exception e) {

        }
    }

    @Override
    public void delete(Mmedico medico) {
        try {
            connection con = new connection();
            Statement stm = con.connection();
            stm.executeUpdate("");
            con.fechaConexao();
        } catch (Exception e) {

        }
    }
}
