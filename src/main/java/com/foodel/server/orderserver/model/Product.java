package com.foodel.server.orderserver.model;

import java.util.Objects;

public class Product {

	private String SKU;

	private String label;

	private ProductCategory category;

	public Product(String SKU, String label, ProductCategory category) {
		this.SKU = SKU;
		this.label = label;
		this.category = category;
	}

	public String getSKU() {
		return SKU;
	}

	public void setSKU(String SKU) {
		this.SKU = SKU;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public ProductCategory getCategory() {
		return category;
	}

	public void setCategory(ProductCategory category) {
		this.category = category;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Product product = (Product) o;
		return Objects.equals(SKU, product.SKU);
	}

	@Override
	public int hashCode() {
		return Objects.hash(SKU);
	}
}
