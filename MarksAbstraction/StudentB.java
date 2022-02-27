package MarksAbstraction;

public class StudentB extends Marks {
    private double mathMark;
    private double biologyMark;
    private double englishMark;
    private double chemistryMark;
    private double percentage;

    public StudentB() {
    }

    public StudentB(double mathMark, double biologyMark, double englishMark, double chemistryMark) {
        this.mathMark = mathMark;
        this.biologyMark = biologyMark;
        this.englishMark = englishMark;
        this.chemistryMark = chemistryMark;
    }

    @Override
    public double getPercentage() {
        percentage = (mathMark + biologyMark + englishMark + chemistryMark) / 4;
        return percentage;
    }

    @Override
    public void message(double percentage) {
        System.out.printf("StudentB's percentage is: %.2f%%\n", this.percentage);
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

    public double getChemistryMark() {
        return chemistryMark;
    }

    public void setChemistryMark(double chemistryMark) {
        this.chemistryMark = chemistryMark;
    }
}
