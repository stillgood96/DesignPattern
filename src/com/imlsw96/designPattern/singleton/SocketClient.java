package com.imlsw96.designPattern.singleton;

public class SocketClient {


    // 어떠한 서버에 통신을 한다고 했을 때
    // 서버에 매번 연결하는 것이 아닌
    // 연결해놨던 connect 통로를 이용하는 방식으로 진행해본다.

    // 싱글톤이란 것은 일단 자기 자신을 객체로 가지고 있어야 한다.
    // static 메서드를 통해 객체를 생성하기 때문에 가지고 있는 객체 또한 static이 되며
    // 기본값은 null로 초기화 해준다.
    private static SocketClient socketClient = null;

    // 싱글톤에 기본적인 것은 기본생성자를 private으로 막아야 한다.
    private SocketClient() {};

    // 그리고 인스턴스를 만들 수 있는 getInstance를 제공해야 한다.
    // 이는 static 메서드로 만들어져 밖에서도 접근이 가능한 메서드가 된다.
    public static SocketClient getInstance() {

        // 내부에서는 현재 내가 가지고 있는 객체가 null인지 확인을 해주고
        // null일 경우 생성을 해주어야 한다.
        // null이 아니라면 기존 생성되어있는 객체를 반환해준다.
        if(socketClient == null) {
            socketClient = new SocketClient();
        }

        return socketClient;
    } ;


    // 객체가 생성되었다면 접근해서 확인할 수 있도록 connect 메서드를 만들어 준다.
    public void connect() {
        System.out.println("connect");
    }
}

