public class InheritedClass2 extends InheritedClass1 {
    @Override
    protected void operation1(String _text) {
        var sentences = _text.split("\\. ");
        int _count = 0;
        for(String sentence : sentences){
            if (sentence.split(" ").length < 5){
                System.out.println(sentence);
                _count++;
            }
        }
        if (_count == 0){
            System.out.println("Таких предложений нет!");
        }
    }
}
