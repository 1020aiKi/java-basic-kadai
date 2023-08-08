package kadai_017;

	abstract public class Kato_Chapter17{
	public String familyName = "加藤";
	public String givenName;
	public String address = "住所は東京都中野区〇×です";
	
	public void commonIntroduce() {
		System.out.println("名前は" + familyName + givenName + "です");
	};
	
	abstract public void eachIntroduce();
	
	public void execIntroduce() {
		System.out.println(address);
		eachIntroduce();
	}
	
}