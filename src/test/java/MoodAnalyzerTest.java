import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {
    @Test
    public void testMoodAnalysis1() throws Exception {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();

        String mood = moodAnalyzer.analyseMood("I am in sad mood");


        Assert.assertThat(mood, CoreMatchers.is("SAD"));
    }

    @Test
    public void testMoodAnalysis2() throws Exception {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        String mood = moodAnalyzer.analyseMood("I am in any mood");

        Assert.assertThat(mood, CoreMatchers.is("HAPPY"));
    }

    @Test
    public void testNullMoodAnalysis() throws Exception{
        MoodAnalyzer moodAnalyzer=new MoodAnalyzer();
        String mood=moodAnalyzer.analyseMood(null);
        Assert.assertThat(mood,CoreMatchers.is("HAPPY"));
    }
}
