package hiou.hicham.pres;
import hiou.hicham.dao.DaoImpl;
import hiou.hicham.ext.DaoImplV2;
import hiou.hicham.metier.MetierImpl;

public class Pres1 {
    public static void main(String[] args){
        DaoImplV2 d = new DaoImplV2();
        MetierImpl metier = new MetierImpl(d);
        //metier.setDao(d); //injection des dependances
        System.out.println("RES = "+metier.calcul());
    }
}


