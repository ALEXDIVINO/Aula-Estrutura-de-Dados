/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.algo40;
import javax.swing.JOptionPane;

/**
 *
 * @author alexd
 */
public class Algo40 {

    public static void main(String[] args) {
         double quoc, rest, vali, va12;
       
       vali = (double) Float.parseFloat(JOptionPane.showInputDialog("Valor do dividendo :"));
          va12 = (double) Float.parseFloat(JOptionPane.showInputDialog("Valor do divisor :"));
          
          quoc = vali / va12 ;
          rest = vali % va12;
          
          JOptionPane.showMessageDialog(null,"\n dividendo: "+vali+"\n divisor: "+ va12 + "\n quociente: " + quoc + "\n resto: " + rest);
           
    
    }
}
