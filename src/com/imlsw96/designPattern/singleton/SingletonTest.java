package com.imlsw96.designPattern.singleton;

public class SingletonTest {

    public static void main(String[] args) {

        Aclazz aclazz = new Aclazz();
        Bclazz bclazz = new Bclazz();

        SocketClient aClient = aclazz.getSocketClient();
        SocketClient bClient = bclazz.getSocketClient();

        System.out.println("두개의 인스턴스는 동일한가?");
        System.out.println(aClient.equals(bClient));

        // true가 나오는걸 확인할 수 있다.
        // 이때 SocketClient 클래스의 default 생성자를 열어두고
        // bclazz의 SocketClient 인스턴스를 default생성자로 생성하고
        // aclazz와 비교했을때는 false가 나오는걸 확인할 수 있다.

        // 이로써 한 프로그램 내부에서 단 하나의 객체만이 존재할때는 getInstance를 통한
        // 객체를 생성해서 사용해야 한다. 
    }
}
