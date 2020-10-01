import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {
    @Test
    public void testMoodAnalysis1() throws Exception{
        MoodAnalyzer moodAnalyzer=new MoodAnalyzer();

        String mood=moodAnalyzer.analyseMood("I am in sad mood");
        Assert.assertThat(mood, CoreMatchers.is("SAD"));
    }

    @Test
    public void testMoodAnalysis2() throws Exception{
        MoodAnalyzer moodAnalyzer=new MoodAnalyzer();
        String mood=moodAnalyzer.analyseMood("I am in any mood");
        Assert.assertThat(mood,CoreMatchers.is("HAPPY"));
    }
}
