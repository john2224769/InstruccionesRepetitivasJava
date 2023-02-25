package ejecutable;

import javax.swing.JOptionPane;

public class Capicua
{
    public static void main(String[] args) 
    {
        int n,inv,aux,d;

        n=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero para comprobar si es capicua o no "));

        inv=0;
        aux=n;

        while (aux>0)
        {
            d=aux%10;
            inv=(inv*10)+d;
            aux=aux/10;
        }
        if (n==inv) 
        {
            JOptionPane.showMessageDialog(null, "El numero ingresado es capicua");
        }
        else 
        {
            JOptionPane.showMessageDialog(null, "El numero ingresado no es capicua");
        }
    }
}