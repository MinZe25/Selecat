import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

public class Form {

    private JPanel panel1;
    private JTextField textField1;
    private JButton descarregaButton;
    private JButton MATButton;
    private JButton CATButton;
    private JButton CASTButton;
    private JButton ENGButton;
    private JButton FILOButton;
    private JButton TECNOButton;
    private JButton QUIMICAButton;
    private JButton FISICAButton;
    private JButton ELECTROButton1;
    private JButton HISTButton;
    private JButton MATCSButton;
    private JButton ECOEButton;
    private JButton CMTButton;
    private JButton BIOButton;
    private JButton GEOButton;
    private JButton HISTARTButton;
    private JButton DIBARTButton;
    private JButton DIBTECButton;
    private JButton FRANCButton;
    private JTextField ruta;
    private JButton ALEMButton;
    private JButton LLATIButton;
    private JSpinner spinner1;

    private void download(String code, String month, String subjectName, String filename) {
        java.lang.String directory = (ruta.getText() + "/");
        String url = "https://selecat.cat/pau/";
        String extension = ".pdf";
        for (byte year = 0; year <= 9; year++) {
            try {
                downloadUsingNIO(url + code + 0 + year + month + extension, directory + subjectName + " " + filename + " " + year + extension);

                downloadUsingStream(url + code + 0 + year + month + extension, directory + subjectName + " " + filename + " " + year + extension);
            } catch (IOException a) {
                a.printStackTrace();
            }
        }
        for (byte year = 10; year <= (int) this.spinner1.getValue(); year++) {
            try {
                downloadUsingNIO(url + code + year + month + extension, directory + subjectName + " " + filename + " " + year + extension);

                downloadUsingStream(url + code + year + month + extension, directory + subjectName + " " + filename + " " + year + extension);
            } catch (IOException a) {
                a.printStackTrace();
            }
        }

    }

    private void downloadSubject(String code, String subjectName) {
        download(code, "sl", subjectName, "preguntes setembre");
        download(code, "jl", subjectName, "preguntes juny");
        download(code, "sp", subjectName, "respostes setembre");
        download(code, "jp", subjectName, "respostes juny");
        JOptionPane.showMessageDialog(null, "DESCARREGAT");
    }

    public Form() {

        MATButton.addActionListener(e -> {
            String code = "pau_mate";
            String subjectName = "Matemàtiques";
            downloadSubject(code, subjectName);
        });
        CASTButton.addActionListener(e -> {
            String code = "pau_lles";
            String subjectName = "Llengua castellana";
            downloadSubject(code, subjectName);

        });
        ELECTROButton1.addActionListener(e -> {
            String code = "pau_elec";
            String subjectName = "Llengua castellana";
            downloadSubject(code, subjectName);

        });
        TECNOButton.addActionListener(e -> {
            String code = "pau_tecn";
            String subjectName = "Tecnologia";
            downloadSubject(code, subjectName);
        });
        DIBTECButton.addActionListener(e -> {
            String code = "pau_dibu";
            String subjectName = "Dibuix";
            downloadSubject(code, subjectName);
        });
        CATButton.addActionListener(e -> {
            String code = "pau_llca";
            String subjectName = "Llengua";
            downloadSubject(code, subjectName);
        });
        ENGButton.addActionListener(e -> {
            String code = "pau_angl";
            String subjectName = "Anglès";
            downloadSubject(code, subjectName);
        });
        DIBARTButton.addActionListener(e -> {
            String code = "pau_angl";
            String subjectName = "Dibuix Artistic";
            downloadSubject(code, subjectName);
        });
        FRANCButton.addActionListener(e -> {
            String code = "pau_fran";
            String subjectName = "Francès";
            downloadSubject(code, subjectName);
        });
        ALEMButton.addActionListener(e -> {
            String code = "pau_alem";
            String subjectName = "Alemany";
            downloadSubject(code, subjectName);
        });
        LLATIButton.addActionListener(e -> {
            String code = "pau_llat";
            String subjectName = "Llatí";
            downloadSubject(code, subjectName);
        });
        MATCSButton.addActionListener(e -> {
            String code = "pau_macs";
            String subjectName = "Matemàtiques";
            downloadSubject(code, subjectName);
        });
        ECOEButton.addActionListener(e -> {
            String code = "pau_ecem";
            String subjectName = "Economia";
            downloadSubject(code, subjectName);
        });
        FISICAButton.addActionListener(e -> {
            String code = "pau_fisi";
            String subjectName = "Física";
            downloadSubject(code, subjectName);
        });
        QUIMICAButton.addActionListener(e -> {
            String code = "pau_quim";
            String subjectName = "Química";
            downloadSubject(code, subjectName);
        });
        BIOButton.addActionListener(e -> {
            String code = "pau_biol";
            String subjectName = "Biologia";
            downloadSubject(code, subjectName);
        });
        CMTButton.addActionListener(e -> {
            String code = "pau_cite";
            String subjectName = "CC";
            downloadSubject(code, subjectName);
        });
        HISTButton.addActionListener(e -> {
            String code = "pau_hist";
            String subjectName = "Història";
            downloadSubject(code, subjectName);
        });
        HISTARTButton.addActionListener(e -> {
            String code = "pau_hart";
            String subjectName = "Història";
            downloadSubject(code, subjectName);
        });
        GEOButton.addActionListener(e -> {
            String code = "pau_hart";
            String subjectName = "Geologia";
            downloadSubject(code, subjectName);
        });
        FILOButton.addActionListener(e -> {
            String code = "pau_hfil";
            String subjectName = "Filosofia";
            downloadSubject(code, subjectName);
        });
        spinner1.setModel(new SpinnerNumberModel(21, 10, 99, 1));
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Selecat");
        frame.setContentPane(new Form().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private static void downloadUsingStream(String urlStr, String file) throws IOException {
        URL url = new URL(urlStr);
        BufferedInputStream bis = new BufferedInputStream(url.openStream());
        FileOutputStream fis = new FileOutputStream(file);
        byte[] buffer = new byte[1024];
        int count = 0;
        while ((count = bis.read(buffer, 0, 1024)) != -1) {
            fis.write(buffer, 0, count);
        }
        fis.close();
        bis.close();
    }

    private static void downloadUsingNIO(String urlStr, String file) throws IOException {
        URL url = new URL(urlStr);
        ReadableByteChannel rbc = Channels.newChannel(url.openStream());
        FileOutputStream fos = new FileOutputStream(file);
        fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
        fos.close();
        rbc.close();
    }
}
