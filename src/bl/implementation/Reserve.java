package bl.implementation;

import ui.controller.ReserveController;
import vo.*;

public class Reserve implements ReserveController {
	
	private DateVO date;
	private int days;
	private PromotionVO promotion;
	private double singlePrice;
	private double price;
	
	public Reserve(int singlePrice) {
		date = null;
		days = 0;
		promotion = null;
		price = 0;
		this.singlePrice = singlePrice;
	}
	
	public void setDate(DateVO date) {
		this.date = date;
	}
	
	public DateVO getDate() {
		return date;
	}
	
	public void setDays(int days) {
		this.days = days;
	}
	
	public int getDays() {
		return days;
	}
	
	public void setPromotion(PromotionVO promotion) {
		this.promotion = promotion;
	}
	
	public PromotionVO getPromotion() {
		return promotion;
	}
	
	public double getPrice() {
		price = singlePrice*days*promotion.getDiscount();
		return price;
	}
	
}
