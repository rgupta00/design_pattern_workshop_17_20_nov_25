package com.bankapp.dto;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
@Data
@AllArgsConstructor
@Builder
public class TransferDto {
    private int fromAccId;
    private int toAccId;
    private BigDecimal amount;
    private TransactionType txType;
}