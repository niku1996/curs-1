public class University {
    Student max;
    Master ivan;
    public University(){

    }

    public University(Student max, Master ivan) {
        this.max = max;
        this.ivan = ivan;
    }
    public String toString(){
        return "Student max ==> " + max + "Student ivan ==> " + ivan;
    }
}
