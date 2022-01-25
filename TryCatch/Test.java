import javax.swing.*;


public class Test {
    public static void main (String[] args){
        boolean continueLooping = true;
        do{
            String a = JOptionPane.showInputDialog("Numerador:");
            String b = JOptionPane.showInputDialog("Denominador:");
            try {
                double result = dividir(Double.parseDouble(a), Double.parseDouble(b));
                System.out.println("Resultado: " + result);
                continueLooping = false;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null,"Entrada Inválida" /*+e.getMessage()*/);
                e.printStackTrace();
            }catch (ArithmeticException e) {
                JOptionPane.showMessageDialog(null,"Impossivel dividir um número por 0" /*+e.getMessage()*/);
                e.printStackTrace();
            } finally {
                System.out.println("Chegou no finally!");
            }
        } while (continueLooping);

        System.out.println("Continuou");
    }
    public static double dividir (double a, double b) {
        return a/b;
    }
}
