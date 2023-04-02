class task_2 {
    public static void main(String[] args) {
        printSimpleNumbersTo(200);
    }
    public static void printSimpleNumbersTo(int number){
        if(number >1)
            System.out.printf("%d, ", 2);
        boolean isSimple = true;
        for (int i = 3; i <= number; i+=2) {
            isSimple = true;
            for (int j = 2; j*j <= i; j++) {
                if (i % j == 0) {
                    isSimple = false;
                    break;
                }
            }
            if (isSimple) {
                System.out.printf("%d, ", i);
            }
        }
    }
}