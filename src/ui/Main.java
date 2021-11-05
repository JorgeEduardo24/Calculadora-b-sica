package ui;
import model.Operaciones;
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        String num1 = JOptionPane.showInputDialog("Escribe un número:");
        String num2 = JOptionPane.showInputDialog("Escribe otro número:");
        
        double numero1 = Double.parseDouble(num1);
        double numero2 = Double.parseDouble(num2);
        
        Operaciones op = new Operaciones();
        
        double suma = op.sumar(numero1, numero2);
        double resta = op.restar(numero1, numero2);
        double multiplicacion = op.multiplicar(numero1, numero2);
        double division = op.dividir(numero1, numero2);
        
        JOptionPane.showMessageDialog(null, "Suma = "+suma+"\nResta = "+resta+"\nMultiplicación = "+multiplicacion+"\nDivisión = "+division, "Calculadora", JOptionPane.INFORMATION_MESSAGE);
    }
}
