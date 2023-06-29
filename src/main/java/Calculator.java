public class Calculator {

    private String level;

    public int sum(int a, int b) {
        return a + b;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public double div (double a, double b) {
        if (b==0) {
            throw new NullPointerException("Делить на ноль нельзя");
        }
        return a / b;
    }

    public int div (int a, int b) {
        if (b == 0) {
            throw new NullPointerException("Делить на ноль нельзя");
        }
        return a / b;
    }
    
}