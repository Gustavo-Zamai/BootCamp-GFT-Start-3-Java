import javax.swing.*;
import java.io.*;


public class CustomizeException {
    public static void main(String[] args) throws IOException {
        String nomeDoArquivo = JOptionPane.showInputDialog("Nome do arquivo que deseja exibir");

        imprimirArquivoNoConsole(nomeDoArquivo);
        System.out.println("Apesar da Exception o arquivo continua");
    }

    public static void imprimirArquivoNoConsole(String nomeDoArquivo) throws ImpossivelAbrirAquirvoException {
        try {
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            do {
                bw.write(line);
                bw.newLine();
                line = br.readLine();
            } while (line != null);
            bw.flush();
            br.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado!");
            e.printStackTrace();
        }
    public static BufferedReader lerArquivo (String nomeDoArquivo){
        File file = new File(nomeDoArquivo);
        try {
            return new BufferedReader(new FileReader(nomeDoArquivo));
        } catch (FileNotFoundException e) {
            throw new ImpossivelAbrirAquirvoException(file.getName(), file.getPath());
            e.printStackTrace();
        }
        }
    }
}

class ImpossivelAbrirAquirvoException extends Exception {
    private String nomeDoArquivo;
    private String diretorio;

    public ImpossivelAbrirAquirvoException(String nomeDoArquivo, String diretorio) {
        super("O arquivo "+nomeDoArquivo + " não foi encontrado no diretório " + diretorio);
        this.nomeDoArquivo = nomeDoArquivo;
        this.diretorio = diretorio;
    }
}
