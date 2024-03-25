public class Main {
    public static void main(String[] args) {

        //Создание экземпляров
        Singleton exemplar1 = Singleton.getInstance();
        Singleton exemplar2 = Singleton.getInstance();

        //Задаем значения поля в первом экземпляре
        exemplar1.setField(5);

        //Вывод полей
        System.out.println("Первый экземпляр: " + exemplar1.getField());
        System.out.println("Второй экземпляр: " + exemplar2.getField());


    }
}