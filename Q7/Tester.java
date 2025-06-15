package Q7;

class Tester {
    
    public static double[] findDetails(double[] salary) {
        double sum = 0.0;
        for (double s : salary) {
            sum += s;
        }

        double average = sum / salary.length;

        int greater = 0;
        int lesser = 0;

        for (double s : salary) {
            if (s > average) {
                greater++;
            } else if (s < average) {
                lesser++;
            }
        }

        // Return result as array
        return new double[]{average, (double)greater, (double)lesser};
    }
       
    public static void main(String[] args) {
        double[] salary = { 23500.0, 25080.0, 28760.0, 22340.0, 19890.0 };
        double[] details = findDetails(salary);
              
        System.out.println("Average salary: " + details[0]);
        System.out.println("Number of salaries greater than the average salary: " + details[1]);
        System.out.println("Number of salaries lesser than the average salary: " + details[2]);
    }
}
