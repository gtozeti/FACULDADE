package br.senac.tads.dsw.musicas.controllers;



import br.senac.tads.dsw.musicas.entidades.Musica;
import br.senac.tads.dsw.musicas.repository.MusicaRepository;

import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller
@RequestMapping("/musicas")
public class MusicasController {
    
    @Autowired
    private MusicaRepository musicaRepository;
     
    @GetMapping
    public ModelAndView lista(){
        List<Musica> resultados = new ArrayList<>();
        resultados = musicaRepository.findAll();
        return new ModelAndView("musicas/lista-musicas").addObject("musicas", resultados);
    } 
    
  
    @GetMapping("/novo")
    public ModelAndView adicionarNova(){
        return new ModelAndView("musicas/adicionar-nova").addObject("musica", new Musica());
    }
    
    @PostMapping("/incluir")
    public ModelAndView incluir(@ModelAttribute("musica") @Valid Musica musica, BindingResult bindingResult, RedirectAttributes redirAttr){
    if (bindingResult.hasErrors()) {
        
            return new ModelAndView("musicas/adicionar-nova");
          
        }
        musicaRepository.save(musica);
        redirAttr.addFlashAttribute("msgSucesso", "Música incluída com sucesso");
        return new ModelAndView("redirect:/musicas");
}
}
