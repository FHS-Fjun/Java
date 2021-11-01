package oo;

class Fish{
	int weight;
}
class Lake{
	Fish fish;
	void setFish(Fish s){
		fish = s;
	}
	void eat(int n){
		fish.weight = fish.weight + n;
	}
}
class FishandLake{
	public static void main(String[] args) {
		Fish niqiu = new Fish();
		System.out.println(niqiu.weight);//���1
		Lake taihu  = new Lake();
        Lake dongtinghu  = new Lake();
        Lake boyanghu  = new Lake();
        taihu.setFish(niqiu);
        dongtinghu.setFish(niqiu);
        boyanghu.setFish(niqiu);
		taihu.eat(15);
		System.out.println(niqiu.weight);//���2
		System.out.println(taihu.fish.weight);
        System.out.println(dongtinghu.fish.weight);
        System.out.println(boyanghu.fish.weight);//���3
	}
}


