package enums;

public enum Classes {
    WARRIOR(1, "warrior"),
    PALADIN(2, "paladin"),
    HUNTER(3, "hunter"),
    ROGUE(4, "rogue"),
    PRIEST(5, "priest"),
    DEATHKNIGHT(6, "death knight"),
    SHAMAN(7, "shaman"),
    MAGE(8, "mage"),
    WARLOCK(9, "warlock"),
    MONK(10, "monk"),
    DRUID(11, "druid"),
    DEMONHUNTER(12, "demon hunter");


    public final int id;
    public final String name;

    Classes(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
