import org.junit.Test;
import com.example.Feline;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;


@RunWith(MockitoJUnitRunner.class)
public class FelineTest {
    @Test
    public void testFelineFeline() throws Exception {
        Feline testerFeline = new Feline();
        System.out.println(testerFeline.eatMeat());
        System.out.println(testerFeline.getFamily());
        System.out.println(testerFeline.getKittens());
    }
}
