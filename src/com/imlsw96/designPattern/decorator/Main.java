package com.imlsw96.designPattern.decorator;

public class Main {


    public static void main(String[] args) {

        // Decorator 패턴은 기본 뼈대를 유지하되 이후 필요한 형태로 꾸밀때
        // 뼈대를 유지한채로 확장을 해나가는 패턴이다.

        // 첫번째로 Interface인 ICar는 getPrice(), showPrice() 이렇게 두가지의 메서드를 갖는다.
        // 이 뼈대를 유지한 확장하기위해서는 ICar를 implements한  AudiDecorator 클래스가 필요하다.
        // 이 클래스에는 멤버변수로 ICar icar, int price, String modelName이 필요 하고
        // 이 세가지를 매개변수로 받는 생성자가 존재하며 getPrice() 메서드에서는 넘겨받는
        // ICar interface 객체에서 지정된 price + modelPrice로 지정된다.


        // ICar를 implements한 Audi 클래스는 price를 멤버변수 , 생성자를 매개변수로받는 클래스이고
        // 기본 Audi의 가격은 500으로 지정되어있다.
        ICar audi = new Audi(500);
        audi.showPrice();


        // a3 모델
        // 위의 코드에서 500원에 형성된 기본아우디 Interface를 매개변수로받아
        // 가격이 500 + 1000원이 형성된다
        ICar audi3 = new A3(audi, "A3");
        audi3.showPrice();

        // a4
        // 마찬가지로 500 +2000 2500원
        ICar audi4 = new A4(audi, "A4");
        audi4.showPrice();

        // a5
        // 마찬가지로 500 + 3500원이 된다.
        ICar audi5 = new A5(audi, "A5");
        audi5.showPrice();


    }
}
