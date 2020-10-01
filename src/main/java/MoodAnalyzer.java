public class MoodAnalyzer {
    public String analyseMood(String message) throws MoodAnalysisException {
        if (message == null)
            throw new MoodAnalysisException("Null mood exception");
        if (message.isBlank())
            throw new MoodAnalysisException("Empty mood exception");

        if (message.contains("sad"))
            return "SAD";
        else
            return "HAPPY";
    }
}
