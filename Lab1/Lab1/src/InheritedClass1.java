public class InheritedClass1 extends Class1 {
    protected void operation2(String text) {

        String max_sentence = " ";
        int max_length = 0;

        String[] sentences = text.split("\\. ");

        for(String sentence : sentences){
            int length = sentence.split(" ").length;
            if (length > max_length){
                max_sentence = sentence;
                max_length = length;
            }
        }
        System.out.println(max_sentence);
        System.out.println("Максимальная длина равна: " + max_length);
    }
}
