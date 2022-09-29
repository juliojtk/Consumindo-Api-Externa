package com.kuniwake.vtraker.rest.resources.pagamento_resource;

import com.kuniwake.vtraker.rest.services.pagamento_service.PagamentoCartaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping("api/pagamento")
public final class PagamentoCartaoResource extends Pagamento {

    @Value("${base.end.point.pagamento.cartao}")
    private static String cartao;
    @Autowired
    PagamentoCartaoService service;

    // AQUI SERIA O PAGAMENTO PADRÃO
//    @Override
//    @GetMapping("/padrao")
//    protected String efetuarPagamento() {
//        return super.efetuarPagamento();
//    }

    @GetMapping("cartao")
    @Override
    @ResponseStatus(OK)
    public String efetuarPagamento() {
        return service.pagarCartao();
    }
}
