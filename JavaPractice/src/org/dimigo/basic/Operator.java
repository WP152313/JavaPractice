/**
 * 
 */
package org.dimigo.basic;

/**
 * <pre>
 * org.dimigo.basic
 *   |_ HelloWorld
 *
 * 1. 개요 :
 * 2. 작성일 : 3/6
 * </pre>
 *
 * @author      : 안문수
 * @version     : 1.0
 */
public class Operator {
	public static void main(String[] args){
		long a=3L, c=1500L;
		long b=1700000L;
		System.out.println("<<디미베네 연간 인건비>>");
		System.out.printf("월 평균 급여 : " + String.format("%,d",b) + "원\n" );
		System.out.printf("점포 내 직원수 : %d명\n",a);
		System.out.printf("점포 수 : " + String.format("%,d", c) + "개\n\n");
		System.out.printf("연간 인건비 : " + String.format("%,d", b * a * c * 12));
	}

}
