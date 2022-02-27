package MarksAbstraction;

public class StudentA extends Marks{

    private double mathMark;
    private double biologyMark;
    private double englishMark;
    private double percentage;

    public StudentA(){}

    public StudentA(double mathMark, double biologyMark, double englishMark) {
        this.mathMark = mathMark;
        this.biologyMark = biologyMark;
        this.englishMark = englishMark;
    }

    @Override
    public double getPercentage(){
        percentage = (mathMark + biologyMark + englishMark) / 3;
        return percentage;
    }

    @Override
    public void message(double percentage) {
        System.out.printf("StudentA's percentage is: %.2f%%\n",this.percentage);
    }

    public double getEnglishMark() {
        return englishMark;
    }

    public void setEnglishMark(double englishMark) {
        this.englishMark = englishMark;
    }

    public double getBiologyMark() {
        return biologyMark;
    }

    public void setBiologyMark(double biologyMark) {
        this.biologyMark = biologyMark;
    }

    public double getMathMark() {
        return mathMark;
    }

    public void setMathMark(double mathMark) {
        this.mathMark = mathMark;
    }
}
