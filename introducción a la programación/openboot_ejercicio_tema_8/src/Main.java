public class Main {
    public static void main(String[] args) {
        Persona miPersona = new Persona();
        miPersona.setNombre("Juan Sebastian Alvarez Yaguara");
        System.out.println(miPersona.getNombre());
        miPersona.setEdad(29);
        System.out.println("Edad"+ " "+miPersona.getEdad());
        miPersona.setTelefono(123456789);
        System.out.println("Telefono"+ " "+miPersona.getTelefono());

    }

    public static class Persona {
        private int edad;
        private String nombre;
        private int telefono;

        public void setEdad(int edad){
            this.edad = edad;
        }

        public int getEdad(){
            return this.edad;
        }

        public void setNombre(String nombre){
            this.nombre = nombre;
        }

        public String getNombre(){
            return this.nombre;
        }

        public void setTelefono (int telefono){
            this.telefono = telefono;
        }

        public int getTelefono(){
            return this.telefono;
        }
    }
}