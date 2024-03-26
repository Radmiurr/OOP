import java.util.Scanner;

public class Class1 implements IProcessText {
    public String processText() {
        Scanner scanner = new Scanner(System.in);
        String _inputText = scanner.nextLine();
        return _inputText;
    }

    // Операция 1
    protected void operation1(String _text) {

        String[] sentences = _text.split("\\. ");
        int _count = 0;

        for (String sentence : sentences) {
            var _words = sentence.split(" ");
            int _length = _words.length;

            if (_length > 3) {
                System.out.println(sentence);
                System.out.println("Длина предложения равна:" + _length);
                _count++;
            }
        }

        if (_count == 0){
            System.out.println("Таких предложений нет!");
        }
    }
}
