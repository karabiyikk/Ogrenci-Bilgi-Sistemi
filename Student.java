package Proje;

public class Student {
    Course c1;
    Course c2;
    Course c3;

    Course v1;
    Course v2;
    Course v3;

    String name;
    String stuNo;
    String classes;
    double avarage;
    boolean isPass;

    Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.v1 = c1;
        this.v2 = c2;
        this.v3 = c3;
        this.avarage = 0;
        this.isPass = false;
    }

    void addBulkExamNote(int note1, int note2, int note3) {
        if (note1 >= 0 && note1 <= 100) {
            this.c1.note = note1;
        }
        if (note2 >= 0 && note2 <= 100) {
            this.c2.note = note2;
        }
        if (note3 >= 0 && note3 <= 100) {
            this.c3.note = note3;
        }
    }

    void addVerbalNote(int verbal1, int verbal2, int verbal3) {
        if (verbal1 >= 0 && verbal1 <= 100) {
            this.v1.verbal = verbal1;
        }
        if (verbal2 >= 0 && verbal2 <= 100) {
            this.v2.verbal = verbal2;
        }
        if (verbal3 >= 0 && verbal3 <= 100) {
            this.v3.verbal = verbal3;
        }
    }

    void printVerbal() {
        System.out.println("\t\t\t\t");
        System.out.println(v1.name + " Sözlü Notu\t: " + v1.verbal);
        System.out.println(v2.name + " Sözlü Notu : " + v2.verbal);
        System.out.println(v3.name + " Sözlü Notu : " + v3.verbal);
        System.out.println("Ortalamanız : " + this.avarage);
    }

    void printNote() {
        System.out.println("****************");
        System.out.println(c1.name + " Notu\t  : " + c1.note);
        System.out.println(c2.name + " Notu : " + c2.note);
        System.out.println(c3.name + " Notu : " + c3.note);

    }

    void isPass() {
        this.avarage = ((this.c1.note + this.c2.note + this.c3.note) / 3.0 * 0.8) +
                ((this.v1.verbal + this.v2.verbal + this.v3.verbal) / 3.0 * 0.2);
        printNote();
        printVerbal();
        if (this.avarage > 55) {
            System.out.println("Sınıfı Geçtiniz ");
        } else {
            System.out.println("Sınıfta Kaldınız ");
        }

    }
}
