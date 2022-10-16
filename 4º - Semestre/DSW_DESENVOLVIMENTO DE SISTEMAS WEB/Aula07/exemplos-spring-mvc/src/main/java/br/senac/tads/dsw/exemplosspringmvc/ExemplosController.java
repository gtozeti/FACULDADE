package br.senac.tads.dsw.exemplosspringmvc;

import java.time.LocalDateTime;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/exemplos")
public class ExemplosController {
    
    @GetMapping
    public String exemplo01(){
        return "exemplo01-template";
    }
    
    @GetMapping("/ex02")
    public String exemplo02(){
    
        return "exemplo02-template";
    }
    
    @GetMapping("/ex03")
    public String exemplo03(Model model){
        String titulo = "Exemplo 3 - Título Gerado no Controller";
        LocalDateTime dataHoraAtual = LocalDateTime.now();
        int numero = 123;
        
        model.addAttribute("tituloAttr",titulo);
        model.addAttribute("dataHoraAttr",dataHoraAtual);
        model.addAttribute("numeroAttr",numero);
        
        return "exemplo03-template";
        
    }
    
      @GetMapping("/ex03b")
        public ModelAndView exemplo03b(){
        String titulo = "Exemplo 3b - Título Gerado no Controller";
        LocalDateTime dataHoraAtual = LocalDateTime.now();
        int numero = 564;
        
        ModelAndView mv = new ModelAndView("exemplo03-template");
        
        mv.addObject("tituloAttr",titulo);
        mv.addObject("dataHoraAttr",dataHoraAtual);
        mv.addObject("numeroAttr",numero);
        
        return mv;
        
    }
        
        @GetMapping("/ex03/json")
        @ResponseBody
        public String exemplo03Json1(){
        String titulo = "Exemplo 3b - Título Gerado no Controller";
        LocalDateTime dataHoraAtual = LocalDateTime.now();
        int numero = 564;
        
        return titulo;
        
        }
}
