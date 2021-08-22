package com.imlsw96.designPattern.adapterPattern;


// Adapter 클래스를 작성할때 필요한 것은
// 첫번째로 110v를 220v로 바꿔줘야함으로 110v를 implements 해주어야 한다.
public class SocketAdapter implements Electronic110V{

    // 두번째로는 220v로 바꿔주기위해 220v를 가지고있어야 한다.
    private Electronic220V electronic220V;

    // 그리고 default 생성자에서 220v 제품을 받아오도록 만들어 준다.
    public SocketAdapter(Electronic220V electronic220V) {
        // 만들어 놓은 220v에 받아온 220v를 할당해준다.
        this.electronic220V = electronic220V;
    }

    @Override
    public void powerOn() {
        // 그리고 powerOn이 실행될때 220v 메서드를 실행시켜주는 것.
        electronic220V.connect();
    }
}
