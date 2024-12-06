
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Container;
import javax.swing.JLabel;
import javax.swing.JButton;

public class Main extends JFrame {
    public Main() {
        setTitle("500x300 프레임과 컨텐트팬 만들기"); // 프레임 제목 설정
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 300); // 프레임 크기 설정

        Container contentPane = getContentPane(); //프레임에서 컨텐트팬 받아오기
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("레이블 테스트 입니다");
        lblNewLabel.setBounds(182, 133, 124, 15); // 레이블 위치 설정
        contentPane.add(lblNewLabel); // 콘텐트팬에 레이블 붙이기

        JButton btnNewButton = new JButton("버튼 테스트");
        btnNewButton.setBounds(182, 59, 110, 23);
        contentPane.add(btnNewButton);

        setVisible(true); //화면에 프레임 출력
    }
    public static void main(String [] args) {
        Main mf = new Main();
    }
}