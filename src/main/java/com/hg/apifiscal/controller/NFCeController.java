package com.hg.apifiscal.controller;

import jakarta.transaction.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/nfce")
public class NFCeController {

  @PostMapping("/emitir")
  public void emitirNFC(String dados) {

  }

  @PostMapping("/cancelar")
  public void cancelarNFC(String dados) {

  }

}
