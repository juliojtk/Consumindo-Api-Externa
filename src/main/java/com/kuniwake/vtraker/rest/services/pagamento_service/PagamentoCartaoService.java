package com.kuniwake.vtraker.rest.services.pagamento_service;

import org.springframework.stereotype.Service;

@Service
public class PagamentoCartaoService {
    public String pagarCartao(){
        return "Pagando com cartão!";
    }
}
