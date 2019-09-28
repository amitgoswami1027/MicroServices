package com.amitgoswami.microservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

@RestController
public class CurrencyConversionController
{
    @Autowired
    private CurrencyExchangeServiceProxy proxy;

    // /currency-convertor/from/USD/to/INR/quantity/1000
    @GetMapping("/currency-convertor/from/{from}/to/{to}/quantity/{quantity}")
    public CurrencyConversionBean convertCurrency(@PathVariable String from,
                                                  @PathVariable String to,
                                                  @PathVariable BigDecimal quantity)
    {

        Map<String,String> uriVariables = new HashMap<>();
        uriVariables.put("from",from);
        uriVariables.put("to",to);

        ResponseEntity<CurrencyConversionBean> responseEntity = new RestTemplate().getForEntity(
                "http://localhost:9000/currency-exchange-service/from/{from}/to/{to}",
                 CurrencyConversionBean.class,
                 uriVariables);

        CurrencyConversionBean response = responseEntity.getBody();

        return new CurrencyConversionBean(response.getId(),
                                          from,
                                           to,
                                           response.getConversionMultiple(),
                                           quantity,
                                           quantity.multiply(response.getConversionMultiple()),
                                            0);
    }


    // /currency-convertor/from/USD/to/INR/quantity/1000
        @GetMapping("/currency-convertor-feign/from/{from}/to/{to}/quantity/{quantity}")
    public CurrencyConversionBean convertCurrencyFeign(@PathVariable String from,
                                                  @PathVariable String to,
                                                  @PathVariable BigDecimal quantity)
    {

        CurrencyConversionBean response = proxy.retrieveExchangeValue(from,to);

        return new CurrencyConversionBean(response.getId(),
                                          from,
                                          to,
                                          response.getConversionMultiple(),
                                          quantity,
                                          quantity.multiply(response.getConversionMultiple()),
                                          0);
    }

}
