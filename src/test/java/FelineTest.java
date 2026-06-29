import org.junit.Test;
import com.example.Feline;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;


@RunWith(MockitoJUnitRunner.class)
public class FelineTest {
    @Test
    public void testFelineFeline() throws Exception {
        Feline testerFeline = new Feline();
        System.out.println(testerFeline.eatMeat());
        assertEquals(List.of("Животные", "Птицы", "Рыба"), testerFeline.eatMeat());
        System.out.println(testerFeline.getFamily());
        assertEquals("Кошачьи", testerFeline.getFamily());
        System.out.println(testerFeline.getKittens());
        assertEquals(1, testerFeline.getKittens());
    }
}
