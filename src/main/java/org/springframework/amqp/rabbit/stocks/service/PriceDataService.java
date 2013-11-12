package org.springframework.amqp.rabbit.stocks.service;

import java.util.List;

import org.springframework.amqp.rabbit.stocks.dto.Price;

public interface PriceDataService {

	/**
	 * Recalculate price for given id. 
	 * @param id
	 */
	void updatePrice(String id);
	
	/** 
	 * Get price by its id.
	 * @param id
	 * @return
	 */
	Price getPrice(String id);
	
	/**
	 * Updates all prices if its underlying market data
	 * has changed.
	 * @param ids - Array of Ids with changed market data. 
	 */
	void recalculatePrices(String[] ids);
	
	/**
	 * Get ids of price that have changed.
	 * @return
	 */
	String[] getChangedIds();
	

	
		
}
