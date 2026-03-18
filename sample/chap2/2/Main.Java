public class Main {
    public static void main(String[] args) {
        String t1 = """
        t1 text""";

        String t2 = """
        t2 text
        """;

        String t3 = """
        Red\s
        Black\
        While
        """;

        System.out.println("----t1----");
        System.out.println(t1);

        System.out.println("----t2----");
        System.out.println(t2);

        System.out.println("----t3----");
        System.out.println(t3);
    }
}