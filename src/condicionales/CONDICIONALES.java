/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicionales;
import javax.swing.JOptionPane;
/**
 *
 * @author LAB02
 */
public class CONDICIONALES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
      float numero1, numero2;
      
      numero1 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el primer numero"));
      numero2 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el segundo numero"));
        if (numero1 ==numero2) //Aqui va una condicion 
            
        {
         //Si la condicion se cumple se ejecuta este codigo 
         JOptionPane.showMessageDialog(null, "Son iguales");
        }
        else //Si no se cumple la condicion se ejecuta esto
        {
           JOptionPane.showMessageDialog(null, "Son diferentes");
            if (numero1 > numero2) 
            {
              JOptionPane.showMessageDialog(null, "Numero"+numero1+" es mayor");   
            }
            else
            {
             JOptionPane.showMessageDialog(null, "Numero"+numero2+" es mayor");   
            }
            
        }
    }
    
}
