import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EulerOneTest {
    @Test
    void whenSetMaxRangeTo10_Give23(){
        //given
        int maxRange = 10;
        //when
        int result = EulerOne.sumOfmultiplesOfNumberThreeAndFive(maxRange);
        //then
        int expectedResult = 23;
        assertEquals(expectedResult, result);
        assertThat(result)
                .isEqualTo(expectedResult);
    }

    @Test
    void whenSetMaxRangeTo11_Give33(){
        //given
        int maxRange = 11;
        //when
        int result = EulerOne.sumOfmultiplesOfNumberThreeAndFive(maxRange);
        //then
        int expectedResult = 33;
        assertEquals(expectedResult, result);
        assertThat(result)
                .isEqualTo(expectedResult);
    }

    @Test
    void whenSetMaxRangeTo12_Give33(){
        //given
        int maxRange = 12;
        //when
        int result = EulerOne.sumOfmultiplesOfNumberThreeAndFive(maxRange);
        //then
        int expectedResult = 33;
        assertEquals(expectedResult, result);
        assertThat(result)
                .isEqualTo(expectedResult);
    }

    @Test
    void whenSetMaxRangeTo13_Give45(){
        //given
        int maxRange = 13;
        //when
        int result = EulerOne.sumOfmultiplesOfNumberThreeAndFive(maxRange);
        //then
        int expectedResult = 45;
        assertEquals(expectedResult, result);
        assertThat(result)
                .isEqualTo(expectedResult);
    }

    @Test
    void whenSetMaxRangeTo16_Give60(){
        //given
        int maxRange = 16;
        //when
        int result = EulerOne.sumOfmultiplesOfNumberThreeAndFive(maxRange);
        //then
        int expectedResult = 60;
        assertEquals(expectedResult, result);
        assertThat(result)
                .isEqualTo(expectedResult);
    }

}
