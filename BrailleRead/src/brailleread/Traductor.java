/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brailleread;

/**
 *
 * @author Kevin González Sanabria
 */
public class Traductor {
        
    public BRWindow bw;
    String Texto;
    
        /**
         * Constructor de la clase, recive una ventana como parámetro
         * @param b 
         */
        public Traductor(BRWindow b){
            bw=b;
        }
        
        public void setTexto(String texto){
            this.Texto=texto;
        }
        
        public void getUnicode(String ch){
        String UnicodeString;
        String entrada=ch;
        String Id = null;

        
        switch (ch) {
            case "a":  UnicodeString = "⠁";
                     break;
            case "b":  UnicodeString = "⠃";
                     break;
            case "c":  UnicodeString = "⠉";
                     break;
            case "d":  UnicodeString = "⠙";
                     break;
            case "e":  UnicodeString = "⠑";
                     break;
            case "f":  UnicodeString = "⠋";
                     break;
            case "g":  UnicodeString = "⠛";
                     break;
            case "h":  UnicodeString = "⠓";
                     break;
            case "i":  UnicodeString = "⠊";
                     break;
            case "j": UnicodeString = "⠚";
                     break;
            case "k": UnicodeString = "⠅";
                     break;
            case "l": UnicodeString = "⠇";
                    break;
            case "m": UnicodeString = "⠍";
                     break;
            case "n": UnicodeString = "⠝";
                     break;
            case "ñ" : UnicodeString = "⠻";
                     break;
            case "o": UnicodeString = "⠕";
                     break;
            case "p": UnicodeString = "⠏";
                     break;
            case "q": UnicodeString = "⠟";
                     break;
            case "r": UnicodeString = "⠗";
                     break;
            case "s": UnicodeString = "⠎";
                     break;
            case "t": UnicodeString = "⠞";
                     break;
            case "u": UnicodeString = "⠥";
                     break;
            case "v": UnicodeString = "⠧";
                     break;
            case "w": UnicodeString = "⠺";
                     break;
            case "x": UnicodeString = "⠭";
                     break;
            case "y": UnicodeString = "⠽";
                     break;
            case "z": UnicodeString = "⠵";
                     break;
            case "A":  UnicodeString = "⢈ ⠁";
                     break;
            case "B":  UnicodeString = "⢈ ⠃";
                     break;
            case "C":  UnicodeString = "⢈ ⠉";
                     break;
            case "D":  UnicodeString = "⢈ ⠙";
                     break;
            case "E":  UnicodeString = "⢈ ⠑";
                     break;
            case "F":  UnicodeString = "⢈ ⠋";
                     break;
            case "G":  UnicodeString = "⢈ ⠛";
                     break;
            case "H":  UnicodeString = "⢈ ⠓";
                     break;
            case "I":  UnicodeString = "⢈ ⠊";
                     break;
            case "J": UnicodeString = "⢈ ⠚";
                     break;
            case "K": UnicodeString = "⢈ ⠅";
                     break;
            case "M": UnicodeString = "⡁⠍";
                     break;
            case "N": UnicodeString = "⢈ ⠝";
                     break;
            case "Ñ" : UnicodeString = "⢈ ⠻";
                     break;   
            case "O": UnicodeString = "⢈ ⠕";
                     break;
            case "P": UnicodeString = "⢈ ⠏";
                     break;
            case "Q": UnicodeString = "⢈ ⠟";
                     break;
            case "R": UnicodeString = "⢈ ⠗";
                     break;
            case "S": UnicodeString = "⢈ ⠎";
                     break;
            case "T": UnicodeString = "⢈ ⠞";
                     break;
            case "U": UnicodeString = "⢈ ⠥";
                     break;
            case "V": UnicodeString = "⢈ ⠧";
                     break;
            case "W": UnicodeString = "⢈ ⠺";
                     break;
            case "X": UnicodeString = "⢈ ⠭";
                     break;
            case "Y": UnicodeString = "⢈ ⠽";
                     break;
            case "Z": UnicodeString = "⢈ ⠵";
                     break;
            case "1":  UnicodeString = "⠼ ⠁";
                     break;
            case "2":  UnicodeString = "⠼ ⠃";
                     break;
            case "3":  UnicodeString = "⠼ ⠉";
                     break;
            case "4":  UnicodeString = "⠼ ⠙";
                     break;
            case "5":  UnicodeString = "⠼ ⠑";
                     break;
            case "6":  UnicodeString = "⠼ ⠋";
                     break;
            case "7":  UnicodeString = "⠼ ⠛";
                     break;
            case "8":  UnicodeString = "⠼ ⠓";
                     break;
            case "9":  UnicodeString = "⠼ ⠊";
                     break;
            case "0": UnicodeString = "⠼ ⠚";
                     break;
            case ")": UnicodeString = "⡘";
                     break;
            case "(": UnicodeString = "⠣";
                     break;
            case ".": UnicodeString = "⠄";
                     break;
            case ";": UnicodeString = "⠰";
                     break;
            case ":": UnicodeString = "⠒";
                     break;
            case "-": UnicodeString = "⠤";
                     break;
            case "&": UnicodeString = "⠯";
                     break;
            case ",": UnicodeString = "⠂";
                     break;
            case "*": UnicodeString = "⠔";
                     break;
            case "'" : UnicodeString = "⠦";
                     break;
            case "=" : UnicodeString = "⠶";
                     break;
            case "@" : UnicodeString = "⠐";
                      break;
            case "/" : UnicodeString = " ⠄⠂";
                     break;
            case "$": UnicodeString = " ⠇⠎";
                     break;
            case "•": UnicodeString = " ";
                     break;
            case "➔": UnicodeString = " ";
                     break;
            case "“": UnicodeString = "⠦";
                     break;
            case "+": UnicodeString = "⠖";
                     break;
            case "?": UnicodeString = "⠢";
                     break;
            case "¿": UnicodeString = "⠢";
                     break;
            case "!": UnicodeString = "⠖";
                     break;
            case "¡": UnicodeString = "⠖";
                     break;
            case "á" : UnicodeString = "⠷";
                     break;
            case "é" : UnicodeString = "⠮";
                     break;
            case "í" : UnicodeString = "⡈";
                     break;
            case "ó" : UnicodeString = "⣐";
                     break;
            case "ú" : UnicodeString = "⠾";
                     break;
            case "Á" : UnicodeString = "⢈ ⠷";
                     break;
            case "É" : UnicodeString = "⢈ ⠮";
                     break;
            case "Í" : UnicodeString = "⢈ ⡈";
                     break;
            case "Ó" : UnicodeString = "⢈ ⣐";
                     break;
            case "Ú" : UnicodeString = "⢈ ⠾";
                     break;
            case " " : UnicodeString = "   ";
                     break;            
            case "\n" : UnicodeString = "\n";
                     break;       
            default: UnicodeString = "";
                     break;
        }
        //bw.tCaracter.setText(bw.tCaracter.getText() + entrada + "  ------> "+  Id + "\n");
        bw.textT.setText(bw.textT.getText() + UnicodeString);
       

        //System.out.println(UnicodeString);
    }
    
     public void TranslateToBraille(String msg) {
        bw.textR.setText(bw.textR.getText() + msg);
        String[] vCharArray = msg.split("");
        for (String aVCharArray : vCharArray){
            this.getUnicode(aVCharArray);
        }
     }

}
