

class HogwartsStudent {
    public String name;
    public boolean isSmart;
    public boolean isKind;
    public String house;
    
    public HogwartsStudent(String name, Boolean isSmart, Boolean isKind) {
        this.name = name;
        this.isKind = isKind;
        this.isSmart = isSmart;
    }
}

class SortStudents {

    public static final String HUFFLEPUFF = "Hufflepuff";
    public static final String RAVENCLAW = "Ravenclaw";
    public static final String GRYFFINDOR = "Gryffindor";
    public static final String SLYTHERIN = "Slytherin";
    
    public void sortStudent(HogwartsStudent student) {
        student.house = getStudentHouse(student);
    }
    
    public String getStudentHouse(HogwartsStudent student) {
        if (student.isKind && student.isSmart) {
            return RAVENCLAW;
        } else if (student.isSmart) {
            return SLYTHERIN;
        } else if (student.isKind) {
            return GRYFFINDOR;
        } else {
            return HUFFLEPUFF;
        }
        return "sorted";
    }
}

