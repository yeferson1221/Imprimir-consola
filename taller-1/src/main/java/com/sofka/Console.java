package com.sofka;
/**
 * [
 *   clase Console contine sus atributos name,tel,age tipo string por que no se haran operaciones
 *   con los numericos adicionael dos metodos inConsole() y showConsole()
 * ]
 * @version [1,0.0]
 *
 * @author [Yeferson Valencia, alejandro.yand@gmail.com]
 * @since [1,0,0]
 *
 */
import java.util.Scanner;

public class Console {

    private String name;
    private String tel;
    private String age;

    /**
     * [
     *   Metetodo inConsole nos deja ingresar los datos name,tel,age instanciando la clase
     *   Scanner
     * ]
     * @version [1,0.0]
     *
     * @author [Yeferson Valencia, alejandro.yand@gmail.com]
     * @since [1,0,0]
     *
     */
    public void inConsole(){
        Scanner in = new Scanner(System.in);
        System.out.println("Ingresar Nombre: ");
        name=in.nextLine();
        System.out.println("Ingresar Telefono: ");
        tel=in.nextLine();
        System.out.println("Ingresar Años: ");
        age=in.nextLine();

    };

    /**
     * [
     *   Metetodo showConsole nos deja Imprimir en consola los datos name,tel,age
     * ]
     * @version [1,0.0]
     *
     * @author [Yeferson Valencia, alejandro.yand@gmail.com]
     * @since [1,0,0]
     *
     */
    public void showConsole(){
        System.out.println("Bienvenido señor "+name+ "es un placer para nosotros contar con una persona de "+age+" años.\n" +
                "Próximamente nos comunicaremos con usted al numero "+tel+".\n" +
                "Feliz día\n ");
    };

}
