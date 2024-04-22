import java.util.*;

public class SentenceLenComparisonWithNumber{

    private static SentenceLenComparisonWithNumber instance;

    private SentenceLenComparisonWithNumber(){

    }
    public static SentenceLenComparisonWithNumber getInstance() {
        if (instance == null) {
            instance = new SentenceLenComparisonWithNumber();
        }
        return instance;
    }
    private static int minSentenceLength;

    public void setMinSentenceLength(int minSentenceLength) {
        this.minSentenceLength = minSentenceLength;
    }

    public static int getMinSentenceLength() {
        return minSentenceLength;
    }
    // Операция 1
    public static ArrayList<String> sentenceLenComparisonWithNumber(String _text) {

        String[] sentences = _text.split("[.!?]+");
        ArrayList<String> array_sentences_len_more_number = new ArrayList<String>();

        for (String sentence : sentences) {
            sentence=sentence.trim();
            var _words = sentence.split(" ");
            int _length = _words.length;

            if (_length > minSentenceLength) {
                array_sentences_len_more_number.add(sentence);
            }
        }
        return array_sentences_len_more_number;
    }
}
