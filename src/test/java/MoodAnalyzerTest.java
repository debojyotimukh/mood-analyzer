import org.hamcrest.CoreMatchers;
import org.junit.*;
import org.junit.rules.ExpectedException;

public class MoodAnalyzerTest {
    public MoodAnalyzer moodAnalyzer;

    @Before
    public void initializeTests() {
        moodAnalyzer = new MoodAnalyzer();
    }

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void testMoodAnalysis1() throws MoodAnalysisException {
        //MoodAnalyzer moodAnalyzer = new MoodAnalyzer();

        String mood = moodAnalyzer.analyseMood("I am in sad mood");


        Assert.assertThat(mood, CoreMatchers.is("SAD"));
    }

    @Test
    public void testMoodAnalysis2() throws MoodAnalysisException {
        //MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        String mood = moodAnalyzer.analyseMood("I am in any mood");

        Assert.assertThat(mood, CoreMatchers.is("HAPPY"));
    }

    @Test
    public void testNullMoodAnalysis() throws MoodAnalysisException {
        exception.expect(MoodAnalysisException.class);
        exception.expectMessage("Null mood exception");
        //MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        String mood = moodAnalyzer.analyseMood(null);
    }

    @Test
    public void testEmptyMoodAnalysis() throws MoodAnalysisException {
        exception.expect(MoodAnalysisException.class);
        exception.expectMessage("Empty mood exception");
        //MoodAnalyzer moodAnalyzer=new MoodAnalyzer();
        String mood = moodAnalyzer.analyseMood("");
    }
}
