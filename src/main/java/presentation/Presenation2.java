package presentation;

import dao.IDao;
import metier.IMetier;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Presenation2 {
    public static void main(String[] args) throws Exception {
        /*
            Injec des depen par insta dynamic
        */
        Scanner scanner = new Scanner(new File("config.txt"));
        String daoClassName = scanner.nextLine();
        Class cDao = Class.forName(daoClassName);
        IDao dao =(IDao) cDao.newInstance();
        System.out.println(dao.getData());

        String metierClassName = scanner.nextLine();
        Class cMetier = Class.forName(metierClassName);
        IMetier metier = (IMetier) cMetier.newInstance();

        Method method = cMetier.getMethod("setDao",IDao.class);// le type de retourne
        //l'éxécution du méthode d'un obj de type metier et trans en para dao
        method.invoke(metier , dao);
        System.out.println("result => "+metier.getCalcul());



    }
}
