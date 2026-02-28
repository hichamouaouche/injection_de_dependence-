package hiou.hicham.pres;

import hiou.hicham.dao.DaoImpl;
import hiou.hicham.metier.MetierImpl;

public class Pres1 {
    public static void main(String[] args){
        DaoImpl d = new DaoImpl();
        MetierImpl metier = new MetierImpl();
        metier.setDao(d);
        System.out.println("RES = "+metier.calcul());
    }
}
