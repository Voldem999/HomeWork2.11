package Service;

import Components.Basket;
import model.Item;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class AppStoreService {

    private final List<Item> items = new ArrayList<>();
    private final Basket basket;

    public AppStoreService(Basket basket) {
        this.basket = basket;
    }

    @PostConstruct
    public void init() {
        items.set(1, new Item(1, "Iphone", 50000));
        items.set(2, new Item(2, "Macbook", 120000));
        items.set(3, new Item(3, "Apple Watch", 25000));
        items.set(4, new Item(4, "Airpods", 15000));
        items.set(5, new Item(5, "Ipad", 70000));
    }

    public void add(List<Integer> ids) {
         basket.add(
                ids.stream()
                        .map(items::get)
                        .collect(Collectors.toList())
        );
    }

    public List<Item> get() {
        return basket.get();
    }
}
