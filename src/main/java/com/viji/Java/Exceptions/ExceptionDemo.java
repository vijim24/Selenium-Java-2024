package com.viji.Java.Exceptions;

public class ExceptionDemo {

	public static void main(String[] args) {
		int a = 10;
		int b = 0;

		try {
			int k = a / b;
			System.out.println(k);
			int[] x = new int[7];
			System.out.println(x[9]);
		} catch (ArithmeticException at) {
			System.out.println("The exception is caught");
		} catch (IndexOutOfBoundsException ets) {
			System.out.println("Index out of bound exception");
		}

		catch (Exception e) {
			System.out.println("The exception is caught");
		} finally {
			System.out.println("I am the finally block");
		}

	}

}
