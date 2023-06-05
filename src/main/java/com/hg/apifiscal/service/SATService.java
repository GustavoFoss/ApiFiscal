package com.hg.apifiscal.service;

import com.hg.apifiscal.gov.pr.FiscalServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SATService {

  @Autowired
  private FiscalServiceImpl fiscalService;
  public void emitirSAT(String dados) {

  }

  public void cancelarSAT(String dados) {

  }
}
