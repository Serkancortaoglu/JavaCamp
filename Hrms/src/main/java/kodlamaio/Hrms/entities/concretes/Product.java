package kodlamaio.Hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="products")
public class Product {
	
	@Id
	@GeneratedValue
	@Column(name="category_id")
	private int id;
	
	@Column(name="product_id")
	private int  productId;
	
	@Column (name="product_name")
	private String productName;

	public Product() {
		
	}

	public Product(int id, int productId, String productName) {
		super();
		this.id = id;
		this.productId = productId;
		this.productName = productName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	

}
