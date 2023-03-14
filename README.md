# java-blackjack

블랙잭 미션 저장소

## 우아한테크코스 코드리뷰

- [온라인 코드 리뷰 과정](https://github.com/woowacourse/woowacourse-docs/blob/master/maincourse/README.md)

- [x] 참가자 이름을 요구한다
- [x] 참가자들에게 배팅을 요구한다
  - [x] 참가자들에게 배팅금을 요구한다
- [x] 딜러와 참가자들에게 카드 2장을 나누어 준다
- [x] 딜러와 참가자의 카드를 공개한다
  - [x] 딜러는 두장 중 한장의 카드만 공개한다
  - [x] 참가자는 두장 모두 공개한다
- [x] 참가자들에게 카드를 그만 받는다 할때까지 요구한다
  - [x] 참가자가 더 받을 경우 카드를 주며 공개한다
    - [x] 카드가 21을 넘어갈 경우 다음 참가자로 넘어간다
  - [x] 참가자가 더 받지 않을 경우 다음 참가자로 넘어간다
- [x] 딜러의 카드 합을 보여준다
  - [x] 딜러의 카드의 합이 17이상이 될때까지 카드를 한장씩 받는다.
- [x] 딜러와 참가자의 모든 카드와 결과를 공개한다
- [x] 최종 수익을 공개한다
  - [x] 딜러는 총 배팅금에서 참가자들의 상금만큼 뺀 수익을 갖는다
  - [x] 참가자는 배팅금을 받는다
    - [x] 이기면 배팅금만큼 더 받는다
    - [x] 질 경우 배팅금을 돌려 받지 못한다
    - [x] 블랙잭일 경우 배팅금의 1.5배로 정 받는다


- [x] 최종 승패를 출력한다
  - [x] 딜러는 각 참가자의 승 패 무승부를 전부 계산하고 출력한다
  - [x] 참가자는 딜러와의 승 패 무승부의 유무를 출력한다

### 객체별 기능 목록
- [x] 플레이어
  - [x] 이름을 가진다
  - [x] 패를 가진다
  - [x] 카드 한장을 가져온다
  - [x] 카드의 합을 보여준다
  - [x] 배팅금을 가진다
- [x] 플레이어들
  - [x] 플레이어들을 가진다
- [x] 패
  - [x] 카드들을 가진다
  - [x] 카드를 한장 추가할 수 있다
  - [x] 카드의 총 합을 계산할 수 있다
- [x] 덱
  - [x] 카드들을 가진다
  - [x] 한장씩 뽑는다
- [x] 덱 메이커
  - [x] 모양(하트,클로버,스페이드,다이아몬드)는 각각 13장씩(2~10,J,Q,K,A)씩 52장이 하나씩 존재한다
- [x] 카드
  - [x] 숫자를 가진다
  - [x] 모양을 가진다
