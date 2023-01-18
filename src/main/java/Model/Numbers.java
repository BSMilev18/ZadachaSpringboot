package Model;

import java.util.Arrays;
import java.util.List;

public class Numbers {
    private List<Integer> numbers;
    public Numbers(){
        this.numbers = Arrays.asList(1,2,3,4,5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);
    }
    public List<Integer> getNumbers(){
        return this.numbers;
    }
}
