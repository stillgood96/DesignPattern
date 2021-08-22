package com.imlsw96.designPattern.aop;

import com.imlsw96.designPattern.proxyPattern.IBrowser;

import java.util.concurrent.atomic.AtomicLong;

public class Main {


    public static void main(String[] args) {


        // AOP 관점으로 진행해보자.
        // AOPBrowser class를 생성하고 IBrowser를 implments 받는다.
        // 이후 Runnable before, after를 생성해서 재정의한 show 메서드에
        // html 객체에 값을 할당하기 전과 후로 before after를 배치한다.
        // 그리고 if 문아네는 Thread.sleep 으로 1.5초간 지연시간을 지정하고
        // before, after, url 이 세가지를 매개변수로 받는 생성자를 생성하고
        // Main 클래스에서 before와 after에 AtomicLong을 이용해서
        // before에는 현재시간을 after에는 현재시간과 before에서 구한 시간을 뺀 값을 넘겨준다.


        // 결과를 확인해보고 순서를 따져보면
        // show()가 실행되면서 before() 도 이어서 실행된다.
        // before()에서 현재시간을 start에 저장후
        // html 객체 유무를 판단하고 after()가 실행되면서 html 객체가 리턴된다.
        // after()에서는 현재시간 - before에서 구한시간 이 값에 지정된다.
        // 그러면 결과적으로 html 객체를 반환하는데 걸린 시간이 나오게 되는데
        // 이때 처음에는 html객체가 없기 때문에 html 객체를 생성하고
        // Thread.sleep으로 1.5초이따가 리턴되어 1.5초정도 시간이 걸린다고 찍힌다.
        // 하지만 한번 더 메서드를 실행하게되면 html 객체가 만들어져있기 때문에
        // 1.5초의 지연시간 없이 바로 리턴되어 걸린시간이 0에 수렴하게 된다.

        AtomicLong start = new AtomicLong();
        AtomicLong end = new AtomicLong();

        IBrowser aopBrowser = new AopBrowser("wwww.naver.com",
                () -> {
                    System.out.println("before");
                    start.set(System.currentTimeMillis());
                },
                () -> {
                    long now = System.currentTimeMillis();
                    end.set(now - start.get());
                });


        aopBrowser.show();
        System.out.println("loading time: " + end.get());


        aopBrowser.show();
        System.out.println("loading time: " + end.get());
    }
}
