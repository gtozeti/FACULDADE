package br.senac.tads.dsw.ado03;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@ControllerAdvice
@RequestMapping("/curriculo")
public class Controller {
    
    @GetMapping("/info")
    public ModelAndView curriculo() {

         //Informações principais
        Info info = new Info("Gustavo Tozeti Herculano","(11) 98932-0987" ,"gtozeti@gmail.com",  LocalDate.of(1999,9,29) , "https://www.linkedin.com/in/gustavo-tozeti-herculano/", "https://github.com/gtozeti");

        //Informações opcionais
        List<Conhecimentos> conhecimentos = new ArrayList<>();
        conhecimentos.add(new Conhecimentos("Java"));
        conhecimentos.add(new Conhecimentos("SQL"));
        conhecimentos.add(new Conhecimentos("Python"));
        info.setConhecimentos(conhecimentos);

        List<ExpProfi> exp_p = new ArrayList<>();
        exp_p.add(new ExpProfi("Prime Control", "Analista de Testes Júnior", LocalDate.of(2020,1,20), LocalDate.of(2022,2,15)));
        exp_p.add(new ExpProfi("E-Vertical", "Técnico de Sistemas Pleno II", LocalDate.of(2017,3,10), LocalDate.of(2020,1,20)));
        info.setExp_profissionais(exp_p);

        List<ExpAcad> exp_a = new ArrayList<>();
        exp_a.add(new ExpAcad("Tecnologia em Análise e Desenvolvimento de Sistemas", "Centro Universitário Senac"));
        exp_a.add(new ExpAcad("Tecnologia em Automação Industrial", "Instituto Federal de Educação, Ciência e Tecnologia de São Paulo"));
        info.setExp_academicas(exp_a);
        
        List<Idiomas> idiomas = new ArrayList<>();
        idiomas.add(new Idiomas("Inglês", "Avançado","Intermediário", "Intermediário" ));
        idiomas.add(new Idiomas("Espanhol", "Básico","Básico", "Básico" ));
        info.setIdiomas(idiomas);

        ModelAndView mv = new ModelAndView("curriculo");
        mv.addObject("dados", info);

        return mv;
    }

}
