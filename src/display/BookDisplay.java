package display;

import jdk.swing.interop.DragSourceContextWrapper;

import java.util.Scanner;


import books.Books;
import books.FictionBooks;
import books.ProgrammingBooks;

public class BookDisplay {
    public static void main(String[] args) {
        Books[] books = new Books[10];
        books[0] = new ProgrammingBooks("English","Java","01","Lập trình là cuộc sống",1000000,"Jeff Atwood");
        books[1] = new ProgrammingBooks("English","Java","02","Code dạo kí sự",400000,"Phạm Huy Hoàng");
        books[2] = new ProgrammingBooks("English","Java","03","Tớ học lập trình",300000,"Nhiều tác giả");
        books[3] = new ProgrammingBooks("Tiếng việt","C++","04","C++ và lập trình hướng đối tượng",200000," Phạm Văn Ất & Lê Trường Thông");
        books[4] = new ProgrammingBooks("Tiếng việt","C++","05","Ngôn ngữ lập trình C và C++",90000,"Ngô Trung Việt");
        books[5] = new FictionBooks("Viễn tưởng ","06","Trò Chơi Của Ender",98000,"Orson Scott Card");
        books[6] = new FictionBooks("Viễn tưởng","07","Thế Giới Mới Tươi Đẹp",108000,"Người kinh doanh");
        books[7] = new FictionBooks("Viễn tưởng","08","451 độ f",84000,"Ray Bradbury");
        books[8] = new FictionBooks("viễn tưởng","09","Bí kíp quá giang vào ngân hàng",8000,"Douglas Adams");
        books[9] = new FictionBooks("Thường","10","Vật chủ",124000,"Stephenie Meyer");
        for (Books b: books){
            System.out.println(b);
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Language");
        String language = scanner.nextLine();

        System.out.println("Enter Category");
        String category = scanner.nextLine();

        System.out.println("Tổng tiền của 10 cuốn sách:" + sum(books));
        System.out.println("Số sách lập trình có ngôn ngữ :" +totalJava(books, language) );
        System.out.println("Số sách thuộc kiểu viễn tưởng:" + totalCategory(books,category) );
        System.out.println("Tổng số sách lập trình có giá nhỏ hơn 10000 nghìn:" + checkPrice(books));
        System.out.println("Tổng số sách viễn tưởng có giá nhỏ hơn 10000 nghìn:" + checkPrice1(books));
    }
    public static double sum(Books[] books) {
        double total = 0;
        for (Books i: books) {
            total += i.getPrice();
        }
        return total;
    }
    public static int totalJava(Books[] books, String language){
        int total = 0;
        for(Books i : books) {
            if (i instanceof ProgrammingBooks) {
                if (((ProgrammingBooks) i).getLanguage().equals(language)) {
                    total++;
                }
            }
        }
        return total;
    }
    public static int totalCategory(Books[] books,String category){
            int total = 0;
            for (Books i : books) {
                if (i instanceof FictionBooks) {
                    if (((FictionBooks) i).getCategory().equals(category)) {
                        total++;
                    }
                }
            }
        return total;
    }
    public static int checkPrice(Books[] books){
        int total = 0;
        for(Books i: books){
            if(i instanceof FictionBooks){
                if(i.getPrice() < 100000){
                    total++;
                }

            }
        }
        return total;
    }
    public static int checkPrice1(Books[] books){
        int total = 0;
        for(Books i: books){
            if(i instanceof FictionBooks ){
                if(i.getPrice() < 10000){
                    total++;
                }
            }
        }
        return total;
    }
}
