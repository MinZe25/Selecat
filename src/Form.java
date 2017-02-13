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

public class Form
{

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

    public Form()
    {
        MATButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e)
            {
                java.lang.String directory = (ruta.getText()+"/");
                String code = "pau_mate";
                String month="sl";
                String extension= ".pdf";
                String url = "http://selecat.cat/pau/";
                for (byte year =00;year<=9;year++) {
                    try {
                        downloadUsingNIO(url+code+0+year+month+extension, directory + "Matemàtiques "+"preguntes setembre "+year+extension);

                        downloadUsingStream(url+code+0+year+month+extension, directory + "Matemàtiques "+"preguntes setembre "+year+extension);
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                }
                for (byte year =10;year<=16;year++) {
                    try {
                        downloadUsingNIO(url+code+year+month+extension, directory + "Matemàtiques "+"preguntes setembre "+year+extension);

                        downloadUsingStream(url+code+year+month+extension, directory + "Matemàtiques "+"preguntes setembre "+year+extension);
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                }
                for (byte year =10;year<=16;year++) {
                    try {
                        downloadUsingNIO(url+code+year+"jl"+extension, directory + "Matemàtiques "+"preguntes juny "+year+extension);

                        downloadUsingStream(url+code+year+"jl"+extension, directory + "Matemàtiques "+"preguntes juny "+year+extension);
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                }
                for (byte year =00;year<=9;year++) {
                    try {
                        downloadUsingNIO(url+code+0+year+"jl"+extension, directory + "Matemàtiques "+"preguntes juny "+year+extension);

                        downloadUsingStream(url+code+0+year+"jl"+extension, directory + "Matemàtiques "+"preguntes juny "+year+extension);
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                }
                for (byte year =10;year<=16;year++) {
                    try {
                        downloadUsingNIO(url+code+year+"sp"+extension, directory + "Matemàtiques "+"respostes setembre "+year+extension);

                        downloadUsingStream(url+code+year+"sp"+extension, directory + "Matemàtiques "+"respostes setembre "+year+extension);
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                }
                for (byte year =00;year<=9;year++) {
                    try {
                        downloadUsingNIO(url+code+0+year+"sp"+extension, directory + "Matemàtiques "+"respostes setembre "+year+extension);

                        downloadUsingStream(url+code+0+year+"sp"+extension, directory + "Matemàtiques "+"respostes setembre "+year+extension);
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                }
                for (byte year =10;year<=16;year++) {
                    try {
                        downloadUsingNIO(url+code+year+"jp"+extension, directory + "Matemàtiques "+"respostes juny "+year+extension);

                        downloadUsingStream(url+code+year+"jp"+extension, directory + "Matemàtiques "+"respostes juny "+year+extension);
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                }for (byte year =00;year<=9;year++) {
                try {
                    downloadUsingNIO(url+code+0+year+"jp"+extension, directory + "Matemàtiques "+"respostes juny"+year+extension);

                    downloadUsingStream(url+code+0+year+"jp"+extension, directory + "Matemàtiques "+"respostes juny "+year+extension);
                } catch (IOException a) {
                    a.printStackTrace();
                }
            }
                JOptionPane.showMessageDialog(null,"DESCARREGAT");
            }
        });
        CASTButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                java.lang.String directory = (ruta.getText()+"/");
                String code = "pau_lles";
                String month="sl";
                String extension= ".pdf";
                String url = "http://selecat.cat/pau/";
                for (byte year =00;year<=9;year++) {
                    try {
                        downloadUsingNIO(url+code+0+year+month+extension, directory + "Llengua castellana "+"preguntes setembre "+year+extension);

                        downloadUsingStream(url+code+0+year+month+extension, directory + "Llengua castellana "+"preguntes setembre "+year+extension);
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                }
                for (byte year =10;year<=16;year++) {
                    try {
                        downloadUsingNIO(url+code+year+month+extension, directory + "Llengua castellana "+"preguntes setembre "+year+extension);

                        downloadUsingStream(url+code+year+month+extension, directory + "Llengua castellana "+"preguntes setembre "+year+extension);
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                }
                for (byte year =10;year<=16;year++) {
                    try {
                        downloadUsingNIO(url+code+year+"jl"+extension, directory + "Llengua castellana "+"preguntes juny "+year+extension);

                        downloadUsingStream(url+code+year+"jl"+extension, directory + "Llengua castellana "+"preguntes juny "+year+extension);
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                }
                for (byte year =00;year<=9;year++) {
                    try {
                        downloadUsingNIO(url+code+0+year+"jl"+extension, directory + "Llengua castellana "+"preguntes juny "+year+extension);

                        downloadUsingStream(url+code+0+year+"jl"+extension, directory + "Llengua castellana "+"preguntes juny "+year+extension);
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                }
                for (byte year =10;year<=16;year++) {
                    try {
                        downloadUsingNIO(url+code+year+"sp"+extension, directory + "Llengua castellana "+"respostes setembre "+year+extension);

                        downloadUsingStream(url+code+year+"sp"+extension, directory + "Llengua castellana "+"respostes setembre "+year+extension);
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                }
                for (byte year =00;year<=9;year++) {
                    try {
                        downloadUsingNIO(url+code+0+year+"sp"+extension, directory + "Llengua castellana "+"respostes setembre "+year+extension);

                        downloadUsingStream(url+code+0+year+"sp"+extension, directory + "Llengua castellana "+"respostes setembre "+year+extension);
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                }
                for (byte year =10;year<=16;year++) {
                    try {
                        downloadUsingNIO(url+code+year+"jp"+extension, directory + "Llengua castellana "+"respostes juny "+year+extension);

                        downloadUsingStream(url+code+year+"jp"+extension, directory + "Llengua castellana "+"respostes juny "+year+extension);
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                }for (byte year =00;year<=9;year++) {
                try {
                    downloadUsingNIO(url+code+0+year+"jp"+extension, directory + "Llengua castellana "+"respostes juny"+year+extension);

                    downloadUsingStream(url+code+0+year+"jp"+extension, directory + "Llengua castellana "+"respostes juny "+year+extension);
                } catch (IOException a) {
                    a.printStackTrace();
                }
            }
                JOptionPane.showMessageDialog(null,"DESCARREGAT");
            }
        });
        ELECTROButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                java.lang.String directory = (ruta.getText()+"/");
                String code = "pau_elec";
                String month="sl";
                String extension= ".pdf";
                String url = "http://selecat.cat/pau/";
                for (byte year =00;year<=9;year++) {
                    try {
                        downloadUsingNIO(url+code+0+year+month+extension, directory + "Electrotècnia "+"preguntes setembre "+year+extension);

                        downloadUsingStream(url+code+0+year+month+extension, directory + "Electrotècnia "+"preguntes setembre "+year+extension);
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                }
                for (byte year =10;year<=16;year++) {
                    try {
                        downloadUsingNIO(url+code+year+month+extension, directory + "Electrotècnia "+"preguntes setembre "+year+extension);

                        downloadUsingStream(url+code+year+month+extension, directory + "Electrotècnia "+"preguntes setembre "+year+extension);
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                }
                for (byte year =10;year<=16;year++) {
                    try {
                        downloadUsingNIO(url+code+year+"jl"+extension, directory + "Electrotècnia "+"preguntes juny "+year+extension);

                        downloadUsingStream(url+code+year+"jl"+extension, directory + "Electrotècnia "+"preguntes juny "+year+extension);
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                }
                for (byte year =00;year<=9;year++) {
                    try {
                        downloadUsingNIO(url+code+0+year+"jl"+extension, directory + "Electrotècnia "+"preguntes juny "+year+extension);

                        downloadUsingStream(url+code+0+year+"jl"+extension, directory + "Electrotècnia "+"preguntes juny "+year+extension);
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                }
                for (byte year =10;year<=16;year++) {
                    try {
                        downloadUsingNIO(url+code+year+"sp"+extension, directory + "Electrotècnia "+"respostes setembre "+year+extension);

                        downloadUsingStream(url+code+year+"sp"+extension, directory + "Electrotècnia "+"respostes setembre "+year+extension);
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                }
                for (byte year =00;year<=9;year++) {
                    try {
                        downloadUsingNIO(url+code+0+year+"sp"+extension, directory + "Electrotècnia "+"respostes setembre "+year+extension);

                        downloadUsingStream(url+code+0+year+"sp"+extension, directory + "Electrotècnia "+"respostes setembre "+year+extension);
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                }
                for (byte year =10;year<=16;year++) {
                    try {
                        downloadUsingNIO(url+code+year+"jp"+extension, directory + "Electrotècnia "+"respostes juny "+year+extension);

                        downloadUsingStream(url+code+year+"jp"+extension, directory + "Electrotècnia "+"respostes juny "+year+extension);
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                }for (byte year =00;year<=9;year++) {
                try {
                    downloadUsingNIO(url+code+0+year+"jp"+extension, directory + "Electrotècnia "+"respostes juny"+year+extension);

                    downloadUsingStream(url+code+0+year+"jp"+extension, directory + "Electrotècnia "+"respostes juny "+year+extension);
                } catch (IOException a) {
                    a.printStackTrace();
                }
            }
                JOptionPane.showMessageDialog(null,"DESCARREGAT");
            }
        });
        TECNOButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                java.lang.String directory = (ruta.getText()+"/");
                String code = "pau_tecn";
                String month="sl";
                String extension= ".pdf";
                String url = "http://selecat.cat/pau/";
                for (byte year =00;year<=9;year++) {
                    try {
                        downloadUsingNIO(url+code+0+year+month+extension, directory + "Tecnologia "+"preguntes setembre "+year+extension);

                        downloadUsingStream(url+code+0+year+month+extension, directory + "Tecnologia "+"preguntes setembre "+year+extension);
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                }
                for (byte year =10;year<=16;year++) {
                    try {
                        downloadUsingNIO(url+code+year+month+extension, directory + "Tecnologia "+"preguntes setembre "+year+extension);

                        downloadUsingStream(url+code+year+month+extension, directory + "Tecnologia "+"preguntes setembre "+year+extension);
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                }
                for (byte year =10;year<=16;year++) {
                    try {
                        downloadUsingNIO(url+code+year+"jl"+extension, directory + "Tecnologia "+"preguntes juny "+year+extension);

                        downloadUsingStream(url+code+year+"jl"+extension, directory + "Tecnologia "+"preguntes juny "+year+extension);
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                }
                for (byte year =00;year<=9;year++) {
                    try {
                        downloadUsingNIO(url+code+0+year+"jl"+extension, directory + "Tecnologia "+"preguntes juny "+year+extension);

                        downloadUsingStream(url+code+0+year+"jl"+extension, directory + "Tecnologia "+"preguntes juny "+year+extension);
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                }
                for (byte year =10;year<=16;year++) {
                    try {
                        downloadUsingNIO(url+code+year+"sp"+extension, directory + "Tecnologia "+"respostes setembre "+year+extension);

                        downloadUsingStream(url+code+year+"sp"+extension, directory + "Tecnologia "+"respostes setembre "+year+extension);
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                }
                for (byte year =00;year<=9;year++) {
                    try {
                        downloadUsingNIO(url+code+0+year+"sp"+extension, directory + "Tecnologia "+"respostes setembre "+year+extension);

                        downloadUsingStream(url+code+0+year+"sp"+extension, directory + "Tecnologia "+"respostes setembre "+year+extension);
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                }
                for (byte year =10;year<=16;year++) {
                    try {
                        downloadUsingNIO(url+code+year+"jp"+extension, directory + "Tecnologia "+"respostes juny "+year+extension);

                        downloadUsingStream(url+code+year+"jp"+extension, directory + "Tecnologia "+"respostes juny "+year+extension);
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                }for (byte year =00;year<=9;year++) {
                    try {
                        downloadUsingNIO(url+code+0+year+"jp"+extension, directory + "Tecnologia "+"respostes juny"+year+extension);

                        downloadUsingStream(url+code+0+year+"jp"+extension, directory + "Tecnologia "+"respostes juny "+year+extension);
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                }
                JOptionPane.showMessageDialog(null,"DESCARREGAT");
            }
        });
        DIBTECButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                java.lang.String directory = (ruta.getText()+"/");
                String code = "pau_dibu";
                String month="sl";
                String extension= ".pdf";
                String url = "http://selecat.cat/pau/";
                for (byte year =00;year<=9;year++) {
                    try {
                        downloadUsingNIO(url+code+0+year+month+extension, directory + "Dibuix tècnic "+"preguntes setembre "+year+extension);

                        downloadUsingStream(url+code+0+year+month+extension, directory + "Dibuix tècnic "+"preguntes setembre "+year+extension);
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                }
                for (byte year =10;year<=16;year++) {
                    try {
                        downloadUsingNIO(url+code+year+month+extension, directory + "Dibuix tècnic "+"preguntes setembre "+year+extension);

                        downloadUsingStream(url+code+year+month+extension, directory + "Dibuix tècnic "+"preguntes setembre "+year+extension);
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                }
                for (byte year =10;year<=16;year++) {
                    try {
                        downloadUsingNIO(url+code+year+"jl"+extension, directory + "Dibuix tècnic "+"preguntes juny "+year+extension);

                        downloadUsingStream(url+code+year+"jl"+extension, directory + "Dibuix tècnic "+"preguntes juny "+year+extension);
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                }
                for (byte year =00;year<=9;year++) {
                    try {
                        downloadUsingNIO(url+code+0+year+"jl"+extension, directory + "Dibuix tècnic "+"preguntes juny "+year+extension);

                        downloadUsingStream(url+code+0+year+"jl"+extension, directory + "Dibuix tècnic "+"preguntes juny "+year+extension);
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                }
                for (byte year =10;year<=16;year++) {
                    try {
                        downloadUsingNIO(url+code+year+"sp"+extension, directory + "Dibuix tècnic "+"respostes setembre "+year+extension);

                        downloadUsingStream(url+code+year+"sp"+extension, directory + "Dibuix tècnic "+"respostes setembre "+year+extension);
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                }
                for (byte year =00;year<=9;year++) {
                    try {
                        downloadUsingNIO(url+code+0+year+"sp"+extension, directory + "Dibuix tècnic "+"respostes setembre "+year+extension);

                        downloadUsingStream(url+code+0+year+"sp"+extension, directory + "Dibuix tècnic "+"respostes setembre "+year+extension);
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                }
                for (byte year =10;year<=16;year++) {
                    try {
                        downloadUsingNIO(url+code+year+"jp"+extension, directory + "Dibuix tècnic "+"respostes juny "+year+extension);

                        downloadUsingStream(url+code+year+"jp"+extension, directory + "Dibuix tècnic "+"respostes juny "+year+extension);
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                }for (byte year =00;year<=9;year++) {
                try {
                    downloadUsingNIO(url+code+0+year+"jp"+extension, directory + "Dibuix tècnic "+"respostes juny"+year+extension);

                    downloadUsingStream(url+code+0+year+"jp"+extension, directory + "Dibuix tècnic "+"respostes juny "+year+extension);
                } catch (IOException a) {
                    a.printStackTrace();
                }
            }
                JOptionPane.showMessageDialog(null,"DESCARREGAT");
            }
        });
        CATButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                java.lang.String directory = (ruta.getText()+"/");
                String code = "pau_llca";
                String month="sl";
                String extension= ".pdf";
                String url = "http://selecat.cat/pau/";
                for (byte year =00;year<=9;year++) {
                    try {
                        downloadUsingNIO(url+code+0+year+month+extension, directory + "Llengua catalana "+"preguntes setembre "+year+extension);

                        downloadUsingStream(url+code+0+year+month+extension, directory + "Llengua catalana "+"preguntes setembre "+year+extension);
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                }
                for (byte year =10;year<=16;year++) {
                    try {
                        downloadUsingNIO(url+code+year+month+extension, directory + "Llengua catalana "+"preguntes setembre "+year+extension);

                        downloadUsingStream(url+code+year+month+extension, directory + "Llengua catalana "+"preguntes setembre "+year+extension);
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                }
                for (byte year =10;year<=16;year++) {
                    try {
                        downloadUsingNIO(url+code+year+"jl"+extension, directory + "Llengua catalana "+"preguntes juny "+year+extension);

                        downloadUsingStream(url+code+year+"jl"+extension, directory + "Llengua catalana "+"preguntes juny "+year+extension);
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                }
                for (byte year =00;year<=9;year++) {
                    try {
                        downloadUsingNIO(url+code+0+year+"jl"+extension, directory + "Llengua catalana "+"preguntes juny "+year+extension);

                        downloadUsingStream(url+code+0+year+"jl"+extension, directory + "Llengua catalana "+"preguntes juny "+year+extension);
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                }
                for (byte year =10;year<=16;year++) {
                    try {
                        downloadUsingNIO(url+code+year+"sp"+extension, directory + "Llengua catalana "+"respostes setembre "+year+extension);

                        downloadUsingStream(url+code+year+"sp"+extension, directory + "Llengua catalana "+"respostes setembre "+year+extension);
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                }
                for (byte year =00;year<=9;year++) {
                    try {
                        downloadUsingNIO(url+code+0+year+"sp"+extension, directory + "Llengua catalana "+"respostes setembre "+year+extension);

                        downloadUsingStream(url+code+0+year+"sp"+extension, directory + "Llengua catalana "+"respostes setembre "+year+extension);
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                }
                for (byte year =10;year<=16;year++) {
                    try {
                        downloadUsingNIO(url+code+year+"jp"+extension, directory + "Llengua catalana "+"respostes juny "+year+extension);

                        downloadUsingStream(url+code+year+"jp"+extension, directory + "Llengua catalana "+"respostes juny "+year+extension);
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                }for (byte year =00;year<=9;year++) {
                try {
                    downloadUsingNIO(url+code+0+year+"jp"+extension, directory + "Llengua catalana "+"respostes juny"+year+extension);

                    downloadUsingStream(url+code+0+year+"jp"+extension, directory + "Llengua catalana "+"respostes juny "+year+extension);
                } catch (IOException a) {
                    a.printStackTrace();
                }
            }
                JOptionPane.showMessageDialog(null,"DESCARREGAT");
            }
        });
        ENGButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                java.lang.String directory = (ruta.getText()+"/");
                String code = "pau_angl";
                String month="sl";
                String extension= ".pdf";
                String url = "http://selecat.cat/pau/";
                for (byte year =00;year<=9;year++) {
                    try {
                        downloadUsingNIO(url+code+0+year+month+extension, directory + "Anglès "+"preguntes setembre "+year+extension);

                        downloadUsingStream(url+code+0+year+month+extension, directory + "Anglès "+"preguntes setembre "+year+extension);
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                }
                for (byte year =10;year<=16;year++) {
                    try {
                        downloadUsingNIO(url+code+year+month+extension, directory + "Anglès "+"preguntes setembre "+year+extension);

                        downloadUsingStream(url+code+year+month+extension, directory + "Anglès "+"preguntes setembre "+year+extension);
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                }
                for (byte year =10;year<=16;year++) {
                    try {
                        downloadUsingNIO(url+code+year+"jl"+extension, directory + "Anglès "+"preguntes juny "+year+extension);

                        downloadUsingStream(url+code+year+"jl"+extension, directory + "Anglès "+"preguntes juny "+year+extension);
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                }
                for (byte year =00;year<=9;year++) {
                    try {
                        downloadUsingNIO(url+code+0+year+"jl"+extension, directory + "Anglès "+"preguntes juny "+year+extension);

                        downloadUsingStream(url+code+0+year+"jl"+extension, directory + "Anglès "+"preguntes juny "+year+extension);
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                }
                for (byte year =10;year<=16;year++) {
                    try {
                        downloadUsingNIO(url+code+year+"sp"+extension, directory + "Anglès "+"respostes setembre "+year+extension);

                        downloadUsingStream(url+code+year+"sp"+extension, directory + "Anglès "+"respostes setembre "+year+extension);
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                }
                for (byte year =00;year<=9;year++) {
                    try {
                        downloadUsingNIO(url+code+0+year+"sp"+extension, directory + "Anglès "+"respostes setembre "+year+extension);

                        downloadUsingStream(url+code+0+year+"sp"+extension, directory + "Anglès "+"respostes setembre "+year+extension);
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                }
                for (byte year =10;year<=16;year++) {
                    try {
                        downloadUsingNIO(url+code+year+"jp"+extension, directory + "Anglès "+"respostes juny "+year+extension);

                        downloadUsingStream(url+code+year+"jp"+extension, directory + "Anglès "+"respostes juny "+year+extension);
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                }for (byte year =00;year<=9;year++) {
                    try {
                        downloadUsingNIO(url+code+0+year+"jp"+extension, directory + "Anglès "+"respostes juny"+year+extension);

                        downloadUsingStream(url+code+0+year+"jp"+extension, directory + "Anglès "+"respostes juny "+year+extension);
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                }
                JOptionPane.showMessageDialog(null,"DESCARREGAT");
            }
        });
        FRANCButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                java.lang.String directory = (ruta.getText()+"/");
                String code = "pau_fran";
                String month="sl";
                String extension= ".pdf";
                String url = "http://selecat.cat/pau/";
                for (byte year =00;year<=9;year++) {
                    try {
                        downloadUsingNIO(url+code+0+year+month+extension, directory + "Francès "+"preguntes setembre "+year+extension);

                        downloadUsingStream(url+code+0+year+month+extension, directory + "Francès "+"preguntes setembre "+year+extension);
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                }
                for (byte year =10;year<=16;year++) {
                    try {
                        downloadUsingNIO(url+code+year+month+extension, directory + "Francès "+"preguntes setembre "+year+extension);

                        downloadUsingStream(url+code+year+month+extension, directory + "Francès "+"preguntes setembre "+year+extension);
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                }
                for (byte year =10;year<=16;year++) {
                    try {
                        downloadUsingNIO(url+code+year+"jl"+extension, directory + "Francès "+"preguntes juny "+year+extension);

                        downloadUsingStream(url+code+year+"jl"+extension, directory + "Francès "+"preguntes juny "+year+extension);
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                }
                for (byte year =00;year<=9;year++) {
                    try {
                        downloadUsingNIO(url+code+0+year+"jl"+extension, directory + "Francès "+"preguntes juny "+year+extension);

                        downloadUsingStream(url+code+0+year+"jl"+extension, directory + "Francès "+"preguntes juny "+year+extension);
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                }
                for (byte year =10;year<=16;year++) {
                    try {
                        downloadUsingNIO(url+code+year+"sp"+extension, directory + "Francès "+"respostes setembre "+year+extension);

                        downloadUsingStream(url+code+year+"sp"+extension, directory + "Francès "+"respostes setembre "+year+extension);
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                }
                for (byte year =00;year<=9;year++) {
                    try {
                        downloadUsingNIO(url+code+0+year+"sp"+extension, directory + "Francès "+"respostes setembre "+year+extension);

                        downloadUsingStream(url+code+0+year+"sp"+extension, directory + "Francès "+"respostes setembre "+year+extension);
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                }
                for (byte year =10;year<=16;year++) {
                    try {
                        downloadUsingNIO(url+code+year+"jp"+extension, directory + "Francès "+"respostes juny "+year+extension);

                        downloadUsingStream(url+code+year+"jp"+extension, directory + "Francès "+"respostes juny "+year+extension);
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                }for (byte year =00;year<=9;year++) {
                try {
                    downloadUsingNIO(url+code+0+year+"jp"+extension, directory + "Francès "+"respostes juny"+year+extension);

                    downloadUsingStream(url+code+0+year+"jp"+extension, directory + "Francès "+"respostes juny "+year+extension);
                } catch (IOException a) {
                    a.printStackTrace();
                }
            }
                JOptionPane.showMessageDialog(null,"DESCARREGAT");
            }
        });
        ALEMButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {

                java.lang.String directory = (ruta.getText()+"/");
                String code = "pau_alem";
                String month="sl";
                String extension= ".pdf";
                String url = "http://selecat.cat/pau/";
                for (byte year =00;year<=9;year++) {
                    try {
                        downloadUsingNIO(url+code+0+year+month+extension, directory + "Alemany "+"preguntes setembre "+year+extension);

                        downloadUsingStream(url+code+0+year+month+extension, directory + "Alemany "+"preguntes setembre "+year+extension);
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                }
                for (byte year =10;year<=16;year++) {
                    try {
                        downloadUsingNIO(url+code+year+month+extension, directory + "Alemany "+"preguntes setembre "+year+extension);

                        downloadUsingStream(url+code+year+month+extension, directory + "Alemany "+"preguntes setembre "+year+extension);
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                }
                for (byte year =10;year<=16;year++) {
                    try {
                        downloadUsingNIO(url+code+year+"jl"+extension, directory + "Alemany "+"preguntes juny "+year+extension);

                        downloadUsingStream(url+code+year+"jl"+extension, directory + "Alemany "+"preguntes juny "+year+extension);
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                }
                for (byte year =00;year<=9;year++) {
                    try {
                        downloadUsingNIO(url+code+0+year+"jl"+extension, directory + "Alemany "+"preguntes juny "+year+extension);

                        downloadUsingStream(url+code+0+year+"jl"+extension, directory + "Alemany "+"preguntes juny "+year+extension);
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                }
                for (byte year =10;year<=16;year++) {
                    try {
                        downloadUsingNIO(url+code+year+"sp"+extension, directory + "Alemany "+"respostes setembre "+year+extension);

                        downloadUsingStream(url+code+year+"sp"+extension, directory + "Alemany "+"respostes setembre "+year+extension);
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                }
                for (byte year =00;year<=9;year++) {
                    try {
                        downloadUsingNIO(url+code+0+year+"sp"+extension, directory + "Alemany "+"respostes setembre "+year+extension);

                        downloadUsingStream(url+code+0+year+"sp"+extension, directory + "Alemany "+"respostes setembre "+year+extension);
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                }
                for (byte year =10;year<=16;year++) {
                    try {
                        downloadUsingNIO(url+code+year+"jp"+extension, directory + "Alemany "+"respostes juny "+year+extension);

                        downloadUsingStream(url+code+year+"jp"+extension, directory + "Alemany "+"respostes juny "+year+extension);
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                }for (byte year =00;year<=9;year++) {
                try {
                    downloadUsingNIO(url+code+0+year+"jp"+extension, directory + "Alemany "+"respostes juny"+year+extension);

                    downloadUsingStream(url+code+0+year+"jp"+extension, directory + "Alemany "+"respostes juny "+year+extension);
                } catch (IOException a) {
                    a.printStackTrace();
                }
            }
                JOptionPane.showMessageDialog(null,"DESCARREGAT");
            }
        });
        LLATIButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                java.lang.String directory = (ruta.getText()+"/");
                String code = "pau_llat";
                String month="sl";
                String extension= ".pdf";
                String url = "http://selecat.cat/pau/";
                for (byte year =00;year<=9;year++) {
                    try {
                        downloadUsingNIO(url+code+0+year+month+extension, directory + "Llatí "+"preguntes setembre "+year+extension);

                        downloadUsingStream(url+code+0+year+month+extension, directory + "Llatí "+"preguntes setembre "+year+extension);
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                }
                for (byte year =10;year<=16;year++) {
                    try {
                        downloadUsingNIO(url+code+year+month+extension, directory + "Llatí "+"preguntes setembre "+year+extension);

                        downloadUsingStream(url+code+year+month+extension, directory + "Llatí "+"preguntes setembre "+year+extension);
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                }
                for (byte year =10;year<=16;year++) {
                    try {
                        downloadUsingNIO(url+code+year+"jl"+extension, directory + "Llatí "+"preguntes juny "+year+extension);

                        downloadUsingStream(url+code+year+"jl"+extension, directory + "Llatí "+"preguntes juny "+year+extension);
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                }
                for (byte year =00;year<=9;year++) {
                    try {
                        downloadUsingNIO(url+code+0+year+"jl"+extension, directory + "Llatí "+"preguntes juny "+year+extension);

                        downloadUsingStream(url+code+0+year+"jl"+extension, directory + "Llatí "+"preguntes juny "+year+extension);
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                }
                for (byte year =10;year<=16;year++) {
                    try {
                        downloadUsingNIO(url+code+year+"sp"+extension, directory + "Llatí "+"respostes setembre "+year+extension);

                        downloadUsingStream(url+code+year+"sp"+extension, directory + "Llatí "+"respostes setembre "+year+extension);
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                }
                for (byte year =00;year<=9;year++) {
                    try {
                        downloadUsingNIO(url+code+0+year+"sp"+extension, directory + "Llatí "+"respostes setembre "+year+extension);

                        downloadUsingStream(url+code+0+year+"sp"+extension, directory + "Llatí "+"respostes setembre "+year+extension);
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                }
                for (byte year =10;year<=16;year++) {
                    try {
                        downloadUsingNIO(url+code+year+"jp"+extension, directory + "Llatí "+"respostes juny "+year+extension);

                        downloadUsingStream(url+code+year+"jp"+extension, directory + "Llatí "+"respostes juny "+year+extension);
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                }for (byte year =00;year<=9;year++) {
                    try {
                        downloadUsingNIO(url+code+0+year+"jp"+extension, directory + "Llatí "+"respostes juny"+year+extension);

                        downloadUsingStream(url+code+0+year+"jp"+extension, directory + "Llatí "+"respostes juny "+year+extension);
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                }
                JOptionPane.showMessageDialog(null,"DESCARREGAT");
            }
        });
        MATCSButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                java.lang.String directory = (ruta.getText()+"/");
                String code = "pau_macs";
                String month="sl";
                String extension= ".pdf";
                String url = "http://selecat.cat/pau/";
                for (byte year =00;year<=9;year++) {
                    try {
                        downloadUsingNIO(url+code+0+year+month+extension, directory + "Matemàtiques social "+"preguntes setembre "+year+extension);

                        downloadUsingStream(url+code+0+year+month+extension, directory + "Matemàtiques social "+"preguntes setembre "+year+extension);
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                }
                for (byte year =10;year<=16;year++) {
                    try {
                        downloadUsingNIO(url+code+year+month+extension, directory + "Matemàtiques social "+"preguntes setembre "+year+extension);

                        downloadUsingStream(url+code+year+month+extension, directory + "Matemàtiques social "+"preguntes setembre "+year+extension);
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                }
                for (byte year =10;year<=16;year++) {
                    try {
                        downloadUsingNIO(url+code+year+"jl"+extension, directory + "Matemàtiques social "+"preguntes juny "+year+extension);

                        downloadUsingStream(url+code+year+"jl"+extension, directory + "Matemàtiques social "+"preguntes juny "+year+extension);
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                }
                for (byte year =00;year<=9;year++) {
                    try {
                        downloadUsingNIO(url+code+0+year+"jl"+extension, directory + "Matemàtiques social "+"preguntes juny "+year+extension);

                        downloadUsingStream(url+code+0+year+"jl"+extension, directory + "Matemàtiques social "+"preguntes juny "+year+extension);
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                }
                for (byte year =10;year<=16;year++) {
                    try {
                        downloadUsingNIO(url+code+year+"sp"+extension, directory + "Matemàtiques social "+"respostes setembre "+year+extension);

                        downloadUsingStream(url+code+year+"sp"+extension, directory + "Matemàtiques social "+"respostes setembre "+year+extension);
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                }
                for (byte year =00;year<=9;year++) {
                    try {
                        downloadUsingNIO(url+code+0+year+"sp"+extension, directory + "Matemàtiques social "+"respostes setembre "+year+extension);

                        downloadUsingStream(url+code+0+year+"sp"+extension, directory + "Matemàtiques social "+"respostes setembre "+year+extension);
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                }
                for (byte year =10;year<=16;year++) {
                    try {
                        downloadUsingNIO(url+code+year+"jp"+extension, directory + "Matemàtiques social "+"respostes juny "+year+extension);

                        downloadUsingStream(url+code+year+"jp"+extension, directory + "Matemàtiques social "+"respostes juny "+year+extension);
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                }for (byte year =00;year<=9;year++) {
                    try {
                        downloadUsingNIO(url+code+0+year+"jp"+extension, directory + "Matemàtiques social "+"respostes juny"+year+extension);

                        downloadUsingStream(url+code+0+year+"jp"+extension, directory + "Matemàtiques social "+"respostes juny "+year+extension);
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                }
                JOptionPane.showMessageDialog(null,"DESCARREGAT");
            }
        });
        ECOEButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                java.lang.String directory = (ruta.getText()+"/");
                String code = "pau_ecem";
                String month="sl";
                String extension= ".pdf";
                String url = "http://selecat.cat/pau/";
                for (byte year =00;year<=9;year++) {
                    try {
                        downloadUsingNIO(url+code+0+year+month+extension, directory + "Economia de l'Empresa "+"preguntes setembre "+year+extension);

                        downloadUsingStream(url+code+0+year+month+extension, directory + "Economia de l'Empresa "+"preguntes setembre "+year+extension);
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                }
                for (byte year =10;year<=16;year++) {
                    try {
                        downloadUsingNIO(url+code+year+month+extension, directory + "Economia de l'Empresa "+"preguntes setembre "+year+extension);

                        downloadUsingStream(url+code+year+month+extension, directory + "Economia de l'Empresa "+"preguntes setembre "+year+extension);
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                }
                for (byte year =10;year<=16;year++) {
                    try {
                        downloadUsingNIO(url+code+year+"jl"+extension, directory + "Economia de l'Empresa "+"preguntes juny "+year+extension);

                        downloadUsingStream(url+code+year+"jl"+extension, directory + "Economia de l'Empresa "+"preguntes juny "+year+extension);
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                }
                for (byte year =00;year<=9;year++) {
                    try {
                        downloadUsingNIO(url+code+0+year+"jl"+extension, directory + "Economia de l'Empresa "+"preguntes juny "+year+extension);

                        downloadUsingStream(url+code+0+year+"jl"+extension, directory + "Economia de l'Empresa "+"preguntes juny "+year+extension);
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                }
                for (byte year =10;year<=16;year++) {
                    try {
                        downloadUsingNIO(url+code+year+"sp"+extension, directory + "Economia de l'Empresa "+"respostes setembre "+year+extension);

                        downloadUsingStream(url+code+year+"sp"+extension, directory + "Economia de l'Empresa "+"respostes setembre "+year+extension);
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                }
                for (byte year =00;year<=9;year++) {
                    try {
                        downloadUsingNIO(url+code+0+year+"sp"+extension, directory + "Economia de l'Empresa "+"respostes setembre "+year+extension);

                        downloadUsingStream(url+code+0+year+"sp"+extension, directory + "Economia de l'Empresa "+"respostes setembre "+year+extension);
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                }
                for (byte year =10;year<=16;year++) {
                    try {
                        downloadUsingNIO(url+code+year+"jp"+extension, directory + "Economia de l'Empresa "+"respostes juny "+year+extension);

                        downloadUsingStream(url+code+year+"jp"+extension, directory + "Economia de l'Empresa "+"respostes juny "+year+extension);
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                }for (byte year =00;year<=9;year++) {
                    try {
                        downloadUsingNIO(url+code+0+year+"jp"+extension, directory + "Economia de l'Empresa "+"respostes juny"+year+extension);

                        downloadUsingStream(url+code+0+year+"jp"+extension, directory + "Economia de l'Empresa "+"respostes juny "+year+extension);
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                }
                JOptionPane.showMessageDialog(null,"DESCARREGAT");
            }
        });
        FISICAButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                java.lang.String directory = (ruta.getText()+"/");
                String code = "pau_fisi";
                String month="sl";
                String extension= ".pdf";
                String url = "http://selecat.cat/pau/";
                for (byte year =00;year<=9;year++) {
                    try {
                        downloadUsingNIO(url+code+0+year+month+extension, directory + "Física "+"preguntes setembre "+year+extension);

                        downloadUsingStream(url+code+0+year+month+extension, directory + "Física "+"preguntes setembre "+year+extension);
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                }
                for (byte year =10;year<=16;year++) {
                    try {
                        downloadUsingNIO(url+code+year+month+extension, directory + "Física "+"preguntes setembre "+year+extension);

                        downloadUsingStream(url+code+year+month+extension, directory + "Física "+"preguntes setembre "+year+extension);
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                }
                for (byte year =10;year<=16;year++) {
                    try {
                        downloadUsingNIO(url+code+year+"jl"+extension, directory + "Física "+"preguntes juny "+year+extension);

                        downloadUsingStream(url+code+year+"jl"+extension, directory + "Física "+"preguntes juny "+year+extension);
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                }
                for (byte year =00;year<=9;year++) {
                    try {
                        downloadUsingNIO(url+code+0+year+"jl"+extension, directory + "Física "+"preguntes juny "+year+extension);

                        downloadUsingStream(url+code+0+year+"jl"+extension, directory + "Física "+"preguntes juny "+year+extension);
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                }
                for (byte year =10;year<=16;year++) {
                    try {
                        downloadUsingNIO(url+code+year+"sp"+extension, directory + "Física "+"respostes setembre "+year+extension);

                        downloadUsingStream(url+code+year+"sp"+extension, directory + "Física "+"respostes setembre "+year+extension);
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                }
                for (byte year =00;year<=9;year++) {
                    try {
                        downloadUsingNIO(url+code+0+year+"sp"+extension, directory + "Física "+"respostes setembre "+year+extension);

                        downloadUsingStream(url+code+0+year+"sp"+extension, directory + "Física "+"respostes setembre "+year+extension);
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                }
                for (byte year =10;year<=16;year++) {
                    try {
                        downloadUsingNIO(url+code+year+"jp"+extension, directory + "Física "+"respostes juny "+year+extension);

                        downloadUsingStream(url+code+year+"jp"+extension, directory + "Física "+"respostes juny "+year+extension);
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                }for (byte year =00;year<=9;year++) {
                    try {
                        downloadUsingNIO(url+code+0+year+"jp"+extension, directory + "Física "+"respostes juny"+year+extension);

                        downloadUsingStream(url+code+0+year+"jp"+extension, directory + "Física "+"respostes juny "+year+extension);
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                }
                JOptionPane.showMessageDialog(null,"DESCARREGAT");
            }
        });
        QUIMICAButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                java.lang.String directory = (ruta.getText()+"/");
                String code = "pau_quim";
                String month="sl";
                String extension= ".pdf";
                String url = "http://selecat.cat/pau/";
                for (byte year =00;year<=9;year++) {
                    try {
                        downloadUsingNIO(url+code+0+year+month+extension, directory + "Química "+"preguntes setembre "+year+extension);

                        downloadUsingStream(url+code+0+year+month+extension, directory + "Química "+"preguntes setembre "+year+extension);
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                }
                for (byte year =10;year<=16;year++) {
                    try {
                        downloadUsingNIO(url+code+year+month+extension, directory + "Química "+"preguntes setembre "+year+extension);

                        downloadUsingStream(url+code+year+month+extension, directory + "Química "+"preguntes setembre "+year+extension);
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                }
                for (byte year =10;year<=16;year++) {
                    try {
                        downloadUsingNIO(url+code+year+"jl"+extension, directory + "Química "+"preguntes juny "+year+extension);

                        downloadUsingStream(url+code+year+"jl"+extension, directory + "Química "+"preguntes juny "+year+extension);
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                }
                for (byte year =00;year<=9;year++) {
                    try {
                        downloadUsingNIO(url+code+0+year+"jl"+extension, directory + "Química "+"preguntes juny "+year+extension);

                        downloadUsingStream(url+code+0+year+"jl"+extension, directory + "Química "+"preguntes juny "+year+extension);
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                }
                for (byte year =10;year<=16;year++) {
                    try {
                        downloadUsingNIO(url+code+year+"sp"+extension, directory + "Química "+"respostes setembre "+year+extension);

                        downloadUsingStream(url+code+year+"sp"+extension, directory + "Química "+"respostes setembre "+year+extension);
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                }
                for (byte year =00;year<=9;year++) {
                    try {
                        downloadUsingNIO(url+code+0+year+"sp"+extension, directory + "Química "+"respostes setembre "+year+extension);

                        downloadUsingStream(url+code+0+year+"sp"+extension, directory + "Química "+"respostes setembre "+year+extension);
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                }
                for (byte year =10;year<=16;year++) {
                    try {
                        downloadUsingNIO(url+code+year+"jp"+extension, directory + "Química "+"respostes juny "+year+extension);

                        downloadUsingStream(url+code+year+"jp"+extension, directory + "Química "+"respostes juny "+year+extension);
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                }for (byte year =00;year<=9;year++) {
                    try {
                        downloadUsingNIO(url+code+0+year+"jp"+extension, directory + "Química "+"respostes juny"+year+extension);

                        downloadUsingStream(url+code+0+year+"jp"+extension, directory + "Química "+"respostes juny "+year+extension);
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                }
                JOptionPane.showMessageDialog(null,"DESCARREGAT");
            }
        });
        BIOButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                java.lang.String directory = (ruta.getText()+"/");
                String code = "pau_biol";
                String month="sl";
                String extension= ".pdf";
                String url = "http://selecat.cat/pau/";
                for (byte year =00;year<=9;year++) {
                    try {
                        downloadUsingNIO(url+code+0+year+month+extension, directory + "Biologia "+"preguntes setembre "+year+extension);

                        downloadUsingStream(url+code+0+year+month+extension, directory + "Biologia "+"preguntes setembre "+year+extension);
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                }
                for (byte year =10;year<=16;year++) {
                    try {
                        downloadUsingNIO(url+code+year+month+extension, directory + "Biologia "+"preguntes setembre "+year+extension);

                        downloadUsingStream(url+code+year+month+extension, directory + "Biologia "+"preguntes setembre "+year+extension);
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                }
                for (byte year =10;year<=16;year++) {
                    try {
                        downloadUsingNIO(url+code+year+"jl"+extension, directory + "Biologia "+"preguntes juny "+year+extension);

                        downloadUsingStream(url+code+year+"jl"+extension, directory + "Biologia "+"preguntes juny "+year+extension);
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                }
                for (byte year =00;year<=9;year++) {
                    try {
                        downloadUsingNIO(url+code+0+year+"jl"+extension, directory + "Biologia "+"preguntes juny "+year+extension);

                        downloadUsingStream(url+code+0+year+"jl"+extension, directory + "Biologia "+"preguntes juny "+year+extension);
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                }
                for (byte year =10;year<=16;year++) {
                    try {
                        downloadUsingNIO(url+code+year+"sp"+extension, directory + "Biologia "+"respostes setembre "+year+extension);

                        downloadUsingStream(url+code+year+"sp"+extension, directory + "Biologia "+"respostes setembre "+year+extension);
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                }
                for (byte year =00;year<=9;year++) {
                    try {
                        downloadUsingNIO(url+code+0+year+"sp"+extension, directory + "Biologia "+"respostes setembre "+year+extension);

                        downloadUsingStream(url+code+0+year+"sp"+extension, directory + "Biologia "+"respostes setembre "+year+extension);
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                }
                for (byte year =10;year<=16;year++) {
                    try {
                        downloadUsingNIO(url+code+year+"jp"+extension, directory + "Biologia "+"respostes juny "+year+extension);

                        downloadUsingStream(url+code+year+"jp"+extension, directory + "Biologia "+"respostes juny "+year+extension);
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                }for (byte year =00;year<=9;year++) {
                    try {
                        downloadUsingNIO(url+code+0+year+"jp"+extension, directory + "Biologia "+"respostes juny"+year+extension);

                        downloadUsingStream(url+code+0+year+"jp"+extension, directory + "Biologia "+"respostes juny "+year+extension);
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                }
                JOptionPane.showMessageDialog(null,"DESCARREGAT");
            }
        });
        CMTButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                java.lang.String directory = (ruta.getText()+"/");
                String code = "pau_cite";
                String month="sl";
                String extension= ".pdf";
                String url = "http://selecat.cat/pau/";
                for (byte year =00;year<=9;year++) {
                    try {
                        downloadUsingNIO(url+code+0+year+month+extension, directory + "CC. Terra i medi ambient "+"preguntes setembre "+year+extension);

                        downloadUsingStream(url+code+0+year+month+extension, directory + "CC. Terra i medi ambient "+"preguntes setembre "+year+extension);
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                }
                for (byte year =10;year<=16;year++) {
                    try {
                        downloadUsingNIO(url+code+year+month+extension, directory + "CC. Terra i medi ambient "+"preguntes setembre "+year+extension);

                        downloadUsingStream(url+code+year+month+extension, directory + "CC. Terra i medi ambient "+"preguntes setembre "+year+extension);
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                }
                for (byte year =10;year<=16;year++) {
                    try {
                        downloadUsingNIO(url+code+year+"jl"+extension, directory + "CC. Terra i medi ambient "+"preguntes juny "+year+extension);

                        downloadUsingStream(url+code+year+"jl"+extension, directory + "CC. Terra i medi ambient "+"preguntes juny "+year+extension);
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                }
                for (byte year =00;year<=9;year++) {
                    try {
                        downloadUsingNIO(url+code+0+year+"jl"+extension, directory + "CC. Terra i medi ambient "+"preguntes juny "+year+extension);

                        downloadUsingStream(url+code+0+year+"jl"+extension, directory + "CC. Terra i medi ambient "+"preguntes juny "+year+extension);
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                }
                for (byte year =10;year<=16;year++) {
                    try {
                        downloadUsingNIO(url+code+year+"sp"+extension, directory + "CC. Terra i medi ambient "+"respostes setembre "+year+extension);

                        downloadUsingStream(url+code+year+"sp"+extension, directory + "CC. Terra i medi ambient "+"respostes setembre "+year+extension);
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                }
                for (byte year =00;year<=9;year++) {
                    try {
                        downloadUsingNIO(url+code+0+year+"sp"+extension, directory + "CC. Terra i medi ambient "+"respostes setembre "+year+extension);

                        downloadUsingStream(url+code+0+year+"sp"+extension, directory + "CC. Terra i medi ambient "+"respostes setembre "+year+extension);
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                }
                for (byte year =10;year<=16;year++) {
                    try {
                        downloadUsingNIO(url+code+year+"jp"+extension, directory + "CC. Terra i medi ambient "+"respostes juny "+year+extension);

                        downloadUsingStream(url+code+year+"jp"+extension, directory + "CC. Terra i medi ambient "+"respostes juny "+year+extension);
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                }for (byte year =00;year<=9;year++) {
                    try {
                        downloadUsingNIO(url+code+0+year+"jp"+extension, directory + "CC. Terra i medi ambient "+"respostes juny"+year+extension);

                        downloadUsingStream(url+code+0+year+"jp"+extension, directory + "CC. Terra i medi ambient "+"respostes juny "+year+extension);
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                }
                JOptionPane.showMessageDialog(null,"DESCARREGAT");
            }
        });
        HISTButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                java.lang.String directory = (ruta.getText()+"/");
                String code = "pau_hist";
                String month="sl";
                String extension= ".pdf";
                String url = "http://selecat.cat/pau/";
                for (byte year =00;year<=9;year++) {
                    try {
                        downloadUsingNIO(url+code+0+year+month+extension, directory + "Història "+"preguntes setembre "+year+extension);

                        downloadUsingStream(url+code+0+year+month+extension, directory + "Història "+"preguntes setembre "+year+extension);
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                }
                for (byte year =10;year<=16;year++) {
                    try {
                        downloadUsingNIO(url+code+year+month+extension, directory + "Història "+"preguntes setembre "+year+extension);

                        downloadUsingStream(url+code+year+month+extension, directory + "Història "+"preguntes setembre "+year+extension);
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                }
                for (byte year =10;year<=16;year++) {
                    try {
                        downloadUsingNIO(url+code+year+"jl"+extension, directory + "Història "+"preguntes juny "+year+extension);

                        downloadUsingStream(url+code+year+"jl"+extension, directory + "Història "+"preguntes juny "+year+extension);
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                }
                for (byte year =00;year<=9;year++) {
                    try {
                        downloadUsingNIO(url+code+0+year+"jl"+extension, directory + "Història "+"preguntes juny "+year+extension);

                        downloadUsingStream(url+code+0+year+"jl"+extension, directory + "Història "+"preguntes juny "+year+extension);
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                }
                for (byte year =10;year<=16;year++) {
                    try {
                        downloadUsingNIO(url+code+year+"sp"+extension, directory + "Història "+"respostes setembre "+year+extension);

                        downloadUsingStream(url+code+year+"sp"+extension, directory + "Història "+"respostes setembre "+year+extension);
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                }
                for (byte year =00;year<=9;year++) {
                    try {
                        downloadUsingNIO(url+code+0+year+"sp"+extension, directory + "Història "+"respostes setembre "+year+extension);

                        downloadUsingStream(url+code+0+year+"sp"+extension, directory + "Història "+"respostes setembre "+year+extension);
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                }
                for (byte year =10;year<=16;year++) {
                    try {
                        downloadUsingNIO(url+code+year+"jp"+extension, directory + "Història "+"respostes juny "+year+extension);

                        downloadUsingStream(url+code+year+"jp"+extension, directory + "Història "+"respostes juny "+year+extension);
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                }for (byte year =00;year<=9;year++) {
                    try {
                        downloadUsingNIO(url+code+0+year+"jp"+extension, directory + "Història "+"respostes juny"+year+extension);

                        downloadUsingStream(url+code+0+year+"jp"+extension, directory + "Història "+"respostes juny "+year+extension);
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                }
                JOptionPane.showMessageDialog(null,"DESCARREGAT");
            }
        });
        HISTARTButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                java.lang.String directory = (ruta.getText()+"/");
                String code = "pau_hart";
                String month="sl";
                String extension= ".pdf";
                String url = "http://selecat.cat/pau/";
                for (byte year =00;year<=9;year++) {
                    try {
                        downloadUsingNIO(url+code+0+year+month+extension, directory + "Història de l'art "+"preguntes setembre "+year+extension);

                        downloadUsingStream(url+code+0+year+month+extension, directory + "Història de l'art "+"preguntes setembre "+year+extension);
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                }
                for (byte year =10;year<=16;year++) {
                    try {
                        downloadUsingNIO(url+code+year+month+extension, directory + "Història de l'art "+"preguntes setembre "+year+extension);

                        downloadUsingStream(url+code+year+month+extension, directory + "Història de l'art "+"preguntes setembre "+year+extension);
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                }
                for (byte year =10;year<=16;year++) {
                    try {
                        downloadUsingNIO(url+code+year+"jl"+extension, directory + "Història de l'art "+"preguntes juny "+year+extension);

                        downloadUsingStream(url+code+year+"jl"+extension, directory + "Història de l'art "+"preguntes juny "+year+extension);
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                }
                for (byte year =00;year<=9;year++) {
                    try {
                        downloadUsingNIO(url+code+0+year+"jl"+extension, directory + "Història de l'art "+"preguntes juny "+year+extension);

                        downloadUsingStream(url+code+0+year+"jl"+extension, directory + "Història de l'art "+"preguntes juny "+year+extension);
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                }
                for (byte year =10;year<=16;year++) {
                    try {
                        downloadUsingNIO(url+code+year+"sp"+extension, directory + "Història de l'art "+"respostes setembre "+year+extension);

                        downloadUsingStream(url+code+year+"sp"+extension, directory + "Història de l'art "+"respostes setembre "+year+extension);
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                }
                for (byte year =00;year<=9;year++) {
                    try {
                        downloadUsingNIO(url+code+0+year+"sp"+extension, directory + "Història de l'art "+"respostes setembre "+year+extension);

                        downloadUsingStream(url+code+0+year+"sp"+extension, directory + "Història de l'art "+"respostes setembre "+year+extension);
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                }
                for (byte year =10;year<=16;year++) {
                    try {
                        downloadUsingNIO(url+code+year+"jp"+extension, directory + "Història de l'art "+"respostes juny "+year+extension);

                        downloadUsingStream(url+code+year+"jp"+extension, directory + "Història de l'art "+"respostes juny "+year+extension);
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                }for (byte year =00;year<=9;year++) {
                    try {
                        downloadUsingNIO(url+code+0+year+"jp"+extension, directory + "Història de l'art "+"respostes juny"+year+extension);

                        downloadUsingStream(url+code+0+year+"jp"+extension, directory + "Història de l'art "+"respostes juny "+year+extension);
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                }
                JOptionPane.showMessageDialog(null,"DESCARREGAT");
            }
        });
        GEOButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                java.lang.String directory = (ruta.getText()+"/");
                String code = "pau_hart";
                String month="sl";
                String extension= ".pdf";
                String url = "http://selecat.cat/pau/";
                for (byte year =00;year<=9;year++) {
                    try {
                        downloadUsingNIO(url+code+0+year+month+extension, directory + "Geologia "+"preguntes setembre "+year+extension);

                        downloadUsingStream(url+code+0+year+month+extension, directory + "Geologia "+"preguntes setembre "+year+extension);
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                }
                for (byte year =10;year<=16;year++) {
                    try {
                        downloadUsingNIO(url+code+year+month+extension, directory + "Geologia "+"preguntes setembre "+year+extension);

                        downloadUsingStream(url+code+year+month+extension, directory + "Geologia "+"preguntes setembre "+year+extension);
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                }
                for (byte year =10;year<=16;year++) {
                    try {
                        downloadUsingNIO(url+code+year+"jl"+extension, directory + "Geologia "+"preguntes juny "+year+extension);

                        downloadUsingStream(url+code+year+"jl"+extension, directory + "Geologia "+"preguntes juny "+year+extension);
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                }
                for (byte year =00;year<=9;year++) {
                    try {
                        downloadUsingNIO(url+code+0+year+"jl"+extension, directory + "Geologia "+"preguntes juny "+year+extension);

                        downloadUsingStream(url+code+0+year+"jl"+extension, directory + "Geologia "+"preguntes juny "+year+extension);
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                }
                for (byte year =10;year<=16;year++) {
                    try {
                        downloadUsingNIO(url+code+year+"sp"+extension, directory + "Geologia "+"respostes setembre "+year+extension);

                        downloadUsingStream(url+code+year+"sp"+extension, directory + "Geologia "+"respostes setembre "+year+extension);
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                }
                for (byte year =00;year<=9;year++) {
                    try {
                        downloadUsingNIO(url+code+0+year+"sp"+extension, directory + "Geologia "+"respostes setembre "+year+extension);

                        downloadUsingStream(url+code+0+year+"sp"+extension, directory + "Geologia "+"respostes setembre "+year+extension);
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                }
                for (byte year =10;year<=16;year++) {
                    try {
                        downloadUsingNIO(url+code+year+"jp"+extension, directory + "Geologia "+"respostes juny "+year+extension);

                        downloadUsingStream(url+code+year+"jp"+extension, directory + "Geologia "+"respostes juny "+year+extension);
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                }for (byte year =00;year<=9;year++) {
                    try {
                        downloadUsingNIO(url+code+0+year+"jp"+extension, directory + "Geologia "+"respostes juny"+year+extension);

                        downloadUsingStream(url+code+0+year+"jp"+extension, directory + "Geologia "+"respostes juny "+year+extension);
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                }
                JOptionPane.showMessageDialog(null,"DESCARREGAT");
            }
        });
        FILOButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                java.lang.String directory = (ruta.getText()+"/");
                String code = "pau_hfil";
                String month="sl";
                String extension= ".pdf";
                String url = "http://selecat.cat/pau/";
                for (byte year =00;year<=9;year++) {
                    try {
                        downloadUsingNIO(url+code+0+year+month+extension, directory + "Filosofia "+"preguntes setembre "+year+extension);

                        downloadUsingStream(url+code+0+year+month+extension, directory + "Filosofia "+"preguntes setembre "+year+extension);
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                }
                for (byte year =10;year<=16;year++) {
                    try {
                        downloadUsingNIO(url+code+year+month+extension, directory + "Filosofia "+"preguntes setembre "+year+extension);

                        downloadUsingStream(url+code+year+month+extension, directory + "Filosofia "+"preguntes setembre "+year+extension);
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                }
                for (byte year =10;year<=16;year++) {
                    try {
                        downloadUsingNIO(url+code+year+"jl"+extension, directory + "Filosofia "+"preguntes juny "+year+extension);

                        downloadUsingStream(url+code+year+"jl"+extension, directory + "Filosofia "+"preguntes juny "+year+extension);
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                }
                for (byte year =00;year<=9;year++) {
                    try {
                        downloadUsingNIO(url+code+0+year+"jl"+extension, directory + "Filosofia "+"preguntes juny "+year+extension);

                        downloadUsingStream(url+code+0+year+"jl"+extension, directory + "Filosofia "+"preguntes juny "+year+extension);
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                }
                for (byte year =10;year<=16;year++) {
                    try {
                        downloadUsingNIO(url+code+year+"sp"+extension, directory + "Filosofia "+"respostes setembre "+year+extension);

                        downloadUsingStream(url+code+year+"sp"+extension, directory + "Filosofia "+"respostes setembre "+year+extension);
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                }
                for (byte year =00;year<=9;year++) {
                    try {
                        downloadUsingNIO(url+code+0+year+"sp"+extension, directory + "Filosofia "+"respostes setembre "+year+extension);

                        downloadUsingStream(url+code+0+year+"sp"+extension, directory + "Filosofia "+"respostes setembre "+year+extension);
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                }
                for (byte year =10;year<=16;year++) {
                    try {
                        downloadUsingNIO(url+code+year+"jp"+extension, directory + "Filosofia "+"respostes juny "+year+extension);

                        downloadUsingStream(url+code+year+"jp"+extension, directory + "Filosofia "+"respostes juny "+year+extension);
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                }for (byte year =00;year<=9;year++) {
                    try {
                        downloadUsingNIO(url+code+0+year+"jp"+extension, directory + "Filosofia "+"respostes juny"+year+extension);

                        downloadUsingStream(url+code+0+year+"jp"+extension, directory + "Filosofia "+"respostes juny "+year+extension);
                    } catch (IOException a) {
                        a.printStackTrace();
                    }
                }
                JOptionPane.showMessageDialog(null,"DESCARREGAT");
            }
        });
    }

    private void createUIComponents()
    {
        // TODO: place custom component creation code here
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Selecat");
        frame.setContentPane(new Form().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
    private static void downloadUsingStream(String urlStr, String file) throws IOException
    {
        URL url = new URL(urlStr);
        BufferedInputStream bis = new BufferedInputStream(url.openStream());
        FileOutputStream fis = new FileOutputStream(file);
        byte[] buffer = new byte[1024];
        int count=0;
        while((count = bis.read(buffer,0,1024)) != -1)
        {
            fis.write(buffer, 0, count);
        }
        fis.close();
        bis.close();
    }

    private static void downloadUsingNIO(String urlStr, String file) throws IOException
    {
        URL url = new URL(urlStr);
        ReadableByteChannel rbc = Channels.newChannel(url.openStream());
        FileOutputStream fos = new FileOutputStream(file);
        fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
        fos.close();
        rbc.close();
    }
}
