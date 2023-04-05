import org.junit.jupiter.api.Test

class PostmanEchoTest1 {
    @Test
    void shoudReturnPost() {
        given()
         .baseUri("https://postman-echo.com")
         .contentType("text/plain; charset=UTF-8")
         .body("some data") // отправляемые данные (заголовки и query можно выставлять аналогично)
// Выполняемые действия
         .when()
         .post("/post")
// Проверки
         .then()
         .statusCode(200)
         .body("data", equalTo("some value"));
    }
}
