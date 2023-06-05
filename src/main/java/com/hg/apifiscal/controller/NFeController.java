package com.hg.apifiscal.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/nfe")
public class NFeController {


  @PostMapping("/emitir")
  public void emitirNFE(String dados) {

  }

  @PostMapping("cancelar")
  public void cancelarNFE(String dados) {

  }

}
