package hiou.hicham.metier;

import hiou.hicham.dao.IDao;

public class IMetierImpl implements IMetier {
    private IDao dao; //couplage faible(depend une interface mais no class

    /**
     * pour injecter dans l'attrubut dao
     * un objet d'une classe qui implemente l'interface IDO
     * au moment de l'instantiation
     */

    public IMetierImpl(IDao dao) {
        this.dao = dao;
    }

    public IMetierImpl() {
    }

    @Override
    public double calcul() {
        double t = dao.getData();
        double res = t * 12 *Math.PI/2 *Math.cos(t);
        return res;
    }

    /**
     *
     * pour injecter dans l'attribut dao
     * un objet d'une class qui implement interface IDO
     */
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
