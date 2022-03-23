package com.example.kotlin200

//접근지정자

//public
//모든 곳에서 접근 가능 접근 지정자를 생략하면 기본적으로 public이 된다.


//private
//프로퍼티와 멤버 함수일 경우, 해당 클래스 안에서만 접근 가능 그 외는 같은 파일 내에서만 접근 가능

//protected
//클래스 내부와 서브 클래스 안에서만 접근가능

//internal
//같은 모듈 안에서 접근 가능
//같은 프로젝트 내에서 접근가능

/*project = 최상위 개념 여러 module 을 가질 수 있다.
* module = 여러 package 를 가질 수 있다.
* package = 여러 class 를 가질 수 있다.
* class = member , function 을 가질 수 있다.
* project > module > package > class*/