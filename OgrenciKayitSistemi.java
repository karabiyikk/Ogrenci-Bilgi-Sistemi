package Proje;

public class OgrenciKayitSistemi {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mahmut Hoca","TRH","0000");
        Teacher t2 = new Teacher("Kül Yutmaz","BİO","1111");
        Teacher t3 = new Teacher("Sevda Hoca","EDB","2222");

        Course tarih = new Course("Tarih","101","TRH");
        tarih.addTeacher(t1);

        Course biyoloji = new Course("Biyoloji","102","BİO");
        biyoloji.addTeacher(t2);

        Course edebiyat = new Course("Edebiyat","103","EDB");
        edebiyat.addTeacher(t3);

        Student s1 = new Student("İnek Şaban","123","4",tarih,biyoloji,edebiyat);
        s1.addBulkExamNote(70,80,90);
        s1.addVerbalNote(20,20,30);

        s1.isPass();


        Student s2 = new Student("Güdük Necmi","321","4",tarih,biyoloji,edebiyat);
        s2.addBulkExamNote(60,50,30);
        s2.addVerbalNote(50,60,30);

        s2.isPass();

    }
}
