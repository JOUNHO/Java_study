package ch06homework.Exercise18;

public class ShopService {
	static ShopService shopService=new ShopService();
	
	private ShopService(){
		
	}
	
	public static ShopService getInstance() {
		return shopService; 
	}

}
