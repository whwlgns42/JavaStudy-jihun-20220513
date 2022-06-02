package j18_최상위클래스.entity;

import java.time.LocalDate;
import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.NonFinal;

/*
 * -- 밑에 있는 형태로 셋팅 -- 무조건...

 * 상품 정보 클래스(Entity Class)
 * 
 * 변수     (중심)
 * productCode
 * ProductName
 * category
 * productionDate
 * 
 * 기본생성자
 * 
 * 전체생성자
 * 
 * getter, setter
 * 
 * hashCode()
 * 
 * equals()
 * 
 * toString()
 * 
 */
@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor  // 전체 생성자
@Getter			
@Setter
@EqualsAndHashCode
@ToString
public class Product2 {
	// 이것을 쓸경우  @RequiredArgsConstructor 같이 써줘야 한다.,  final이 쓸때는 @NoArgsConstructor(같이 쓰지못하기때문에 지워준다.)		
	private  int productCode;
	@NonNull 
	private String productName;
	private int category;
	private LocalDate productionDate;
	
	
	
	
}
