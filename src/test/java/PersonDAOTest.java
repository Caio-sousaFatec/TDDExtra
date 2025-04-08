import org.exercicio3.Email;
import org.exercicio2.Person;
import org.exercicio2.PersonDAO;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import java.util.Arrays;

public class PersonDAOTest {
    private final PersonDAO personDAO = new PersonDAO();

    @Test
    void testNomeValido() {
        Person p = new Person(1, "João Silva", 30, Arrays.asList(new Email(1, "joao@email.com")));
        assertFalse(personDAO.isValidToInclude(p).isEmpty());
    }

    @Test
    void testNomeInvalido() {
        Person p = new Person(2, "João", 30, Arrays.asList(new Email(2, "joao@email.com")));
        assertTrue(personDAO.isValidToInclude(p).contains("Nome inválido: deve conter pelo menos duas palavras e apenas letras."));
    }

    @Test
    void testIdadeForaDoIntervalo() {
        Person p = new Person(3, "Ana Souza", 0, Arrays.asList(new Email(3, "ana@email.com")));
        assertTrue(personDAO.isValidToInclude(p).contains("Idade inválida: deve estar entre 1 e 200."));
    }

    @Test
    void testSemEmail() {
        Person p = new Person(4, "Carlos Mendes", 25, List.of());
        assertTrue(personDAO.isValidToInclude(p).contains("Pelo menos um email deve ser informado."));
    }

    @Test
    void testEmailInvalido() {
        Person p = new Person(5, "Fernanda Lima", 40, Arrays.asList(new Email(5, "fernandaemail.com")));
        assertTrue(personDAO.isValidToInclude(p).contains("Email inválido: fernandaemail.com"));
    }
}
