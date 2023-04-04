package one.digitalinnovation;

public class Main {
    public static void main(String[] args) {
        ListaCircular<String> minhaListaCircular = new ListaCircular<>();

        minhaListaCircular.edd("c0");
        System.out.println(minhaListaCircular);

        minhaListaCircular.remove(0);
        System.out.println(minhaListaCircular);

        minhaListaCircular.edd("c1");
        System.out.println(minhaListaCircular);

        minhaListaCircular.edd("c2");
        minhaListaCircular.edd("c3");
        System.out.println(minhaListaCircular);

//        System.out.println(minhaListaCircular.get(0));
//        System.out.println(minhaListaCircular.get(1));
//        System.out.println(minhaListaCircular.get(2));
//        System.out.println(minhaListaCircular.get(3));

        for (int i = 0; i < 1000000; i++) {
            System.out.println(minhaListaCircular.get(i));

        }
    }
}