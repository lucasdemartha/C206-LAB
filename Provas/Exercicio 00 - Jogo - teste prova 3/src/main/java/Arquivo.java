import java.io.*;
import java.util.ArrayList;

public class Arquivo {

    public void escrever(Jogo jogo){
        OutputStream os = null;
        OutputStreamWriter osw = null;
        BufferedWriter bw = null;
        String linhaEscrever;

        try {
            os = new FileOutputStream("Arquivo.txt", true);
            osw = new OutputStreamWriter(os);
            bw = new BufferedWriter(osw);

            bw.write("Cadastro");
            bw.newLine();
            bw.write(jogo.getNome() + "\n");
            bw.write(jogo.getGenero() + "\n");
            bw.write(jogo.getPreco() + "\n");
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            try {
                bw.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public ArrayList<Jogo> ler(){

        InputStream is = null;
        InputStreamReader isr = null;
        BufferedReader br = null;
        String linhaLer;
        ArrayList<Jogo> acheiNoArquivo = new ArrayList<>();

        try {

            is = new FileInputStream("Arquivo.txt");
            isr = new InputStreamReader(is);
            br = new BufferedReader(isr);

            linhaLer = br.readLine();
            while (linhaLer != null) {
                if (linhaLer.contains("Cadastro")) {
                    Jogo aux = new Jogo();
                    aux.setNome(br.readLine());
                    aux.setGenero(br.readLine());
                    aux.setPreco(Double.parseDouble(br.readLine()));
                    acheiNoArquivo.add(aux);
                }
                linhaLer = br.readLine();
            }
        } catch (Exception e) {
            System.out.println("Deu ruim");
        } finally {
            try {
                br.close();
            } catch (Exception e) {
                System.out.println("Deu ruim");
            }
        }
        return acheiNoArquivo;
    }



}
