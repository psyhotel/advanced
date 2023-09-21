package application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.context.annotation.Scope;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Testt {

    //@Value("${nnn}")
    String nnn;
    @Scheduled(fixedRate = 1000)
    @Autowired
    public String getString(){
        return nnn;
    }
}
