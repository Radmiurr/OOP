import java.util.*;

public class SentenceLenComparisonWithNumber implements IProcessText {
    // Операция 1
    public String sentenceLenComparisonWithNumber(String _text, int select) {

        String sentences_len_more_number = "";

        String[] sentences = _text.split("(?<=[.!?])\\s*");

        for (String sentence : sentences) {
            var _words = sentence.split(" ");
            int _length = _words.length;

            if (_length > select) {
                sentences_len_more_number += sentence + "\n";
            }
        }
        return sentences_len_more_number;
    }
}
