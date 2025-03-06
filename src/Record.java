public class Record {

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            MyAcademyStudent S = new MyAcademyStudent("S92828989" + i,
                    switch (i) {
                        case 1 -> "Mary";
                        case 2 -> "Carol";
                        case 3 -> "Tim";
                        case 4 -> "Lisa";
                        case 5 -> "Harold";
                        default -> "Anonymous";
                    },
                    "05/23/1994",
                    "Java Masterclass");

            //System.out.println(S);
        }

        Student pojoStudent = new Student("123", "Gagan", "01/01/1993", "Python");
        System.out.println(pojoStudent);
        pojoStudent.setName("Gagan Singla");
        System.out.println(pojoStudent);
        System.out.println("*********************************************************");
        MyAcademyStudent recordstudent = new MyAcademyStudent("345", "Dolly", "01/01/1994", "C++");
        System.out.println(recordstudent);
        System.out.println(recordstudent.name());
        System.out.println(recordstudent.id());


    }
}
