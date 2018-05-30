/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brailleread;

import java.awt.Color;
import java.io.File;
import javax.swing.JFileChooser;
import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.stage.FileChooser;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.apache.pdfbox.cos.COSDocument;
import org.apache.pdfbox.io.RandomAccessRead;
import org.apache.pdfbox.pdfparser.PDFParser;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.pdfbox.text.PDFTextStripperByArea;
import org.apache.poi.xwpf.extractor.XWPFWordExtractor;
import org.apache.poi.xwpf.usermodel.XWPFDocument;

/**
 *
 * @author Pablo
 */
public class BrailleRead {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Menu();
        /*
        JFileChooser jfc = new JFileChooser();
        File file;
        String direccion = null;
        String documento = null;
        String tipo = null;
        String nombre = null;

        direccion = "C:\\Users\\Usuario\\Documents\\AA Documentos Para Braile\\PDF3.pdf";
        file = new File(direccion);
        nombre = file.getName();
        try {
            tipo = nombre.substring(nombre.lastIndexOf(".") + 1);
        } catch (Exception e) {
            e.printStackTrace();
        }

        switch (tipo) {
            case "txt":
                try {
                    BufferedReader br = new BufferedReader(new FileReader(direccion));
                    StringBuilder sb = new StringBuilder();
                    String line = br.readLine();
                    while (line != null) {
                        sb.append(line);
                        sb.append(System.lineSeparator());
                        line = br.readLine();
                    }
                    documento = sb.toString();
                    //System.out.println(documento);

                } catch (FileNotFoundException ex) {
                    ex.printStackTrace();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
                break;
            case "docx":
                try {
                    XWPFDocument docx = new XWPFDocument(new FileInputStream(direccion));
                    XWPFWordExtractor we = new XWPFWordExtractor(docx);
                    documento = we.getText().toString();
                    //System.out.println(documento);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case "pdf":
                try {
                    PDDocument PDFDocument = PDDocument.load(file);
                    PDFDocument.getClass();
                    if (!PDFDocument.isEncrypted()) {
                        PDFTextStripperByArea stripper = new PDFTextStripperByArea();
                        stripper.setSortByPosition(true);
                        PDFTextStripper tStripper = new PDFTextStripper();
                        String pdfFileInText = tStripper.getText(PDFDocument);

                        StringBuilder sb = new StringBuilder();

                        String lines[] = pdfFileInText.split("\\r?\\n");
                        for (String line : lines) {
                            sb.append(line);
                            sb.append(System.lineSeparator());
                        }
                        documento = sb.toString();
                        //System.out.println(documento);                        
                    }

                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
        }
        //System.out.println("Se envia al traductor");
        //System.out.println(documento);
        BRWindow b;
        b = new BRWindow();
        b.setVisible(true);
        b.trad.TranslateToBraille(documento);
        */

    }

}
