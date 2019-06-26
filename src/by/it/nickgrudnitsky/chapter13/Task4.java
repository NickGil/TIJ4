package by.it.nickgrudnitsky.chapter13;

import java.util.Formatter;

public class Task4 {
    private int iteamWidt;
    private int qtyWidt;
    private int priceWidt;
    private String style1;
    private String style2;
    private String style3;

    public Task4(int iteamWidt, int qtyWidt, int priceWidt) {
        this.iteamWidt = iteamWidt;
        this.qtyWidt = qtyWidt;
        this.priceWidt = priceWidt;
        style1 = "%-" + iteamWidt + "s %" + qtyWidt + "s %" + priceWidt + "s\n";
        style2 = "%-" + iteamWidt + ".15s %" + qtyWidt + "d %" + priceWidt + ".2f\n";
        style3 = "%-" + iteamWidt + "s %" + qtyWidt + "s %" + priceWidt + ".2f\n";
    }

    private double total = 0;
    private Formatter f = new Formatter(System.out);

    public void printTitle() {
        f.format(style1, "Item", "Qty", "Price");
        f.format(style1, "----", "---", "-----");
    }

    public void print(String name, int qty, double price) {
        f.format(style2, name, qty, price);
        total += price;
    }

    public void printTotal() {
        f.format(style3, "Tax", "", total * 0.06);
        f.format(style1, "", "", "-----");
        f.format(style3, "Total", "", total * 1.06);
    }

    public static void main(String[] args) {
        Task4 receipt = new Task4(15, 5, 10);
        receipt.printTitle();
        receipt.print("Jack's Magic Beans", 4, 4.25);
        receipt.print("Princess Peas", 3, 5.1);
        receipt.print("Three Bears Porridge", 1, 14.29);
        receipt.printTotal();
    }
}