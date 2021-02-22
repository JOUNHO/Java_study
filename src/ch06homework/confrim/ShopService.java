package ch06homework.confrim;

public class ShopService {
	static ShopService shopService=new ShopService();
	
	private ShopService(){
		
	}
	
	public static ShopService getInstance() {
		return shopService; 
	}

}
