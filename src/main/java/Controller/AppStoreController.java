package Controller;

import Service.AppStoreService;
import model.Item;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order")
public class AppStoreController {

    private AppStoreService appStoreService;

    public AppStoreController(AppStoreService appStoreService) {
        this.appStoreService = appStoreService;
    }

    @GetMapping("/add")
    public void add(@RequestParam("id") List<Integer> ids) {
         appStoreService.add(ids);

    }

    @GetMapping("/get")
    public List<Item> get() {
        return appStoreService.get();
    }
}
