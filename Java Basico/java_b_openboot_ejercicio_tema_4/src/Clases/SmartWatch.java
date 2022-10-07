package Clases;

public class SmartWatch extends SmartDevice {

    String hora;
    String fecha;

    public SmartWatch() {
    }

    public SmartWatch(String marca, String modelo, String sistemaOperativo, String hora, String fecha) {
        super(marca, modelo, sistemaOperativo);
        this.hora = hora;
        this.fecha = fecha;
    }



    public SmartWatch (String hora, String fecha){
        this.hora = hora;
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "hora='" + hora + '\'' +
                ", fecha='" + fecha + '\'' +
                ", modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", sistemaOperativo='" + sistemaOperativo + '\'' +
                '}';
    }
}
