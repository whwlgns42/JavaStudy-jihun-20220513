package j22_람다식;
// 람다식 인터페이스에는 메소드가 무조건 하나이여야만 한다.
public class Math2Impl implements Math2{

	@Override
	public double calc(double value1, double value2) {
		return value1 + value2;
	}

}
