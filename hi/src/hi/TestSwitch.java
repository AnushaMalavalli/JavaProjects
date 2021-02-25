package hi;

public class TestSwitch {

	public static void main(String[] args) {
		int category=2;
		double salary =10000;
		double increment=0;
		switch(category)
		{
		case 1: increment=salary *0.4;
				break;
		case 2:increment=salary *0.35;
		break;
		case 3:increment=salary *0.25;
		break;
		case 4: increment=salary *0.2;
		break;
		default: increment=salary *0.1;
		break;
		}
			System.out.println(salary+" "+increment);
	}

}
