package com.imlsw96.designPattern.adapterPattern;

public class AdapterTest {

    // 110v / 220v 나누어지는 인터페이스를 만들고
    // 가전의 이름으로 110v / 220v 를 implements 해주어
    // 각 가전에 맞게 메서드를 재정의 해준다.

    // main 클래스에서는 void 메서드 (콘센트 역할)를 만들어서 확인해본다.
    public static void connect(Electronic110V electronic110V){
        electronic110V.powerOn();
    };



    public static void main(String[] args) {

        // 110v인 hairDryer는 connect(콘센트)에 잘 끼워진다.
        HairDryer hairDryer = new HairDryer();
        connect(hairDryer);

        // 하지만 220v를 implements 해준 AirConditioner 같은 경우는
        // connect에 끼울수 없다 이때 필요한것이 돼지코이고
        // 프로그래밍에서는 Adapter라 부른다.
        AirConditioner airConditioner = new AirConditioner();
        //connect(airConditioner);

        // SocketAdapter를 사와서 적용해보자.
        Electronic110V adapter = new SocketAdapter(airConditioner);

        // 돼지코를 끼운 adapter를 콘센트에 연결해준다.
        connect(adapter);


    }
}
