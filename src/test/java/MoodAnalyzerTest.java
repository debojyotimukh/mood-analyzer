import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {
    @Test
    public void testMoodAnalysis() throws Exception{
        MoodAnalyzer moodAnalyzer=new MoodAnalyzer();

        String mood=moodAnalyzer.analyseMood("This is a sad message");
        Assert.assertThat(mood, CoreMatchers.is("SAD"));
    }
}
