package kadai_018;

abstract public class Kato_Chapter18 {

	public String familyName = "加藤"; // 姓を表す
	public String givenName; // 名を表す
	public String address; // 住所を表す
	
	
	
	public void commonIntroduce(String address) {
		System.out.println("名前は" + familyName + givenName + "です");
		System.out.println("住所は" + address + "です");
	}
	
	abstract public void eachIntroduce();
	abstract void setGivenName();
	
	public void execIntroduce(String address) {
		setGivenName();
		commonIntroduce(address);
		eachIntroduce();
	}
	
}
