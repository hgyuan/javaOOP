package day10;

public class BlackWhitePrinter extends Printer {

    /**
     * 这是重写，本类的print会覆盖父类Printer的print方法，
     * 如果定义类是BlackWhitePrinter，调用print方法时，会调用本类的print，即会输出“使用黑色打印”
     */
    public void print(){
        System.out.println("使用黑色打印");
    }
}
