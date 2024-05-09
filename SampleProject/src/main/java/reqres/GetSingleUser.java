package reqres;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

public class GetSingleUser {
	public static void main(String[] args) {
		RestAssured.baseURI = "https://reqres.in/";
//	how to get single user
		given().log().all().when().get("/api/users/2").then().log().all().assertThat().statusCode(200);
//add user
		given().contentType("application/json")
				.body("{\r\n" + "    \"name\": \"morpheus\",\r\n" + "    \"job\": \"leader\"\r\n" + "}").when()
				.post("/api/users").then().assertThat().statusCode(201).log().all(); //log is used to get Response 
	}

}
