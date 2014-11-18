package controller;

import model.Mmedico;

public interface Imed {
    void insert(Mmedico obj);
    Mmedico select(int id);
    void update(Mmedico obj);
    void delete(Mmedico obj);
}
