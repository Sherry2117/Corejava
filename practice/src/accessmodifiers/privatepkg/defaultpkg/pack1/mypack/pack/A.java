package accessmodifiers.privatepkg.defaultpkg.pack1.mypack.pack;

class A {
     void msg(){
      System.out.println("Hello A");
    }

    public static void main(String[] args) {
        A a = new A();
        a.msg();
    }
}
