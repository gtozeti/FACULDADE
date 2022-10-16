package br.senac.tads.dsw.exemplosspring.links;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import br.senac.tads.dsw.exemplosspring.sessao.item.Item;
import br.senac.tads.dsw.exemplosspring.sessao.item.ItemService;

@Controller
@RequestMapping("/links")
public class ExemploLinksController {

    @Autowired
    private ItemService itemService;

    @GetMapping
    public ModelAndView abrirView() {
        return new ModelAndView("links/exemplo-links");
    }

    @GetMapping("/dinamico")
    public ModelAndView exemploDinamicos() {
        return new ModelAndView("links/exemplo-links-dinamicos").addObject("itens",
                itemService.findAll());
    }

    @GetMapping("/dinamico/{itemId}")
    public ModelAndView exemploDinamico(@PathVariable("itemId") int itemId) {
        return new ModelAndView("links/exemplo-links-dinamicos-item").addObject("item",
                itemService.findById(itemId));
    }

    @GetMapping("/dinamico/ajax")
    public ModelAndView exemploDinamicosAjax() {
        return new ModelAndView("links/exemplo-links-dinamicos-ajax").addObject("itens",
                itemService.findAll());
    }

    // Exemplo de @Controller + @ResponseBody para retornar JSON
    // Atualmente é melhor usar @RestController
    @RequestMapping(value = "/dinamico/ajax/{itemId}", method = RequestMethod.GET,
            produces = "application/json")
    @ResponseBody
    public Item exemploDinamicoAjax(@PathVariable("itemId") int itemId) {
        return itemService.findById(itemId);
    }
}
