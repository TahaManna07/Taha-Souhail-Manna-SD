package ext;

import dao.IDao;

public class DAOImplVWS implements IDao {
    @Override
    public double getData() {
        System.out.println("Version Web Service ");
        return 26;
    }
}
