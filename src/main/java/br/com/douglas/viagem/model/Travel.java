package br.com.douglas.viagem.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Travel {
	
	private Long id;
	private String orderNumber;
	private LocalDateTime startDate;
	private LocalDateTime endDate;
	private BigDecimal amount;
	//private TravelTypeEnum type;
	
}