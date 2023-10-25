/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import dao.IDao;
import entities.Salle;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import service.SalleService;

/**
 *
 * @author Lachgar
 */
public class Test {

    public static void main(String[] args) {
        try {
            IDao<Salle> dao = new SalleService();
            dao.create(new Salle("ER44"));
            for (Salle s : dao.findAll()) {
                System.out.println(s);
            }
        } catch (RemoteException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
