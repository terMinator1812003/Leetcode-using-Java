public class PeakIndexInMountainArray_852_bs {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 0 };
        System.out.println(peakIndexInMountainArray(arr));

    }

    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                // now we are in the descending part of the array
                // this might be the ans,but look at the left hand side so i.e end=mid
                // this is why end is not mid-1
                end = mid;
            } else // if(arr[mid]<arr[mid+1])
            {
                // you are in ascending part of the array
                start = mid + 1; // becoause we know that mid+1 element>mid element
            }
        }
        // in the end, start==end and pointing to the largest number because of the 2
        // checks above
        // start and end are always trying to find max element in the above 2checks
        // hence , when they are pointing to just one elemnt , that is themax one
        // because that is what the check say
        // more elaboration at every point of start and end ,they have the best possible
        // answer till that time and
        // if we are saying only one item is remaining, hence because of above line that
        // is the best possible answer

        return start; // return end as both are =
    }
}
