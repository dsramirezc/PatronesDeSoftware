package Factory;

public class RestaurantFactoryProducer {
    public RestaurantAbstractFactory getRestaurantAbstractFactory(int numRestaurant){
        if(numRestaurant==1){
           return new Restaurant1Factory();
        }else if(numRestaurant==2){
		return new Restaurant2Factory();	
	}else{
	 default:return null;
	}	
    }
}
