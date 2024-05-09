package reqres;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
public class GettingListOfUsers {
public static void main(String[] args) {
	RestAssured.baseURI="https://reqres.in/";
}
}
