package reqres;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

public class CUD_OperationsOnUser {
	public static void main(String[] args) {
		RestAssured.baseURI = "https://reqres.in/";
//	creating an user
		Object id = given().contentType("application/json")
				.body("{\r\n" + "    \"name\": \"morpheus\",\r\n" + "    \"job\": \"leader\"\r\n" + "}").when()
				.post("/api/users").jsonPath().get("id");
		System.out.println(id);
//updating an user
		given().log().all().contentType("application/json")
				.body("{\r\n" + "    \"name\": \"morpheus\",\r\n" + "    \"job\": \"zion resident\"\r\n" + "}").when()
				.put("/api/users/" + id).then().assertThat().statusCode(200).log().all();
//to delete an user
		given().when().delete("/api/users/" + id).then().assertThat().statusCode(204).log().all();

	}
}
