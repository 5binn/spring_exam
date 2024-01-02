## 1차 요구사항 구현
- [x] 유저가 루트 url로 접속시에 게시글 리스트 페이지(http://주소:포트/article/list)가 나온다.
- [x] 리스트 페이지에서는 등록 버튼이 있고 버튼을 누르면 http://주소:포트/article/create 경로로 이동하고 등록 폼이 나온다.
- [x] 게시글 등록을 하면 http://주소:포트/article/create로 POST 요청을 보내어 DB에 해당 내용을 저장한다.
- [x] 게시글 등록이 되면 해당 게시글 리스트 페이지로 리다이렉트 된다. 페이지 URL 은 http://주소:포트/article/list 이다.
- [x] 리스트 페이지에서 해당 게시글을 클릭하면 상세페이지로 이동한다. 해당 경로는 http://주소:포트/article/detail/{id} 가 된다.
- [x] 게시글 상세 페이지에는 id에 맞는 게시글 데이터와 목록 버튼이 있다. 목록 버튼을 누르면 게시글 리스트 페이지로 이동하게 된다.

- (추가 기능이나 구현기능설명이 필요한 경우 서술)

## 미비사항 or 막힌 부분
- 부트스트랩 활용 
- html 기능 활용

## MVC 패턴
- model, view, controller 세 파트로 구분되어진다.
- 뷰는 사용자에게 보여지는 부분, 모델은 데이터 부분, 컨트롤러는 이 두 개를 관리하는 부분
- 사용자가 직접적으로 데이터에 접근하지 못하게 하여 보안성을 높임
- 해당 부분은 해당 역할만 할당해주어 후에 유지보수가 용이하게함

## 스프링에서 의존성 주입(DI) 방법 3가지 방법
- 객체 자체에 @Autowired 를 적용하여 주입
- private final 의 생성자를 만들어 @RequiredArgsConstructor 를 적용하는 방식
- setter 메서드에 @Autowired 를 적용

## JPA의 장점과 단점
장점
- 통일된 SQL문을 작성해주므로 SQL문의 오류를 줄일 수 있다.
- 데이터베이스의 종류가 달라져도 일관된 코드를 사용하므로 유지보수가 용이하다. <br>

단점
- 내부에서 SQL문을 작성하므로 직접SQL문을 작성하는 것 보다 성능이 떨어진다.
## HTTP GET 요청과 POST 요청의 차이
GET
- 데이터를 불러와 요청하는 방식, 주로 블로그처럼 미리 저장되어 있는 데이터를 불러오는 것<br>

POST
- 요청이 들어오면 뭔가 실행하는 방식, 게시글을 등록하거나 새롭게 수정하면서 업데이트가 이루어질때 사용