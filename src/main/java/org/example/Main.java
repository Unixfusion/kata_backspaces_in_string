package org.example;

public class Main {
    public static void main(String[] args) {
        String s = "abc#d##c"; // test
        String s2 = "abc####d##c#"; // test
        System.out.println(cleanString(s)); // test
        System.out.println(cleanString(s2)); // test
    }
    public static String cleanString(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '#') {
                sb.append(s.charAt(i));
            } else {
                if (sb.length() > 0) {
                    sb.setLength(sb.length() - 1);
                }
            }
        }
        return sb.toString();
    }
}