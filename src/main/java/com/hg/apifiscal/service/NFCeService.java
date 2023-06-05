package com.hg.apifiscal.service;

import com.hg.apifiscal.gov.pr.FiscalServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NFCeService {

  @Autowired
  private FiscalServiceImpl fiscalService;
  public void emitirNFC(String dados) {

  }

  public void cancelarNFC(String dados) {

  }

}
