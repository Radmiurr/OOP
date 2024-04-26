import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите вариант (1 или 2): ");
        int userChoice = Integer.parseInt(scanner.nextLine());

        if (userChoice == 1) {
            SentenceLenMoreNumberAndMaxSentence sentenceLenMoreNumberAndMaxSentence = new SentenceLenMoreNumberAndMaxSentence();
            System.out.println("Выберите операцию (1 или 2): ");
            int _operationChoice = Integer.parseInt(scanner.nextLine());
            System.out.println("Введите текст: ");
            String inputText = scanner.nextLine();
            switch (_operationChoice){
                case 1:
                    System.out.println("Введите длину: ");
                    int _operationSelect = Integer.parseInt(scanner.nextLine());
                    String result =  sentenceLenMoreNumberAndMaxSentence.sentenceLenComparisonWithNumber(inputText, _operationSelect);
                    System.out.println(result);
                    break;
                case 2:
                    String max_sentence = sentenceLenMoreNumberAndMaxSentence.maxLenSentence(inputText);
                    System.out.println(max_sentence);
                    break;
            }
        }
        else if (userChoice == 2){
            SentenceLenLessNumberAndMaxSentence sentenceLenLessNumberAndMaxSentence = new SentenceLenLessNumberAndMaxSentence();
            System.out.println("Выберите операцию (1 или 2): ");
            int _operationChoice = Integer.parseInt(scanner.nextLine());
            System.out.println("Введите текст: ");
            String inputText = scanner.nextLine();
            switch (_operationChoice){
                case 1:
                    System.out.println("Введите длину: ");
                    int _operationSelect = Integer.parseInt(scanner.nextLine());
                    String result =  sentenceLenLessNumberAndMaxSentence.sentenceLenComparisonWithNumber(inputText, _operationSelect);
                    System.out.println(result);
                    break;
                case 2:
                    String max_sentence = sentenceLenLessNumberAndMaxSentence.maxLenSentence(inputText);
                    System.out.println(max_sentence);
                    break;
            }
        }
    }
}



