package Task3.Java;

public class Task3 {

   // Write a Java program called Teacher.
   // Identify features and behaviour of that Class.
    //    Create 3 subclasses MathTeacher, ChemistryTeacher and PianoTeacher
    //that would have it their own features and behaviour. Test all 4 classes

    public static void main(String[] args) {
        MathTeacher mathTeacher=new MathTeacher();
        mathTeacher.name="Demir";
        mathTeacher.teachMath();
        chemistryTeacher chemistryTeacher=new chemistryTeacher();
        chemistryTeacher.name="Demir";
        chemistryTeacher.teachChemistry();
    }
}
class Teacher{

    String name;
    void teach(){
        System.out.println("Teachers teach subjects");
    }
}
class MathTeacher extends Teacher{
    void teachMath(){
        System.out.println(name+"Teaches math");
    }
}
class chemistryTeacher extends Teacher{
        void teachChemistry(){
        System.out.println(name+"Teaches chemistry");
        }
        }
class PianoTeacher extends Teacher{
    void teachPiano() {
        System.out.println(name + "Teaches Piano");
    }
}
