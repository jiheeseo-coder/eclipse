package example01;

// ���赵, �ؾ Ʋ�� ����� �۾�
public class FieldInit {

	// �⺻�� ����
	byte byteField;				// 1
	short shortField;			// 2
	int intField;				// 4(����Ʈ Ÿ��)
	long longField;				// 8
	
	boolean boolField;			// 1
	char charField;				// 2
	
	float floatField;			// 4
	double doubleField;			// 8
	
	
	// ������ ����
	int[] arrField;				// 4
	String strField;			// 8
	
	// annotation : �����Ϸ����� ���� ������ �䱸
	// toString() : Ŭ������ �������(�ʵ�)�� ������ ���÷� Ȯ���ϰ��� �� ���� ,
	// 				���ϴ� �������� ����������� ����ϰ��� �� �� ����� ���� ��.
	@Override
	public String toString() {
		
		String str = "byteField : "+byteField + ", shortField : "+shortField+
				", intField : "+intField+", boolField : "+boolField + ", strField : "+strField;
		
		
		return str; 
	}
	
}
































