import com.sofka.Console;
/**
 * [
 *   clase main ejecuta nuestro aplicativo  el cual instacia la clase Console,
 *   despues tomamos sus dos metodos creados inConsole() este nos permite ingresar los datos y
 *   showConsole() nos permite imprimirlos
 * ]
 * @version [1,0.0]
 *
 * @author [Yeferson Valencia, alejandro.yand@gmail.com]
 * @since [1,0,0]
 *
 */
public class Main {
    public static void main(String[] args) {
        Console console = new Console();

        console.inConsole();
        System.out.println("...........................................................");
        console.showConsole();
        System.out.println("...........................................................");
    }
}
