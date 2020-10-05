import com.rizkykhapidsyah.Class_Generic;
import com.rizkykhapidsyah.EntrySaya;

public class Operator_Diamond {
    public static void main(String[] args) {
        /* Operasi Normal */
        Class_Generic<String> P1 = new Class_Generic<String>();
        Class_Generic<Integer> P2 = new Class_Generic<Integer>();
        Class_Generic<Double> P3 = new Class_Generic<Double>();

        /* Operasi Diamond */
        Class_Generic<String> P4 = new Class_Generic<>();
        Class_Generic<Integer> P5 = new Class_Generic<>();
        Class_Generic<Double> P6 = new Class_Generic<>();

        /* Operasi Normal */
        Class_Generic<EntrySaya<Integer, String>> Buah_1 = new Class_Generic<>();
        Buah_1.Dorong(new EntrySaya<Integer, String>(3, "Semangka"));
        Buah_1.Dorong(new EntrySaya<Integer, String>(4, "Mangga"));
        Buah_1.Dorong(new EntrySaya<Integer, String>(5, "Manggis"));
        Buah_1.Dorong(new EntrySaya<Integer, String>(6, "Pepaya"));
        Buah_1.Dorong(new EntrySaya<Integer, String>(7, "Jeruk"));

        /* OPerasi Diamond */
        Class_Generic<EntrySaya<Integer, String>> Buah_2 = new Class_Generic<>();
        Buah_2.Dorong(new EntrySaya<>(3, "Semangka"));
        Buah_2.Dorong(new EntrySaya<>(4, "Mangga"));
        Buah_2.Dorong(new EntrySaya<>(5, "Manggis"));
        Buah_2.Dorong(new EntrySaya<>(6, "Pepaya"));
        Buah_2.Dorong(new EntrySaya<>(7, "Jeruk"));

        for (int i = 0; i < 5; i++) {
            System.out.println(Buah_1.pop() + " - " + Buah_2.pop());
        }

    }
}
