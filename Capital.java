package ejecutable;

import javax.swing.JOptionPane;

public class Capital
{
    public static void main(String[] args) 
    {
        double c1, c2, c3, t;
        int m=0;

        c1=Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el capital de Pedro "));
        c2=Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el capital de Juan "));
        c3=Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el valor del negocio"));
        t=c1+c2;

        while (t<c3)
        {
            c1=c1+(c1*0.03);
            c2=c2+(c2*0.04);
            t=c1+c2;
            m=m+1;
        }
        JOptionPane.showMessageDialog(null, "La cantidad de meses requeridos para reunir el capital del negocio es de: "+ m);

    }
}