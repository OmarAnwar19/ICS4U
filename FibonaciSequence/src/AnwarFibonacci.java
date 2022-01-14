/**
 * Description: fib sequence is 0, 1, 1, 1, 2, 3, 5, 8, 13, etcc first two
 * numbers, add to get the next
 *
 * @author (Omar Anwar)
 * @version (12/15/2021)
 */

public class AnwarFibonacci {

	public static int fib(int num) {

		// two base cases
		// if the number is 1 or 0, dont subtract or add anything, just return 0
		if (num == 0 || num == 1) {

			// since we cant subtract, just return
			return 1;

		}

		// recursive call
		return (fib(num - 1) + fib(num - 2));

		// for example, if we send in 5, its not 0 or 1, so it skips the base case, and
		// goes to bottom, now, what happens, is that it re-runs the the base case
		//(0 or 1)

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// call the fib method
		System.out.println(fib(27));

	}

}
