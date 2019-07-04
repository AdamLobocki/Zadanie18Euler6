import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class Euler6Test {

    @Test
    public void shouldReturnFor3() {
        //given
        Euler6 euler6 = new Euler6();
        int x = 3;
        //when
        int calc = euler6.calc(x);
        //then
        Assert.assertThat(calc, CoreMatchers.is(22));
    }
    @Test
    public void shouldReturnFor1() {
        //given
        Euler6 euler6 = new Euler6();
        int x = 1;
        //when
        int calc = euler6.calc(x);
        //then
        Assert.assertThat(calc, CoreMatchers.is(0));
    }
    @Test
    public void shouldReturnFor2() {
        //given
        Euler6 euler6 = new Euler6();
        int x = 2;
        //when
        int calc = euler6.calc(x);
        //then
        Assert.assertThat(calc, CoreMatchers.is(4));
    }

}
