package com.example.msstock.service;

import com.example.msstock.entity.Stock;

import java.util.List;
import java.util.Map;

public interface IServiceStock {
    Stock createStock(Stock stock);
    Stock updateStock(Map<Object, Object> fields, Long id);
    Stock deleteStock(Long id);
    Stock getStockById(Long id);
    List<Stock> findAllStocks();
}
