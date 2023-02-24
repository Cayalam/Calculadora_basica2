package Calculadora_basica2.Ejecutable;

import javax.swing.JOptionPane;

public class Test{

    public static void main(String[] args)
    {
        // Declaración de variables
        double x, y;
        int opcion;
        boolean bandera;

        // Entrada
        JOptionPane.showMessageDialog(null, "CALCULADORA BÁSICA\n\n1. Ingrese los valores para x e y.\n2. Seleccione la operación a realizar");
        x = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor de x: "));
        y = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor de y: "));
        opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "OPERACIONES:\n\n1. Suma.\n2. Resta\n3. Multiplicacion\n4. División\n5. Potencia\n6. Logaritmo"));

        // Procesamiento
        switch(opcion)
        {
            case 1:
                // Suma
                JOptionPane.showMessageDialog(null, "La suma es: "+  (x+y));
                break;
            case 2:
                // Resta
                JOptionPane.showMessageDialog(null, "La resta es: "+ (x-y));
            case 3:
                // Multiplicación
                JOptionPane.showMessageDialog(null,"La multiplicación es: " + (x*y)); 
            case 4:
                // División
                if(y!=0){
                    JOptionPane.showMessageDialog(null," La división es: "+ (x/y));

                }else{
                    JOptionPane.showMessageDialog(null,"No se puede dividir entre 0");

                }
            case 5:

                // Exponencial
                JOptionPane.showMessageDialog(null," La Exponencial es: "+ Math.pow(x,y));
            case 6:
                // Logaritmo
                JOptionPane.showMessageDialog(null," La división es: "+ (x/y));

            default:
                //Otros casos
                JOptionPane.showMessageDialog(null, "El logaritmo de x es: " + Math.log(x) +"\n El logaritmo de y es: "+ Math.log(y));
        }

        // Salida

        // Fin
        System.exit(0);
    }
}




