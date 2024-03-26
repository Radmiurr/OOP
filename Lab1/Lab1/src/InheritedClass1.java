public class InheritedClass1 extends Class1 {
    protected void operation2(String _text) {

        String _max_sentence = " ";
        int _max_length = 0;

        String[] sentences = _text.split("\\. ");

        for(String sentence : sentences){
            int _length = sentence.split(" ").length;
            if (_length > _max_length){
                _max_sentence = sentence;
                _max_length = _length;
            }
        }
        System.out.println(_max_sentence);
        System.out.println("Максимальная длина равна: " + _max_length);
    }
}
