package catch_the_drop;


import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;

public class GameWindow extends JFrame {

    private static Image background;// переменная для нашей картинки
    private static long last_frame_type;// переменная для подсчета времени между кадрами
    private static Image game_over;// переменная для нашей картинки
    private static Image drop;// переменная для нашей картинки
    private static float drop_left = 200;// координаты x верхнего левого угла картинки с каплей для вставки в окно игры
    private static float drop_top = -100;// координаты y верхнего левого угла картинки с каплей для вставки в окно игры
    private static float drop_v = 200;// скорость капли
    private static GameWindow game_window; //переменная, в которой будет храниться объект нашего окна,
    // с ней смогут работать переменные из класса
    private static float drop_right;
    private static float drop_bottom;
    private static int score;// счетчик очков



    public static void main(String[] args) throws IOException {  // добавляем исключения для наших объектов (картинок)
        background = ImageIO.read(GameWindow.class.getResourceAsStream("111.png"));// загрузка картинки в переменную
        game_over = ImageIO.read(GameWindow.class.getResourceAsStream("game-over.png"));// загрузка картинки в переменную
        drop = ImageIO.read(GameWindow.class.getResourceAsStream("tear.png"));// загрузка картинки в переменную
        game_window = new GameWindow();//Создание обьекта для переменной GameWindow
        game_window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//Настройка: Если окно закрыто - программа завершается.
        game_window.setLocation(100,100); //Настройка: Место появления окна на рабочем столе
        game_window.setSize(906, 478); // Настройка  размера окна
        game_window.setResizable(false); // Возможность изменить размер окна (отсутствует в нашем случае)
        last_frame_type = System.nanoTime(); // Возвращаем текущее время в наносекундах
        GameField game_field = new GameField(); // Создаем поле для рисования
        game_field.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                int x = e.getX();// Получаем координаты курсора мыши
                int y = e.getY();
                drop_right = drop_left + drop.getWidth(null);// Узнаем размеры нашей капли
                drop_bottom = drop_top + drop.getHeight(null);// Узнаем размеры нашей капли
                boolean is_drop = x >= drop_left && x <= drop_right && y >= drop_top && y <= drop_bottom;
                // условия попадания курсора в каплю
                if (is_drop) {
                    drop_top = -100;// Откидываем каплю в начальное положение, когда условия попадания в каплю выполняются
                    drop_left = (int) ((game_field.getWidth() - drop.getWidth(null) * Math.random()));/* Ставим каплю в рандомное
                  положение сверху, после того, как попали в ее курсором */
                    drop_v = drop_v + 20;// повышение скорости после каждого попадания
                    score++;// переменная для счета очков (+1 после каждого попадания)
                    game_window.setTitle("Score: " + score);// вывод текущего счета в нашем окне игры
                }
            }
        });
        game_window.add(game_field);// Добавляем поле для рисования в наш объект
        game_window.setVisible(true); // Делаем окно видимым
    }
    private static void onRepaint(Graphics g) {        //метод, который рисует
        long current_time = System.nanoTime();// Получаем текущее время в наносекундах
        float delta_time = (current_time - last_frame_type) * 0.000000001f;/* Разница между текущим временем и
    временем предыдущего кадра в секундах */
        last_frame_type = current_time; // Время предыдущего кадра равно текущему
        drop_top = drop_top + drop_v * delta_time;
        g.drawImage(background, 0, 0,906, 478, null); // определяем координаты вставки наших картинок в окно игры
        g.drawImage(drop, (int) drop_left, (int) drop_top, 50, 50, null);
        if (drop_top > game_window.getHeight()) g.drawImage(game_over, 360,120, 300,200, null);
    }

    private static class GameField extends JPanel {    //класс, внутри которого есть метод, который переопределяет paintComponent из Jpanel
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);                    // считывает из JPanel
            onRepaint(g);
            repaint();
        }
    }
}
