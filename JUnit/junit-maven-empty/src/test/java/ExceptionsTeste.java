import org.example.Conta;
import org.example.TransferenciaEntreContas;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionsTeste {

    @Test
    void validarCenarioDeExcecaoNaTransferencia(){
        Conta contaOrigem = new Conta("123456", 0);
        Conta contaDestino = new Conta("1543445", 100);

        Assertions.assertThrows(IllegalArgumentException.class, () -> TransferenciaEntreContas.transfere(contaOrigem, contaDestino, -1));
    }
}
