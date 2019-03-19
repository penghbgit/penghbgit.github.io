import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author liusibo
 * @Title: Temp
 * @ProjectName function
 * @date 2018/11/2111:19 PM
 */
public class Temp {

    public final List<String> list = new ArrayList<>();

    {
        list.add("1");
        list.add("1");
        list.add("1");
        list.add("1");
        list.add("1");
        list.add("1");
    }
        
    public List<Integer> collect = list.stream().map(Integer::parseInt).collect(Collectors.toList());

    {
        System.out.println(collect);
    }

}
