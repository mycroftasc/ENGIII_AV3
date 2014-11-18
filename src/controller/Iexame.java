/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import model.Mexame;

/**
 *
 * @author 631210019
 */
public interface Iexame {
    void insert(Mexame exame);
    Mexame select(int id);
    void update(Mexame exame);
    void delete(Mexame exame);
}
