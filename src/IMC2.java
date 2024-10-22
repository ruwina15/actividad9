import java.util.InputMismatchException;
import java.util.Scanner;

public class IMC2 {

    public static void main(String[] args) {
        Paciente persona = new Paciente();
        Scanner teclado = new Scanner(System.in);
        double altura = 0, peso = 0, IMC;

        // Agregue un try catch para verificar que el usuario
        // ingrese los datos validos en peso y altura
        try
        {
            System.out.println("Ingrese sus datos");
            System.out.print("Nombre: ");
            persona.setNombre(teclado.nextLine());

            System.out.print("Edad: ");
            persona.setEdad(teclado.nextInt());
            teclado.nextLine();

            System.out.print("Genero: ");
            persona.setGenero(teclado.nextLine());

            System.out.print("Ingrese su peso en kg: ");
            peso = teclado.nextDouble();

            System.out.print("Ingrese su altura en metros: ");
            altura = teclado.nextDouble();

            // Verifica que el peso y la altura sean mayores que 0
            if (peso <= 0 || altura <= 0)
            {
                System.out.println("Error: El peso y la altura deben ser mayores que 0.");
                return;
            }

            IMC = Paciente.calcularIMC(peso, altura);
            String result = Paciente.resultadoIMC(IMC);
            System.out.println("Los datos del Paciente " + persona.getNombre() + " de " + persona.getEdad() + " años y del genero " + persona.getGenero() + " es: ");
            System.out.println("Su IMC es: " + IMC + " y tiene un " + result + ".");

            //En caso de que el usuario ingrese letras en peso o altura saldra un error
        }

        //Utilize InputMissmatchException para cuando se espera un tipo de dato específico,
        // como un número, pero se ingresa algo diferente, como texto
        catch (InputMismatchException e)
        {
            System.out.println("Error: Debe ingresar un número válido.");
        }
        finally
        {
            teclado.close();
        }
    }
}
