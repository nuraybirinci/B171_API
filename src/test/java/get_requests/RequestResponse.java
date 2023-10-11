package get_requests;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class RequestResponse {
    public static void main(String[] args) {
        String url = "https://petstore.swagger.io/v2/pet/9898";

        Response response = given().when().get(url);
        // response.prettyPrint();

        // Status kod nasıl yazdırılır?
        System.out.println("Status Kod:" + response.statusCode());

        // Content Type nasıl yazdırıır?
        System.out.println("Content Type: " + response.contentType());

        // Status Line nasıl yazdırılr?
        System.out.println("Status Line: " + response.statusLine());

        // Header bölümünden bir başlık nasıl yazdırılır?
        System.out.println("Header | Server :" + response.header("Server"));

        // Header bölümünden tüm başlıklar nasıl yazdırılır?
        System.out.println("Header : \n" + response.headers());

        // Time bilgisi nasıl yazdırılır?
        System.out.println("Time:" + response.time());
    }
}
