
package controller;

public class Cexame implements Imed{

    @Override
    public void insert(Object exame) {
        try {
            // TODO dar insert no banco com o objeto exame que esta em parametro
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
            // TODO dar insert no banco com o objeto exame que esta em parametro
        } catch (Exception e) {
            
        }
    }

    @Override
    public void delete(Object exame) {
        try {
            // TODO dar insert no banco com o objeto exame que esta em parametro
        } catch (Exception e) {
            
        }
    }
    
}
