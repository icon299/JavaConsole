/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaconsole;
import java.util.Scanner;
/**
 *
 * @author d.sinyatkin
 */
public class JavaConsole {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner sc = new Scanner(System.in);
    int i;            
    System.out.print("Введите целое число: ");
    if(sc.hasNextInt()) { // возвращает истинну если с потока ввода можно считать целое число
          i = sc.nextInt(); // считывает целое число с потока ввода и сохраняем в переменную
          System.out.println(i*2);
        } else {
          System.out.println("Вы ввели не целое число");
        }
    
    }
    
}
