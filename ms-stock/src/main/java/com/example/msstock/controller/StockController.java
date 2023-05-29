package com.example.msstock.controller;

import com.example.msstock.entity.Stock;
import com.example.msstock.service.ServiceStock;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/stock")
public class StockController {
    private final ServiceStock serviceStock;

    @PatchMapping("/{id}")
    Stock updateStock(
            @RequestBody Map<Object,Object> fields,
            @PathVariable Long id)
    {
        return serviceStock.updateStock(fields,id);
    }

    @PostMapping("/add")
    Stock createStock(@RequestBody Stock stock)
    {

        return serviceStock.createStock(stock);
    }

    @GetMapping("/all")
    public List<Stock> getAllStocks() {
        return serviceStock.findAllStocks();
    }

    @GetMapping("/{id}")
    public Stock getStockById(@PathVariable Long id) {
        return serviceStock.getStockById(id);
    }


}
