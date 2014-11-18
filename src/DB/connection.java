package DB;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public class connection {

    private Connection con;
    private Statement stm;

    public void criaConexao() throws Exception {
        String url = "jdbc:postgresql://localhost:5432/SenacMed";
        String usuario = "postgres";
        String senha = "root";

        Class.forName("org.postgresql.Driver");

        this.con = DriverManager.getConnection(url, usuario, senha);

        this.stm = con.createStatement();
    }

    public void fechaConexao() throws Exception {
        this.con.close();
    }
    
    public Statement connection() throws Exception{
       
        if(this.stm == null){
            criaConexao();
        }
        
        return this.stm;
    }
}
