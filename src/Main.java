import java.util.Arrays;

public class Main {

    static String cPuntuation = ".,;:¿?¡!\"<>()[]{}-*'/+=%";
    static String[][] cSignos = {{".",",",";",":","¿","?","¡","!","\"","<",">","(",")","[","]","{","}","-","*","'","/",
            "+","=","%"}, {"3","2","23","25","26","26","235","235","236","6-236","6-236","126","345","12356","23456",
            "5-123","456-2","36","35","3","256","235","2356","456-356"}};
    static String[][] cLetras = {{"a","b","c","d","e","f","g","h","i","j","k","l","m","n","ñ","o","p","q","r","s","t",
            "u","v","w","x","y","z","á","é","í","ó","ú","ü"},{"1","12","14","145","15","124","1245","125","24","245",
            "13","123","134","1345","12456","135","1234","12345","1235","234","2345","136","1236","2456","1346","13456",
            "1356","12356","2346","34","346","23456","1256"}};
    static String[][] cNums = {{"0","1","2","3","4","5","6","7","8","9"},{"3456-245","3456-1","3456-12","3456-14",
            "3456-145","3456-15","3456-124","3456-1245","3456-125","3456-24",}};

    public static void main(String[] args) {

//        TranslateToBraille("¿5 es lo mismo que 2+3?");
        TranslateToBraille("It basically handles special cases of empty and one-character string first and correctly cases a two-plus-character string otherwise.");
    }

    private static void TranslateToBraille(String msg) {
        StringBuilder stringBuilder = new StringBuilder();
        String[] vCharArray = msg.split("");

        for (String aVCharArray : vCharArray) {

            if (aVCharArray.equals(" ")){
                stringBuilder.append("0");
                stringBuilder.append(" ");
            }

            else if (cPuntuation.contains(aVCharArray)){
                stringBuilder.append(SearchSimb(aVCharArray));
                stringBuilder.append(" ");
            }

            else if (Character.isLetter(aVCharArray.charAt(0))){
                stringBuilder.append(SearchLett(aVCharArray));
                stringBuilder.append(" ");
            }

            else if (Character.isDigit(aVCharArray.charAt(0))){
                stringBuilder.append(SearchNum(aVCharArray));
                stringBuilder.append(" ");
            } else {
                System.out.println("Caracter no soportado");
                stringBuilder.append(aVCharArray);
                stringBuilder.append(" ");
            }

        }

        System.out.println(stringBuilder.toString());
        TranslateToEspañol(stringBuilder.toString());

    }

    private static String SearchSimb(String vSim){
        String vIdentificador = null;
        for (int i = 0; i < cSignos[0].length; i++) {
            if (cSignos[0][i].equals(vSim)){
                vIdentificador = cSignos[1][i];
                break;
            }
        }
        return vIdentificador;
    }

    private static String SearchLett(String vLet){
        StringBuilder stringBuilder = new StringBuilder();
        if (Character.isUpperCase(vLet.charAt(0))){
            String vIdentificador = "46-";
            stringBuilder.append(vIdentificador);

        }

        vLet = vLet.toLowerCase();

        for (int i = 0; i < cLetras[0].length; i++) {
            if (cLetras[0][i].equals(vLet)) {
                stringBuilder.append(cLetras[1][i]);
                break;
            }
        }
        return stringBuilder.toString();
    }

    private static String SearchNum(String vNum){
        String vIdentificador = null;
        for (int i = 0; i < cNums[0].length; i++) {
            if (cNums[0][i].equals(vNum)){
                vIdentificador = cNums[1][i];
                break;
            }
        }
        return vIdentificador;
    }


    private static void TranslateToEspañol(String msg){
        StringBuilder stringBuilder = new StringBuilder();
        String[] vBrailleArray = msg.split(" ");
        for (String element : vBrailleArray) {
            if (element.equals("0")){
                stringBuilder.append(" ");
            }
            for (int i = 0; i < cSignos[1].length; i++) {
                if (cSignos[1][i].equals(element)){
                    stringBuilder.append(cSignos[0][i]);
                    break;
                }
            }
            for (int i = 0; i < cLetras[1].length; i++) {
                String[] elementArray = element.split("");
                if (element.length() > 3){
                    StringBuilder stringBuilder1 = new StringBuilder();
                    for (int j = 0; j < 3; j++) {
                        stringBuilder1.append(elementArray[j]);
                    }

                    String toCompare = stringBuilder1.toString();

                    if (toCompare.equals("46-")){
                        String[] newArray = Arrays.copyOfRange(elementArray, 3,elementArray.length);
                        StringBuilder stringBuilder2 = new StringBuilder();
                        for (String aNewArray : newArray) {
                            stringBuilder2.append(aNewArray);
                        }
                        String newElement = stringBuilder2.toString();
                        if (cLetras[1][i].equals(newElement)){
                            stringBuilder.append(cLetras[0][i].toUpperCase());
                            break;
                        }
                    }
                }

                if (cLetras[1][i].equals(element)){
                    stringBuilder.append(cLetras[0][i]);
                    break;
                }
            }
            for (int i = 0; i < cNums[1].length; i++) {
                if (cNums[1][i].equals(element)){
                    stringBuilder.append(cNums[0][i]);
                }
            }

        }
        System.out.println(stringBuilder.toString());
    }
}
