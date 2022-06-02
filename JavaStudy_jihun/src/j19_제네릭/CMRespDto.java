package j19_제네릭;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data   // Getter, Setter,EqualsAndHashCode,ToString 하나로 묶어둔것이 @Data이다


public class CMRespDto<T> {
	private int code;
	private String msg;
	private T data;
	
}
