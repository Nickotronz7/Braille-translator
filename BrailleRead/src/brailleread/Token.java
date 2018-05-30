/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brailleread;

/**
 *
 * @author Usuario
 */
public class Token {
   public BRWindow bw;

   public Token(BRWindow b){
       bw=b;
   }
   public void getID(String ch){
        String UnicodeString;
        String entrada=ch;
        String Id = null;

        
        switch (ch) {
            case "a": Id="1";
                     break;
            case "b": Id="12";
                     break;
            case "c": Id="14";
                     break;
            case "d": Id="145";
                     break;
            case "e": Id="15";
                     break;
            case "f": Id="124";
                     break;
            case "g": Id="1245";
                     break;
            case "h": Id="125";
                     break;
            case "i": Id="24";
                     break;
            case "j": Id="245";
                     break;
            case "k": Id="13";
                     break;
            case "l": Id="123";
                    break;
            case "m": Id="134";
                     break;
            case "n": Id="1345";
                     break;
            case "ñ": Id="12456";
                     break;
            case "o": Id="135";
                     break;
            case "p": Id="1234";
                     break;
            case "q": Id="12345";
                     break;
            case "r": Id="1235";
                     break;
            case "s": Id="234";
                     break;
            case "t": Id="2345";
                     break;
            case "u": Id="136";
                     break;
            case "v": Id="1236";
                     break;
            case "w": Id="2456";
                     break;
            case "x": Id="1346";
                     break;
            case "y": Id="13456";
                     break;
            case "z": Id="1356";
                     break;
            case "A": Id="46-1";
                     break;
            case "B": Id="46-12";
                     break;
            case "C": Id="46-14";
                     break;
            case "D": Id="46-145";
                     break;
            case "E": Id="46-15";
                     break;
            case "F": Id="46-124";
                     break;
            case "G": Id="46-1245";
                     break;
            case "H": Id="46-125";
                     break;
            case "I": Id="46-24";
                     break;
            case "J": Id="46-245";
                     break;
            case "K": Id="46-13";
                     break;
            case "M": Id="46-134";
                     break;
            case "N": Id="46-1345";
                     break;
            case "Ñ": Id="46-12456";
                     break;   
            case "O": Id="46-135";
                     break;
            case "P": Id="46-1234";
                     break;
            case "Q": Id="46-12345";
                     break;
            case "R": Id="46-1235";
                     break;
            case "S": Id="46-234";
                     break;
            case "T": Id="46-2345";
                     break;
            case "U": Id="46-136";
                     break;
            case "V": Id="46-1236";
                     break;
            case "W": Id="46-2456";
                     break;
            case "X": Id="46-1346";
                     break;
            case "Y": Id="46-13456";
                     break;
            case "Z": Id="46-12356";
                     break;
            case "1": Id="3456-1";
                     break;
            case "2": Id="3456-1";
                     break;
            case "3": Id="3456-13";
                     break;
            case "4": Id="3456-145";
                     break;
            case "5": Id="3456-15";
                     break;
            case "6": Id="3456-124";
                     break;
            case "7": Id="3456-1245";
                     break;
            case "8": Id="3456-125";
                     break;
            case "9": Id="3456-24";
                     break;
            case "0": Id="3456-245";
                     break;
            case ")": Id="345";
                     break;
            case "(": Id="126";
                     break;
            case ".": Id="3";
                     break;
            case ";": Id="23";
                     break;
            case ":": Id="23";
                     break;
            case "-": Id="36";
                     break;
            case "&": Id="12346";
                     break;
            case ",": Id="2";
                     break;
            case "*": Id="35";
                     break;
            case "'": Id="236";
                     break;
            case "=": Id="2356";
                     break;
            case "@": Id="4";
                      break;
            case "/": Id="6-2";
                     break;
            case "$": Id="456-234";
                     break;
            case "•": Id="0";
                     break;
            case "➔": Id="0";
                     break;
            case "“": Id="236";
                     break;
            case "+": Id="235";
                     break;
            case "?": Id="26";
                     break;
            case "¿": Id="26";
                     break;
            case "!": Id="235";
                     break;
            case "¡": Id="235";
                     break;
            case "á" : Id="12356";
                     break;
            case "é" : Id="2346";
                     break;
            case "í" : Id="34";
                     break;
            case "ó" : Id="346";
                     break;
            case "ú" : Id="23456";
                     break;
            case "Á" : Id="46-12356";
                     break;
            case "É" : Id="46-2346";
                     break;
            case "Í" : Id="46-45";
                     break;
            case "Ó" : Id="46-446";
                     break;
            case "Ú" : Id="46-23456";
                     break;
            case " " : Id="0";
                     break;            
            case "\n" : UnicodeString = "\n";
                     break;       
            default: UnicodeString = "";
                     break;
        }
        bw.tCaracter.setText(bw.tCaracter.getText() + entrada + "  ------> "+  Id + "\n");      
       //System.out.println(UnicodeString);
    }
        public void createTokenTable(String msg) {
        String[] vCharArray = msg.split("");
        for (String aVCharArray : vCharArray){
            this.getID(aVCharArray);
        }
     }

    
}
