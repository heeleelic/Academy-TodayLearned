package restTime;

/*난 동물원의 사육사다.
 *육식동물이 들어오면 난 먹이를 던져준다.
 *호랑이가 오면 사과를 던져준다.
 *사자가 오면 바나나를 던져준다.*/

abstract class Predater extends Animal {
	
	abstract String getFood();
	
	void printFood() {
		System.out.printf("my food is %s\n",getFood());
	}
	
	static int LEG_COUNT=4;
	
	static int speed() {
		return LEG_COUNT*30;
	}
	
}

interface Barkable{
	void bark();
}

/*interface BarkablePredator extends Predater, Barkable{
	
}*/

class Animal{
	
	String name;

	public void setName(String name) {
		this.name = name;
	}
	
}

class Tiger extends Predater implements Barkable{

	@Override
	public String getFood() {
		return "apple";
	}

	@Override
	public void bark() {
		System.out.println("어흥");
		
	}
}

class Lion extends Predater implements Barkable{

	@Override
	public String getFood() {
		return "banana";
	}

	@Override
	public void bark() {
		System.out.println("으르렁");
		
	}


	
}

class Zookeeper{
	
	void feed(Predater predater) {
		System.out.println("feed "+predater.getFood());
	}
	
}


class Bouncer{
	
	void barkAnimal(Barkable animal) {
		animal.bark();
		
	}
}



public class Sample {

	public static void main(String[] args) {
		
		/*Zookeeper zookeeper = new Zookeeper();
		Tiger tiger=new Tiger();
		Lion lion=new Lion();
		
		zookeeper.feed(tiger);
		zookeeper.feed(lion);*/
		
		/*Predater tiger=new Tiger();
		Predater lion=new Lion();
		
		zookeeper.feed(tiger);
		zookeeper.feed(lion);*/
		
		Tiger tiger=new Tiger();
		Lion lion=new Lion();
		
		Bouncer bouncer=new Bouncer();
		bouncer.barkAnimal(tiger);
		bouncer.barkAnimal(lion);
		
		
		
		

	}

}
