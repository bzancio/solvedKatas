package GreatestWarrior;

import java.util.ArrayList;
import java.util.List;

public class Warrior {

    public int level;
    public int experience;
    public List<String> achievements;

    public Warrior() {
        this.level = 1;
        this.experience = 100;
        this.achievements = new ArrayList<>();
    }

    public String rank() {
        if (level < 10) return "Pushover";
        if (level < 20) return "Novice";
        if (level < 30) return "Fighter";
        if (level < 40) return "Warrior";
        if (level < 50) return "Veteran";
        if (level < 60) return "Sage";
        if (level < 70) return "Elite";
        if (level < 80) return "Conqueror";
        if (level < 90) return "Champion";
        if (level < 100) return "Master";
        if (level == 100) return "Greatest";
        return "Invalid";
    }

    public String battle(int enemyLevel) {
        if (enemyLevel < 1 || enemyLevel > 100) return "Invalid level";
        int levelDiff = level - enemyLevel;
        String res = "";
        if (levelDiff >= 2) res = "Easy fight";
        if (levelDiff == 0 || levelDiff == 1) res = "A good fight";
        if (levelDiff <= -1) res = "An intense fight";
        if (levelDiff <= -5 && level / 10 < enemyLevel / 10) return "You've been defeated";
        learn(levelDiff);
        return res;
    }

    public void learn(int levelDiff) {
        int gainedXP = 0;
        if (levelDiff == 1) gainedXP = 5;
        if (levelDiff == 0) gainedXP = 10;
        if (levelDiff <= -1) gainedXP = 20 * -levelDiff * -levelDiff;
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
        level = experience / 100;
    }

    public int level() {
        return level;
    }

    public int experience() {
        return experience;
    }

    public List<String> achievements() {
        return achievements;
    }
}
