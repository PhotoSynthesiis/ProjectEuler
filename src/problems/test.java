package problems;

import java.io.*;

public class test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        A a1 = new A();
        Object a2 = null;
//
        a1.setP(111);
//        a2 = a1;
//        System.out.println(a2.getP());
//        a1.setP(100);
//        System.out.println(a2.getP());


        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(a1);
        objectOutputStream.flush();
        objectOutputStream.close();

        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);

        a2 = objectInputStream.readObject();
        A newA2 = (A) a2;
        System.out.println(newA2.getP());
    }
}

class A implements Serializable {
    private int p = 0;

    public void setP(int i) {
        p = i;
    }

    public int getP() {
        return p;
    }
}
