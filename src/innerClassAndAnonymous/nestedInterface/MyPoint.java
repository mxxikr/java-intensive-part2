package innerClassAndAnonymous.nestedInterface;

// 2차원 좌표를 나타내는 MyPoint 클래스
class MyPoint {
    // x, y 좌표를 인자로 받아 MyPoint 객체를 초기화하는 생성자
    MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }
    int x; // x 좌표
    int y; // y 좌표
}