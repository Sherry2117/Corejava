package throwsExamples;

import java.io.IOException;

//case2 : You declare the Exception.
class Z{
    void xyz() throws IOException{
        throw new IOException("Device Error"); //checked exception
    }
}
public class TestThrows2 {
    public static void main(String[] args) throws IOException {
        Z z = new Z();
        z.xyz();
    }
}
