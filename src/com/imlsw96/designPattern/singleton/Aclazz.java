package com.imlsw96.designPattern.singleton;

public class Aclazz {
    // + class는 예약어이기 때문에 'clazz'라고 붙여 진행한다.
    // 아래의 코드를 동일하게 Bclazz에서도 작성을 해준다.

    // A, B class 를 만들어 각각의 클래스에서 socketClient를 가질수 있도록 만들어 보겠다.
    private SocketClient socketClient;

    // Aclazz의 default 생성자에서 초기화를 해준다.


    public Aclazz() {
        // 기본생성자를 private으로 묶었기 때문에 아래 코드는 사용이 불가
        //  this.socketClient = new SocketClient();

        // static으로 만들어 놓은 getInstance 메서드를 이용하자.
        this.socketClient = SocketClient.getInstance();
    }

    // 그리고 socketClient를 리턴해주는 get메서드를 생성해준다.
    public SocketClient getSocketClient() {
        return this.socketClient;
    }
}
