import java.util.*;
import SMSAPI;

public class test {
    public static final int NUM_RETRY = 3;
    public static void main(String[] args) {
        int count = 0;
        while(true) {
            try {
                SMSAPI.send();
            } catch (ConnectiontException e) {
                if (++count >= NUM_RETRY){
                    Thread.sleep(100);
                    throw e;
                }
                else{
                    continue;
                }
            }
        }       
    }

}
