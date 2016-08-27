package HapExam.core.order.dto;

import com.hand.hap.core.annotation.MultiLanguage;
import com.hand.hap.core.annotation.MultiLanguageField;
import com.hand.hap.system.dto.BaseDTO;

import java.util.Date;

import javax.persistence.*;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * Created by taotao.xu on 16/6/24.
 */
@MultiLanguage
@Table(name = "hap_inv_inventory_items")
public class Item  extends BaseDTO {
    
    @Id
    @Column
    @GeneratedValue
    private  Long inventoryItemId;
    
    @Column
    @NotEmpty
    private String itemCode;
    
    @Column
    @NotEmpty
    private String itemDescription;
    
    @Column
    @NotEmpty
    private String orderdQuantityUom;
    
    @Column
    @NotEmpty
    private Long orderdQuantity;
    
    @Column
    @NotEmpty
    private Long unitSellingPrice;
    
    @Column
    @NotEmpty
    private Long orderMoney;
    
    @Column
    @NotEmpty
    private String description;
    
    @Column
    private String addition1;
    
    public String getAddition1() {
		return addition1;
	}

	public void setAddition1(String addition1) {
		this.addition1 = addition1;
	}

	public String getAddition2() {
		return addition2;
	}

	public void setAddition2(String addition2) {
		this.addition2 = addition2;
	}

	public String getAddition3() {
		return addition3;
	}

	public void setAddition3(String addition3) {
		this.addition3 = addition3;
	}

	public String getAddition4() {
		return addition4;
	}

	public void setAddition4(String addition4) {
		this.addition4 = addition4;
	}

	public String getAddition5() {
		return addition5;
	}

	public void setAddition5(String addition5) {
		this.addition5 = addition5;
	}

	@Column
    private String addition2;
    
    @Column
    private String addition3;
    
    @Column
    private String addition4;
    
    @Column
    private String addition5;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getOrderdQuantityUom() {
		return orderdQuantityUom;
	}

	public void setOrderdQuantityUom(String orderdQuantityUom) {
		this.orderdQuantityUom = orderdQuantityUom;
	}

	public Long getOrderdQuantity() {
		return orderdQuantity;
	}

	public void setOrderdQuantity(Long orderdQuantity) {
		this.orderdQuantity = orderdQuantity;
	}

	public Long getUnitSellingPrice() {
		return unitSellingPrice;
	}

	public void setUnitSellingPrice(Long unitSellingPrice) {
		this.unitSellingPrice = unitSellingPrice;
	}

	public Long getOrderMoney() {
		return orderMoney;
	}

	public void setOrderMoney(Long orderMoney) {
		this.orderMoney = orderMoney;
	}

	public Long getInventoryItemId() {
		return inventoryItemId;
	}

	public void setInventoryItemId(Long inventoryItemId) {
		this.inventoryItemId = inventoryItemId;
	}

	public String getItemCode() {
		return itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getItemDescription() {
		return itemDescription;
	}

	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}
    
    
    
    
}
