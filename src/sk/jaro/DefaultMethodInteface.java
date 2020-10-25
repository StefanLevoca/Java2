package sk.jaro;

public interface DefaultMethodInteface {
    void zastav();
    void pohniSa();

    static void chodSam(){
        int i = 0;
        System.out.println("z DefaultMethodInteface");
    }
}
