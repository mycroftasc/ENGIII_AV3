package controller;

import DB.connection;
import java.sql.Statement;
import model.Mpaciente;

public class Cpaciente implements Ipaciente {

    @Override
    public void insert(Mpaciente paciente) {
        try {
            connection con = new connection();
            Statement stm = con.connection();
            stm.executeUpdate("");
            con.fechaConexao();
        } catch (Exception e) {

        }
    }

    @Override
    public Mpaciente select(int id) {
        try {
            // TODO retornar o objeto com os dados do paciente buscado do banco
            return null;
        } catch (Exception e) {
            System.err.println(e.getMessage());
            return null;
        }
    }

    @Override
    public void update(Mpaciente paciente) {
        try {
            connection con = new connection();
            Statement stm = con.connection();
            stm.executeUpdate("");
            con.fechaConexao();
        } catch (Exception e) {

        }
    }

    @Override
    public void delete(Mpaciente paciente) {
        try {
            connection con = new connection();
            Statement stm = con.connection();
            stm.executeUpdate("");
            con.fechaConexao();
        } catch (Exception e) {

        }
    }
}
