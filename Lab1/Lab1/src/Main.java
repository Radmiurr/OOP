public class Main {
    public static void main(String[] args) {
        Class1 instance_class1 = new Class1();

        System.out.println("Выберите вариант (1 или 2): ");
        int userChoice = Integer.parseInt(instance_class1.processText());

        if (userChoice == 1) {
            InheritedClass1 instance_inherit1 = new InheritedClass1();
            System.out.println("Выберите операцию (1 или 2): ");
            int operationChoice = Integer.parseInt(instance_inherit1.processText());
            System.out.println("Введите текст: ");
            String inputText = instance_inherit1.processText();
            switch (operationChoice){
                case 1:
                    instance_inherit1.operation1(inputText);
                    break;
                case 2:
                    instance_inherit1.operation2(inputText);
                    break;
            }
        }
        else if (userChoice == 2){
            InheritedClass2 instance_inherit2 = new InheritedClass2();
            System.out.println("Выберите операцию (1 или 2): ");
            int operationChoice = Integer.parseInt(instance_inherit2.processText());
            System.out.println("Введите текст: ");
            String inputText = instance_inherit2.processText();
            switch (operationChoice){
                case 1:
                    instance_inherit2.operation1(inputText);
                    break;
                case 2:
                    instance_inherit2.operation2(inputText);
                    break;
            }
        }
    }
}



