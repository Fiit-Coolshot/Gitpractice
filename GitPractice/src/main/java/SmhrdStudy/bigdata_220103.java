package SmhrdStudy;

public class bigdata_220103 {
	/*
	 * 생존자와 사망자를 예측 kaggle은 사이트임 사이트에서 데이터 로드한거
	 * 
	 * 기본적으로 필요한 3가지 라이브러리 임포트 시키고 불러올 때 train = pd.read_csv(‘data/train.csv’,
	 * index_col = ‘passengerId’) index_col 은 index표시해주는거 data_Frame 으로 해줘야 컴터가
	 * 알아들을수 있다고함 항상 불러오면 shape를 찍어봐야함 몇행 몇열인지 확인해줘야함
	 * 
	 * train, test info()명령어는 컬럼들의 내역들을 확인할수 있음 컬럼 이름 널값이 아닌값이 몇 개인지 데이터 타입이 어ᄄᅠᇂ게
	 * 되어있는지 확인 할 수 있음.
	 * 
	 * 결측치가 있는 컬럼 켤측치는 다른 열의 비해 값이 비는것들
	 * 
	 * age컬럼에서 describe()를 쓰면 기술통계를 확인 할 수 있다
	 * 
	 * 기술통계가 무엇인지 찾아봐
	 * 
	 * 기술통계 (Descriptive statistics) 수집한 데이터를 요약, 묘사, 설명하는 통계 기법
	 * 
	 * 기술통계는 표본 자체의 속성을 파악하는 데 주안점을 두는 데이터 분석통계다. 기술통계는 주로 표본에 속한 대상자들의 인구통계학적 속성과
	 * 함께 연구문제나 연구가설에 포함된 개별적 변인에 대한 표본 대상자의 응답, 즉 데이터의 속성을 특정한 통계량을 사용해 요약해 준다.
	 * 
	 * #데이터 프레임 전체 행 보기 pd.set_option('display.max_rows',None)
	 * 
	 * None: 무제한 출력(개수를 쓰면 해당 개수 만큼만 표시됨) set_option은 pandas설정을 바꿔주는 명령어임 이 명령어는
	 * 
	 * 조회를 햇을 때 짤리는거 없이 모든데이터를 출력할 때 사용함
	 * 
	 * 만약 설정을 다시 리셋하고 싶으면 밑의 명령어를 사용하면 됨 pd.reset_option(‘display’)
	 * 
	 * 
	 * 
	 * corr() #수치형 데이터들만 출력됨 #상관관계 : 각 특성들 간 영향도를 수치로 파악할수 있음 (범위:-1(반비례)~1(비례)) #
	 * 절대값이 클수록 영향도가 높아짐
	 * 
	 * #피벗테이블: 컬럼들의 요약된 정보를 출력할 수있는 테이블 형태 pt1= train.pivot_table(values='Age',
	 * #데이터로 사용될 컬럼을 지정
	 * 
	 * index =['Pclass','Sex'], #멀티인덱스 설정 #(Pclass로 나눈후에 Sex로 한번 더 나눠 서 표시) #데이터 요약시
	 * 사용하는 함수를 지정 aggfunc='mean' #(mean:평균,sum: 합계,count: 개수)
	 * 
	 * )
	 * 
	 * #멀티 인덱싱 index가 2개이상이면 index에 맞게 써주면 나옴 pt1.loc[1,'female']
	 * 
	 * 
	 * #null 값이 잇는 행을 판단하는 명령(있으면True,없으면 false true가 비어있는것) pd.isna(train['Age'])
	 * #수치형,문자형 데이터 모두 판단
	 * 
	 * #np.isnan(train['Age']) # 수치형 데이터만 판단 #train['Age'].isnull() #수치형,문자형 데이터 모두
	 * 판단
	 * 
	 * def fill_age(data): #매개변수 data에는 train혹은 test가 들어갈꺼임 #만약 Age 컬럼에 켤측치가 있다면
	 * 피벗테이블에서 값을 가져오고 if pd.isna(data['Age']): #위에서 만든 피벗테이블에서 멀티 인덱싱한 값을 리턴!
	 * return pt1.loc[data['Pclass'],data['Sex']] #Age 컬럼에 결측치가 없다면 원래 나이값을 그대로 사용하자
	 * else: return data['Age'] #원래 Age 컬럼에 잇는 값 그대로 적용!
	 * 
	 * #apply : 데이터 프레임에서 행 또는 열에 한번에 복잡한 계산을 적용하고 싶을때 사용하는 명령 #astype : 데이터의 타입을
	 * 변경시켜줌 (나이는 실수가 아닌 정수로 표기) train['Age']= train.apply(fill_age,
	 * axis=1).astype('int64') ‘’‘가장 좋은건 train,test 데이터가 합쳐져 있을 경우 피벗테이블의 값을 적용하는게
	 * 좋으나 train, test가 사전에 나뉘어져 잇었고 각각의 값들의 큰 차이가 없었으며 train 데이터의 개수가 많기 때문에
	 * train데이터의 피벗 테이블을 기준으로 둘 다 적용시켜줌 ### Embarked 채우기! - train 데이터의 Embarked 컬럼은
	 * 2개밖에 없습니다 - 그래서 앞에 처럼 def만들어서 해줄필요가 없음! - #fillna: 지정값으로 결측치를 전부 채워주는 명령 -
	 * train['Embarked']=train['Embarked'].fillna('S')
	 * 
	 * - Fare 컬럼도 최대, 최소값에 비해 평균이 최소값쪽으로 쏠려있음 - 무작정 전체 평균값으로 계산하기에는 신뢰성이 떨어질 것 같음
	 * 
	 * pt2= test.pivot_table(values='Fare', index=['Pclass','Sex'], aggfunc='mean' )
	 * pt2
	 * 
	 * test['Fare'].isnull() #불리언 인덱싱으로 비어있는 Fare컬럼의 행을 찾아보자!
	 * test[test['Fare'].isnull()==True] test['Fare'] =
	 * test['Fare'].fillna(11.826350)
	 * 
	 * ### Cabin 컬럼 채우기 - Cabin 컬럼은 실제 데이터보다 결측치가 더 많음(컬럼 자체를 삭제시키는 것도 한 방법이 될 수 있음)
	 * - 일단은 결측치에 임의값을 넣고 시각화까지 해서 판단해 봅시다!
	 * 
	 * train['Cabin'].unique()
	 * 
	 * - Cabin 컬럼은 데이터의 개수에 비해 유니크 값이 너무 많음(데이터가 얕고 넓게 분포되어 있는 느낌) - 객실 번호 컬럼에서 각각의
	 * 숫가 값이 큰 의미가 있을까??? - 앞에 영문자는 일정한 구역이나 층을 의미하지 않을까?? - ->앞에 영문자만 따와서 활용을 해보자!
	 * 
	 * #train, test 데이터에서 Cabin 컬럼의 결측치 들을 임의의 문자 M으로 채운후 새로운 Deck 컬럼 생성
	 * train['Deck'] = train['Cabin'].fillna('M') test['Deck'] =
	 * test['Cabin'].fillna('M')
	 * 
	 * #Deck 컬럼에서 맨 앞의 영문자만 인덱싱 train['Deck']= train['Deck'].str[0] #문자열에서 0번째에 접근을
	 * 하는법 test['Deck']= test['Deck'].str[0] #train,test 데이터에서 기존에 있던 Cabin 컬럼을
	 * 지워보자!!!!!!! #drop : 행과 열을 모두 삭제할수 있는 명령( 행: axis=0,열: axis=1)
	 * train.drop('Cabin',axis=1,inplace=True)
	 * test.drop('Cabin',axis=1,inplace=True)
	 * 
	 * #del : 열(컬럼)만 삭제하는 명령 # del train['Cabin']
	 * 
	 * #groupby : 그룹별로 데이터를 집계,요약해주는 명령(그룹으로 묶어서 인덱스로 설정) train_deck=
	 * train[['Deck','Survived','Name']].groupby(['Deck','Survived']).count()
	 * train_deck #위와 같은 결과를 출력하는 코드 #train.pivot_table(values='Name', #
	 * index=['Deck','survived'], # aggfunc='count')
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * ==================================================================
	 * ===========================복습===================================
	 * ==================================================================
	 * 
	 * and xor연산을 통해 기계가 학습과 정답을 예측하는 과정 and연산 : 둘다 1이면 1이 출력 하나다로 0이면 0이 출력되는 놀리연산
	 * 기본 라이브러리 3종류 임포트 import numpy as np pandas as pd matplotlib.pyplot as plt
	 * sklearn : 데이터 분석을 위한 머신러닝 전용 라이브러리 sklearn 라이브러리에서 knn이라는 모델을 불러오고 from
	 * sklearn.neighbors import KNeighborsClassifier #학습된 모델의 신뢰성을 검증하기 위하여 평가할수 있는
	 * 라이브러리 학습된 모델의 신뢰성을 검증하기 위하여 평가할 수 있는 라이브러리 from sklearn import metrics
	 * metrics~~! # 인덱싱, 슬라이싱 (loc,iloc) loc[] iloc[] 둘다 대괄호로 작성
	 * 
	 * loc,iloc 인덱서: 행과 열에 모두 접근가능 loc:인덱스 명으로 접근 iloc : 인덱스 번호로 접근
	 * 
	 * 예측을 위해 판단하는 이웃 데이터의 개수 n_neighbors knn_model=
	 * KNeighborsClassifier(n_neighbors=1)
	 * 
	 * fit 모델을 학습 시키는 명령, 학습을 위해 문제와 정답 넣고 돌리면 모델이 학습된다 knn_model.fit(X,y) knn_model
	 * 이라는 변수에 문제 와 정답으로 학습된 규칙이 그대로 남아있음 #predict : 학습된 모델로 정답을 예측하는 명령 #학습된 모델에
	 * 새로운 문제를 넣어서 예측해보자! predict 학습된 모델로 정답을 예측하는 명령 pre= knn_model.predict([])
	 * #비교를 위해 실제 정답을 만들어준다 answer=[1,0,0,0] 모델 평가 진행 accuracy_score : 학습된 모델의 정확도를
	 * 표현 범위는 0~1이고 1이면 100퍼센트
	 * 
	 * metrics.accuracy_score(pre,answer)
	 * 
	 * 
	 * 
	 * 
	 * 2일차 BMI 부분 문제 정의 머신런징 모델을 어디에 사용할껀지 DJEjG게 사용할ᄁᅠᆫ지 키와 몸무게 비만도 지수를 통해서 비만을
	 * 판단하는 모델
	 * 
	 * 맨처음 라이브러리 IMPORT NUMPY, PANDAS MATPLOTLIB.PYPLOT AS PLT 머신러닝 모델로
	 * sklearn.neighbors import kneighborsClassifier 평가를 위한 모듈은 metrics
	 * 
	 * 파일 불러올 때 tbl= pd.read.csv(‘파일경로’,indes_col=’인덱스 설정해줄값‘)
	 * 
	 * # 전체 row수, 결측치 여부, 컬럼별 정보 #info() tbl.info() #기술 통계 확인은 describe() #인덱스 종류
	 * 확인은 unique값으로 확인하면됨 위에서 한것처럼 unique값이 많으면 전처리에서 구분을 해줘야함
	 * 
	 * 간단하게 시각화 하는 것 여기서는 키와 몸무게를 사용해서 시각화 plt.scatter(tbl[‘weight’],tbl[‘height])
	 * plt.show() 산점도를 표시하는 함수를 만들자 def myScatter(label, color): # 이름은 myScatter ,
	 * 사용하는값은 label,color tmp = tbl.loc[label] plt.scatter(tmp['Weight'],
	 * tmp['Height'], c = color, label = label) #정상인 사람들만 출력
	 * myScatter('Normal','green') myScatter('Obesity','blue')
	 * myScatter('Overweight','red') myScatter('Extreme Obesity','yellow')
	 * 
	 * 
	 * plt.legend() #범례 출력가능 plt.show()
	 * 
	 * #한번에 출력하기 plt.figure(figsize=(5,5))#그래프의 가로,세로 크기 설정
	 * 
	 * 다음 문제
	 * 
	 * # 훈련용 문제와 정답을 활용해서 학습시키기 knn_model.fit(X_train,y_train)
	 */
}
