public class SentenceLenMoreNumberAndMaxSentence extends SentenceLenComparisonWithNumber {
    public String maxLenSentence(String _text) {

        String _max_sentence = " ";
        int _max_length = 0;

        String[] _sentences = _text.split("[.!?]+");

        for(String _sentence : _sentences){
            _sentence=_sentence.trim();
            int _length = _sentence.split(" ").length;
            if (_length > _max_length){
                _max_sentence = _sentence;
            }
        }
        return _max_sentence;
    }
}
