package com.workintech.pazararabası.main;

import com.workintech.pazararabası.model.Pazar;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    pazarArabasiUygulamasi();

    }
    public static void pazarArabasiUygulamasi() {
        Scanner scanner = new Scanner(System.in);
        List<String> pazarListesi = new LinkedList<>();

      while (true){
          System.out.println("Merhaba, pazar arabasına hoş geldiniz.");
          System.out.println("Yapılmasını isteğiniz işlemi giriniz:");
          System.out.println("0: çıkış");
          System.out.println("1: ürün ekle");
          System.out.println("2: ürün çıkar");
          int input = scanner.nextInt();
          if(input == 0){
              break;
          }
          if(input == 1) {
              System.out.println("Eklenmesini istediğiniz elemanları giriniz.");
              Pazar.addItems(pazarListesi);
          }
          if(input == 2){
              System.out.println("Çıkarılmasını istediğiniz elemanları yazınız.");
              Pazar.removeItems(pazarListesi);
          }
      }

    }

}
