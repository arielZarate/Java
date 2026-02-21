package desafios.encontrarAnagrama;

/**
 * Se debe hacer una funcion que reciba dos strings y retorne true o false
 * dependiendo si son anagramas o no.
 * Un anagrama es cuando ambas palabras tienen las mismas letras
 * ejemplo: "roma" y "amor"
 * * Ejemplo de entrada:
 * * "roma", "amor" -> true
 * * "roma", "amord" -> false
 * * "roma", "romaa" -> false
 */

public class Main {

    public static boolean checkAnagram(String str1, String str2) {

        str1 = str1.replace(" ", "").trim().toLowerCase();
        str2 = str2.replace(" ", "").trim().toLowerCase();

        if (str1.length() != str2.length()) {
            return false;
        }

        for (String c : str1.split("")) {

            if (!str2.contains(c)) {
                return false;
            }
        }

        return true;

    }

    public static void main(String[] args) {
        System.out.println(checkAnagram("roma", "amor")); // true
        System.out.println(checkAnagram("roma", "amord")); // false
        System.out.println(checkAnagram("funeral", "real fun")); // true //porque le programa elimina las espacios
        System.out.println(checkAnagram("roma", "romaa")); // false
    }
}
