package Lab23;

public class Array2<arr> {
    arr[] array;

    public Array2(arr[] array){
        this.array = array;
    }

    public arr[] getArray() {
        return array;
    }

    public arr at(int ind) throws Exception {
        if (ind <= 0 || ind >= array.length)
            throw new Exception(ind);

        return array[ind];
    }
}
