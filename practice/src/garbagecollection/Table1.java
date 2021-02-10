package garbagecollection;

class Table1 {
    void printTable(int n) {
        System.out.println("Started printable");
        //preparation
        //====
        synchronized (this) { //block synchronized
            for (int j = 1; j <= 5; j++) {
                System.out.println(n * j);
                try {
                    Thread.sleep(400);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }
       class TestSync1 {
        }

    }


}
