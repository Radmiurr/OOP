public class InheritedClass2 extends InheritedClass1 {
    @Override
    protected void operation1(String _text) {
        var _sentences = _text.split("\\. ");
        int _count = 0;
        for(String _sentence : _sentences){
            if (_sentence.split(" ").length < 5){
                System.out.println(_sentence);
                _count++;
            }
        }
        if (_count == 0){
            System.out.println("Таких предложений нет!");
        }
    }
}
