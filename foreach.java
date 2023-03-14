class ForEach {
    public static void main(String[] arg) {
        int[] marks = { 125, 132, 95, 116, 110 };
         int max = marks[0]; 
         for (int num: marks) {
             if (num > max) {
                  max = num;
             }
         }
          System.out.println("Student highest score is "+max);
    }
}