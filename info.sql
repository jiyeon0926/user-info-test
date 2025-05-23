-- 테이블 생성
create table info(
	id bigint not null auto_increment,
	email varchar(50) not null,
	name varchar(20) not null,
	book_title varchar(50) not null,
	author varchar(20) not null,
	publisher varchar(20) not null,
	primary key (id),
	unique key uq_email (email)
);

-- 데이터 삽입
insert into (email, name, book_title, author, publisher) values
('py1@naver.com', '파이1', '이펙티브 자바', '조슈아 블로크', '인사이트'),
('py2@naver.com', '파이2', '클린 코드', '로버트 C. 마틴', '인사이트'),
('py3@naver.com', '파이3', '객체지향의 사실과 오해', '조영호', '위키북스'),
('py4@naver.com', '파이4', '자바의 정석', '남궁성', '도우출판'),
('py5@naver.com', '파이5', '모던 자바 인 액션', '라울-게이브리얼 우르마', '에이콘출판'),
('py6@naver.com', '파이6', '실용주의 프로그래머', '앤드류 헌트 외', '인사이트'),
('py7@naver.com', '파이7', 'Do it! 점프 투 파이썬', '박응용', '이지스퍼블리싱'),
('py8@naver.com', '파이8', '처음 배우는 머신러닝', '조지프 리잔카 외', '한빛미디어'),
('py9@naver.com', '파이9', '코틀린 인 액션', '드미트리 제메라브 외', '에이콘출판'),
('py10@naver.com', '파이10', '모두의 데이터 분석 with 파이썬', '송석리', '길벗')