import org.junit.Assert;
import org.junit.Test;

public class CodewarsTest {

    public static String getMiddle(String word) {
        if (word.length()%2 == 0){
            return word.substring(word.length() / 2 - 1, word.length() / 2 + 1);
        } else {
            return word.substring(word.length() / 2, word.length() / 2 + 1);
        }
    }

    @Test
    public void evenTests() {
        Assert.assertEquals("es", getMiddle("test"));
        Assert.assertEquals("dd", getMiddle("middle"));
    }

    @Test
    public void oddTests() {
        Assert.assertEquals("t", getMiddle("testing"));
        Assert.assertEquals("A", getMiddle("A"));
    }

}
