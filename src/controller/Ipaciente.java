/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import model.Mpaciente;

/**
 *
 * @author 631210019
 */
public interface Ipaciente {
    void insert(Mpaciente obj);
    Mpaciente select(int id);
    void update(Mpaciente obj, int id);
    void delete(Mpaciente obj, int id);
}
