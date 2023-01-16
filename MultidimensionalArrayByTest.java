package z01normal_java;

import java.util.Arrays;


// 다차원배열 랜덤 인덱스:
// 몫 연산자 : 한단계 아래 차원 정하는거... 계속 몫연산자로 하다가 마지막에 나머지 연산자 한번 하면됨
public class MultidimensionalArrayByTest {
    public static void main(String[] args) {


        int[][] arr = new int[4][4];
        int totalElementNum = arr.length * arr[0].length;
        boolean[] check = new boolean[totalElementNum];


        int index=0;
        int row;
        int col;
        for (int i = 0; i < totalElementNum; ++i) {
            index= getRandomFromTo(0,totalElementNum);
            while (check[index]) {
                ++index;
                if (index == check.length) {
                    index = 0;
                }
            }
            check[index]=true;

            row= index/4;
            col= index%4;

            arr[row][col] = getRandomFromTo(1,11);
        }

        System.out.println(Arrays.deepToString(arr));
    }

    private static int getRandomFromTo(int from, int to) {
        return (int) ((Math.random() * (to - from) + from));
    }

}
