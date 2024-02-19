package metier;

import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("metier")
public class MetierImpl implements IMetier {

    @Qualifier("dao")// càd injecter moi l'injection qui s'appele dao : càd je pense injecter dao ou bine dao2 ..
    private IDao iDao;


    @Override
    public double getCalcul() {
       double tmp = iDao.getData();
       double res = tmp*400/(Math.tan(tmp));
        return res;
    }
    // injecter dans la variable DAO un obj d'une calsse qui imple IDAO
    public void setDao(IDao iDao) {
        this.iDao = iDao;
    }
}
