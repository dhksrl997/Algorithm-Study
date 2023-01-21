package Programmers.Lv0;
/*
Created on 2023/01/21 6:56 PM In Intelli J IDEA 
by jeon-wangi
*/

public class Morse {
    public static void main(String[] args) {
        System.out.println(new Morse().solution(".... . .-.. .-.. ---"));
    }

    public String solution(String letter) {
        StringBuilder sb = new StringBuilder();
        for (String m : letter.split(" "))
            sb.append(getAlphabet(m));
        return sb.toString();
    }

    private String getAlphabet(String morse) {
        switch (morse) {
            case ".-":
                return "a";
            case "-...":
                return "b";
            case "-.-.":
                return "c";
            case "-..":
                return "d";
            case ".":
                return "e";
            case "..-.":
                return "f";
            case "--.":
                return "g";
            case "....":
                return "h";
            case "..":
                return "i";
            case ".---":
                return "j";
            case "-.-":
                return "k";
            case ".-..":
                return "l";
            case "--":
                return "m";
            case "-.":
                return "n";
            case "---":
                return "o";
            case ".--.":
                return "p";
            case "--.-":
                return "q";
            case ".-.":
                return "r";
            case "...":
                return "s";
            case "-":
                return "t";
            case "..-":
                return "u";
            case "...-":
                return "v";
            case ".--":
                return "w";
            case "-..-":
                return "x";
            case "-.--":
                return "y";
            case "--..":
                return "z";
            default:
                return null;
        }
    }
}
