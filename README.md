# java-blackjack

블랙잭 미션 저장소

## 우아한테크코스 코드리뷰

- [온라인 코드 리뷰 과정](https://github.com/woowacourse/woowacourse-docs/blob/master/maincourse/README.md)

## 기능 목록

### 게임 규칙
- 에이스의 기본 값은 1로 한다.
- 보유한 덱에 에이스가 있고 버스트가 아닌 경우 에이스 카드를 11로 계산한다.
- 딜러는 16 이하일 때 히트 가능하다.
  - 딜러는 한 번만 히트 할 수 있다.
- 플레이어는 21 이하일 때 히트 가능하다.
  - 플레이어는 버스트 되지 않으면 계속 히트 할 수 있다.
- 딜러와 플레이어의 점수를 비교하여 최종 수익을 계산할 수 있다.
  - 딜러와 플레이어 모두 버스트면 딜러가 1배의 배팅 금액을 가져간다.
  - 딜러와 플레이어 모두 블랙잭이면 플레이어가 1배의 배팅 금액을 가져간다.
  - 플레이어만 블랙잭인 경우 플레이어가 1.5배의 배팅 금액을 가져간다.
  - 딜러와 플레이어의 점수가 21 이하일때, 점수가 동일하면 플레이어가 1배의 배팅 금액을 가져간다.
  - 딜러와 플레이어의 점수가 21 이하일때, 점수가 큰 쪽이 1배의 배팅 금액을 가져간다..
  - 플레이어와 딜러 중 한 쪽이 승리하면 한 쪽은 패배로 한다.
  - 플레이어 간 승패는 가르지 않는다.

### 게임 로직
- 게임을 시작하면 카드를 두 장 받는다.
- 플레이어 턴을 진행한다.
- 딜러 턴을 진행한다.
- 게임 결과를 계산한다.

### 게이머 (플레이어, 딜러)
- 카드 덱을 가진다.
- 카드를 받을 수 있다.
- 버스트 여부를 확인할 수 있다.
- 블랙잭 여부를 확인할 수 있다.
- 히트 가능 여부를 확인할 수 있다.
- 카드 합을 계산할 수 있다.
- (플레이어) 이름을 가진다.
  - 이름의 길이가 1~5자를 벗어난 경우 예외를 발생시킨다.

### 카드
- 카드는 속성을 가진다.
  - 속성에는 패턴이 있다. (스페이드, 하트, 다이아몬드, 클로버)
  - 속성에는 숫자 값을 표현이 있다. (Ace는 1 또는 11, JQK는 10을 나타냄)
- 카드는 점수 계산에 적용될 숫자값을 가지고 있다.

### 핸드 덱
- 게이머가 보유하고 있는 카드들을 가진다.
- 덱에 카드를 추가할 수 있다.
  - 이미 보유한 카드를 받은 경우 예외를 발생시킨다.
- 현재 덱에 있는 카드들의 점수를 계산할 수 있다.
  - 버스트 여부에 따라 1로 계산된 에이스 카드의 값을 11로 계산할 수 있다.
- 현재 덱에 에이스 카드가 있는지 여부를 알려줄 수 있다.

### 플레이 덱
- 플레이할 카드들을 생성하고 가진다.
  - 생성 후 섞는다.
- 덱에서 카드를 한 장 꺼낸다.
  - 덱이 비어있는 경우 예외를 발생시킨다.

### 플레이어 결과
- 플레이어 결과는 각 플레이어들의 최초 배팅값을 가진다.
- 최종 배팅값을 계산할 수 있다.
