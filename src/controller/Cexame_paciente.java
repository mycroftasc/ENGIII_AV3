package controller;

import DB.Conexao;
import java.sql.ResultSet;
import java.sql.Statement;
import model.Mexame_paciente;
import model.Mpaciente;

public class Cexame_paciente implements Iexame_paciente {

    @Override
    public void insert(Mexame_paciente paciente) {
        try {
            Conexao con = new Conexao();
            Statement stm = con.connection();
            stm.executeUpdate("INSERT INTO exame_paciente (codmedico,codpaciente, codexame, dtexame, qtdexame, valorexame)\n" +
"VALUES ('','','','')");
            con.fechaConexao();
        } catch (Exception e) {

        }
    }

    @Override
    public Mexame_paciente select(int id) {
        try {
         return null;
        } catch (Exception e) {
            System.err.println(e.getMessage());
            return null;
        }
    }

    @Override
    public void update(Mexame_paciente paciente, int id) {
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
    public void delete(Mexame_paciente paciente, int id) {
        try {
            Conexao con = new Conexao();
            Statement stm = con.connection();
            stm.executeUpdate("DELETE FROM paciente WHERE codpaciente = ...;");
            con.fechaConexao();
        } catch (Exception e) {

        }
    }
}
