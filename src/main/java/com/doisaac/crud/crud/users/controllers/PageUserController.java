package com.doisaac.crud.crud.users.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.doisaac.crud.crud.users.entities.User;
import com.doisaac.crud.crud.users.repository.UserRepository;

@Controller
@RequestMapping("/")
public class PageUserController {

  @Autowired
  private UserRepository userRepository;

  
  @GetMapping("/users")
  public String listUsers(Model model){
    model.addAttribute("users", userRepository.findAll());
    return "list-users";
  }

  @GetMapping("/nuevo")
  public String formularioNuevoUser(Model model) {
    model.addAttribute("usuario", new User());
    return "form-users";
  }

  @SuppressWarnings("null")
  @PostMapping("/nuevo") 
  public String guardarUser(@ModelAttribute User user) {
    userRepository.save(user);
    return "redirect:/users";
  }

  @GetMapping("/editar/{id}")
  public String formularioEditarUser(Model model, @PathVariable Long id) {
    @SuppressWarnings("null")
    User usuario = userRepository.findById(id).get();
    model.addAttribute("usuario", usuario);
    return "form-users";
  }

  @GetMapping("/eliminar/{id}")
  public String eliminarUser(@PathVariable Long id) {
    userRepository.delete(new User(id));
    return "redirect:/users";
  }
}
