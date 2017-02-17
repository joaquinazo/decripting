import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.Scanner;
//ajajajsjsj j jasjd l  akakaksjsddjajdjsskskjd
//Resumen 1: G���OX�Hg��~��� sdq

public class Hash {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte[] c1;
        String line;

        try {

            System.out.println("1.- Obteniendo la instancia con algoritmo MD5");
            MessageDigest md = MessageDigest.getInstance("MD5");
            System.out.println("2.- Actualizando el contenido de la instancia");
            String mssg ="";
            System.out.println("Enter names (\"QUIT\" to finish)");
            while (sc.hasNextLine()) {
                line = sc.nextLine();
                mssg = mssg+" " + line;
                if (line.equals("QUIT")) {
                    break;
                }
            }
            c1 = mssg.getBytes(Charset.forName("UTF-8"));


            md.update(c1);

            System.out.println("3.- Calculando el resumen");
            byte[] resumen = md.digest();
            System.out.println("Resumen 1: " + new String(resumen,Charset.forName("UTF-8")));
            Writer out = new BufferedWriter(new OutputStreamWriter(System.out));
            out.write("RESUMEEEEN" + new String(resumen));

            System.out.println("- Reiniciando la instancia -");
            md.reset();
            System.out.println("2.- Actualizando el contenido de la instancia");
            byte[] c4 = "Cuarta cadena".getBytes();
            md.update(c4);
            System.out.println("3.- Calculando el resumen");
            resumen = md.digest();
            System.out.println("Resumen 2: " + new String(resumen));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}