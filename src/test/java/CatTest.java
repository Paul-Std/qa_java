import org.junit.Test;
import com.example.Feline;
import com.example.Cat;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    @Mock
    private Feline mockPredator;

    @Test
    public void testCatFeline() throws Exception {
        when(mockPredator.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));

        Cat catTester = new Cat((Feline) mockPredator);

        System.out.println(catTester.getSound());
        assertEquals("Мяу", catTester.getSound());
        System.out.println(catTester.getFood());
        assertEquals(List.of("Животные", "Птицы", "Рыба"), catTester.getFood());
    }
}
