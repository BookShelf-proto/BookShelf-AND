# BookShelf-AND
책 기록 어쩌구 윤주야 화이팅이야
|CHECK|||
|---|---|---|
|[DB](### DB)|내정보 테이블||
||책리스트||
||칭호|
|[주요기능](### 주요기능)|기록 복사||
||책 기록||
||매일 노티||
||연속기록일자||

### DB
내정보 테이블
|idx|column|description|type|
|---|---|---|---|
|1|UUID|기기값|String|
|2|MY_NM|닉네임|String|
|3|START_DATE|가입일자|String (yyyymmdd)|
|4|CON_DAY|연속활동일자|Int|
|5|LAST_DATE|최근활동일자|String (yyyymmdd)|

칭호 테이블
|idx|column|description|type|
|---|---|---|---|
|1|MDL_NM|칭호명|String|
|2|MDL_GL|칭호달성조건|Int|

책 리스트 테이블
|idx|column|description|type|
|---|---|---|---|
|1|BOOK_NM|책제목|String|
|2|ING_YN|진행상황유무|Int(0:x / 1:o)
|3|PAGE|현재진행페이지수|Int|

### 주요기능
- 기록 복사
  - 현재 진행 중인 책 정보만 클립보드에 복사
  - (idx, 책 제목, 책 쪽수)
  
- 책 기록
  - 추가 : 책 제목, 책 쪽수
  - 수정 : 책 쪽수, 진행여부 수정 가능

- 연속기록일자
  - 활동 시점 날짜 -1 == 마지막 활동 날짜 : 연속기록일자 + 1
  - else : 연속기록일자 초기화

- 매일 노티
  - 매일 20시 체크
  - 활동 시점 날짜 != 마지막 활동 날짜 : 노티 발송
  - 노티 문구 "오늘의 기록 내용을 공유해주세요!"

