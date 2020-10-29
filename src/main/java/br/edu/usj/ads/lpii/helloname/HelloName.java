package br.edu.usj.ads.lpii.helloname;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.PostMapping;



@Controller
public class HelloName {
  
    @PostMapping(value="helloName")
    public ModelAndView postHelloName(@RequestParam String nome , String email) {
        ModelAndView modelAndView = new ModelAndView("hello-name");
        String mensagemCompleta = "Olá " + nome + ",seu e-mail é: " + email;
        modelAndView.addObject("mensagem", mensagemCompleta);
        return modelAndView;
    }
    
    
}
