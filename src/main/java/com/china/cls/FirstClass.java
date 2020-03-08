package com.china.cls;

/**
 * Created by Cailianshe on 2020/3/7.
 */
public class FirstClass {

    public static void main(String[] args) {
        try {
            System.out.println("hi");
//            int x = 3 / 0;
            int[] s = new int[3];
            System.out.println(s[3]);
        }catch (ArithmeticException e){
            System.out.println("ohoh , ArithmeticException!!!");
            e.printStackTrace();
        } catch (Throwable e){
            System.out.println("yayaya, Throwable!!!!");
            e.printStackTrace();
        } finally {
            System.out.println("ooooo finally");
        }
    }
}
