package tn.wissem.msarticle.service;


import dto.stockDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "STOCK")
public interface IStockDto {

    @GetMapping("api/stock/{id}")
    public stockDto retrieveStockById(@PathVariable("id") long id);
}