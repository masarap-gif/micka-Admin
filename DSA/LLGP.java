/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DSA;

/**
 *
 * @author ivan
 */
public class LLGP {
     private NodeReports head; 
    private int size; 
    public LinkedListGenRep() {
        head = null;
        size = 0;
    }

//    public void addRow(Object[] row) {
//        NodeReports newNode = new NodeReports(row);
//        if (head == null) {
//            head = newNode;
//        } else {
//            NodeReports current = head;
//            while (current.next != null) {
//                current = current.next;
//            }
//            current.next = newNode;
//        }
//        size++;
//    }
//    public void addRowAtPosition(int position, Object[] row) {
//        if (position < 0 || position > size) {
//            throw new IndexOutOfBoundsException("Invalid position!");
//        }
//
//        NodeReports newNode = new NodeReports(row);
//        if (position == 0) {
//            newNode.next = head;
//            head = newNode;
//        } else {
//            NodeReports current = head;
//            for (int i = 0; i < position - 1; i++) {
//                current = current.next;
//            }
//            newNode.next = current.next;
//            current.next = newNode;
//        }
//        size++;
//    }

    public void updateRowAtPosition(int position, String isbn, String title, String category, String date, String additionalData) {
        if (position < 0 || position >= size) {
            throw new IndexOutOfBoundsException("Position out of bounds for linked list size: " + size);
        }

        nodeeReports current = head;
        for (int i = 0; i < position; i++) {
            current = current.next;
        }

        current.isbn = isbn;
        current.title = title;
        current.category = category;
        current.date = date;
        current.additionalData = additionalData;
    }

    public void populateTable(DefaultTableModel tableModel) {
        tableModel.setRowCount(0); 

        nodeeReports current = head;
        while (current != null) {
            tableModel.addRow(new Object[]{
                current.isbn,
                current.title,
                current.category,
                current.date,
                current.additionalData
            });
            current = current.next;
        }
    }
    public void deleteAtPosition(int position) {
    if (position < 0 || position >= size) { 
        throw new IndexOutOfBoundsException("Invalid position!");
    }

    if (position == 0) { 
        head = head.next; 
    } else {
        nodeeReports current = head;
        for (int i = 0; i < position - 1; i++) { 
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
        }
    }

    size--; 
}


    public nodeeReports getHead() {
        return head;
    }

    public int getSize() {
        return size;
    }
}
