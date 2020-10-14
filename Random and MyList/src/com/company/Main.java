package com.company;

public class Main {

    public static void main(String[] args) {
        MyList<String> z = new MyList<>();
//					((a, b) -> {
//				if (((int) a.getValue() -  (int)b.getValue()) > 0) {
//					return 1;
//				} else {
//					if (((int) a.getValue() - (int) b.getValue()) == 0) {
//						return 0;
//					} else return (-1);
//				}
//			});
        Randomizer.randomString(z,10, 3);
        System.out.println(z.toString());
    }
}