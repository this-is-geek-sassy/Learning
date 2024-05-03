public class StringContentBlockDemo {

    public static void main(String[] args) {

        String str = """
                {\
                "name": "Bharath",\
                "sal": 1000000\
                }\
                """;
        System.out.println(str);

        str = null;
        System.out.println(str.charAt(1));
    }
}
