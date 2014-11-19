package controller;

import model.Mexame_paciente;
import model.Mmedico;

public interface Iexame_paciente {
    void insert(Mexame_paciente obj);
    Mexame_paciente select(int id);
    void update(Mexame_paciente obj, int id);
    void delete(Mexame_paciente obj, int id);
}
