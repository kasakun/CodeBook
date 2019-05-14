class Solution {
    public String multiply(String num1, String num2) {
        int m = num1.length(), n = num2.length();
        int[] res = new int[m + n];
        
        for (int i = m - 1; i >= 0; --i) {
            for (int j = n - 1; j >= 0; --j) {
                int mul = (num1.charAt(i) - '0')*(num2.charAt(j) - '0');
                int p1 = i + j, p2 = i + j + 1;
                
                int sum = res[p2] + mul;
                
                res[p1] += sum/10;
                res[p2] = sum%10;
            }
        }
        
        StringBuilder sb = new StringBuilder();
        
        for (int num : res) {
            // eliminate first 0
            if (!(sb.length() == 0 && num == 0))
                sb.append(num);
        }
        
        return sb.length() == 0 ? "0" : sb.toString();
    }
}