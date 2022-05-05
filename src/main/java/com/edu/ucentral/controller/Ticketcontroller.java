package com.edu.ucentral.controller;


import com.edu.ucentral.modelo.ticket;
import com.edu.ucentral.repository.Ticketrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class Ticketcontroller {
    //inyectando dependencia
    @Autowired
    Ticketrepository ticketR;
    //redirige a la pagina donde se muestra todos los tickets
    @GetMapping("/")
    public String index(){
        return "redirect:/tickets";
    }
    //Redirige a crear uno nuevo
    @GetMapping("/new")
    public String nuevo(Model model){
        model.addAttribute("ticket",new ticket());
        return "registrar-ticket";
    }

    //crea uno nuevo
    @PostMapping("/ticke")

    public String registrar(ticket tick, RedirectAttributes atributos){

        ticketR.save(tick);
        atributos.addFlashAttribute("Success","Successful");
        return "redirect:/tickets";

    }
    //muestra todos los tickets
    @GetMapping("/tickets")
    public String ticketList(Model model){
        model.addAttribute("ticket",ticketR.findAll());
        return "index";
    }
    //elimina uno
    @GetMapping("/ticket/{id}")
    public String delete(@PathVariable("id") Long id,RedirectAttributes atributos){
        ticketR.deleteById(id);
        atributos.addFlashAttribute("Success","Se ha eliminado con exito");
        return "redirect:/tickets";
    }
    @GetMapping("/ticketupdate/{id}")
    public String update(@PathVariable("id") Long id,Model model,RedirectAttributes atributos){
        ticket encontrado= ticketR.getById(id);
        if (encontrado==null){
            atributos.addFlashAttribute("Fail","No se ha encontrado.");
            return "redirect:/tickets";
        }
        model.addAttribute("ticketupdate",encontrado);

        return "update-ticket" ;
    }

}
