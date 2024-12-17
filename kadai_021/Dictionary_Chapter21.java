package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
	
	HashMap<String,String> hashMap = new HashMap<String,String>();{

		//要素を追加
		hashMap.put("apple", "りんご");
		hashMap.put("peach", "桃");
		hashMap.put("banana", "バナナ");
		hashMap.put("lemon", "レモン");
		hashMap.put("pear", "梨");
		hashMap.put("kiwi", "キウィ");
		hashMap.put("strawberry", "いちご");
		hashMap.put("grape", "ぶどう");
		hashMap.put("muscat", "マスカット");
		hashMap.put("cherry", "さくらんぼ");
	}

	
	void search( String fruitsName ) {
		
		String name = hashMap.get(fruitsName);
		
		for(int i = 0; i < hashMap.size(); i++) {
			
			if(hashMap.containsKey(fruitsName)) {
				System.out.println(fruitsName + "の意味は" + name);
			}
			else if(name == null){
				System.out.println(fruitsName + "は辞書に存在しません");
			}
			break;
		}
	}
	
}