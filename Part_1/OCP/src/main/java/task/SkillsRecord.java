package task;

public class SkillsRecord extends Record {

    private String skill;
    private SkillLevel level;

    public String getSkill() {
        return skill;
    }

    public SkillsRecord setSkill(String skill) {
        this.skill = skill;
        return this;
    }

    public SkillLevel getLevel() {
        return level;
    }

    public SkillsRecord setLevel(SkillLevel level) {
        this.level = level;
        return this;
    }

    @Override
    public String format(){
        return "skills: " + getSkill() + "=" + getLevel();
    }

}
