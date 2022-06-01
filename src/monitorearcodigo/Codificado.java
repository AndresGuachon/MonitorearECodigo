/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package monitorearcodigo;

import javax.swing.JOptionPane;


public class Codificado {
    public final static int OVERFLOW = 200000000;
    private String salida;
    private int tamanio;
    String tempOOM = "";
   

    public Codificado(int leng) {
        this.tamanio = leng; 
int i = 0;
        while (i < leng) {
            i++;
            try {         
                this.salida += "a";
            } catch (OutOfMemoryError e) {
                e.printStackTrace();
                
            }
        }
        this.salida = tempOOM.toString();
    }

    public String getOom() {
        return salida;
    }

    public int getLength() {
        return tamanio;
    }

    public static void main(String[] args) {
        Codificado javaHeapTest = new Codificado(OVERFLOW);
        System.out.println(javaHeapTest.getOom().length());
        String sc = JOptionPane.showInputDialog("precione cualquier numero:");
       
    }
}

