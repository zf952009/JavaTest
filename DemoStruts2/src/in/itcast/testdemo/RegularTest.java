package in.itcast.testdemo;

import in.itcast.domain.Regular;
import in.itcast.service.RegularSerivce;
import in.itcast.service.impl.RegularSerivceImpl;
import org.junit.Test;

import java.util.List;

public class RegularTest {

    @Test
    public void getAll() {
        RegularSerivce regularSerivce = new RegularSerivceImpl();
        List<Regular> all = regularSerivce.getAll();
        System.out.println(all);
    }
}
