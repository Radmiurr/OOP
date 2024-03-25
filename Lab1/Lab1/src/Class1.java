import java.util.Scanner;

public class Class1 implements IProcessText {
    public String processText() {
        Scanner scanner = new Scanner(System.in);
        String inputText = scanner.nextLine();
//        scanner.nextLine(); // очистка буфера
        return inputText;
    }

    // Операция 1
    protected void operation1(String text) {

        String[] sentences = text.split("\\. ");
        int count = 0;

        for (String sentence : sentences) {
            var words = sentence.split(" ");
            int length = words.length;

            if (length > 3) {
                System.out.println(sentence);
                System.out.println("Длина предложения равна:" + length);
                count++;
            }
        }

        if (count == 0){
            System.out.println("Таких предложений нет!");
        }
    }
}