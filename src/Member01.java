import java.util.ArrayList;

class Member01 {
	ArrayList<String> member = new ArrayList<>();
	
	public Member01(String member){
		this.member.add(member);
	}//constructor
	
	public void print() {
		System.out.print("Member name:");
		for(String m : member) {
			System.out.print(m+" ");
		}//for
	}//print()
	
}//Member01 class