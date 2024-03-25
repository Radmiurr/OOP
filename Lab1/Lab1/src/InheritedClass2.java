public class InheritedClass2 extends InheritedClass1 {
    @Override
    protected void operation1(String text) {
        var sentences = text.split("\\. ");
        int count = 0;
        for(String sentence : sentences){
            if (sentence.split(" ").length < 5){
                System.out.println(sentence);
                count++;
            }
        }
        if (count == 0){
            System.out.println("Таких предложений нет!");
        }
    }
}
