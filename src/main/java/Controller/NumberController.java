package Controller;

import Model.Numbers;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NumberController {
    @GetMapping("/numbers")
    public String getNumbers(Model model) {
        model.addAttribute("numbers", new Numbers().getNumbers());
        return "numbers";
    }
}
