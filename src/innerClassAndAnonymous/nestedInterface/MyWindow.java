package innerClassAndAnonymous.nestedInterface;

// 윈도우와 관련된 동작을 정의하는 MyWindow 클래스
class MyWindow {
    // 버튼 클릭 이벤트를 처리하기 위한 정적 중첩 인터페이스 OnClickListener
    static interface OnClickListener {
        public void onClick(MyPoint point); // 클릭 이벤트를 처리하는 메서드
    }

    OnClickListener listener; // OnClickListener 타입의 리스너 객체

    // OnClickListener를 인자로 받아 MyWindow 객체를 초기화하는 생성자
    MyWindow(OnClickListener listener) {
        this.listener = listener; // 전달받은 리스너를 현재 객체의 리스너로 설정
    }

    // 지정된 지점(point)에서 클릭 이벤트를 발생시키는 메서드
    void click(MyPoint point) {
        listener.onClick(point); // 등록된 리스너의 onClick 메서드를 호출
    }
}