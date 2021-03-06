package com.market.contract.dto;

import com.market.model.Costumer;
import com.market.model.RuleMarketPlace;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    @NotNull
    private CostumerDTO costumer;

    private Set<RuleMarketPlaceDTO> rules = new HashSet<>();
    @NotNull
    private String name;
    
    private String description;

    private String sku;

    private BigDecimal price;
    @NotNull
    private BigDecimal costPrice;

}
