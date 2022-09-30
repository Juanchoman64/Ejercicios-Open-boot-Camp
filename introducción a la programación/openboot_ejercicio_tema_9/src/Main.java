public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.Nombre();
        cliente.Edad();
        cliente.Telefono();
        cliente.setCredito();
        cliente.isCredito();;

        Trabajador trabajador = new Trabajador();
        trabajador.Nombre();
        trabajador.Edad();
        trabajador.Telefono();
        trabajador.setSalario();
        trabajador.getSalario();
    }

    static abstract class Persona {

        int edad;
        String nombre;
        int telefono;

        abstract void Edad();
        abstract void Nombre();
        abstract void Telefono();
    }


    static class Cliente extends Persona{

        boolean credito = false;

        public void Nombre(){
            System.out.println("El nombre del cliente es: Pepito Perez");
        }

        public void Edad(){
            System.out.println("La edad del cliente es: 22");
        }

        public void Telefono(){
            System.out.println("El telefono del cliente es: 123456789");
        }

        public boolean setCredito(){
            return this.credito;
        }
        public void isCredito(){
            System.out.println("La persona tiene credito con la entidad? " + credito);
        }

        }
        static class Trabajador extends Persona{

        int salario = 1000;
            public void Nombre(){
                System.out.println("El nombre del trabajador es: Juan Alvarez");
            }

            public void Edad(){
                System.out.println("La edad del traqbajador es: 29");
            }

            public void Telefono(){
                System.out.println("El telefono del trabajador es: 987654321");
            }

            public int setSalario(){
                return this.salario;
            }
            public void getSalario(){
                System.out.println("El salario del trabajador es "+salario + " Euros");
            }


    }

}