package calcularsalariocatedratico;

import javax.swing.JOptionPane;

public class CalcularSalarioCatedratico
{
    public static int leerInt(String mensaje) //Funcion que lee un entero
    {
        return Integer.parseInt(JOptionPane.showInputDialog(mensaje));
    }
    
    public static String leerString(String mensaje) //Funcion que lee un String
    {
        return JOptionPane.showInputDialog(mensaje);
    }
    
    public static void imprimirMensaje(String mensaje) //Funcion que imprime un mensaje
    {
        JOptionPane.showMessageDialog(null, mensaje);
    }
    
    public static int calcularSalario(int cat, int h) //Funcion que calcula el salario de un profesor catdratico
        int salario=0;
        
        switch(cat)
        {
            case 1: salario=25000*h;
                break;
                
            case 2: salario=30000*h;
                break;
                
            case 3: salario=35000*h;
                break;
                
            case 4: salario=40000*h;
                break;
                
            default: imprimirMensaje("La categoria ingresada no existe");
                break;
        }
        return salario;
    }
    
    public static void main(String[] args) //Funcion main
    {
        int c,h, salario;
        String nombre;
        
        nombre=leerString("Ingrese el nombre del profesor: ");
        c=leerInt("Ingrese la categoria a la que "+nombre+" pertenece: ");
        h=leerInt("Ingrese la cantidad de horas laboradas este mes por "+nombre+" : ");
        
        salario=calcularSalario(c, h);
        
        imprimirMensaje("El salario de "+nombre+" es : "+salario);
    }
}