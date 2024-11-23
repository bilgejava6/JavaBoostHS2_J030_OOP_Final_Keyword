package com.muhammet;

public class Runner {
    public static void main(String[] args) {
        /**
         * final keyword,
         * önüne geldiği method, değişken ve class ın değişmezliğini garanti eder.
         * 1- bir değişkenin değerinin değişmemesini sağlamak için kullanılır.
         * DİKKAT!!!! ancak, bir değişken final olarak belirlenirse mutlaka ama mutlaka
         * o değişken bulunduğu sınıftan nesne yaratılmadan önce değerinin atanması gereklidir.
         * 2- bir methodun değişmesini istemediğimiz zamanlarda ilgili
         * methodun önüne final ekleriz. final override işleminin yapılmasını engeller.
         * 3- bir sınıfın önüne final keywork eklenirse o sınıfın miras alınmasını engeller.
         */
        Personel personel = new Personel();
        personel.ad = "Muhammet HOCA";
        personel.adres = "Ankara";
        personel.id = "P0034";
        //personel.KURUM_ADI = "";
    }
}