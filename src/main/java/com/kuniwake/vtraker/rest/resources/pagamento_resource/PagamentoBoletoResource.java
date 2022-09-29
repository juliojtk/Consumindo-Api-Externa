package com.kuniwake.vtraker.rest.resources.pagamento_resource;

import com.kuniwake.vtraker.rest.services.pagamento_service.PagamentoBoletoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping("api/pagamento")
public final class PagamentoBoletoResource extends Pagamento {

    @Value("${base.end.point.pagamento.boleto}")
    private static String boleto;
    @Autowired
    PagamentoBoletoService service;

    @Override
    @GetMapping("boleto")
    @ResponseStatus(OK)
    public String efetuarPagamento() {
        return service.pagarBoleto();
    }
}
