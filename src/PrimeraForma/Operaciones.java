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
 * @Date: 15/06/2021
 *
 */
public class Operaciones {

    public Operaciones() {

    }

    //Metodo para pedir los valores
    public int a() {
        int a = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el primer numero complejo", "Introduciendo Primera Exprecion", 1));
        return a;
    }

    public int b() {
        int b = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el primer numero complejo", "Introduciendo Primera Exprecion", 1));
        return b;
    }

    public int c() {
        int c = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce la parte imaginaria", "Introduciendo Segunda Exprecion", 1));
        return c;
    }

    public int d() {
        int d = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce la parte imaginaria", "Introduciendo Segunda Exprecion", 1));
        return d;
    }

    public void sumarNumeros(int a, int b, int c, int d) {
        int n = a + b;
        int m = c + d;
        JOptionPane.showMessageDialog(null, "Resultado de la suma:\n" + "(" + n + ((m > 0) ? "+" : "-") + m + "i)", "Resultado de la suma de numeros complejos", 1);
    }

    public void MultiplicarNumeros(int a, int b, int c, int d) {
        int n = (a * c) - (b * d);
        int m = (a * d) + (b * c);
        JOptionPane.showMessageDialog(null, "Resultado de la multiplicacion:\n" + "(" + n + ((m > 0) ? "+" : "-") + m + "i)", "Resultado de la multiplicacion de numeros complejos", 1);
    }

    public boolean compararNumeros(int a, int b, int c, int d) {
        return (a == c || c == a && b == d || d == b);
    }

    public void MultiplicacionNumerosEntero(int a, int b, int c) {
        int n = a * c;
        int m = b * c;
        JOptionPane.showMessageDialog(null, "Resultado de la multiplicacion :" + c + "\n" + "(" + n + ((m > 0) ? "+" : "-") + m + "i)", "Resultado de la multiplicacion complejos", 1);
    }

}
