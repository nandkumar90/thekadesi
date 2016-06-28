package com.ensulin.models.dto;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="billitem")
public class BillItem {
	@Id
	@Column(name = "itemid")
	private long itemId;
	@Column(name="itemNo")
	private long itemNo;
    @Embedded
	private Items _item;
	@Column(name="quantity")
	private int quantity;
    @Embedded
	private BillItem _nextItem;
	
	public BillItem(Items _item, int quantity){
		this._item = _item;
		this.quantity = quantity;
	}
	
	public Items get_item() {
		return _item;
	}
	public void set_item(Items _item) {
		this._item = _item;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public double cost(){
		if(_nextItem != null)
			return _item.getCost()*quantity +_nextItem.cost();
		return _item.getCost()*quantity ;
	}
	
	public void setNextBillItem(Items _item, int quantity){
		if(_nextItem == null)
			_nextItem = new BillItem(_item, quantity);
		else
			_nextItem.setNextBillItem(_item, quantity);
	}
	
}