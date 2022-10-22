import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class) // Ordem definida pelo @Order()
//@TestMethodOrder(MethodOrderer.MethodName.class) Ordem definida pelo nome em ordem alfabética
//@TestMethodOrder(MethodOrderer.Random.class) Ordem randomica
//@TestMethodOrder(MethodOrderer.DisplayName.class) Ordem definida pelo @DisplayName() em ordem alfabética
public class EscolhendoAOrdemTeste {

    @Order(4)
    @Test
    void validaFluxoA(){
        Assertions.assertTrue(true);
    }

    @Order(3)
    @Test
    void validaFluxoB(){
        Assertions.assertTrue(true);
    }

    @Order(2)
    @Test
    void validaFluxoC(){
        Assertions.assertTrue(true);
    }

    @Order(1)
    @Test
    void validaFluxoD(){
        Assertions.assertTrue(true);
    }

}
