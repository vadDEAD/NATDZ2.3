package ru.netology.rest;

import org.junit.jupiter.api.Test;

public class postManEchoTest {
    @Test
    void shouldReturnSameData() {
        // Given - When - Then
// Предусловия
        given()
                .baseUri("https://postman-echo.com")
                .body("some lame Data") // отправляемые данные (заголовки и query можно выставлять аналогично)
// Выполняемые действия
                .when()
                .post("/post")
// Проверки
                .then()
                .statusCode(200)
                .body("some lame Data")
        ;
    }
}
