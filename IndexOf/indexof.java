public class indexof {
    public static void main(String[] args) {
        String text = "Hello, World!";
        String search = "World";

        int index = text.indexOf(search);

        if (index != -1) {
            System.out.println("Found '" + search + "' at position " + index);
        } else {
            System.out.println("'" + search + "' not found in the text.");
        }
    }
}
