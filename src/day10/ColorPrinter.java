package day10;

public class ColorPrinter extends Printer {
    /**
     * 这是重载，colorPrinter类中的print与其父类的print方法的参数不一样
     * @param color
     */
    public void print(String color){
        System.out.println(color+"打印");
    }
}
