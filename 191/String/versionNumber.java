public class versionNumber {

    public int compareVersion(String version1, String version2) {

        int i = 0;
        int j = 0;

        int n = version1.length();
        int m = version2.length();

        while(i < n || j < m){
            
            int num1 = 0;
            while (i < n && version1.charAt(i) != '.') {
                num1 = num1 * 10 + (version1.charAt(i) - '0');
                i++;
            }
            
            int num2 = 0;
            while (j < m && version2.charAt(j) != '.') {
                num2 = num2 * 10 + (version2.charAt(j) - '0');
                j++;
            }

            if (num1 < num2) return -1;
            if (num1 > num2) return 1;

            if(i<n) i++;
            if(j<m) j++;

        }

        return 0;
    }

    public static void main(String[] args) {
        String v1 = "1.2";
        String v2 = "1.10";

        versionNumber obj = new versionNumber();
        System.out.println(obj.compareVersion(v1, v2));
    }
}
