import javax.swing.*;

public class CustomizeException2 {
    public static void main (String [] args){
        int [] numerador = {4, 5, 8, 10};
        int [] denominador = {2, 4, 0, 2, 8};

        for (int i = 0; i < denominador.length; i++) {
            try{
            if (numerador[i] %2 != 0)
                throw new DivisaoNaoExataException("Divisão não exata!", numerador[i], denominador[i]);
            int resultado = numerador[i] / denominador[i];
            System.out.println(resultado);
            } catch (DivisaoNaoExataException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
        System.out.println("Goes on");
    }
}

class DivisaoNaoExataException extends Exception{
    private int denominador;
    private int numerador;

    public DivisaoNaoExataException(String message, int denominador, int numerador) {
        super(message);
        this.denominador = denominador;
        this.numerador = numerador;
    }
}
