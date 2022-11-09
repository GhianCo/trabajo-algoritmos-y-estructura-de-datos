import java.io.File;
import views.MainForm;

public class App {

    public static void main(String[] args) {

        String path = "\\src\\data\\data.csv";
        String raiz = new File("").getAbsolutePath();
        System.out.println(raiz + path);

        MainForm productos = new MainForm();
        productos.setVisible(true);
    }

}
