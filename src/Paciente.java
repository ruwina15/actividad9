public class Paciente {
    private String nombre, genero;
    private int edad;

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }


    public static double calcularIMC (double p, double alt){
        return p / (alt * alt);
    }

    public static String resultadoIMC(double imc) {
        if (imc < 18.5)
        {
            return "bajo peso";
        }
        else if (imc >= 18.5 && imc < 24.9)
        {
            return "peso normal";
        }
        else if (imc >= 25 && imc < 29.9)
        {
            return "sobrepeso";
        }
        else
        {
            return "obesidad";
        }
    }
}
