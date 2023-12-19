package study;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StringTest {

    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    void request1() {
        String[] req1 = "1,2".split(",");
        String[] req2 = "1".split(",");

        assertThat(req1).contains("1", "2");
        assertThat(req1).containsExactly("1","2");
        assertThat(req2).contains("1");
        assertThat(req2).containsExactly("1");
    }

    @Test
    void request2() {
        String req = "(1,2)".substring(1, 4);
        assertThat(req).isEqualTo("1,2");
    }

    @Test
    @DisplayName("OutOfBoundsException Test")
    void request3() {
        String req = "abc";
        
        assertThatThrownBy(() -> {
            req.charAt(3);
        }).isInstanceOf(IndexOutOfBoundsException.class)
            .hasMessageContaining("String index out of range: 3");
    }
}
