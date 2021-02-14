package Lab13_14_22p2;

import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student> {
    public void quickSort(Data[] data, int left, int right)
    {
        if (data.length == 0) return;
        if (left >= right) return;
        int middle = left + (right - left) / 2;
        Data bufArr =new Student(0,"",0);
        bufArr = data[middle];
        Data temp=new Student(0,"",0);
        int i = left, j = right;
        while (i <= j) {
            while (this.dataComparator.compare(data[i],bufArr) > 0) {
                i++;
            }

            while (this.dataComparator.compare(data[j],bufArr) < 0) {
                j--;
            }

            if (i <= j) {
                temp = data[i];
                data[i] = data[j];
                data[j] = temp;
                i++;
                j--;
            }
        }

        if (left < j)
            quickSort(data, left, j);
        if (right > i)
            quickSort(data, i, right);
    }

    public Data[] sortMerge(Data[] arrayA){
        if (arrayA == null) return null;
        if (arrayA.length < 2)return arrayA;

        Data [] left = new Data[arrayA.length / 2];
        System.arraycopy(arrayA, 0, left, 0, arrayA.length / 2);

        Data [] right = new Data[arrayA.length - arrayA.length / 2];
        System.arraycopy(arrayA, arrayA.length / 2, right, 0, arrayA.length - arrayA.length / 2);

        left = sortMerge(left);
        right = sortMerge(right);

        return mergeArray(left, right);
    }

    private Data [] mergeArray(Data[] left, Data[] right) {
        Data[] merged = new Student[left.length+right.length];
        for (int i = 0; i < merged.length; i++)
            merged[i]=new Student(0,"",0);
        int lengthLeft = left.length;
        int lengthRight = right.length;
        while (lengthLeft > 0 && lengthRight > 0){
            if (this.dataComparator.compare(left[left.length - lengthLeft],right[right.length - lengthRight]) > 0){
                merged[merged.length -lengthLeft-lengthRight] = left[left.length - lengthLeft];
                lengthLeft--;
            }
            else{
                merged[merged.length - lengthLeft-lengthRight] = right[right.length - lengthRight];
                lengthRight--;
            }
        }
        while (lengthLeft > 0){
            merged[merged.length - lengthLeft] = left[left.length-lengthLeft];
            lengthLeft--;
        }
        while (lengthRight > 0){
            merged[merged.length - lengthRight] = right[right.length-lengthRight];
            lengthRight--;
        }
        return merged;
    }

    Comparator<Data> dataComparator = new Comparator<Data>() {

        @Override
        public int compare(Data o1, Data o2) {
            return Integer.compare(o1.getGPA(),o2.getGPA());
        }
    };

    public int compare(Student o1, Student o2){
        return o1.getSum().compareTo(o2.getSum());

    }
}
