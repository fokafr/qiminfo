public class Solution {

    public static int solution(int N, int K){
        int[] arrayInput = getDigit(N);
        int[] arrayOutPut = getDigit(N);
        for(int i = 0; i < arrayInput.length; i++){
            if(K == 0 ) break;
            while(K > 0 && arrayInput[i] < 9){
                arrayInput[i]++;
                K--;
                if(arrayInput[i] == 9 ) {
                    arrayOutPut[i] = arrayInput[i];
                    break;
                }
                else {
                    arrayOutPut[i] = arrayInput[i];
                }

            }

        }
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < arrayOutPut.length; i++){
            sb.append(Integer.valueOf(arrayOutPut[i]).toString());
        }
        return Integer.parseInt(sb.toString());
    }

    private static int[] getDigit(int number){
        Integer initialNumber = new Integer(number);
        String fromIntToString =  initialNumber.toString();
        int[] tab = new int[fromIntToString.length()];
        for(int i = 0; i < fromIntToString.length(); i++){
            tab[i] =  fromIntToString.charAt(i) - '0';
        }
    return tab;
    }

}
