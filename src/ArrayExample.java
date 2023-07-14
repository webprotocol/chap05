
public class ArrayExample {
	
	public static void main(String[] args) {
		int[][][] nums = new int[3][10][20];
		
		for (int i=0; i<10; i++) {
			for (int j=0; j<20; j++) {
				do {
					nums[0][i][j] = (int)(Math.random()*8 + 30); // [30-37]
					nums[1][i][j] = (int)(Math.random()*8 + 40); // [40-47]
				} while (nums[0][i][j] + 10 == nums[1][i][j]);
				
				nums[2][i][j] = (int)(Math.random()*26 + 'A');
			}
		}
		
		for (int k=0; k<3; k++) {
			for (int i=0; i<10; i++) {
				for (int j=0; j<20; j++) {
					if (k==2)
						System.out.printf("%c ", nums[k][i][j]);
					else
						System.out.printf("%d ", nums[k][i][j]);
				}
				System.out.println();
			}
			System.out.println();
		}
		
		System.out.print("\033[0m");	// color reset

		for (int i=0; i<10; i++) {
			for (int j=0; j<20; j++) {
				System.out.printf("\033[%dm", nums[0][i][j]); // fg
				System.out.printf("\033[%dm", nums[1][i][j]); // bg
				System.out.printf("%c", nums[2][i][j]);	// 	ch
			}
			System.out.println();
		}
		
		System.out.println("\033[0m");	// color reset
		
	}
	
	public static void main7(String[] args) {
		int[][][] nums = {
				{
					{1,2,3,4,},
					{2,3},
					{1,1,1,2,2,2,2}
				},
				{
					{1,2,3,4,},
					{2,3},
					{1,1,1,2,2,2,2},
					{1,1,1}
				}
		};
		
		for (int i=0; i<nums.length; i++) {
			for (int j=0; j<nums[i].length; j++) {
				for (int k=0; k<nums[i][j].length; k++) {
					System.out.printf("%02d ", nums[i][j][k]);
				}
				System.out.println();
			}
			System.out.println();
		}
		
		
		
		
		
		
	}
	
	public static void main6(String[] args) {
		int[][] nums = new int[5][8];
		
		for (int i=0; i<nums.length; i++) {
			for (int j=0; j<nums[i].length; j++)
				nums[i][j] = (int)(Math.random()*8 + 30);
		}
		
		for (int i=0; i<nums.length; i++) {
			for (int j=0; j<nums[i].length; j++)
				System.out.print(nums[i][j] + " ");
			System.out.println();
		}
		
	}

	public static void main5(String[] args) {
		int[][] nums = {
				{1,2,3,4},
				{5,6,7,8,9},
				{9}
		};
		
		System.out.println(nums.length);		// 3
		System.out.println(nums[0].length);	// 4
		System.out.println(nums[1].length);	// 5
		System.out.println(nums[2].length);	// 1
		
		int sum = 0;
		for (int i=0; i<nums.length; i++) {
			for (int j=0; j<nums[i].length; j++)
				sum += nums[i][j];
		}
		
		System.out.println("sum=" + sum);
	}
	
	
	public static void main4(String[] args) {
		int[] nums = new int[100];
		
		for (int i=0; i<nums.length; i++)
			nums[i] = (int)(Math.random()*100 + 1);
		
		for (int i=0; i<nums.length; i++)
			System.out.println(nums[i]);
		
		int sum = 0;
		for (int i=0; i<nums.length; i++)
			sum += nums[i];
		
		double avg = (double)sum/nums.length;
		
		System.out.printf("avg=%.2f\n", avg);
	}
	
	public static void main3(String[] args) {
		int[] nums = {1,56,7,9};
		
		int[] nums2;
		nums2 = new int[]{1,2,3,4};
		
		nums[0] = 100;
		nums[3] = 200;	// in-place
//		nums[-4] = 300;
		System.out.println(nums[0]);
		System.out.println(nums[1]);
		System.out.println(nums[2]);
		System.out.println(nums[3]);
		System.out.println(nums[4]);
		
		System.out.println("End...");
	}

	public static void main2(String[] args) {
		int num = 10;
		
		int[] nums = {10, 20, 40};
		nums = null;
		
		String str = "java,c/c++,python,html,css";
		
		String[] strs = str.split(",");
		
		System.out.println(str);
		
		for (int i=0; i<strs.length; i++)
			System.out.println(strs[i]);
		
	}

}
