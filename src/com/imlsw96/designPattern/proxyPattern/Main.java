package com.imlsw96.designPattern.proxyPattern;

public class Main {

    public static void main(String[] args) {




//        Browser browser= new Browser("www.naver.com");
//        browser.show();

        // Interface IBrowser는 Html 객체를 리턴해주는 show() 메서드가 있다.
        // Html 클래스는 url이란 String 멤버변수가 존재하고 기본생성자에
        // url을 매개변수로 받아 멤버변수인 url에 값을 할당해준다.
        // 다시 돌아와서 Browser 클래스가 IBrowser를 implements를 받는다.
        // Browser에서 Html show() 메서드를 재정의할 때
        // if 문으로 html 객체가 존재하는지 확인하고 없다면
        // new Html(url)을 객체를 새로 만들어서 리턴해준다.
        // Main으로 돌아와서 테스트해보면 처음에는 존재하지 않아서 url을 생성해서 리턴해주고
        // 두번째 호출했을때는 생성된 html 인스턴스를 바로 가져다가 사용하는걸 확인할 수 있다.
        // 여기서 필요한 부분은 인스턴스된 html 객체를 담아둘 변수가 BrowserProxy 클래스의 멤버변수로 존재해야한다는 것.
        IBrowser browser = new BrowserProxy("www.naver.com");
        browser.show();
        browser.show();
        browser.show();
        browser.show();
        browser.show();

    }
}
