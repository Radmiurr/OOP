import java.util.ArrayList;

public class SentenceLenLessNumberAndMaxSentence extends SentenceLenMoreNumberAndMaxSentence {
    @Override
    public ArrayList<String> sentenceLenComparisonWithNumber(String _text) {
        String[] sentences = _text.split("[.!?]+");
        ArrayList<String> array_sentences_len_less_number = new ArrayList<String>();

        for (String sentence : sentences) {
            sentence=sentence.trim();
            var _words = sentence.split(" ");
            int _length = _words.length;

            if (_length < 5) {
                array_sentences_len_less_number.add(sentence);
            }
        }
        return array_sentences_len_less_number;
    }
}
