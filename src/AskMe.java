import java.util.Random;

interface SharedConstants {
    int NO = 0;
    int YES = 1;
    int MAYBE = 2;
    int LATER = 3;
    int SOON = 4;

    int NEVER = 5;
}

class Question implements SharedConstants {
    Random r = new Random();

   void ask() {

    }
}
public class AskMe {
}
