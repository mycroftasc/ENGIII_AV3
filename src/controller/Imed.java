package controller;

import model.Mmedico;

public interface Imed {
    void insert(Mmedico obj);
    Mmedico select(int id);
    void update(Mmedico obj, int id);
    void delete(Mmedico obj, int id);
}
