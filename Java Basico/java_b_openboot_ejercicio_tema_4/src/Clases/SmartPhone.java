package Clases;

public class SmartPhone extends SmartDevice{

    int memoriaInterna;
    int memoriaRam;

    public SmartPhone() {
    }

    public SmartPhone(String marca, String modelo, String sistemaOperativo, int memoriaInterna, int memoriaRam) {
        super(marca, modelo, sistemaOperativo);
        this.memoriaInterna = memoriaInterna;
        this.memoriaRam = memoriaRam;
    }

    public SmartPhone(int memoriaInterna, int memoriaRam){
        this.memoriaInterna = memoriaInterna;
        this.memoriaRam = memoriaRam;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "memoriaInterna=" + memoriaInterna +
                ", memoriaRam=" + memoriaRam +
                ", modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", sistemaOperativo='" + sistemaOperativo + '\'' +
                '}';
    }
}
