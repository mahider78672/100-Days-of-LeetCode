class Solution {
    public String addBinary(String a, String b) {
      if(a.length()<b.length()) {
            return addBinary(b,a);
        }
        int i = a.length()-1;
        int j = b.length()-1;
        int sum = 0;
        int carry = 0;
        char[] res = new char[i+2];
        int k = i+1;

        while(i>=0) {
            sum = carry+(a.charAt(i--)-'0');
            if(j>=0) {
                sum = sum+(b.charAt(j--)-'0');
            }
            res[k--] = (char)(sum%2+'0');
            carry = sum/2;
        }
        if(carry == 1) {
            res[k]=(char)(carry+'0');
        }
        else if(res[k]!=1) {
            return new String(res, 1, res.length-1);
        }
        return new String(res);
    }
}
