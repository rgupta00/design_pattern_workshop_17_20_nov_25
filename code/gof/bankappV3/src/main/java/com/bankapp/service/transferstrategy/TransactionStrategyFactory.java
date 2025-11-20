package com.bankapp.service.transferstrategy;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bankapp.dto.TransactionType;
@Service
public class TransactionStrategyFactory {
	
	private final Map<String, TransactionStrategy> strategyMap;

    @Autowired
    public TransactionStrategyFactory(Map<String, TransactionStrategy> strategyMap) {
        this.strategyMap = strategyMap;
    }

    public TransactionStrategy getStrategy(TransactionType type) {
        return strategyMap.get(type.name());
    }
}
