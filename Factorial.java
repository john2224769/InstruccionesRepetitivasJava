package ejecutable;

import javax.swing.JOptionPane;

public class Factorial
{
    public static void main(String[] args) 
    {
        int n,f=1,i;
        n=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero para calcular su factorial :"));
        
        for (i=1; i<=n; i++)
        {
            f=f*i;
        }
        JOptionPane.showMessageDialog(null, "El factorial de "+n+" es: "+ f);
    }
}