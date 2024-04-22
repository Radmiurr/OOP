import java.util.*;

public class SentenceLenComparisonWithNumber implements IProcessText {
    // Операция 1
    public ArrayList<String> sentenceLenComparisonWithNumber(String _text) {

        String[] sentences = _text.split("[.!?]+");
        ArrayList<String> array_sentences_len_more_number = new ArrayList<String>();

        for (String sentence : sentences) {
            sentence=sentence.trim();
            var _words = sentence.split(" ");
            int _length = _words.length;

            if (_length > 3) {
                array_sentences_len_more_number.add(sentence);
            }
        }
        return array_sentences_len_more_number;
    }
}
