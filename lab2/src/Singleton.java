public class Singleton {
    private static Singleton singleton;
    private int field;
//    private static final Singleton singleton = new Singleton();


    private Singleton() {}

    public static Singleton getInstance(){
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
    public void setField(int value){
        this.field = value;
    }

    public int getField(){
        return field;
    }
}
