
public class Array1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

	}
	//	Given an array of ints, return true if 6 appears as either the first or
	//	last element in the array. The array will be length 1 or more.
	//
	//	firstLast6([1, 2, 6]) → true
	//	firstLast6([6, 1, 2, 3]) → true
	//	firstLast6([13, 6, 1, 2, 3]) → false
	public boolean firstLast6(int[] nums) {
		// numsの要素数が0の場合
		if(nums.length <1){return false;};
		// numsの要素数が1以上の場合
		if(nums.length >=1){
			// 配列の先頭要素が6だった場合、trueを返す
			if(nums[0] == 6){
				return true;
			}else if(nums[nums.length-1]==6){
				return true;
			}
		}
		return false;
	}

	//	Given an array of ints, return true if the array is length 1 or more,
	//	and the first element and the last element are equal.
	//
	//	sameFirstLast([1, 2, 3]) → false
	//	sameFirstLast([1, 2, 3, 1]) → true
	//	sameFirstLast([1, 2, 1]) → true
	public boolean sameFirstLast(int[] nums) {
		// numsの要素数が0と1の場合
		switch (nums.length) {
		case 0:
			return false;
		case 1:
			return true;
		}
		// numsの要素先頭と同じ値の要素があった場合、trueを返す
		int first = nums[0];
		for(int i =1; i < nums.length; i++){
			if(nums[i] == first){
				return true;
			}
		}
		return false;
	}

	//	Return an int array length 3 containing the first 3 digits of pi, {3, 1, 4}.
	//
	//	makePi() → [3, 1, 4]
	public int[] makePi() {
		int [] pi = {3,1,4};
		return pi;
	}

	//	Given 2 arrays of ints, a and b, return true if they have the same first element or
	//	they have the same last element. Both arrays will be length 1 or more.
	//
	//	commonEnd([1, 2, 3], [7, 3]) → true
	//	commonEnd([1, 2, 3], [7, 3, 2]) → false
	//	commonEnd([1, 2, 3], [1, 3]) → true
	public boolean commonEnd(int[] a, int[] b) {
		// aとbいずれかの配列が空の場合、falseとする
		if(a.length == 0 || b.length ==0){
			return false;
		}
		// aとbの先頭または最後方の値が同じだった場合、trueとする
		if(a[0] == b[0] || a[a.length-1] == b[b.length-1]){
			return true;
		}
		return false;
	}

	//	Given an array of ints length 3, return the sum of all the elements.
	//
	//	sum3([1, 2, 3]) → 6
	//	sum3([5, 11, 2]) → 18
	//	sum3([7, 0, 0]) → 7
	public int sum3(int[] nums) {
		int sum = 0;
		// 配列の要素分加算する
		for(int num: nums){
			sum = sum + num;
		}
		return sum;
	}

	//	Given an array of ints length 3, return an array with the elements
	//	"rotated left" so {1, 2, 3} yields {2, 3, 1}.
	//
	//	rotateLeft3([1, 2, 3]) → [2, 3, 1]
	//	rotateLeft3([5, 11, 9]) → [11, 9, 5]
	//	rotateLeft3([7, 0, 0]) → [0, 0, 7]
	public int[] rotateLeft3(int[] nums) {
		// 要素を左にずらす
		int[] result = {nums[1],nums[2],nums[0]};
		return result;
	}

	//	Given an array of ints length 3, return a new array with the elements
	//	in reverse order, so {1, 2, 3} becomes {3, 2, 1}.
	//
	//	reverse3([1, 2, 3]) → [3, 2, 1]
	//	reverse3([5, 11, 9]) → [9, 11, 5]
	//	reverse3([7, 0, 0]) → [0, 0, 7]
	public int[] reverse3(int[] nums) {
		// 配列の要素を逆さまにして返す
		int[] result = {nums[2],nums[1],nums[0]};
		return result;
	}

	// Given an array of ints length 3, figure out which is larger,
	// the first or last element in the array, and set all the other elements
	// to be that value. Return the changed array.
	//
	// maxEnd3([1, 2, 3]) → [3, 3, 3]
	// maxEnd3([11, 5, 9]) → [11, 11, 11]
	// maxEnd3([2, 11, 3]) → [3, 3, 3]
	public int[] maxEnd3(int[] nums) {
		// 配列の先頭と最後尾の要素を比べる
		if(nums[0] >= nums[2]){
			nums[0] = nums[0];
			nums[1] = nums[0];
			nums[2] = nums[0];
		}else if(nums[2] >= nums[0]){
			nums[0] = nums[2];
			nums[1] = nums[2];
			nums[2] = nums[2];
		}
		return new int[] { nums[0],nums[1],nums[2]};
	}

	// Given an array of ints, return the sum of the first 2 elements in the array.
	// If the array length is less than 2, just sum up the elements that exist,
	// returning 0 if the array is length 0.
	//
	// sum2([1, 2, 3]) → 3
	// sum2([1, 1]) → 2
	// sum2([1, 1, 1, 1]) → 2
	public int sum2(int[] nums) {
		int sum = 0;
		// 要素数が2個より少ない場合
		if(nums.length <2){
			for(int num: nums){
				sum = sum + num;
			}
			return sum;
		}
		// 要素の1番目と2番目を足す
		return nums[0] + nums[1];
	}


	// Given 2 int arrays, a and b, each length 3,
	// return a new array length 2 containing their middle elements.
	//
	// middleWay([1, 2, 3], [4, 5, 6]) → [2, 5]
	// middleWay([7, 7, 7], [3, 8, 0]) → [7, 8]
	// middleWay([5, 2, 9], [1, 4, 5]) → [2, 4]
	public int[] middleWay(int[] a, int[] b) {
		// aとbの要素の2番目を抽出して返す
		return new int []{a[1],b[1]};
	}

	//	Given an array of ints, return a new array length 2 containing the first
	//	and last elements from the original array.
	//	The original array will be length 1 or more.
	//
	//	makeEnds([1, 2, 3]) → [1, 3]
	//	makeEnds([1, 2, 3, 4]) → [1, 4]
	//	makeEnds([7, 4, 6, 2]) → [7, 2]
	public int[] makeEnds(int[] nums) {
		// numsの先頭と最後尾の要素を抽出して返す
		return new int[]{nums[0],nums[nums.length-1]};
	}

	//	Given an int array length 2, return true if it contains a 2 or a 3.
	//
	//	has23([2, 5]) → true
	//	has23([4, 3]) → true
	//	has23([4, 5]) → false
	public boolean has23(int[] nums) {
		// 2か3を含む時、trueを返す
		if(nums[0] == 2 || nums[0] == 3 || nums[1] == 2 || nums[1] == 3){
			return true;
		}
		return false;
	}

	//	Given an int array length 2, return true if it does not contain a 2 or 3.
	//
	//	no23([4, 5]) → true
	//	no23([4, 2]) → false
	//	no23([3, 5]) → false
	public boolean no23(int[] nums) {
		// 2か3を含む時、falseを返す
		if(nums[0] == 2 || nums[0] == 3 || nums[1] == 2 || nums[1] == 3){
			return false;
		}
		return true;
	}

	//	Given an int array, return a new array with double the length
	//	where its last element is the same as the original array,
	//	and all the other elements are 0. The original array will be
	//	length 1 or more. Note: by default, a new int array contains all 0's.
	//
	//	makeLast([4, 5, 6]) → [0, 0, 0, 0, 0, 6]
	//	makeLast([1, 2]) → [0, 0, 0, 2]
	//	makeLast([3]) → [0, 3]
	public int[] makeLast(int[] nums) {
		int[] num = new int[nums.length*2];
		// サイズだけ取っておくと0が初期値として入る（Note参照）
		num[nums.length*2 - 1] = nums[nums.length -1];
		return num;
	}


	//  Given an int array, return true if the array contains 2 twice, or 3 twice.
	//	The array will be length 0, 1, or 2.
	//
	//  double23([2, 2]) → true
	//  double23([3, 3]) → true
	//  double23([2, 3]) → false
	public boolean double23(int[] nums) {
		// 2or3が複数あったらtrueを返す
		if(nums.length<2){return false;};
		return (nums[0] == 2 && nums[1] == 2) || (nums[0] == 3 && nums[1] == 3);
	}

	//	Given an int array length 3, if there is a 2 in the array immediately
	//	followed by a 3, set the 3 element to 0. Return the changed array.
	//
	//	fix23([1, 2, 3]) → [1, 2, 0]
	//	fix23([2, 3, 5]) → [2, 0, 5]
	//	fix23([1, 2, 1]) → [1, 2, 1]
	public int[] fix23(int[] nums) {
		// 配列の要素で、2の直後に3があった場合、3を0に変える
		if(nums[0] == 2 && nums[1] == 3){
			nums[1] = 0;
		}
		if(nums[1] == 2 && nums[2] == 3){
			nums[2] = 0;
		}
		return nums;
	}

	//	Start with 2 int arrays, a and b, of any length.
	//	Return how many of the arrays have 1 as their first element.
	//
	//	start1([1, 2, 3], [1, 3]) → 2
	//	start1([7, 2, 3], [1]) → 1
	//	start1([1, 2], []) → 1
	public int start1(int[] a, int[] b) {
		int count = 0;
		// a,bの要素の先頭が1だった場合、カウントアップする
		if(a.length > 0){
			if(a[0] == 1){
				count++;
			}
		}
		if(b.length > 0){
			if(b[0] == 1){
				count++;
			}
		}
		return count;
	}


	// Start with 2 int arrays, a and b, each length 2.
	// Consider the sum of the values in each array.
	// Return the array which has the largest sum.
	// In event of a tie, return a.
	//
	// biggerTwo([1, 2], [3, 4]) → [3, 4]
	// biggerTwo([3, 4], [1, 2]) → [3, 4]
	// biggerTwo([1, 1], [1, 2]) → [1, 2]
	public int[] biggerTwo(int[] a, int[] b) {
		// aの要素の合計とbの要素の合計を比べて、合計が大きかった配列を返す
		int sumA = a[0] + a[1];
		int sumB = b[0] + b[1];

		if(sumA >= sumB){
			return a;
		}else{
			return b;
		}
	}

	//	Given an array of ints of even length, return a new array length 2
	//	containing the middle two elements from the original array.
	//	The original array will be length 2 or more.
	//
	//	makeMiddle([1, 2, 3, 4]) → [2, 3]
	//	makeMiddle([7, 1, 2, 3, 4, 9]) → [2, 3]
	//	makeMiddle([1, 2]) → [1, 2]
	public int[] makeMiddle(int[] nums) {
		// 要素数が2の場合はそのまま返す
		if(nums.length == 2){return nums;};
		int middle = (nums.length /2) -1;
		return new int[] {nums[middle],nums[middle+1]};
	}

	//	Given 2 int arrays, each length 2, return a new array length 4 containing
	//  all their elements.
	//
	//	plusTwo([1, 2], [3, 4]) → [1, 2, 3, 4]
	//	plusTwo([4, 4], [2, 2]) → [4, 4, 2, 2]
	//	plusTwo([9, 2], [3, 4]) → [9, 2, 3, 4]
	public int[] plusTwo(int[] a, int[] b) {
		return new int[] {a[0],a[1],b[0],b[1]};
	}


	// Given an array of ints, swap the first and last elements in the array.
	// Return the modified array. The array length will be at least 1.
	//
	// swapEnds([1, 2, 3, 4]) → [4, 2, 3, 1]
	// swapEnds([1, 2, 3]) → [3, 2, 1]
	// swapEnds([8, 6, 7, 9, 5]) → [5, 6, 7, 9, 8]
	public int[] swapEnds(int[] nums) {
		// 要素の先頭と最後尾を入れ替える
		int first = nums[0];
		int end = nums[nums.length-1];
		nums[0] = end;
		nums[nums.length-1] = first;
		return nums;
	}

	//	Given an array of ints of odd length, return a new array length 3 containing
	//	the elements from the middle of the array. The array length will be at least 3.
	//
	//	midThree([1, 2, 3, 4, 5]) → [2, 3, 4]
	//	midThree([8, 6, 7, 5, 3, 0, 9]) → [7, 5, 3]
	//	midThree([1, 2, 3]) → [1, 2, 3]
	public int[] midThree(int[] nums) {
		// 配列の要素数が3の場合、そのまま返す
		if(nums.length == 3){return nums;};
		int middle = (nums.length / 2) -1;
		return new int[] {nums[middle], nums[middle+1], nums[middle+2]};
	}

	//	Given an array of ints of odd length, look at the first, last,
	//	and middle values in the array and return the largest.
	//	The array length will be a least 1.
	//
	//	maxTriple([1, 2, 3]) → 3
	//	maxTriple([1, 5, 3]) → 5
	//	maxTriple([5, 2, 3]) → 5
	public int maxTriple(int[] nums) {
		// 要素の中で一番大きい数字を返す(先頭、真ん中、最後尾）
		int result = 0;
		int a = nums[0];
		int b= nums[((nums.length+1)/2) -1];
		int c = nums[nums.length -1];

		if (a>b && a>c)
			result = a;
		if (b>a && b>c)
			result = b;
		if (c>a && c>b)
			result = c;
		return result;
	}

	//	Given an int array of any length, return a new array of its first 2 elements.
	//	If the array is smaller than length 2, use whatever elements are present.
	//
	//	frontPiece([1, 2, 3]) → [1, 2]
	//	frontPiece([1, 2]) → [1, 2]
	//	frontPiece([1]) → [1]
	public int[] frontPiece(int[] nums) {
		// 配列の要素が1より少ない場合、そのまま返す
		if(nums.length <2){return nums;};

		// 先頭2つの要素を返す
		return new int[]{nums[0],nums[1]};
	}


	// We'll say that a 1 immediately followed by a 3 in an array is an "unlucky" 1.
	// Return true if the given array contains an unlucky 1 in the first 2 or last 2
	// positions in the array.
	//
	// unlucky1([1, 3, 4, 5]) → true
	// unlucky1([2, 1, 3, 4, 5]) → true
	// unlucky1([1, 1, 1]) → false
	public boolean unlucky1(int[] nums) {
		// ある要素が1の時、その直後が3の場合、trueを返す
		int len = nums.length;
		if (len <= 1) return false;

		// 先頭
		for (int i = 0; i <= 1; i++) {
			if (nums[i] == 1 && nums[i + 1] == 3)
				return true;
			if (len < 3) break;
		}
		// 最後尾
		return nums[len - 2] == 1 && nums[len - 1] == 3;
	}
	//	Given 2 int arrays, a and b, return a new array length 2 containing,
	//	as much as will fit, the elements from a followed by the elements from b.
	//	The arrays may be any length, including 0, but there will be 2 or more elements
	//	available between the 2 arrays.
	//
	//	make2([4, 5], [1, 2, 3]) → [4, 5]
	//	make2([4], [1, 2, 3]) → [4, 1]
	//	make2([], [1, 2]) → [1, 2]
//	public int[] make2(int[] a, int[] b) {

//	}

	//	Given 2 int arrays, a and b, of any length, return a new array with the first element
	//	of each array. If either array is length 0, ignore that array.
	//
	//	front11([1, 2, 3], [7, 9, 8]) → [1, 7]
	//	front11([1], [2]) → [1, 2]
	//	front11([1, 7], []) → [1]
	public int[] front11(int[] a, int[] b) {
		if(a.length == 0 && b.length == 0){
			return new int[]{};
		}else if(a.length == 0){
			return new int[]{b[0]};
		}else if(b.length == 0){
			return new int[]{a[0]};
		}
		return new int[]{a[0],b[0]};
	}

}


