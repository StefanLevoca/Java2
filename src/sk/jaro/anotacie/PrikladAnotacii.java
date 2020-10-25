package sk.jaro.anotacie;

//import com.sun.istack.internal.NotNull;

@Author(
        name = {"Jaro Beno","Beno Peter"},
        date = "02/02/2018",
        vek = 30
)
public class PrikladAnotacii {

    /**
     * fdsaf
     * @param args
     */
    @JednoHodnotova("Jaro")
    @Deprecated
    public static void main(String[] args) {
        Class c = PrikladAnotacii.class;
        System.out.println(c.getAnnotations().length);
    }
}
