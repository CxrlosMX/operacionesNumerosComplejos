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
public class NumeroComplejo {

    private double a; //Parte Real
    private double b; //Parte Imaginaria

    public NumeroComplejo(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }
     //Metodo para pedir los valores
    public double a() {
        int a = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el primer numero complejo", "Introduciendo Primera Exprecion", 1));
        return a;
    }

    public double b() {
        int b = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el primer numero complejo", "Introduciendo Primera Exprecion", 1));
        return b;
    }

    public double c() {
        int c = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce la parte imaginaria", "Introduciendo Segunda Exprecion", 1));
        return c;
    }

    public double d() {
        int d = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce la parte imaginaria", "Introduciendo Segunda Exprecion", 1));
        return d;
    }

    //Metodo para realizar la suma
    public NumeroComplejo calcularSuma(NumeroComplejo n) {
        NumeroComplejo suma = new NumeroComplejo(a + n.getA(), b + n.getB());
        return suma;
    }

    //Metodo para calcular el producto
    public NumeroComplejo calcularProducto(NumeroComplejo complejo) {
        NumeroComplejo multiplicacion = new NumeroComplejo((a * complejo.getA() - b * complejo.getB()), (a * complejo.getB() + complejo.getA() * b));
        return multiplicacion;
    }

    //Metodo para comprobar si dos numeros complejos son iguales 
    public boolean comprobarNumerosIguales(NumeroComplejo n) {
        return (a == n.getA() && b == n.getB());
    }

    //Multiplicar un numero entero por un numero complejo
    public NumeroComplejo multiplicacionEntero(int i) {
        NumeroComplejo mul = new NumeroComplejo((a * i), (b * i));
        return mul;
    }

}
