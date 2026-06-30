import com.example.Feline;
import com.example.Lion;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import java.util.List;
import static org.mockito.Mockito.when;
import org.testng.asserts.SoftAssert;


@RunWith(Parameterized.class)
public class LionTest {

    private final String animalType = "Хищник";
    private final String sxt;

    public LionTest(String sxt){
        this.sxt = sxt;
    }

    @Parameterized.Parameters
    public static Object[][] getTestData() {
        return new Object[][]{
                {"Самец"},
                {"Самка"},
                {"Тестовый"} //Проверка исключения, тест должен выдать ошибку.
        };
    }

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Mock
    private Feline mockLion;

    @Test
    public void testLionFelineCheck() throws Exception {
        Lion testerLion = new Lion(sxt, mockLion);
        System.out.println(testerLion.doesHaveMane());
        when(mockLion.getKittens()).thenReturn(1);
        System.out.println(testerLion.getKittens());
        when(mockLion.getFood(animalType)).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        System.out.println(testerLion.getFood());

        SoftAssert softAssert = new SoftAssert();
        if (sxt == "Самец") {
            softAssert.assertTrue(testerLion.doesHaveMane());
            softAssert.assertEquals(1, testerLion.getKittens());
            softAssert.assertEquals(List.of("Животные", "Птицы", "Рыба"), testerLion.getFood());
        } else {
            softAssert.assertFalse(testerLion.doesHaveMane());
            softAssert.assertEquals(1, testerLion.getKittens());
            softAssert.assertEquals(List.of("Животные", "Птицы", "Рыба"), testerLion.getFood());
        }


    }

}
