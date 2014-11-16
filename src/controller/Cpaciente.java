package controller;

public class Cpaciente implements Imed{
    @Override
    public void insert(Object paciente) {
        try {
            // TODO dar insert no banco com o objeto paciente que esta em parametro
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
    public void update(Object paciente) {
        try {
            // TODO dar update no banco com o objeto paciente que esta em parametro
        } catch (Exception e) {
            
        }
    }

    @Override
    public void delete(Object paciente) {
        try {
            // TODO dar delete no banco com o objeto paciente que esta em parametro
        } catch (Exception e) {
            
        }
    }
}
