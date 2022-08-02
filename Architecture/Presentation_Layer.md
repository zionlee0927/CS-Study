## BackEnd Server Architecture

백엔드 서버 기본 구조

![img_1.png](resources/img_1.png)

Layer는 총 4개로 구성되어 있으며 각 Layer는 아키텍처를 설명하는 책에 따라 
다른 명칭으로 불리기도 합니다만 (PoEAA는 이 구조를 Persentation Layer, 
Service Layer, Domain Layer, DataSource Layer로 부릅니다.), 전체적으로
4가지 Layer는 거의 흔들리지 않습니다. 서버가 어떤 역할을 수행해야 하는지에 따라,
작성해야 하는 로직이 간단한가, 복잡한가 등의 요인에 의해 각 Layer를 구성하는
요소들이 추가되거나, 합쳐지거나 하는 변형이 일어날 뿐입니다.

> 이후 Layered Architecture 더 개선한 Hexagonal Architecture, Clean Architecture,
> 라는 아키텍처도 등장하지만 기본적인 틀은 일치한다.

## Presentation Layer

#### 역할과 Variation

- Client의 요청을 변환
- 기본적인 요청 내용 검증
- 수행결과를 Client에 반환
> MVC 패턴에서 Controller의 역할

#### Controller는 아닌 요청 유형

Spring에서 Controller의 기능을 생각해본다면, Web/HTTP에 한정되어있다고
볼수 있지만 Socket이나, Message 등 다른 요청 방식들의 Client도 올수 있다
이 때는 Hexagonal Architecture의 Adapter의 일종으로 생각하는 것이 좋음

#### 1. WebSocket
