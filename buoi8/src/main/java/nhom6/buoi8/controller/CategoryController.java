package nhom6.buoi8.controller;

import nhom6.buoi8.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("categories")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @GetMapping("")
    public String index(Model model){
        model.addAttribute("listCategory", categoryService.GetAll());
        return "admin/categories/index";
    }

    @GetMapping("/create")
    public String create(Model model){
        model.addAttribute("category", new Category());
        return "admin/categories/create";
    }

    @PostMapping("/create")
    public String create(@Valid Category newCategory, BindingResult result, Model model){
        if(result.hasErrors()){
            model.addAttribute("category", newCategory);
            return "admin/categories/create";
        }
        categoryService.Add(newCategory);
        return "redirect:/categories";
    }


}
