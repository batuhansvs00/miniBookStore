package nt.MiniBookStore;

import java.util.Scanner;


public class MiniBookStore {
    public static void main(String[] args) {
        enter();
    }

    //1-product, book, notebook classları oluştur.
    public static void enter() {
        //10-kategori menü
        Scanner inp=new Scanner(System.in);
        System.out.println("--- Mini Book Store ---");
        int select=-1;
        while (select!=0){
            System.out.println("Ürün Yönetim Paneli");
            System.out.println("1-Kitaplar");
            System.out.println("2-Defterler");
            System.out.println("0-Çıkış");
            System.out.println("Seçiminiz: ");
            select= inp.nextInt();
            //ProductService i referans alarak service oluştur
            ProductService service=select==1 ? new BookService() : new NotebookService();

            //select==1 ->ProductService service=new BookService();
            //select==2 ->ProductService service=new NotebookService();

            if(select==1 || select==2){
                service.processMenu();
            } else if (select == 0) {
                System.out.println("İyi günler...");
            }else{
                System.out.println("Hatalı giriş.");
            }


        }


    }

}
