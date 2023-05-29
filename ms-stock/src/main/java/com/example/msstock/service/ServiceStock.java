package com.example.msstock.service;

import com.example.msstock.entity.Stock;
import com.example.msstock.repository.StockRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import org.springframework.util.ReflectionUtils;

import java.lang.reflect.Field;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ServiceStock implements IServiceStock{
    private final StockRepository stockRepository;
    @Override
    public Stock createStock(Stock stock) {
        stock.setCreatedAt(LocalDate.now());
        return stockRepository.save(stock);
    }

    @Override
    public Stock updateStock(Map<Object, Object> fields, Long id) {
        Optional<Stock> stock = stockRepository.findById(id);
        Assert.isTrue(stock.isPresent(),"Article not found with this id");
        fields.forEach((key,value)->{
            Field field = ReflectionUtils.findField(Stock.class,(String) key);
            field.setAccessible(true);
            ReflectionUtils.setField(field,stock.get(),value);
        });
        return stockRepository.save(stock.get());
    }

    @Override
    public Stock deleteStock(Long id) {
        return null;
    }

    @Override
    public Stock getStockById(Long id) {
        Optional <Stock> stock = stockRepository.findById(id);
        Assert.isTrue(stock.isPresent(),"Article not found with this id");
        return stock.get();
    }

    @Override
    public List<Stock> findAllStocks() {
        return stockRepository.findAll();
    }
}
