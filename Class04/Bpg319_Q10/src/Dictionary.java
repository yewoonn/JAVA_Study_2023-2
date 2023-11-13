
public class Dictionary extends PairMap {
	int iNum = 0; //삭제한 경우에도 배열 정렬 없이 그 다음 위치에 저장하기 위한 변수

	Dictionary(int iNum){
		keyArray = new String [iNum]; 
		valueArray = new String [iNum]; 
		
		for(int i=0; i < iNum; i++) {
			keyArray[i] = "";
			valueArray[i] = "";
		}

	}
	
	@Override
	String get(String key) {
		String keyVal = "null";
		int keyInx = 0;
		for(String k : keyArray) {
			if(k.equals(key)) {
				keyVal = valueArray[keyInx];
			}
			keyInx ++;
		}
		return keyVal;
	}

	@Override
	void put(String key, String value) {
		int i = 0;
		for(i = 0; i < iNum; i++) {
			if(keyArray[i] == key) {
				valueArray[i] = value;
				break;
			}
		}
		
		if(i == iNum) {
			keyArray[i] = key;
			valueArray[i] = value;
			iNum++;
		}

	}

	@Override
	String delete(String key) {
		int i = 0;
		String deleteVal = "";
		for(i = 0; i < iNum; i++) {
			if(keyArray[i] == key) {
				keyArray[i] = "";
				deleteVal = valueArray[i];
				break;
			}
		}
		return deleteVal;
	}

	@Override
	int length() {
		int arrLength = 0; //인덱스 + 1
		
		for(String k : keyArray) {
			if(k.equals("")) {
				continue;
			}
			else {
				arrLength ++;
			}

		}
		
		return arrLength;
	}

}
