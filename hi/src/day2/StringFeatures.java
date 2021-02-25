package day2;

public class StringFeatures {

	public static void main(String[] args) {
		String str="karnataka state";
		String s1=new String("bangalore");
		System.out.println("length="+str.length());
		System.out.println("ucase="+str.toUpperCase());
		System.out.println("charat="+str.charAt(5));
		System.out.println("hashcode="+str.hashCode());
		System.out.println("replace="+str.replace('a','A'));
		System.out.println("substring="+str.substring(5));
		System.out.println("sub1="+str.substring(5,11));
		System.out.println("concat="+str.concat("mangalore"));
		String s2="mangalore";
		System.out.println("using=="+str==s2);
		System.out.println("using equals()"+str.equals(s2));
		System.out.println("using CopareTo()"+str.compareTo(s2));

	}

}
