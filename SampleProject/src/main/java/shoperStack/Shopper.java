package shoperStack;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

public class Shopper {
public static void main(String[] args) {
	RestAssured.baseURI="https://www.shoppersstack.com/shopping";
	
	Object shopperId = given().log().all().contentType("application/json")
	.body("{\r\n"
			+ "  \"email\": \"baluab1418@gmail.com\",\r\n"
			+ "  \"password\": \"9666537973@aB\",\r\n"
			+ "  \"role\": \"SHOPPER\"\r\n"
			+ "}")
	.when().post("/users/login").jsonPath().get("data.userId");
	System.out.println("ShopperId is "+shopperId);
	
	Object token = given().log().all().contentType("application/json")
			.body("{\r\n"
					+ "  \"email\": \"baluab1418@gmail.com\",\r\n"
					+ "  \"password\": \"9666537973@aB\",\r\n"
					+ "  \"role\": \"SHOPPER\"\r\n"
					+ "}")
			.when().post("/users/login").jsonPath().get("data.jwtToken");
			System.out.println("Token is "+token);
	
//	view product
	Object productId= when().get("products/alpha").jsonPath().get("data[0].product");
			System.out.println(productId);
	
			
			
//	add product to wishlist
	given().contentType("application/json").header("Authorization", "Bearer"+token)
	.body("{\r\n"
			+ "  \"productId\": "+productId+",\r\n"
			+ "  \"quantity\": 0\r\n"
			+ "}")
	.when().post("/shoppers/"+shopperId+"wishlist")
	.then().assertThat().statusCode(201).log().all();
	
}
}
