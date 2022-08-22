public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public static int singleNumber(final List<Integer> A) {
        int sum = 0;
        for(int i = 0; i < 32; i++){

            int bitSum = 0;

            for(int j = 0; j < A.size(); j++){

                bitSum += ((A.get(j) >> i) & 1);

            }
		//Other than the answer, every element is repeating thrice.
		//So the bitsum of bits which are not multiple of 3 are the set bits of the answer.
            sum += (bitSum % 3) * Math.pow(2, i);
        }

        return sum;
    }
}

//  Example :
//  Array = [ 1 , 2 , 2 , 2 , 3 , 3 , 3 , 4 , 4 , 4 ]
//  Binary Representation of the array Elements
//  1 - 0 0 0 1
//  2 - 0 0 1 0
//  2 - 0 0 1 0
//  2 - 0 0 1 0
//  3 - 0 0 1 1
//  3 - 0 0 1 1
//  3 - 0 0 1 1
//  4 - 0 1 0 0
//  4 - 0 1 0 0
//  4 - 0 1 0 0
//sum - 0 3 6 4 -- (mod with 3)
//      0 0 0 1 -- (answer)
 	
