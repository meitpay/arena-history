package enums;

public enum Specs {
    DEATHKNIGHT_BLOOD(250, "blood", Classes.DEATHKNIGHT),
    DEATHKNIGHT_FROST(251, "frost", Classes.DEATHKNIGHT),
    DEATHKNIGHT_UNHOLY(252, "unholy", Classes.DEATHKNIGHT),

    DEMONHUNTER_HAVOC(577, "havoc", Classes.DEMONHUNTER),
    DEMONHUNTER_VENGEANCE(581, "vengeance", Classes.DEMONHUNTER),

    DRUID_BALANCE(102, "balance", Classes.DRUID),
    DRUID_FERAL(103, "feral", Classes.DRUID),
    DRUID_GUARDIAN(104, "guardian", Classes.DRUID),
    DRUID_RESTORATION(105, "restoration", Classes.DRUID),

    HUNTER_BEASTMASTERY(253, "beast mastery", Classes.HUNTER),
    HUNTER_MARKMANSHIP(254, "markmanship", Classes.HUNTER),
    HUNTER_SURVIVAL(255, "survival", Classes.HUNTER),

    MAGE_ARCANE(62, "arcance", Classes.MAGE),
    MAGE_FIRE(63, "fire", Classes.MAGE),
    MAGE_FROST(64, "frost", Classes.MAGE),

    MONK_BREWMASTER(268, "brewmaster", Classes.MONK),
    MONK_WINDWALKER(269, "windwalker", Classes.MONK),
    MONK_MISTWEAVER(270, "mistweaver", Classes.MONK),

    PALADIN_HOLY(65, "holy", Classes.PALADIN),
    PALADIN_PROTECTION(66, "protection", Classes.PALADIN),
    PALADIN_RETRIBUTION(70, "retribution", Classes.PALADIN),

    PRIEST_DISCIPLINE(256, "discipline", Classes.PRIEST),
    PRIEST_HOLY(257, "holy", Classes.PRIEST),
    PRIEST_SHADOW(258, "shadow", Classes.PRIEST),

    ROGUE_ASSASSINATION(259, "assassination", Classes.ROGUE),
    ROGUE_OUTLAW(260, "outlaw", Classes.ROGUE),
    ROGUE_SUBTLETY(261, "subtlety", Classes.ROGUE),

    SHAMAN_ELEMENTAL(262, "elemental", Classes.SHAMAN),
    SHAMAN_ENHANCEMENT(263, "enhancement", Classes.SHAMAN),
    SHAMAN_RESTORATION(264, "restoration", Classes.SHAMAN),

    WARLOCK_AFFLICTION(265, "affliction", Classes.WARLOCK),
    WARLOCK_DEMONOLOGY(266, "demonology", Classes.WARLOCK),
    WARLOCK_DESTRUCTION(267, "destruction", Classes.WARLOCK),

    WARRIOR_ARMS(71, "arms", Classes.WARRIOR),
    WARRIOR_FURY(72, "fury", Classes.WARRIOR),
    WARRIOR_PROTECTION(73, "protection", Classes.WARRIOR);

    public final int specId;
    public final Classes classData;
    public final String specName;

    Specs(int specId, String specName, Classes classData) {
        this.specId = specId;
        this.specName = specName;
        this.classData = classData;
    }
}
