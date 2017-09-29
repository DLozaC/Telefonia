package mx.edu.utng.dloza.telefoniaestrategy;

/**
 * Created by Daniel on 14/09/2017.
 */

public class Contexto {
    private Telefonica strategy;

    public Contexto(Telefonica stratetgy){
        this.strategy= stratetgy;
    }

    public  double calcularTarifaLocal(int minLocal){
        return strategy.calcularTarifaLocal(minLocal);
    }

    //tarifa de larga distancia
    public  double calcularTarifaLD(int minLD){
        return strategy.calcularTarifaLD(minLD);
    }

}
