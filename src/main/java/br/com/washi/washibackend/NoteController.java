package br.com.washi.washibackend;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("notes")
public class NoteController {

    @GetMapping("hello")
    @ResponseBody
    public String helloWorld() {
        return "Olá";
    }
}
