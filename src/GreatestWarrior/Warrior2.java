package GreatestWarrior;
import java.util.List;

public class Warrior2 {

    public int level;
    public int experience;
    public List<String> achievements;

    public Warrior2() {
        this.level = 1;
        this.experience = 100;
    }

    public String rank() {
        return switch (level) {
            case Integer l when l < 10 -> "Pushover";
            case Integer l when l < 20 -> "Novice";
            case Integer l when l < 30 -> "Fighter";
            case Integer l when l < 40 -> "Warrior";
            case Integer l when l < 50 -> "Veteran";
            case Integer l when l < 60 -> "Sage";
            case Integer l when l < 70 -> "Elite";
            case Integer l when l < 80 -> "Conqueror";
            case Integer l when l < 90 -> "Champion";
            case Integer l when l < 100 -> "Master";
            case Integer l when l == 100 -> "Greatest";
            default -> "Invalid";
        };
    }

    public String fight(int enemyLevel) {
        int levelDiff = level - enemyLevel;
        String res = switch (levelDiff) {
            case Integer l when l < -99 || l > 99 -> "Invalid level";
            case Integer l when l >= 2 -> "Easy fight";
            case Integer l when l == 0 || l == 1 -> "A good fight";
            case Integer l when l <= -1 -> "An intense fight";
            case Integer l when l <= -15 -> "You've been defeated";
            default -> "Invalid";
        };
        learn(levelDiff);
        return res;
    }

    public void learn(int levelDiff) {
        int gainedXP = switch (levelDiff) {
            case Integer l when l >= 2 -> 0;
            case Integer l when l == 1 -> 5;
            case Integer l when l == 0 -> 10;
            case Integer l when l <= -1 -> 20 * -levelDiff * -levelDiff;
            default -> -1;
        };
        addExperience(gainedXP);
    }

    public String training(String reason, int gainedXP, int minLevel) {
        if (level >= minLevel) {
            addExperience(gainedXP);
            achievements.add(reason);
            return reason;
        }
        return "Not strong enough";
    }

    public void addExperience(int gainedXP) {
        experience += gainedXP;
        if (experience > 10000)
            experience = 10000;
        level = experience / 10;
    }

    public int level() {
        return level;
    }

    public int experience() {
        return experience;
    }

    public List<String> achivements() {
        return achievements;
    }
}

