package com.mahedi.imagedatabase.controller;

import com.mahedi.imagedatabase.entity.ImageData;
import com.mahedi.imagedatabase.service.ImageDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Optional;

@Controller
public class ImageDataController {
    @Autowired
    private ImageDataService imageDataService;

    @GetMapping("/")
    public String showExampleView(Model model)
    {
        List<ImageData> imgs = imageDataService.getAllProduct();
        model.addAttribute("listofimg", imgs);
        return "/listImgs";
    }
    @GetMapping("/addimg")
    public String showAddProduct()
    {

        return "/addimg";
    }


    @PostMapping("/addimg")
    public String saveProduct(@RequestParam("img") MultipartFile file,
                              @RequestParam("name") String name)

    {
        imageDataService.saveImageToDB(file, name);
        return "redirect:/";
    }

    @GetMapping("/update/{id}")
    public String update(@PathVariable long id, Model model) {
        ImageData imageData = imageDataService.updatetest(id);
        model.addAttribute("updatelist", imageData);
        System.out.println(imageData);
        return "update";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable long id)
    {
        imageDataService.delete(id);
        return "redirect:/";
    }
}
