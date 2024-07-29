# 💸 개인 금융 관리 서비스
금융결제원의 오픈뱅킹API를 활용한 개인 금융 관리 서비스

<br/>

## 프로젝트 개요

**✅ 기간** | 07. 22 ~ 08. 23

**✅ 주제** | 핀테크

**✅ 목표**
1. 금융결제원의 오픈뱅킹API 를 통해 오픈 API 적용 경험
2. 작은 단위의 MVP 우선 구현 후 기능 확장 시도

**✅ Tech Stack**
<div> 
  <img src="https://img.shields.io/badge/springboot-6DB33F?style=for-the-badge&logo=springboot&logoColor=white"> 
  <img src="https://img.shields.io/badge/postgresql-4169E1?style=for-the-badge&logo=postgresql&logoColor=white"> 
</div>


<br/>

## 프로젝트 기능 및 설계

1. **사용자 등록 및 로그인**
- 오픈뱅킹 API 에서 제공하는 OAuth 인증을 통한 로그인 구현
  - 사용자 인증 및 AccessToken 관리
  - 처음 접근하는 사용자라면 회원가입 및 조회/출금 동의, 결제 비밀번호 설정
  - 로그인에 따른 서비스 접근 권한 관리

<br/>

2. **계좌 조회 및 잔액 조회**
- <계좌 조회>를 통해 사용자 소유 계좌 조회 및 계좌 별 잔액 조회
  - 등록된 계좌는 사용중 → 해지 순서로 조회

<br/>

3. **거래 내역 조회**
- 하나의 계좌에 대한 <거래 내역 조회>를 통해 거래 내역 조회
  - 거래 내역이 많을 수 있기 때문에 paging 처리

<br/>

4. **가상 계좌 생성 및 삭제**
- 가상 계좌를 생성할 수 있으며, 거래 유효기간은 1일로 제한
- 가상 계좌를 삭제할 수 있으며, 잔액은 본인 명의 계좌로 반환

<br/>

5. **거래 기능**
- 금액 인출, 입금하기
- 송금하기

<br/>

6. **추가 기능**
- (계좌조회) 설정에서 사용자가 계좌 순서를 변경할 수 있음
- (거래내역) 거래 내역을 최신순 / 오래된 순으로 정렬할 수 있다
- (거래내역) 거래 내역을 1달 / 3달 / 1년 등 기간을 지정할 수 있다
- (거래내역) Elastic Search를 통해 거래 내역을 검색할 수 있다
- (거래내역) 입금 / 출금으로 분류할 수 있다
- (예산설정) 예산 설정 기능 및 예산 대비 실제 지출 추적, 예산 초과 시 알림 기능

<br/>

## ERD
<img width="1195" alt="스크린샷 2024-07-29 오후 9 10 45" src="https://github.com/user-attachments/assets/06d4add6-365b-47e6-b5aa-6c0ac80f7d26">

<br/>
<br/>

## 프로젝트와 함께 공부하고 싶은 내용

- 핀테크 기업들의 기술 블로그 읽어보며 생각 넓히기
    - [토스](https://toss.tech/tech)는 어떻게 거래 내역을 무한 스크롤로 가져올 수 있는걸까
    - [뱅크샐러드](https://blog.banksalad.com/)는 어떻게 지출 내역을 카테고리화 할까
- [Elastic Search](https://www.elastic.co/guide/en/elasticsearch/reference/current/index.html) 를 통해 검색 기능 최적화
- 테스트 코드 작성

<br/>
