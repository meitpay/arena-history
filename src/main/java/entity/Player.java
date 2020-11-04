package entity;

public class Player {
    int classId, specId;
    String className, specName;


    public Player(int classId, int specId, String className, String specName) {
        this.classId = classId;
        this.specId = specId;
        this.className = className;
        this.specName = specName;
    }

    public int getSpecId() {
        return specId;
    }

    public String getSpecName() {
        return specName;
    }

    public int getClassId() {
        return classId;
    }

    public String getClassName() {
        return className;
    }

    public String classSpec() {
        return specName;
    }
}
