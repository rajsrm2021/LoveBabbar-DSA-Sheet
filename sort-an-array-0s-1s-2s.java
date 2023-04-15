//User function template for Java

class Solution
{
    public static void sort012(int a[], int n)
    {
        // code here 
        int lo = 0;
        int hi = n - 1;
        int mid = 0, temp = 0;
        // Iterate till all the elements
        // are sorted
        while (mid <= hi) {
            switch (a[mid]) {
                // If the element is 0
            case 0: {
                temp = a[lo];
                a[lo] = a[mid];
                a[mid] = temp;
                lo++;
                mid++;
                break;
            }
                // If the element is 1
            case 1:
                mid++;
                break;
                // If the element is 2
            case 2: {
                temp = a[mid];
                a[mid] = a[hi];
                a[hi] = temp;
                hi--;
                break;
            }
            }
    }
}
}
