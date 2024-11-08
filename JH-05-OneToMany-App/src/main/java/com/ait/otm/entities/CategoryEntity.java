package com.ait.otm.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="tbl_categories")
public class CategoryEntity {
	
	@Column(name="category_name")
	private String categoryName;
	
	@Id
	@Column(name = "category_id")
	private Integer categoryId; 
	
	@OneToMany(cascade = CascadeType.ALL  ,orphanRemoval = true , fetch = FetchType.EAGER)
	@JoinColumn(name = "category_id_fk", referencedColumnName = "category_id")
	private List<ProductEntity> lstOfProducts ;

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public List<ProductEntity> getLstOfProducts() {
		return lstOfProducts;
	}

	public void setLstOfProducts(List<ProductEntity> lstOfProducts) {
		this.lstOfProducts = lstOfProducts;
	} 
	
	
}
