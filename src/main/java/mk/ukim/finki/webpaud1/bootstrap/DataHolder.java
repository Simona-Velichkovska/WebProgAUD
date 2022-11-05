package mk.ukim.finki.webpaud1.bootstrap;

import mk.ukim.finki.webpaud1.model.Category;
import mk.ukim.finki.webpaud1.model.Manufacturer;
import mk.ukim.finki.webpaud1.model.Product;
import mk.ukim.finki.webpaud1.model.User;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
public class DataHolder {

    public static List<Category> categories = new ArrayList<>();
    public static List<User> users = new ArrayList<>();
    public static List<Manufacturer> manufacturers = new ArrayList<>();

    public static List<Product> products = new ArrayList<>();

    @PostConstruct
    public void init(){
        categories.add(new Category("Books","Books category"));
        categories.add(new Category("Movies","Movies category"));

        users.add(new User("kostadin.mishev","km","Kostadin","Mishev"));
        users.add(new User("riste.stojanov","rs","Riste","Stojanov"));

        Manufacturer manufacturer = new Manufacturer("Nike","NY NY");
        manufacturers.add(manufacturer);
        Category category = new Category("Sport","Sport category");
        categories.add(category);
        products.add(new Product("Ball 1",234.8,7,category,manufacturer));
        products.add(new Product("Ball 2",234.8,7,category,manufacturer));
        products.add(new Product("Ball 3",234.8,7,category,manufacturer));
    }
}
