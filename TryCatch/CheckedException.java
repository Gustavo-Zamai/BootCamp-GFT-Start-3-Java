import javax.swing.*;
import java.io.*;


public class CheckedException {
    public static void main (String [] args) {
        String nomeDoArquivo = "novo-documento-de-texto.txt";
        try {
            imprimirArquivoNoConsole(nomeDoArquivo);
        }catch (FileNotFoundException e){
            JOptionPane.showMessageDialog(null,"O nome do arquivo ou pasta não é válido!");
            e.printStackTrace();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null,"Ocorreu um erro inesperado!");
            e.printStackTrace();
        }
        System.out.println("Apesar da Exception o arquivo continua");
    }
    public static void imprimirArquivoNoConsole(String nomeDoArquivo) throws IOException{
        File file = new File(nomeDoArquivo);

        BufferedReader br = new BufferedReader(new FileReader(file.getName()));
        String line = br.readLine();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        do{
            bw.write(line);
            bw.newLine();
            line = br.readLine();
        }while(line != null);
        bw.flush();
        br.close();
    }
}
