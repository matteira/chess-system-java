package boardgame;

public class BoardExeception extends RuntimeException{
    public static final long serialVersionUID = 1l;

    public BoardExeception(String msg) {
        super(msg);
    }
}
