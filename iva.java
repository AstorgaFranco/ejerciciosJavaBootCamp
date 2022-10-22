
/*
Online Java - IDE, Code Editor, Compiler

Online Java is a quick and easy tool that helps you to build, compile, test your programs online.
*/
import java.util.Scanner;
public class Main
{  
    public static void main(String[] args) { 

Scanner entrada=new Scanner(System.in);

System.out.println("ingresa el precio");

double precio=entrada.nextDouble();

double retorno = convercion(precio);

System.out.println("el precio con iva en Argentina es : " + retorno) ;
 
}

public static double convercion(double precio){

double iva =(precio*21)/100;

double precioFinal=iva+precio;

return  precioFinal ;





}
    }

