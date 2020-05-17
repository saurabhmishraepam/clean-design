package task;

public class FeedbackRecord extends Record {

    private String criterion;

    private FeedbackQuality quality;

    public String getCriterion() {
        return criterion;
    }

    public FeedbackRecord setCriterion(String criterion) {
        this.criterion = criterion;
        return this;
    }

    public FeedbackQuality getQuality() {
        return quality;
    }

    public FeedbackRecord setQuality(FeedbackQuality quality) {
        this.quality = quality;
        return this;
    }
    @Override
    public String format(){
        return "feedback: " + getCriterion() + "=" + getQuality();
    }
}
