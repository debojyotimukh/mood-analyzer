public class MoodAnalyzer {
    public String analyseMood(String message) throws NullPointerException{
        try {
            if (message.contains("sad"))
                return "SAD";
            else
                return "HAPPY";
        }catch (NullPointerException e){
            e.printStackTrace();
            return "HAPPY";
        }
    }
}
