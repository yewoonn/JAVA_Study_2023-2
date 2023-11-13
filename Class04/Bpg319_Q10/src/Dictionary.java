
public class Dictionary extends PairMap {

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
		for(i = 0; i < length(); i++) {
			if(keyArray[i] == key) {
				valueArray[i] = value;
				break;
			}
		}
		
		if(i == length()) {
			keyArray[i] = key;
			valueArray[i] = value;
		}

	}

	@Override
	String delete(String key) {
		int i = 0;
		String deleteVal = "";
		for(i = 0; i < length(); i++) {
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
