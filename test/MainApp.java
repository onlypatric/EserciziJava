package test;

import pkg.growp.RUtil;

/**
 * MainApp
 */
public class MainApp {

    public static void main(String[] args) {
        RUtil r = new RUtil();
        System.out.println(r.randInt(10, 100));
    }
}