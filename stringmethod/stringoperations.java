package stringmethod;

import java.util.Arrays;

public class stringoperations {
	public static void main(String[] args) {
		String str=new String("Babu");
		String str2=" reddy BAbu ";
		String str3="babbu";
		System.out.println(str==str2);
		System.out.println(str2.equals(str));
		System.out.println(str2==str3);
		System.out.println(str.equalsIgnoreCase(str3));
		System.out.println(str.concat(str2));
		System.out.println(str3.contains("ba"));
		System.out.println(str.startsWith("B"));
		System.out.println(str2.endsWith("b"));
		System.out.println(str2.length());
		System.out.println(str2.trim());
		System.out.println(str2.toLowerCase());
		System.out.println(str2.toUpperCase());
		System.out.println(str2.toCharArray());
		System.out.println(str.indexOf("2"));
		System.out.println(str.lastIndexOf(3));
		System.out.println(str2.substring(6));
		System.out.println(str2.substring(0,11));
		System.out.println(Arrays.toString(str2.split("/n")));
		System.out.println(str.charAt(3));
		System.out.println(str2.replace("e","d"));
		System.out.println(str.subSequence(1,2));
		System.out.println(str.compareTo("Bab"));
		System.out.println(str.compareToIgnoreCase("abu"));
		System.out.println(str.codePointAt(2));
		System.out.println(str.codePointBefore(1));
		System.out.println(str.isBlank());
		System.out.println(str3.intern());
		System.err.println(str3.hashCode());
		System.out.println(str3);
	}
}
