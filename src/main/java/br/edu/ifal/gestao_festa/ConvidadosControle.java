package br.edu.ifal.gestao_festa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ConvidadosControle {

    @Autowired
    private Convidados convidados;

    @RequestMapping("/convidados")
    public ModelAndView Listar() {
        ModelAndView mv =  new ModelAndView("ListaConvidados");
        mv.addObject("convidados", convidados.todos());
        return mv;
    }

    @RequestMapping("/excluir/{nome}")
    public ModelAndView Excluir(@PathVariable(name = "nome") String nome){
        convidados.excluir(nome);
        return new ModelAndView("redirect:/convidados");
    }
    @RequestMapping("/adcionar")
    public String Adcionar(Convidado convidado){
        convidados.adicionar(convidado);
        return "redirect:/convidados";
    }


}