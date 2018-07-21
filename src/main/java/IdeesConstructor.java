public class IdeesConstructor {

    private String word;
    private String verb;
    private String noun;

    public IdeesConstructor(String word, String verb, String noun) {
        this.word = word;
        this.verb = verb;
        this.noun = noun;
    }

    public IdeesConstructor() {
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getVerb() {
        return verb;
    }

    public void setVerb(String verb) {
        this.verb = verb;
    }

    public String getNoun() {
        return noun;
    }

    public void setNoun(String noun) {
        this.noun = noun;
    }
}
