package Clases;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class GamePanel extends JPanel implements ActionListener {

    static final int SCREEN_WIDTH = 600;
    static final int SCREEN_HEIHGH = 600;
    static final int UNIT_SIZE = 25;
    static final int GAME_UNIT = (SCREEN_WIDTH * SCREEN_HEIHGH)/ UNIT_SIZE;
    static final int DELAY = 75;
    final int x[] = new int[GAME_UNIT];
    final int y[] = new int[GAME_UNIT];
    int bodyParts = 6;
    int applesEaten;
    int appleX;
    int appleY;
    char direction = Teclas.ARRIBA;
    boolean running = false;
    Timer timer;
    Random random;


    //constructor --> declaramos todos los metodos
    GamePanel(){
        random = new Random();
        this.setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIHGH));
        this.setBackground(Color.PINK);
        this.setFocusable(true);
        this.addKeyListener(new MyKeyAdapter());
        startGame();

    }

    public void startGame(){
        newApple();
        running = true;
        timer= new Timer(DELAY, this);
        timer.start();
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        draw(g);
    }

    public void draw (Graphics g){

        if (running) {
            g.setColor(Color.RED);
            g.fillOval(appleX,appleY,UNIT_SIZE,UNIT_SIZE);

            //head
            for(int i = 0; i<bodyParts; i++){
                if(i==0){
                    g.setColor(Color.ORANGE);
                    g.fillRect(x[i],y[i],UNIT_SIZE,UNIT_SIZE);
                }else{
                    g.setColor(Color.ORANGE);
                    g.setColor (new Color(random.nextInt(255),random.nextInt(255),random.nextInt(255)));
                    g.fillRect(x[i],y[i],UNIT_SIZE,UNIT_SIZE);
                }
            }

            //Score
            g.setColor(Color.red);
            g.setFont(new Font("INK Free", Font.BOLD, 35));
            FontMetrics metrics = getFontMetrics(g.getFont());
            g.drawString("Score:  "+applesEaten, (SCREEN_WIDTH - metrics.stringWidth("Score:  "+applesEaten))/2, g.getFont().getSize());

        }else{
            gameOver(g);
        }


    }

    public void newApple(){
        appleX= random.nextInt( UNIT_SIZE* (int)(SCREEN_WIDTH/UNIT_SIZE));
        appleY= random.nextInt( UNIT_SIZE* (int)(SCREEN_WIDTH/UNIT_SIZE));
    }

    public void move(){
        for(int i= bodyParts; i >0;i--){
            x[i]= x[i-1];
            y[i]= y[i-1];
        }

        switch(direction) {
            case Teclas.ABAJO:
                y[0]=y[0]+UNIT_SIZE;
                break;
            case Teclas.ARRIBA:
                y[0]=y[0]-UNIT_SIZE;
                break;
            case Teclas.DERECHA:
                x[0]=x[0]+UNIT_SIZE;
                break;
            case Teclas.IZQUIERDA:
                x[0]=x[0]-UNIT_SIZE;
                break;
        }

    }

    public void checkApple() {
        if((x[0] == appleX)&& y[0] == appleY) {
            bodyParts++;
            applesEaten++;
            newApple();
        }

    }

    public void checkCollisions() {
        for(int i = bodyParts; i>0;i--){
            if((x[0] ==x[i]) &&(y[0] ==y[i])) {
                running = false;
            }

        }
        //check if head touches left border
        if(x[0]<0) {
            running = false;
        }
        //check if head touches right border
        if(x[0]>SCREEN_WIDTH) {
            running = false;
        }

        //check if head touches UPPER border
        if(y[0]>SCREEN_HEIHGH) {
            running = false;
        }

        //check if head touches BOTTOM border
        if(y[0]<0) {
            running = false;
        }

        if(!running) {
            timer.stop();
        }
    }

    public void restartGame() {
        bodyParts = 6;
        applesEaten = 0;
        direction = Teclas.ARRIBA;
        running = true;
        newApple();
        for (int i = 0; i < bodyParts; i++) {
            x[i] = 0;
            y[i] = 0;
        }
        timer.start();
    }

    public void gameOver (Graphics g){

        //Score
        g.setColor(Color.red);
        g.setFont(new Font("INK Free", Font.BOLD, 35));
        FontMetrics metrics = getFontMetrics(g.getFont());
        g.drawString("Score:  "+applesEaten, (SCREEN_WIDTH - metrics.stringWidth("Score:  "+applesEaten))/2, g.getFont().getSize());

        //Game Over text
        g.setColor(Color.red);
        g.setFont(new Font("INK Free", Font.BOLD, 75));
        FontMetrics metrics1 = getFontMetrics(g.getFont());
        g.drawString("GAME OVER , Presiona R para reiniciar", (SCREEN_WIDTH - metrics1.stringWidth("GAME OVER"))/2, SCREEN_HEIHGH/2);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(running){
            move();
            checkApple();
            checkCollisions();
        }
        repaint();
    }

    public class MyKeyAdapter extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            switch(e.getKeyCode()) {
                case KeyEvent.VK_LEFT:
                    if(direction!= Teclas.DERECHA){
                        direction = Teclas.IZQUIERDA;
                    }
                    break;
                case KeyEvent.VK_RIGHT:
                    if(direction!= Teclas.IZQUIERDA){
                        direction = Teclas.DERECHA;
                    }
                    break;

                case KeyEvent.VK_UP:
                    if(direction!= Teclas.ABAJO){
                        direction = Teclas.ARRIBA;
                    }
                    break;

                case KeyEvent.VK_DOWN:
                    if(direction!= Teclas.ARRIBA){
                        direction = Teclas.ABAJO;
                    }
                    break;

                case KeyEvent.VK_R:
                    if (!running) {
                        restartGame();
                    }
                    break;
            }
        }
    }
}
