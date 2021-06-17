/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SegundaForma;

import javax.swing.JOptionPane;

/**
 *
 * @author: CxrlosMX
 * @Git-Hub: https://github.com/CxrlosMX
 * @Phone: 953-212-97-27
 * @Email: LuisCRendon131@gmail.com
 * @Date: 17/06/2021
 *
 */
public class Aplicacion {

    public static void main(String args[]) {
        int op = 0;
        double a = 0, b = 0, c = 0, d = 0;
        NumeroComplejo primero, segundo, suma, multiplicacion;

        do {
            try {
                op = Integer.parseInt(JOptionPane.showInputDialog(null, "MENU\n1.-Sumas 2 numeros complejos"
                        + "\n2.-Multiplicar 2 numeros complejos"
                        + "\n3.-Comparar 2 numeros complejos"
                        + "\n4.-Multipilicar Numero Complejo por Entero"
                        + "\n5.-Salir\n¿Que desea realizar?", "Menu", 3));
                switch (op) {
                    case 1: {
                        a = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el primer numero complejo", "Introduciendo Primera Exprecion", 1));
                        b = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el primer numero complejo", "Introduciendo Primera Exprecion", 1));
                        primero = new NumeroComplejo(a, b);
                        c = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce la parte imaginaria", "Introduciendo Segunda Exprecion", 1));
                        d = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce la parte imaginaria", "Introduciendo Segunda Exprecion", 1));
                        segundo = new NumeroComplejo(c, d);
                        suma = primero.calcularSuma(segundo);
                        JOptionPane.showMessageDialog(null, "La suma es: " + suma.getA() + "+" + suma.getB() + "i");
                        break;
                    }
                    case 2: {
                        a = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el primer numero complejo", "Introduciendo Primera Exprecion", 1));
                        b = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el primer numero complejo", "Introduciendo Primera Exprecion", 1));
                        primero = new NumeroComplejo(a, b);
                        c = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce la parte imaginaria", "Introduciendo Segunda Exprecion", 1));
                        d = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce la parte imaginaria", "Introduciendo Segunda Exprecion", 1));
                        segundo = new NumeroComplejo(c, d);
                        multiplicacion = primero.calcularProducto(segundo);
                        JOptionPane.showMessageDialog(null, "La multiplicacion es: " + multiplicacion.getA() + "+" + multiplicacion.getB() + "i");

                        break;
                    }
                    case 3: {
                        a = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el primer numero complejo", "Introduciendo Primera Exprecion", 1));
                        b = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el primer numero complejo", "Introduciendo Primera Exprecion", 1));
                        primero = new NumeroComplejo(a, b);
                        c = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce la parte imaginaria", "Introduciendo Segunda Exprecion", 1));
                        d = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce la parte imaginaria", "Introduciendo Segunda Exprecion", 1));
                        segundo = new NumeroComplejo(c, d);
                        if (primero.comprobarNumerosIguales(segundo)) {
                            JOptionPane.showMessageDialog(null, "Las expresions introducidad son iguales", "Expresiones iguales", 1);

                        } else {
                            JOptionPane.showMessageDialog(null, "Las expresiones no son iguales", "Expresiones No son iguales", 1);

                        }

                        break;
                    }
                    case 4: {
                        a = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el primer numero complejo", "Introduciendo Primera Exprecion", 1));
                        b = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el primer numero complejo", "Introduciendo Primera Exprecion", 1));
                        primero = new NumeroComplejo(a, b);
                        c = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el numero entero", "Introduciendo Numero entero", 1));
                        multiplicacion = primero.multiplicacionEntero((int) (c));
                        JOptionPane.showMessageDialog(null, "La multiplicacion es: " + multiplicacion.getA() + "+" + multiplicacion.getB() + "i");

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

    }

}
