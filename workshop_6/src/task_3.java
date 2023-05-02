public class task_3 {
    public static void main(String[] args) {
        Cat semen = new Cat("Семен", true, "метис", true);
        System.out.printf("%s %s пароды %s %s \n",
                semen.getGender(),
                semen.getName(),
                semen.getCatBreed(),
                semen.getVaccination());
        semen.setVaccinations(false);
        System.out.printf("%s %s пароды %s %s \n",
                semen.getGender(),
                semen.getName(),
                semen.getCatBreed(),
                semen.getVaccination());
    }
}


