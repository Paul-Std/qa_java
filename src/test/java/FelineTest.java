import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.testng.asserts.SoftAssert;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {
    @Test
    public void testFelineFeline() throws Exception {
        Feline testerFeline = new Feline();
        System.out.println(testerFeline.eatMeat());
        System.out.println(testerFeline.getFamily());
        System.out.println(testerFeline.getKittens());

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(List.of("Животные", "Птицы", "Рыба"), testerFeline.eatMeat());
        softAssert.assertEquals("Кошачьи", testerFeline.getFamily());
        softAssert.assertEquals(1, testerFeline.getKittens());
        softAssert.assertAll();

    }
}
