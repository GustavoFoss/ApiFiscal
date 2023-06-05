package com.hg.apifiscal.service;

import com.hg.apifiscal.gov.pr.FiscalServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NFeService {

  @Autowired
  private FiscalServiceImpl fiscalService;
  public void emitirNFE(String dados) {

  }

  public void cancelarNFE(String dados) {

  }

}
