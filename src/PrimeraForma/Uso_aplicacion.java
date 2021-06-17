/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrimeraForma;

import javax.swing.JOptionPane;

/**
 *
 * @author: CxrlosMX
 * @Git-Hub: https://github.com/CxrlosMX
 * @Phone: 953-212-97-27
 * @Email: LuisCRendon131@gmail.com
 * @Date: 16/06/2021
 *
 */
public class Uso_aplicacion {

    public static void main(String args[]) {
        Operaciones operacion = new Operaciones();
        int op = 0, a = 0, b = 0, c = 0, d = 0;

        do {
            try {
                op = Integer.parseInt(JOptionPane.showInputDialog(null, "MENU\n1.-Sumas 2 numeros complejos"
                        + "\n2.-Multiplicar 2 numeros complejos"
                        + "\n3.-Comparar 2 numeros complejos"
                        + "\n4.-Multipilicar Numero Complejo por Entero"
                        + "\n5.-Salir\n¿Que desea realizar?", "Menu", 3));
                switch (op) {
                    case 1: {
                        a = operacion.a();
                        b = operacion.b();
                        c = operacion.c();
                        d = operacion.d();
                        operacion.sumarNumeros(a, b, c, d);
                        break;
                    }
                    case 2: {
                        a = operacion.a();
                        b = operacion.b();
                        c = operacion.c();
                        d = operacion.d();
                        operacion.MultiplicarNumeros(a, b, c, d);
                        break;
                    }
                    case 3: {
                        a = operacion.a();
                        b = operacion.b();
                        c = operacion.c();
                        d = operacion.d();
                        if (operacion.compararNumeros(a, b, c, d)) {
                            JOptionPane.showMessageDialog(null, "Las expresions introducidad son iguales", "Expresiones iguales", 1);
                        } else {
                            JOptionPane.showMessageDialog(null, "Las expresiones no son iguales", "Expresiones No son iguales", 1);
                        }
                        break;
                    }
                    case 4: {
                        a = operacion.a();
                        b = operacion.b();
                        d = operacion.d();
                        c = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el numero entero", "Introduciendo Numero entero", 1));
                        operacion.MultiplicacionNumerosEntero(a, b, c);
                        break;
                    }
                    case 5: {
                        JOptionPane.showMessageDialog(null, "Saliendo", "Cerrando Programa", 2);
                        break;
                    }
                    default: {

                        break;
                    }
                }

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error " + e.getMessage(), "Error", 0);
            }

        } while (op != 5);

        /* op.sumarNumeros(2, 7, 3, -4);
         op.MultiplicarNumeros(3, 2, 5, 6);
         if(op.compararNumeros(1, 2, 1, 2)){
         System.out.println("Los numeros son iguales");
         }
         else {
         System.out.println("La Expresion no es igual");
         }
         op.MultiplicacionNumerosEntero(7, -9, 5);
         */
    }
}
