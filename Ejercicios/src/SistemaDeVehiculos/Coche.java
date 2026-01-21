package SistemaDeVehiculos;

public class Coche extends Vehiculo{

    private int numeroPuertas;



    public Coche(String matricula, String marca, String modelo, double consumoKm, int numeroPuertas) {
        super(matricula, marca, modelo,consumoKm);
        this.numeroPuertas=numeroPuertas;

    }


    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }



    @Override
    public double calcularConsumo() {

    return 0;
    }


    @Override
    public String toString() {

        StringBuilder sb= new StringBuilder();
        sb.append("==Coche==\n");
        sb.append(super.toString()).append("\n");
        sb.append("Numero de Puertas: ").append(numeroPuertas).append("\n");

        return sb.toString();
    }
}
