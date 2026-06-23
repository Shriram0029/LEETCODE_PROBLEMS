class Solution {
    public String largestNumber(int[] nums) {
        int n = nums.length;
        
        String[] str = new String[n];
        for(int i = 0; i < n; i++){
            str[i] = String.valueOf(nums[i]);
        }

        quickSort(str, 0, n - 1);

        if (str[0].equals("0")) {
            return "0";
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            result.append(str[i]);
        }

        return result.toString();
    }

    private void quickSort(String[] str, int low, int high) {
        if (low < high) {
            int p = partition(str, low, high);
            quickSort(str, low, p - 1);
            quickSort(str, p + 1, high);
        }
    }

    private int partition(String[] str, int low, int high) {
        String pivot = str[high];
        int i = low;

        for (int j = low; j < high; j++) {
            if ((str[j] + pivot).compareTo(pivot + str[j]) > 0) {
                String temp = str[i];
                str[i] = str[j];
                str[j] = temp;
                i++;
            }
        }

        String temp = str[i];
        str[i] = str[high];
        str[high] = temp;

        return i;
    }
}