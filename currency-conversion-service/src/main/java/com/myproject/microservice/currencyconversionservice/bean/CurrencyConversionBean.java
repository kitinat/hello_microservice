package com.myproject.microservice.currencyconversionservice.bean;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class CurrencyConversionBean {
    private Long id;
    private String from;
    private String to;
    private BigDecimal conversionMultiple;
    private BigDecimal quantity;
    private BigDecimal totalCalculatedAmount;
    private int port;
    private int parentPort;

    public CurrencyConversionBean() {

    }

    public CurrencyConversionBean(Long id, String from, String to, BigDecimal conversionMultiple, BigDecimal quantity,
                                  BigDecimal totalCalculatedAmount, int port,int parentPort) {
        super();
        this.id = id;
        this.from = from;
        this.to = to;
        this.conversionMultiple = conversionMultiple;
        this.quantity = quantity;
        this.totalCalculatedAmount = totalCalculatedAmount;
        this.port = port;
        this.parentPort = parentPort;
    }


}
