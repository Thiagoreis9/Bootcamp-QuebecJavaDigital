import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;

public class CondicionaisTeste {

    @Test
    void validarAlgoSomenteNoUsuarioWillyan(){
        Assertions.assertEquals(10, 5 + 5);
    }
}
