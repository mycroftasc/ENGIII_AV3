package controller;

public class Cmedico implements Imed{

    @Override
    public void insert(Object medico) {
        try {
            // TODO dar insert no banco com o objeto medico que esta em parametro
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
            // TODO dar insert no banco com o objeto medico que esta em parametro
        } catch (Exception e) {
            
        }
    }

    @Override
    public void delete(Object medico) {
        try {
            // TODO dar insert no banco com o objeto medico que esta em parametro
        } catch (Exception e) {
            
        }
    }
    
}
