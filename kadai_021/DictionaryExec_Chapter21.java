package kadai_021;


public class DictionaryExec_Chapter21 extends Dictionary_Chapter21 {
	
	public static void main(String[] args) {
		
		Dictionary_Chapter21 nameSearch = new Dictionary_Chapter21();
		
		String[] fruitsName = { "apple","banana", "grape", "orange"};
		
		for(int i = 0; i < fruitsName.length; i++) {
			nameSearch.search(fruitsName[i]);
		}

	}
	
}
