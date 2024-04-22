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
                    ArrayList<String> result =  sentenceLenMoreNumberAndMaxSentence.sentenceLenComparisonWithNumber(inputText);
                    if (result.size() != 0){
                        for (int i = 0; i < result.size(); i++){
                            String sentence = result.get(i);
                            System.out.println(sentence);
                            System.out.println("Длина предложения равна:" + sentence.split(" ").length);
                        }
                    }
                    else{
                        System.out.println("Таких предложений нет!");
                    }
                    break;
                case 2:
                    String max_sentence = sentenceLenMoreNumberAndMaxSentence.maxLenSentence(inputText);
                    System.out.println("Предложение с максимальной длиной:" + max_sentence);
                    System.out.println("Длина максимального по длине предложения равна:" + max_sentence.split(" ").length);
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
                    ArrayList<String> result =   sentenceLenLessNumberAndMaxSentence.sentenceLenComparisonWithNumber(inputText);
                    if (result.size() != 0){
                        for (int i = 0; i < result.size(); i++){
                            String sentence = result.get(i);
                            System.out.println(sentence);
                            System.out.println("Длина предложения равна:" + sentence.split(" ").length);
                        }
                    }
                    else{
                        System.out.println("Таких предложений нет!");
                    }
                    break;
                case 2:
                    String max_sentence = sentenceLenLessNumberAndMaxSentence.maxLenSentence(inputText);
                    System.out.println("Предложение с максимальной длиной:" + max_sentence);
                    System.out.println("Длина максимального по длине предложения равна:" + max_sentence.split(" ").length);
                    break;
            }
        }
    }
}



