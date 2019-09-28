package com.amitgoswami.micorservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class CurrencyExchangeController
{
    @Autowired
    private Environment environment;

    @Autowired
    private ExchangeValueRepository repository;

    // Rest WebService
    //localhost:8000/currency-exchange-service/from/USD/to/INR
    @GetMapping("/currency-exchange-service/from/{from}/to/{to}")
    public ExchangeValue retrieveExchangeValue(@PathVariable String from,
                                               @PathVariable String to)
    {
        ExchangeValue exchangeValue = repository.findByFromAndTo(from,to);

        // Service Port and it runs at port 8000.
        //Best practice is to use the port from variable instead of hard coding it
        exchangeValue.setPort(Integer.parseInt(environment.getProperty("local.server.port")));
        return exchangeValue;
    }
}
