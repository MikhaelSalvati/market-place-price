package com.market.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;


import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
public class Product extends PersistentEntity implements Serializable{
	private static final long serialVersionUID = 1L;

	@NotNull
	@ManyToOne
	@JoinColumn(name = "costumer_id")
	private Costumer costumer;


	@ManyToMany
	//Cria tabela auxiliar para fazer ligação de muitos para muitos entre rule e produtos
	@JoinTable(name = "product_rule",
			joinColumns = @JoinColumn(name = "product_id"),
			inverseJoinColumns = @JoinColumn(name = "rule_id" )
	)
	private Set<RuleMarketPlace> rules = new HashSet<>();

	@NotNull
	private String name;
	private String description;
	private String sku;
	private BigDecimal price;
	@NotNull
	private BigDecimal costPrice;
}
