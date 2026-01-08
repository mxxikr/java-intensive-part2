package innerClassAndAnonymous.nestedInterface;

// MyWindow.OnClickListener 인터페이스를 구현하는 ButtonListener 클래스
class ButtonListener implements MyWindow.OnClickListener {
    @Override
    // onClick 메서드를 오버라이드하여 클릭 시 좌표를 출력하는 기능 구현
    public void onClick(MyPoint point) {
        System.out.print("ButtonListener.onClick(): ");
        System.out.println(point.x + ", " + point.y);
    }
}

// 메인 클래스
public class Main {
    public static void main(String[] args) {
        // ButtonListener 객체를 인자로 전달하여 MyWindow 객체 생성
        MyWindow win = new MyWindow(new ButtonListener());
        // MyWindow의 click 메서드를 호출하여 (10, 10) 좌표에서 이벤트 발생
        win.click(new MyPoint(10, 10));
        // MyWindow의 click 메서드를 호출하여 (200, 150) 좌표에서 이벤트 발생
        win.click(new MyPoint(200, 150));
    }
}