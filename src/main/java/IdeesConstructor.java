public class IdeesConstructor {

    private String sujet;
    private String verb;
    private String cod;

    public IdeesConstructor(String sujet, String verb, String cod) {
        this.sujet = sujet;
        this.verb = verb;
        this.cod = cod;
    }

    public IdeesConstructor() {
    }

    public String getSujet() {
        return sujet;
    }

    public void setSujet(String sujet) {
        this.sujet = sujet;
    }

    public String getVerb() {
        return verb;
    }

    public void setVerb(String verb) {
        this.verb = verb;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }
}
