package presentation;

import dao.IDao;
import ext.DaoImpl2;
import metier.MetierImpl;

public class Presenation1 {

    public static void main(String[] args) {
        /*
            Injec des depen par insta static => new
        */
        IDao iDao = new DaoImpl2();
        MetierImpl iMetier = new MetierImpl();
        //iMetier.setDao(iDao);
        System.out.println(iMetier.getCalcul());
    }
}
