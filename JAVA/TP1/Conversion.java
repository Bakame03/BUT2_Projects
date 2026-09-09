public class Conversion {
    public static void main(String[] args) {
        if (args.length == 1) {
            double celsius = Double.parseDouble(args[0]);
            double fahrenheit = (celsius * 9.0 / 5) + 32;
            System.out.println(celsius + "°C correspond à " + fahrenheit + "°F");
        } else {
            System.out.println("Erreur : Veuillez fournir une valeur en paramètre.");
        }
    }
}