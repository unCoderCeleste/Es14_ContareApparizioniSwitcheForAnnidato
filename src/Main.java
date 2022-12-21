public class Main {
    public static void main(String[] args) {
        System.out.println("Esercizio 14:");
        int[] elementi = new int[10];
        // Generare l'array con die numeri random
        for (int i = 0; i < elementi.length; i++) {
            elementi[i] = (int) (Math.random() * 10);
        }
        // Stamparli
        System.out.println("\nNumeri random generati: ");
        for (int elemento : elementi) {
            System.out.print(elemento + " ");
        }
        System.out.println();

        // CONTATORE USANDO SWITCH:
        int[] contatore = new int[10];
        for (int i = 0; i < elementi.length; i++) {
            switch (elementi[i]) {
                case 0:
                    contatore[0]++; break;
                case 1:
                    contatore[1]++; break;
                case 2:
                    contatore[2]++; break;
                case 3:
                    contatore[3]++; break;
                case 4:
                    contatore[4]++; break;
                case 5:
                    contatore[5]++; break;
                case 6:
                    contatore[6]++; break;
                case 7:
                    contatore[7]++; break;
                case 8:
                    contatore[8]++; break;
                case 9:
                    contatore[9]++; break;
            }
        }
        // STAMPARE IL CONTATORE DEL SWITCH:
        System.out.println("\nLeggo quante volte compare una cifra: ");
        System.out.println("'Usando SWITCH':");
        for (int i = 0; i < contatore.length; i++) {
            System.out.println(i + "---->" + contatore[i]);
        }
        // CONTATORE USANDO SWITCH:
        int[] contatore2 = new int[10];
        for (int i = 0; i < elementi.length; i++) {
            for (int j = 0; j < contatore2.length; j++) {
                if (elementi[i] == j) {
                    contatore2[j]++;
                }
            }
        }
        // STAMPARE IL CONTATORE DEL FOR ANNIDATO:
        System.out.println("\n'Usando FOR ANNIDATO':");
        for (int i = 0; i < contatore2.length; i++) {
            System.out.println("Il numero " + i + " compare: " + contatore2[i] + " volte");
        }
    }
}
