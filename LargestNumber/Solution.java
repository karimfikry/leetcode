public class Solution {
    public String largestNumber(int[] num) {
        if(num == null || num.length == 0) {
            return "";
        }
        String[] lrgNum = new String[num.length];
        for(int i = 0; i < lrgNum.length; i++) {
            lrgNum[i] = num[i] + "";
        }

        Comparator<String> comp = new Comparator<String>() {
          @Override
          public int compare(String s1, String s2) {
              String str1 = s1 + s2;
              String str2 = s2 + s1;
              return str1.compareTo(str2);
          }
        };

        Arrays.sort(lrgNum, comp);
        if(lrgNum[lrgNum.length - 1].charAt(0) == '0')
            return "0";

        StringBuilder sb = new StringBuilder();
        for(String s : lrgNum) {
            sb.insert(0, s);
        }

        return sb.toString();
    }
}
