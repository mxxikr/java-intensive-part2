package class2.deepCopy;

public class MyTest {
    private int[] array = null;

    /**
     * 주어진 크기만큼의 정수 배열을 생성하는 생성자
     */
    public MyTest(int size) {
        array = new int[size];
    }

    /**
     * 복사 생성자
     */
    public MyTest(MyTest rhs) {
        // 원본 객체(rhs)와 동일한 크기의 새로운 배열을 생성
        this(rhs.array.length);

        // 원본 객체의 배열 내용을 새로 만든 배열에 깊은 복사
        this.deepCopy(rhs);
    }

    /**
     * 배열의 특정 인덱스에 있는 값을 반환
     */
    public int getAt(int index) {
        return array[index];
    }

    /**
     * 배열의 특정 인덱스에 값을 설정
     */
    public void setAt(int index, int value) {
        array[index] = value;
    }

    /**
     * 얕은 복사를 수행
     */
    public void shallowCopy(MyTest rhs) {
        // 원본 객체(rhs)의 배열이 가리키는 메모리 주소(참조)를 그대로 복사
        // this.array와 rhs.array는 똑같은 배열을 가리키게 됨
        array = rhs.array;
    }

    /**
     * 깊은 복사를 수행
     */
    public void deepCopy(MyTest rhs) {
        for(int i = 0; i < rhs.array.length; ++i)
            array[i] = rhs.array[i];

        // 자신과 똑같은 내용물을 가진 새로운 배열을 생성하여 반환
//         array = rhs.array.clone();

        // 대량의 데이터를 복사할 때 가장 효율적인 방법
//         System.arraycopy(rhs.array, 0, this.array, 0, rhs.array.length);
    }
}
