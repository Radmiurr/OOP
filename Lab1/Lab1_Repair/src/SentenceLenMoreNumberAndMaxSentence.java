import java.util.Arrays;

public class SentenceLenMoreNumberAndMaxSentence extends SentenceLenComparisonWithNumber {
    public String maxLenSentence(String _text) {

        String _max_sentence = "";
        int _max_length = 0;

        if (_text == "") {
              _max_sentence = "Вы не ввели предложение";
              return _max_sentence;
        }

        String[] _sentences = _text.split("(?<=[.!?])\\s*");

        for(String _sentence : _sentences){
            int _length =  _sentence.split(" ").length;
            if (_length > _max_length){
                _max_sentence = _sentence + " Длина предложения: " + _length;
                _max_length = _length;
            }
        }
        return _max_sentence;
    }
}
