import java.util.Arrays;

public class Ex1 {
    static void main() {
        int result = multiply(4, 5);
        System.out.println(result);
        String result2 = concat("Numero ", 1);
        System.out.println(result2);
        String[] newArr = strangerPush(new String[]{"1", "2", "3", "4", "5"}, "inserito");
        System.out.println(Arrays.toString(newArr));

    }

    static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    static String concat(String str, int num1) {
        return str + num1;
    }

    static String[] strangerPush(String[] arr, String str) {

        String[] resultArr = new String[arr.length + 1];
        int position = arr.length / 2;
        int len;
        if (resultArr.length % 2 == 0) {
            len = position + 2;
        } else {
            len = position + 1;
        }
        String[] tempArr = new String[len];
        for (int i = 0; i < tempArr.length; i++) {
            if (i == 0) {
                tempArr[i] = str;
            } else {
                tempArr[i] = arr[position + i - 1];
            }
        }

        int n = 0;
        for (int i = 0; i < resultArr.length; i++) {

            if (i < position) {
                resultArr[i] = arr[i];
            } else {
                n = n + 1;
                resultArr[i] = tempArr[n - 1];
            }
        }

        return resultArr;

    }


}



