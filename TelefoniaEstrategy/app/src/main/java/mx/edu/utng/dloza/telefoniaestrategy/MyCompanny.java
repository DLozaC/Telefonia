package mx.edu.utng.dloza.telefoniaestrategy;

/**
 * Created by Daniel on 14/09/2017.
 */


public class MyCompanny implements Telefonica{
    @Override
    public double calcularTarifaLocal(int minLocal) {
        return minLocal*1.0;
    }

    @Override
    public double calcularTarifaLD(int minLD) {
        return minLD*1.50;
    }
}
