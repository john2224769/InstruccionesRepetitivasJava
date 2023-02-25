package ejecutable;

import javax.swing.JOptionPane;

public class NumerosPrimos
{
    public static void main(String[] args)
    {
    int n;
    boolean r=true;

    n=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un numero para comprobar si es primo o no "));

    for (int i=2; i<=(n/2); i++)
    {
        if((n%i)==0)
        {
            r=false;
        }
        else
        {
            r=true;
        }
    }

    if (n==1 || n==0)
    {
        r = false;
    }

    if (r==false)
    {
    JOptionPane.showMessageDialog(null, "El numero ingresado no es primo");
    }
    else
    {
    JOptionPane.showMessageDialog(null, "El numero ingresado es primo");
    }

    }
}