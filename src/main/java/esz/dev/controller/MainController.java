package esz.dev.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class MainController {
    @GetMapping("/")
    public String mainPage() {
        return "index";
    }

    @PostMapping(value = "/upload", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public String handleUpload(@RequestParam(name = "file", required = false) MultipartFile multipartFile, RedirectAttributes redirectAttributes) {
        if (multipartFile != null) {
            redirectAttributes.addFlashAttribute("message", "You successfully uploaded " +
                    multipartFile.getOriginalFilename() + "!");
        }
        return "redirect:/";
    }
}
