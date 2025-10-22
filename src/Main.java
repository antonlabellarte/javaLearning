/*
 * La classe Main (ma può chiamarsi in altri modi)
 * stabilisce il flusso principale
 */
public class Main {
    // Questo main interno viene richiesto in ogni programma java

    static void printaCodice() {
        System.out.println("in attesa");
    }
    public static void main(String[] args) throws Exception {

        // Variabili
        String name = "Antonio";    // Var di tipo stringa
        int age = 29;               // Var di tipo intero
        final String birthDate = "20/03/1996";  // Var di valore immutabile
        boolean status = false;     // Var booleana

        int maxScore = 100;
        int userScore = 150;
                
        // Prints
        System.out.println("Nome: " + name);     // Print con concatenazione
        System.out.println("Età " + age);
        System.out.println("Data di nascita " + birthDate);
        

        // Esempio di if -> else if
        if (maxScore == userScore) {
            System.out.println("Punteggio uguale");
        } else if (userScore > maxScore) {
            System.out.println("Punteggio maggiore");
        } else if (userScore < maxScore) {
            System.out.println("Punteggio minore");
        }

        // Esempio while
        // String stars = "*";
        // int i = 0;
        // while (i <= 5) {
        //     System.out.println(stars);
        //     i++;
        // }

        // Esempio for
        // for (int f = 0; f < 5; f++) {
        //     System.out.println("*");
        //     f++;
        // }

        // For che cicla dati
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

        for (String car : cars) {
            System.out.println(car);
        }

        
    }
}
