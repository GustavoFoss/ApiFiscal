package com.hg.apifiscal.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sat")
public class SATController {

  @PostMapping("/emitir")
  public void emitirSAT(String dados) {

  }

  @PostMapping("/cancelar")
  public void cancelarSAT(String dados) {

  }
}
