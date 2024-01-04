//Need commons-lang3-3.14.0.jar

package io.hexlet;

import org.apache.commons.lang3.StringUtils;

public class anotherOne {
	public static void main(String[] args) {
		var reverseWord = StringUtils.reverse("hexlet");
		System.out.println(reverseWord);
	}
}
