package SistemaDeVehiculos;

public class Moto extends Vehiculo{

    private int cilindrada;


    public Moto(String matricula, String marca, String modelo,double consumoKm,int cilindrada) {
        super(matricula, marca, modelo,consumoKm);
        this.cilindrada=cilindrada;

    }


    public int getCilindrada() {
        return cilindrada;
    }


    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }


    @Override
    public double calcularConsumo(/*double litros, double km*/) {
        //km recorridos entre litros del deposito para conseguir el consumo
        EntrasdaSalida.dameLitros();


        double total=0;

    return 0;
    }

    @Override
    public String toString() {
        StringBuilder sb= new StringBuilder();
        sb.append("==Moto==\n");
        sb.append(super.toString()).append("\n");
        sb.append("Cilindada: ").append(cilindrada).append("\n");


        return sb.toString();
    }
}
