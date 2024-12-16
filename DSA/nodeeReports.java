/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DSA;

/**
 *
 * @author ivan
 */
public class nodeeReports {
   String date, mostBorrowedBook;
    int totalBorrowedBooks;
    double totalFine;
    nodeeReports next;

    public nodeeReports(String date, String mostBorrowedBook,int totalBorrowedBooks, double totalFine) {
        this.date = date;
        this.mostBorrowedBook = mostBorrowedBook;
        this.totalBorrowedBooks = totalBorrowedBooks;
        this.totalFine = totalFine;
        this.next = null;
    }
}
