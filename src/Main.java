public class Main {
    static boolean equals(double[] a1, double[] a2) {
        if (a1.length != a2.length) {
            return false;
        }

        for (int i= 0; i < a1.length; i++) {
            if (a1[i] != a2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // Skriv en egen version av Arrays.equals metoden
        //  - Längden måste vara lika
        //  - Elementen på respektive index måste vara samma

        double[] a1 = {1, 2, 3, 4, 5};
        double[] a2 = {1, 2, 3, 4, 5, 6};

        if (equals(a1, a2)) {
            System.out.println("Lika");
        } else {
            System.out.println("Olika");
        }
    }
}