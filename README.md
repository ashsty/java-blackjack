# java-blackjack

### 요구 기능 정리

- [x] 카드 덱 생성하기
- [x] 플레이어 이름 입력 받기
    - [x] 쉼표로 분리
- [x] 플레이어 별 베팅 금액 입력 받기
- [x] 딜러 및 플레이어 생성하기
    - [x] 딜러 및 플레이어들에게 카드를 각각 두 장씩 주기
    - [x] 딜러의 카드는 첫 장만 공개
    - [x] 플레이어의 카드는 2장 모두 공개
- [x] 플레이어 별로 게임 진행
    - [x] 카드를 더 받을지 선택
        - [x] 플레이어의 카드 숫자 합이 21 이상이면 선택할 수 없음
        - [x] y / n 으로 입력받아서 결정
    - [x] 플레이어가 가진 카드를 출력
- [x] 딜러의 게임 진행
    - [x] 숫자의 합이 16 이하인 경우 카드를 한 장 더 받기
    - [x] 17 이상이면 멈추기
- [x] 승패 계산
    - [x] A는 1 또는 11
    - [x] K, Q, J는 10으로 계산
    - [x] 딜러와 플레이어가 가진 카드와 합계를 출력
    - [x] 플레이어의 처음 받은 두 카드가 21이면 무조건 플레이어의 블랙잭
    - [x] 플레이어의 숫자가 21을 넘기면 무조건 플레이어의 패배
    - [x] 플레이어의 숫자가 딜러보다 21에 가까우면 플레이어의 승리
    - [x] 플레이어의 숫자가 21을 넘기지 않고 딜러의 숫자가 21을 넘기면 플레이어의 승리
- [x] 최종 수익 계산
    - [x] 블랙잭인 경우 베팅금액의 1.5배
    - [x] 비긴 경우 배팅 금액의 1배
    - [x] 진 경우 배팅 금액을 잃음
    - [x] 최종 수익 결과를 출력

---

### 객체 별 역할 정리

- **Card**
    - 카드의 문양과 끗수를 저장하고 있다.
    - **Pattern**
        - 카드의 문양이 저장된 enum
    - **Denomination**
        - 카드의 끗수가 저장된 enum

- **Cards**
    - 다수의 카드를 가지고 관리한다.
    - 카드의 총 점수를 계산한다.

- **CardDeck**
    - 게임에서 사용하는 카드들을 관리하고 있다.

- **CardsGenerator**
    - 카드를 생성하는 전략을 제공하는 interface

- **BlackJackCardsGenerator**
    - 서로 다른 52장의 카드를 가진 덱을 생성한다.

- **Participant**
    - 게임 참여자 abstract class
    - 카드를 보유하고 있다.
    - 베팅 금액을 보유하고 있다.
    - 카드 덱에서 카드를 한 장 뽑을 수 있다.
    - 버스트, 블랙잭 여부를 판단한다.

- **Dealer**
    - 게임의 딜러
    - 보유 카드 숫자가 17이 넘을 때 까지 카드를 뽑을 수 있다.

- **Player**
    - 게임의 플레이어
    - 보유 카드 숫자가 21이 넘을 때 까지 카드를 뽑을 수 있다.

- **Players**
    - 다수의 Player 를 저장하고 관리한다.

- **Name**
    - 참여자의 이름

- **BetMoney**
    - 베팅한 돈

- **HitRequest**
    - 카드 추가 여부에 대한 응답 값을 의미하는 enum

- **Referee**
    - 승패 결과를 판단하고 플레이어와 딜러의 수익을 계산한다.
    
- **ParticipantProfit**
  - 참가자 이름과 수익을 담는 dto