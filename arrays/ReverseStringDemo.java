package datastructures.arrays;

public class ReverseStringDemo {

	static String reverseSubStringsInSameOrder(String str) {
		if (str != null && str.length() >= 1) {

			String strings[] = str.split(" ");
			StringBuffer sb = new StringBuffer();
			for (String st : strings) {
				char chars[] = st.toCharArray();
				int i = chars.length - 1;
				while (i >= 0) {
					sb.append(chars[i]);
					i--;
				}
				sb.append(" ");

			}
			return sb.toString();

		}
		return null;
	}

	static String reverseWithoutSplit(String str) {
		if (str != null && str.length() >= 1) {
			StringBuffer sb = new StringBuffer();
				int i = str.length() - 1;
				while (i >= 0) {
					sb.append(str.charAt(i));
					i--;
				}
			//	sb.append(" ");

			return sb.toString();

		}
		return null;
	}
	
	public static void main(String[] args) {
		String str = "Hi, How Are You!";

		System.out.println(reverseSubStringsInSameOrder(str));
		System.out.println(reverseWithoutSplit(str));

	}

}
