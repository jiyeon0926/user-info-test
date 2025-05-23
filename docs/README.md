# 📃 요구사항
- 회원가입, 로그인 기능 필요 없음
- 토큰을 통해 사용자 정보 조회하기

# 🛠️ 기술 스택
- Java 21
- Spring Boot 3.5.0 Version
- JPA
- JWT
- MySQL

# 📄 API 명세서
|테스트|Method|URL|상태코드|
|---|---|---|---|
|토큰 발급|POST|/auth/email|200 OK <br> 400 Bad Request|
|사용자 정보 조회|GET|/users/me|200 OK|
