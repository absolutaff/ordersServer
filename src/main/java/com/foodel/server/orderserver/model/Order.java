package com.foodel.server.orderserver.model;

import java.util.List;
import java.util.Objects;

public class Order {

	private List<Product> buyList;

	private String clientId;

	private boolean trackOrder;

	public Order() {
	}

	public Order(List<Product> buyList, String clientId, boolean trackOrder) {
		this.buyList = buyList;
		this.clientId = clientId;
		this.trackOrder = trackOrder;
	}

	public List<Product> getBuyList() {
		return buyList;
	}

	public void setBuyList(List<Product> buyList) {
		this.buyList = buyList;
	}

	public String getClientId() {
		return clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public boolean isTrackOrder() {
		return trackOrder;
	}

	public void setTrackOrder(boolean trackOrder) {
		this.trackOrder = trackOrder;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Order order = (Order) o;
		return trackOrder == order.trackOrder &&
				Objects.equals(buyList, order.buyList) &&
				Objects.equals(clientId, order.clientId);
	}

	@Override
	public int hashCode() {
		return Objects.hash(buyList, clientId, trackOrder);
	}
}
