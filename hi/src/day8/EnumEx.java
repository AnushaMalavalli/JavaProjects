package day8;

public class EnumEx {

	public static void main(String[] args) {
		CarModel model= CarModel.swift;
		System.out.println(model);
		if(model==CarModel.swift)
			System.out.println("swift car is good");

	}

}
